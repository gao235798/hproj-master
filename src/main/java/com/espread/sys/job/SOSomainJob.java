package com.espread.sys.job;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.espread.common.datasource.DynamicDataSource;
import com.espread.sys.model.SOSOMain;
import com.espread.sys.model.SomainCurrent;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.service.EhrToDmsXml;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysQtrzLogService;

public class SOSomainJob implements Job {

	private static Logger LOGGER = LoggerFactory.getLogger(SOSomainJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOGGER.debug("校验订单是否满足库存量接口job开始---------------------------------");
		InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);

		// les 审核
		List list = inventoryService.selectSomainCurrent();
		EhrToDmsXml ehrToDmsXml = ApplicationContextHelper.getBean(EhrToDmsXml.class);
		SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);

		List<Map<Integer, Object>> list1 = new ArrayList();

		Map<Integer, Object> map = new HashMap();

		int status = -1;

		if (list.isEmpty()) {
			LOGGER.debug("销售订单已经查询完毕！！！！！！！！");
		} else {

			for (int i = 0; i < list.size(); i++) {
				SomainCurrent somainCurrent = (SomainCurrent) list.get(i);// 获取每一个Example对象

				Integer id = 0;
				if (i != 0) {

					SomainCurrent somainCurrent1 = (SomainCurrent) list.get(i - 1);
					id = somainCurrent1.getId();
				}
				if (!id.equals(somainCurrent.getId())) {

					map.clear();
					map.put(somainCurrent.getAutoid(), somainCurrent);
					status += 1;
				} else {

					map.put(somainCurrent.getAutoid(), somainCurrent);
					list1.remove(status);
				}

				// 更改查询状态
				DynamicDataSource.setDataSource("slave");
				ehrToDmsXml.updateSOSOMainStatus(somainCurrent.getAutoid(), "f");

				Map<Integer, Object> mapData = new HashMap(map);

				// 添加到判断list
				list1.add(status, mapData);

			}

			// listData判断循环
			for (int i = 0; i < list1.size(); i++) {

				Map<Integer, Object> map1 = list1.get(i);

				boolean status1 = false;

				Integer id = 0;

				for (Integer key : map1.keySet()) {// keySet获取map集合key的集合  然后在遍历key即可
					SomainCurrent value = (SomainCurrent) map1.get(key);//
					id = value.getId();
					DynamicDataSource.setDataSource("slave");
					BigDecimal ifhquantity = inventoryService.selectCurrent(value.getCinvcode(), value.getAutoid());

					if (ifhquantity == null) {
						ifhquantity = BigDecimal.ZERO;
					}

					System.out.println(ifhquantity);
					int r = value.getCurrentIquantity().subtract(ifhquantity).compareTo(BigDecimal.ZERO);
					if (r == 1) {
						status1 = true;
						BigDecimal current = value.getCurrentIquantity().subtract(ifhquantity);
						if (current.subtract(value.getIquantity()).compareTo(BigDecimal.ZERO) == -1) {
							// 销售订单调整
							LOGGER.debug("调整销售订单行，订单行编号为：" + key);
							DynamicDataSource.setDataSource("slave");
							SysQrtzLog sysQrtzLogCh = ehrToDmsXml.updateSosomainChange(value.getAutoid(), value.getCinvcode(), value.getCsoCode(), current);
							DynamicDataSource.setDataSource("master");
							sysQtrzLogService.save(sysQrtzLogCh);
						}

					} else {

						// 关闭订单行
						LOGGER.debug("关闭订单行，订单行编号为：" + key);
						DynamicDataSource.setDataSource("slave");
						SysQrtzLog sysQrtzLogSode = ehrToDmsXml.closeSOSODetails(key, value.getCinvcode(), value.getCsoCode());
						DynamicDataSource.setDataSource("master");
						sysQtrzLogService.save(sysQrtzLogSode);
					}
				}

				// 关闭订单
				if (status1 == false) {
					LOGGER.debug("关闭订单，订单编号为：" + id);
					DynamicDataSource.setDataSource("slave");
					SysQrtzLog sysQrtzLogSo = ehrToDmsXml.closeSOSOmain(id);
					DynamicDataSource.setDataSource("master");
					sysQtrzLogService.save(sysQrtzLogSo);
				}
			} //
		}

		List listPOPmain = inventoryService.selectByALLSOSOMain();

		for (int j = 0; j < listPOPmain.size(); j++) {

			SOSOMain sOSOMain = (SOSOMain) listPOPmain.get(j);// 获取每一个Example对象
			SysQrtzLog sysQrtzLog = ehrToDmsXml.toKCFK(sOSOMain);
			sysQtrzLogService.save(sysQrtzLog);
		}

		LOGGER.debug("校验订单是否满足库存量接口job结束---------------------------------");

	}

}
