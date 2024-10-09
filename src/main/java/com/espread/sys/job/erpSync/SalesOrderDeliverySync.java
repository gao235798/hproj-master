 package com.espread.sys.job.erpSync;

 import com.espread.sys.job.ApplicationContextHelper;
 import com.espread.sys.model.DispatchList;
 import com.espread.sys.model.POPomain;
 import com.espread.sys.model.SysQrtzLog;
 import com.espread.sys.service.ERPConnectionService;
 import com.espread.sys.service.InventoryService;
 import com.espread.sys.service.SysQtrzLogService;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.quartz.DisallowConcurrentExecution;
 import org.quartz.Job;
 import org.quartz.JobExecutionContext;
 import org.quartz.JobExecutionException;

 import java.util.List;


 /**
  * @Description ： 002系统到销售系统的销售订单同步信息
  * @author lingzhenggao
  * @date 2024-09-20
  */
 @DisallowConcurrentExecution
 public class SalesOrderDeliverySync implements Job{

     private static Logger LOGGER = LoggerFactory.getLogger(SalesOrderDeliverySync.class);
     @Override
     public void execute(JobExecutionContext context) throws JobExecutionException {

         LOGGER.error("----002ERP销售订单发货单同步003采购订单入库单--------------------------------");
         InventoryService inventoryService = ApplicationContextHelper.getBean(InventoryService.class);
         SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
         ERPConnectionService erpConnectionService = ApplicationContextHelper.getBean(ERPConnectionService.class);
         //根据客户查询销售订单送货单
         List list = inventoryService.selectDispatchListByCustomers("1006");
         for (Object o : list) {
             DispatchList dispatchList = (DispatchList) o;
             SysQrtzLog sysQrtzLog = erpConnectionService.salesOrderDeliverySync(dispatchList);
             sysQtrzLogService.save(sysQrtzLog);
         }
         LOGGER.error("----销售订单同步接口结束----------------------------------");
     }

 }
