package com.espread.sys.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.espread.sys.mapper.*;
import com.espread.sys.model.*;
import org.apache.commons.beanutils.PropertyUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espread.common.annotation.DataSourceChange;
import com.espread.common.constant.Const;
import com.espread.common.constant.Global;
import com.espread.common.exception.ServiceException;
import com.espread.sys.job.CreateClient;
import com.espread.sys.service.EhrToDmsXml;
import com.espread.sys.service.EhrToLesService;
import com.espread.sys.service.EhrToLesXml;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysLogService;
import com.espread.sys.service.SysQtrzLogService;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class EhrToDmsXmlImpl implements EhrToDmsXml {
	private static Logger LOGGER = LoggerFactory.getLogger(EhrToDmsXmlImpl.class);

	@Autowired
	private EhrToLesService ehrToLesService;
	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private DMSInventoryMapper dMSInventoryMapper;

	@Autowired
	private Rdrecord32Mapper rdrecord32Mapper;
	@Autowired
	private Rdrecords32Mapper rdrecords32Mapper;

	@Autowired
	private Rdrecord10Mapper rdrecord10Mapper;
	@Autowired
	private Rdrecords10Mapper rdrecords10Mapper;

	@Autowired
	private RdRecord01Mapper rdrecord01Mapper;
	@Autowired
	private Rdrecords01Mapper rdrecords01Mapper;

	@Autowired
	private CurrentStockMapper currentStockMapper;

	@Autowired
	private SaleBillVouchMapper saleBillVouchMapper;
	@Autowired
	private SaleBillVouchsMapper saleBillVouchsMapper;

	@Autowired
	private SOSOMainMapper sOSOMainMapper;
	@Autowired
	private SOSODetailsMapper sOSODetailsMapper;

	@Autowired
	private DispatchListMapper dispatchListMapper;

	@Autowired
	private MomOrderdetailMapper momOrderdetailMapper;

	@Autowired
	private PriceJustifyMapper priceJustifyMapper;

	@Autowired
    private  Rdrecords08Mapper rdrecords08Mapper;

	@Autowired
	private Rdrecord08Mapper rdrecord08Mapper;
	// 整车物料主数据同步接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toCH(DMSInventory dMSInventory) {

		SysQrtzLog sysQrtLog = new SysQrtzLog("31");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element vehicleMaterialDTO = interfaceDTO.addElement("VehicleMaterialDTO");
		Element GUID = vehicleMaterialDTO.addElement("GUID");
		Element cInvCode = vehicleMaterialDTO.addElement("cInvCode");
		Element cInvName = vehicleMaterialDTO.addElement("cInvName");
		Element cidefine1 = vehicleMaterialDTO.addElement("cidefine1");

		// 2019-10-31 richie 新增规格型号
		Element cInvStd = vehicleMaterialDTO.addElement("cInvStd");

		Element cidefine2 = vehicleMaterialDTO.addElement("cidefine2");
		Element cidefine3 = vehicleMaterialDTO.addElement("cidefine3");
		Element cidefine4 = vehicleMaterialDTO.addElement("cidefine4");
		Element cidefine5 = vehicleMaterialDTO.addElement("cidefine5");
		Element cidefine6 = vehicleMaterialDTO.addElement("cidefine6");

		Element cidefine14 = vehicleMaterialDTO.addElement("cidefine14");

		GUID.addText(UUID.randomUUID().toString());
		cInvCode.addText(dMSInventory.getCinvcode());

		cInvName.addText(dMSInventory.getCinvname());
		// 2019-10-31 richie 新增规格型号
		// cInvStd.addText(dMSInventory.getCinvstd());
		cInvStd.addText(dMSInventory.getCinvstd() == null ? "" : dMSInventory.getCinvstd());

		cidefine1.addText(dMSInventory.getCidefine1() == null ? "" : dMSInventory.getCidefine1());
		cidefine2.addText(dMSInventory.getCidefine2() == null ? "" : dMSInventory.getCidefine2());
		cidefine3.addText(dMSInventory.getCidefine3() == null ? "" : dMSInventory.getCidefine3());
		cidefine4.addText(dMSInventory.getCidefine4() == null ? "" : dMSInventory.getCidefine4());
		cidefine5.addText(dMSInventory.getCidefine5() == null ? "" : dMSInventory.getCidefine5());
		cidefine6.addText(dMSInventory.getCidefine6() == null ? "" : dMSInventory.getCidefine6());
		cidefine14.addText(dMSInventory.getCidefine14() == null ? "" : dMSInventory.getCidefine14());

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toDms(req_xml, "vehiclematerialinfo");

		System.out.println("----------" + res_xml);

		sysQrtLog.setCodeNo(dMSInventory.getCinvcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			System.out.println("----------" + dMSInventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				dMSInventoryMapper.updateInventory(dMSInventory.getiId(), "1");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				dMSInventoryMapper.updateInventory(dMSInventory.getiId(), "2");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("整车物料主数据同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 配件主数据同步接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toPJ(DMSInventory dMSInventory) {

		SysQrtzLog sysQrtLog = new SysQrtzLog("32");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element partMaterialDTO = interfaceDTO.addElement("PartMaterialDTO");
		Element GUID = partMaterialDTO.addElement("GUID");

		Element cInvCode = partMaterialDTO.addElement("cInvCode");
		Element cInvName = partMaterialDTO.addElement("cInvName");
		Element fMinSupply = partMaterialDTO.addElement("fMinSupply");
		Element SALE_MINI_UNIT = partMaterialDTO.addElement("SALE_MINI_UNIT");
		Element cComUnitName = partMaterialDTO.addElement("cComUnitName");
		Element iTopSum = partMaterialDTO.addElement("iTopSum");
		Element iLowSum = partMaterialDTO.addElement("iLowSum");
		Element cInvStd = partMaterialDTO.addElement("cInvStd");

		Element BATTERY_TYPE = partMaterialDTO.addElement("BATTERY_TYPE");

		Element IS_RUN = partMaterialDTO.addElement("IS_RUN");
		Element RUN_TYPE = partMaterialDTO.addElement("RUN_TYPE");

		Element PART_PROPERTY = partMaterialDTO.addElement("PART_PROPERTY");

		Element cidefine7 = partMaterialDTO.addElement("cidefine7");
		Element cidefine8 = partMaterialDTO.addElement("cidefine8");
		Element cidefine9 = partMaterialDTO.addElement("cidefine9");

		Element PART_SOURCE = partMaterialDTO.addElement("PART_SOURCE");
		Element iinvadvance = partMaterialDTO.addElement("iinvadvance");

		GUID.addText(UUID.randomUUID().toString());
		cInvCode.addText(dMSInventory.getCinvcode());

		cInvName.addText(dMSInventory.getCinvname());
		Double js = dMSInventory.getFsupplymulti() * dMSInventory.getFminsupply();
		fMinSupply.addText(dMSInventory.getFminsupply().toString());
		SALE_MINI_UNIT.addText(js.toString());
		cComUnitName.addText(dMSInventory.getCcomunitcode());
		iTopSum.addText(dMSInventory.getItopsum() == null ? "0" : dMSInventory.getItopsum().toString());
		iLowSum.addText(dMSInventory.getIlowsum() == null ? "0" : dMSInventory.getIlowsum().toString());

		cInvStd.addText(dMSInventory.getCinvstd() == null ? "" : dMSInventory.getCinvstd().toString());

		cidefine7.addText(dMSInventory.getCidefine7() == null ? "0" : dMSInventory.getCidefine7().toString());
		cidefine8.addText(dMSInventory.getCidefine8() == null ? "0" : dMSInventory.getCidefine8().toString());
		cidefine9.addText(dMSInventory.getCidefine9() == null ? "0" : dMSInventory.getCidefine9().toString());
		String Cidefine10 = dMSInventory.getCidefine10() == null ? "" : dMSInventory.getCidefine10().toString();
		String Cidefine11 = dMSInventory.getCidefine11() == null ? "" : dMSInventory.getCidefine11().toString();
		String Cidefine12 = dMSInventory.getCidefine12() == null ? "" : dMSInventory.getCidefine12().toString();
		String Cidefine13 = dMSInventory.getCidefine13() == null ? "" : dMSInventory.getCidefine13().toString();
		if (Cidefine10.equals("电池包")) {
			BATTERY_TYPE.addText("50771001");
		}
		if (Cidefine10.equals("电池模块")) {
			BATTERY_TYPE.addText("50771002");
		}

		if (Cidefine11.equals("是")) {
			IS_RUN.addText("16001001");
		}
		if (Cidefine11.equals("否")) {
			IS_RUN.addText("16001002");
		}
		if (Cidefine12.equals("电池")) {
			RUN_TYPE.addText("40501001");
		}
		if (Cidefine12.equals("电机")) {
			RUN_TYPE.addText("40501002");
		}
		if (Cidefine12.equals("电控")) {
			RUN_TYPE.addText("40501003");
		}
		if (Cidefine12.equals("电芯")) {
			RUN_TYPE.addText("40501004");
		}
		if (Cidefine12.equals("其他")) {
			RUN_TYPE.addText("40501005");
		}

		if (Cidefine13.equals("配件")) {
			PART_PROPERTY.addText("50071001");
		}
		if (Cidefine13.equals("精品")) {
			PART_PROPERTY.addText("50071002");
		}
		if (Cidefine13.equals("辅料")) {
			PART_PROPERTY.addText("50071003");
		}

		PART_SOURCE.addText(dMSInventory.getBself().toString().equals("1") ? "40731001" : "40731002");
		iinvadvance.addText(dMSInventory.getIinvadvance() == null ? "0" : dMSInventory.getIinvadvance().toString());

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toDms(req_xml, "partmaterialinfo");
		// String res_xml = "";
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(dMSInventory.getCinvcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			System.out.println("----------" + dMSInventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				dMSInventoryMapper.updateInventory(dMSInventory.getiId(), "1");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				dMSInventoryMapper.updateInventory(dMSInventory.getiId(), "2");
				// System.out.println("123456"+feedbackCode);

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("配件主数据同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 配件主数据同步接口
	@Override

	public SysQrtzLog toPJQT(DMSInventory dMSInventory) {

		SysQrtzLog sysQrtLog = new SysQrtzLog("32");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element partMaterialDTO = interfaceDTO.addElement("PartMaterialDTO");
		Element GUID = partMaterialDTO.addElement("GUID");

		Element cInvCode = partMaterialDTO.addElement("cInvCode");
		Element cInvName = partMaterialDTO.addElement("cInvName");
		Element fMinSupply = partMaterialDTO.addElement("fMinSupply");
		Element SALE_MINI_UNIT = partMaterialDTO.addElement("SALE_MINI_UNIT");
		Element cComUnitName = partMaterialDTO.addElement("cComUnitName");
		Element iTopSum = partMaterialDTO.addElement("iTopSum");
		Element iLowSum = partMaterialDTO.addElement("iLowSum");
		Element cInvStd = partMaterialDTO.addElement("cInvStd");

		Element BATTERY_TYPE = partMaterialDTO.addElement("BATTERY_TYPE");

		Element IS_RUN = partMaterialDTO.addElement("IS_RUN");

		Element PART_ATTR = partMaterialDTO.addElement("PART_ATTR");

		Element cidefine7 = partMaterialDTO.addElement("cidefine7");
		Element cidefine8 = partMaterialDTO.addElement("cidefine8");
		Element cidefine9 = partMaterialDTO.addElement("cidefine9");

		Element PART_SOURCE = partMaterialDTO.addElement("PART_SOURCE");
		Element iinvadvance = partMaterialDTO.addElement("iinvadvance");

		GUID.addText(UUID.randomUUID().toString());
		cInvCode.addText(dMSInventory.getCinvcode());

		cInvName.addText(dMSInventory.getCinvname());
		Double js = dMSInventory.getFsupplymulti() * dMSInventory.getFminsupply();
		fMinSupply.addText(dMSInventory.getFminsupply().toString());
		SALE_MINI_UNIT.addText(js.toString());
		cComUnitName.addText(dMSInventory.getCcomunitcode());

		iTopSum.addText(dMSInventory.getItopsum() == null ? "0" : dMSInventory.getItopsum().toString());
		iLowSum.addText(dMSInventory.getIlowsum() == null ? "0" : dMSInventory.getIlowsum().toString());

		cInvStd.addText(dMSInventory.getCinvstd() == null ? "" : dMSInventory.getCinvstd().toString());

		Element RUN_TYPE = partMaterialDTO.addElement("RUN_TYPE");

		Element PART_PROPERTY = partMaterialDTO.addElement("PART_PROPERTY");
		cidefine7.addText(dMSInventory.getCidefine7() == null ? "0" : dMSInventory.getCidefine7().toString());
		cidefine8.addText(dMSInventory.getCidefine8() == null ? "0" : dMSInventory.getCidefine8().toString());
		cidefine9.addText(dMSInventory.getCidefine9() == null ? "0" : dMSInventory.getCidefine9().toString());

		String Cidefine10 = dMSInventory.getCidefine10() == null ? "" : dMSInventory.getCidefine10().toString();
		String Cidefine11 = dMSInventory.getCidefine11() == null ? "" : dMSInventory.getCidefine11().toString();
		String Cidefine12 = dMSInventory.getCidefine12() == null ? "" : dMSInventory.getCidefine12().toString();
		String Cidefine13 = dMSInventory.getCidefine13() == null ? "" : dMSInventory.getCidefine13().toString();
		if (Cidefine10.equals("电池包")) {
			BATTERY_TYPE.addText("50771001");
		}
		if (Cidefine10.equals("电池模块")) {
			BATTERY_TYPE.addText("50771002");
		}

		if (Cidefine11.equals("是")) {
			IS_RUN.addText("16001001");
		}
		if (Cidefine11.equals("否")) {
			IS_RUN.addText("16001002");
		}
		if (Cidefine12.equals("电池")) {
			RUN_TYPE.addText("40501001");
		}
		if (Cidefine12.equals("电机")) {
			RUN_TYPE.addText("40501002");
		}
		if (Cidefine12.equals("电控")) {
			RUN_TYPE.addText("40501003");
		}
		if (Cidefine12.equals("电芯")) {
			RUN_TYPE.addText("40501004");
		}
		if (Cidefine12.equals("其他")) {
			RUN_TYPE.addText("40501005");
		}

		if (Cidefine13.equals("配件")) {
			PART_PROPERTY.addText("50071001");
		}
		if (Cidefine13.equals("精品")) {
			PART_PROPERTY.addText("50071002");
		}
		if (Cidefine13.equals("辅料")) {
			PART_PROPERTY.addText("50071003");
		}

		PART_SOURCE.addText(dMSInventory.getBself().toString().equals("1") ? "40731001" : "40731002");
		iinvadvance.addText(dMSInventory.getIinvadvance() == null ? "0" : dMSInventory.getIinvadvance().toString());
		// Element partModelItem = partMaterialDTO.addElement("partModelItem");
		// List list = dMSInventoryMapper.selectByPJGYS(dMSInventory.getCinvcode());
		List list = inventoryService.selectByPJGYS(dMSInventory.getCinvcode());
		for (int i = 0; i < list.size(); i++) {
			DMSInventory dMSInventoryl = (DMSInventory) list.get(i);// 获取每一个Example对象
			Element partSupplierItem = partMaterialDTO.addElement("partSupplierItem");
			Element cVenCode = partSupplierItem.addElement("cVenCode");
			Element cVenAbbName = partSupplierItem.addElement("cVenAbbName");
			Element cVenName = partSupplierItem.addElement("cVenName");
			Element SUPPLIER_TYPE = partSupplierItem.addElement("SUPPLIER_TYPE");

			cVenCode.addText(dMSInventoryl.getcVenCode());
			cVenAbbName.addText(dMSInventoryl.getcVenAbbName());
			cVenName.addText(dMSInventoryl.getcVenName());
			SUPPLIER_TYPE.addText("40731002");
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toDms(req_xml, "partmaterialinfo");
		// String res_xml = "";
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(dMSInventory.getiId().toString());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			System.out.println("----------" + dMSInventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				dMSInventoryMapper.updatePU_PriceJustDetail(dMSInventory.getiId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				dMSInventoryMapper.updatePU_PriceJustDetail(dMSInventory.getiId(), "F");
				// System.out.println("123456"+feedbackCode);

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("配件主数据同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 配件主数据同步接口
	@Override

	public SysQrtzLog toPJCX(DMSInventory dMSInventory) {

		SysQrtzLog sysQrtLog = new SysQrtzLog("32");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element partMaterialDTO = interfaceDTO.addElement("PartMaterialDTO");
		Element GUID = partMaterialDTO.addElement("GUID");

		Element cInvCode = partMaterialDTO.addElement("cInvCode");
		Element cInvName = partMaterialDTO.addElement("cInvName");
		Element fMinSupply = partMaterialDTO.addElement("fMinSupply");
		Element SALE_MINI_UNIT = partMaterialDTO.addElement("SALE_MINI_UNIT");
		Element cComUnitName = partMaterialDTO.addElement("cComUnitName");
		Element iTopSum = partMaterialDTO.addElement("iTopSum");
		Element iLowSum = partMaterialDTO.addElement("iLowSum");
		Element cInvStd = partMaterialDTO.addElement("cInvStd");

		Element BATTERY_TYPE = partMaterialDTO.addElement("BATTERY_TYPE");

		Element IS_RUN = partMaterialDTO.addElement("IS_RUN");

		Element PART_ATTR = partMaterialDTO.addElement("PART_ATTR");
		Element RUN_TYPE = partMaterialDTO.addElement("RUN_TYPE");

		Element PART_PROPERTY = partMaterialDTO.addElement("PART_PROPERTY");
		Element cidefine7 = partMaterialDTO.addElement("cidefine7");
		Element cidefine8 = partMaterialDTO.addElement("cidefine8");
		Element cidefine9 = partMaterialDTO.addElement("cidefine9");

		Element PART_SOURCE = partMaterialDTO.addElement("PART_SOURCE");
		Element iinvadvance = partMaterialDTO.addElement("iinvadvance");

		GUID.addText(UUID.randomUUID().toString());
		cInvCode.addText(dMSInventory.getCinvcode());

		cInvName.addText(dMSInventory.getCinvname());
		Double js = dMSInventory.getFsupplymulti() * dMSInventory.getFminsupply();
		fMinSupply.addText(dMSInventory.getFminsupply().toString());
		SALE_MINI_UNIT.addText(js.toString());
		cComUnitName.addText(dMSInventory.getCcomunitcode());
		iTopSum.addText(dMSInventory.getItopsum() == null ? "0" : dMSInventory.getItopsum().toString());
		iLowSum.addText(dMSInventory.getIlowsum() == null ? "0" : dMSInventory.getIlowsum().toString());

		cInvStd.addText(dMSInventory.getCinvstd() == null ? "" : dMSInventory.getCinvstd().toString());
//							iTopSum.addText(dMSInventory.getItopsum().toString());
//							iLowSum.addText(dMSInventory.getIlowsum().toString());
//							
//							cInvStd.addText(dMSInventory.getCinvstd().toString());
//							
		cidefine7.addText(dMSInventory.getCidefine7() == null ? "0" : dMSInventory.getCidefine7().toString());
		cidefine8.addText(dMSInventory.getCidefine8() == null ? "0" : dMSInventory.getCidefine8().toString());
		cidefine9.addText(dMSInventory.getCidefine9() == null ? "0" : dMSInventory.getCidefine9().toString());

		String Cidefine10 = dMSInventory.getCidefine10() == null ? "" : dMSInventory.getCidefine10().toString();
		String Cidefine11 = dMSInventory.getCidefine11() == null ? "" : dMSInventory.getCidefine11().toString();
		String Cidefine12 = dMSInventory.getCidefine12() == null ? "" : dMSInventory.getCidefine12().toString();
		String Cidefine13 = dMSInventory.getCidefine13() == null ? "" : dMSInventory.getCidefine13().toString();
		if (Cidefine10.equals("电池包")) {
			BATTERY_TYPE.addText("50771001");
		}
		if (Cidefine10.equals("电池模块")) {
			BATTERY_TYPE.addText("50771002");
		}

		if (Cidefine11.equals("是")) {
			IS_RUN.addText("16001001");
		}
		if (Cidefine11.equals("否")) {
			IS_RUN.addText("16001002");
		}
		if (Cidefine12.equals("电池")) {
			RUN_TYPE.addText("40501001");
		}
		if (Cidefine12.equals("电机")) {
			RUN_TYPE.addText("40501002");
		}
		if (Cidefine12.equals("电控")) {
			RUN_TYPE.addText("40501003");
		}
		if (Cidefine12.equals("电芯")) {
			RUN_TYPE.addText("40501004");
		}
		if (Cidefine12.equals("其他")) {
			RUN_TYPE.addText("40501005");
		}

		if (Cidefine13.equals("配件")) {
			PART_PROPERTY.addText("50071001");
		}
		if (Cidefine13.equals("精品")) {
			PART_PROPERTY.addText("50071002");
		}
		if (Cidefine13.equals("辅料")) {
			PART_PROPERTY.addText("50071003");
		}

		PART_SOURCE.addText(dMSInventory.getBself().toString().equals("1") ? "40731001" : "40731002");
		iinvadvance.addText(dMSInventory.getIinvadvance() == null ? "0" : dMSInventory.getIinvadvance().toString());

		// List list = dMSInventoryMapper.selectByPJXCS(dMSInventory.getiId());
		List list = inventoryService.selectByPJGYS(dMSInventory.getiId());

		for (int i = 0; i < list.size(); i++) {
			DMSInventory dMSInventoryl = (DMSInventory) list.get(i);// 获取每一个Example对象
			Element partModelItem = partMaterialDTO.addElement("partModelItem");
			Element InvCode = partModelItem.addElement("InvCode");

			InvCode.addText(dMSInventoryl.getCinvcode());

		}
		// Element partSupplierItem = partMaterialDTO.addElement("partSupplierItem");
		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toDms(req_xml, "partmaterialinfo");
		// String res_xml = "";
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(dMSInventory.getiId().toString());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			System.out.println("----------" + dMSInventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				dMSInventoryMapper.updatebom_opcomponent(dMSInventory.getiId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				dMSInventoryMapper.updatebom_opcomponent(dMSInventory.getiId(), "F");
				// System.out.println("123456"+feedbackCode);

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("配件主数据同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 价格同步接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toJG(List list) {

		SysQrtzLog sysQrtLog = new SysQrtzLog("33");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		String uuid = UUID.randomUUID().toString();

		Element interfaceDTO = doc.addElement("InterfaceDTO");

		for (int i = 0; i < list.size(); i++) {
			PriceJustify priceJustify = (PriceJustify) list.get(i);// 获取每一个Example对象
			Element materialPriceDTO = interfaceDTO.addElement("MaterialPriceDTO");
			Element GUID = materialPriceDTO.addElement("GUID");

			Element cInvCode = materialPriceDTO.addElement("cInvCode");
			Element cInvCCode = materialPriceDTO.addElement("cInvCCode");
			Element iNInvCost1 = materialPriceDTO.addElement("iNInvCost1");
			Element INSalePrice1 = materialPriceDTO.addElement("INSalePrice1");
			Element dstartdate = materialPriceDTO.addElement("dstartdate");
			Element cdefine26 = materialPriceDTO.addElement("cdefine26");

			GUID.addText(uuid);
			cInvCode.addText(priceJustify.getCinvcode());

			String zc = priceJustify.getcInvCCode().substring(0, 1);
			cInvCCode.addText(zc.equals("1") ? "10041001" : "10041002");
			iNInvCost1.addText(priceJustify.getIninvcost1().toString());

			INSalePrice1.addText(priceJustify.getInsaleprice1().toString());

			dstartdate.addText(
					(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(priceJustify.getDstartdate()));
			cdefine26.addText(priceJustify.getCdefine26() == null ? "0" : priceJustify.getCdefine26().toString());
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		// String res_xml = ehrToLesService.toInventory(req_xml,"MaterialInterface");
		String  res_xml = ehrToLesService.toDms(req_xml, "materialpriceinfo");
		// String res_xml = "";

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo("同步价格");
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			// System.out.println("----------" + priceJustify.getId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				for (int i = 0; i < list.size(); i++) {
					PriceJustify priceJustify = (PriceJustify) list.get(i);// 获取每一个Example对象
					priceJustifyMapper.updatePriceJustify(priceJustify.getId(), "T");
				}
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				for (int i = 0; i < list.size(); i++) {
					PriceJustify priceJustify = (PriceJustify) list.get(i);// 获取每一个Example对象
					priceJustifyMapper.updatePriceJustify(priceJustify.getId(), "F");
				}
				// System.out.println("123456"+feedbackCode);

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("价格同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 配件出库单接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toPJCK(Rdrecord32 rdrecord32) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("38");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element partOutboundOrderDTO = interfaceDTO.addElement("PartOutboundOrderDTO");
		Element GUID = partOutboundOrderDTO.addElement("GUID");

		Element cCode = partOutboundOrderDTO.addElement("cCode");
		Element cCusCode = partOutboundOrderDTO.addElement("cCusCode");
		Element csocode = partOutboundOrderDTO.addElement("csocode");
		Element cWhName = partOutboundOrderDTO.addElement("cWhName");

		GUID.addText(UUID.randomUUID().toString());
		cCode.addText(rdrecord32.getCcode());

		cCusCode.addText(rdrecord32.getCcuscode());

		csocode.addText(rdrecord32.getCdefine10());

		cWhName.addText(rdrecord32.getCwhcode());

		List list = rdrecords32Mapper.selectByRdrecords32(rdrecord32.getId());

		for (int i = 0; i < list.size(); i++) {
			Rdrecords32 rdrecords32 = (Rdrecords32) list.get(i);// 获取每一个Example对象
			Element partOutboundOrderItem = partOutboundOrderDTO.addElement("partOutboundOrderItem");
			// csocode.addText(rdrecords32.getIordercode());
			Element irowno = partOutboundOrderItem.addElement("irowno");// 行号

			Element cInvCode = partOutboundOrderItem.addElement("cInvCode");//
			Element iQuantity = partOutboundOrderItem.addElement("iQuantity");//

			irowno.addText(rdrecords32.getIrowno().toString());
			cInvCode.addText(rdrecords32.getCinvcode());
			iQuantity.addText(rdrecords32.getIquantity().toString());

		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		// String res_xml ="";
		// String res_xml =
		// ehrToLesService.toInventory(req_xml,"TransferFormInterface");
		String res_xml = ehrToLesService.toDms(req_xml, "partoutboundorderinfo");
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(rdrecord32.getCcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				rdrecord32Mapper.updateRdrecord32(rdrecord32.getId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				// System.out.println("123456"+feedbackCode);
				rdrecord32Mapper.updateRdrecord32(rdrecord32.getId(), "F");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("配件出库单接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 库存同步接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toXCL() {
		SysQrtzLog sysQrtLog = new SysQrtzLog("39");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");

		List list = currentStockMapper.selectByALL();

		for (int i = 0; i < list.size(); i++) {
			CurrentStock currentStock = (CurrentStock) list.get(i);// 获取每一个Example对象
			Element partOutboundOrderDTO = interfaceDTO.addElement("PartMaterialStockDTO");
			Element GUID = partOutboundOrderDTO.addElement("GUID");
			Element cInvCode = partOutboundOrderDTO.addElement("cInvCode");
			Element fAvaQuantity = partOutboundOrderDTO.addElement("fAvaQuantity ");
			Element cWhName = partOutboundOrderDTO.addElement("cWhName");
			GUID.addText(UUID.randomUUID().toString());
			cInvCode.addText(currentStock.getCinvcode());
			fAvaQuantity.addText(currentStock.getIquantity().toString());
			cWhName.addText(currentStock.getCwhcode());
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);

		String res_xml = ehrToLesService.toDms(req_xml, "partstockinfo");
                                                                                                                                		System.out.println("----------" + res_xml);

		sysQrtLog.setCodeNo("库存同步");
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("库存同步接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 车辆销司入库接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toSCRK(Rdrecord10 rdrecord10) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("35");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		String uuid = UUID.randomUUID().toString();

		Element interfaceDTO = doc.addElement("InterfaceDTO");

		List list = rdrecords10Mapper.selectBySCRKVIN(rdrecord10.getId());

		for (int i = 0; i < list.size(); i++) {
			Rdrecords10 rdrecords10 = (Rdrecords10) list.get(i);// 获取每一个Example对象

			Element VehicleDTO = interfaceDTO.addElement("VehicleDTO");
			Element GUID = VehicleDTO.addElement("GUID");

			Element cInvSN = VehicleDTO.addElement("cInvSN");
			Element cInvCode = VehicleDTO.addElement("cInvCode");
			Element csocode = VehicleDTO.addElement("csocode");
			Element cDefine22 = VehicleDTO.addElement("cDefine22");
			Element cDefine23 = VehicleDTO.addElement("cDefine23");
			Element cDefine24 = VehicleDTO.addElement("cDefine24");
			Element cDefine25 = VehicleDTO.addElement("cDefine25");
			Element cDefine36 = VehicleDTO.addElement("cDefine36");
			Element ddate = VehicleDTO.addElement("ddate");
			Element cWhName = VehicleDTO.addElement("cWhName");

			GUID.addText(uuid);

			cInvSN.addText(rdrecords10.getcInvSN() == null ? "" : rdrecords10.getcInvSN());
			cInvCode.addText(rdrecords10.getCinvcode());
			if (rdrecords10.getIsotype() == 1) {
				csocode.addText(rdrecords10.getCsocode());
			} else {
				csocode.addText("");
			}

			cDefine22.addText(rdrecords10.getCdefine22() == null ? "" : rdrecords10.getCdefine22());
			cDefine23.addText(rdrecords10.getCdefine23() == null ? "" : rdrecords10.getCdefine23());
			cDefine24.addText(rdrecords10.getCdefine24() == null ? "" : rdrecords10.getCdefine24());
			cDefine25.addText(rdrecords10.getCdefine25() == null ? "" : rdrecords10.getCdefine25());
			cDefine36.addText((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord10.getDdate()));
			ddate.addText((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord10.getDdate()));
			cWhName.addText(rdrecord10.getCwhcode() == null ? "" : rdrecord10.getCwhcode().toString());

		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		// String res_xml ="";
		// String res_xml =
		// ehrToLesService.toInventory(req_xml,"TransferFormInterface");
		String res_xml = ehrToLesService.toDms(req_xml, "vehicleinfo");
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(rdrecord10.getCcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				rdrecord10Mapper.updateRdrecord10(rdrecord10.getId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				// System.out.println("123456"+feedbackCode);
				rdrecord10Mapper.updateRdrecord10(rdrecord10.getId(), "F");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("车辆销司入库接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 车辆销司入库（采购）接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toSCRKCG(RdRecord01 rdrecord01) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("41");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		String uuid = UUID.randomUUID().toString();

		Element interfaceDTO = doc.addElement("InterfaceDTO");

		List list = rdrecords01Mapper.selectBySCRKCGVIN(rdrecord01.getId());

		for (int i = 0; i < list.size(); i++) {
			Rdrecords01 rdrecords01 = (Rdrecords01) list.get(i);// 获取每一个Example对象

			Element VehicleDTO = interfaceDTO.addElement("VehicleDTO");
			Element GUID = VehicleDTO.addElement("GUID");

			Element cInvSN = VehicleDTO.addElement("cInvSN");
			Element cInvCode = VehicleDTO.addElement("cInvCode");
			Element csocode = VehicleDTO.addElement("csocode");
			Element cDefine22 = VehicleDTO.addElement("cDefine22");
			Element cDefine23 = VehicleDTO.addElement("cDefine23");
			Element cDefine24 = VehicleDTO.addElement("cDefine24");
			Element cDefine25 = VehicleDTO.addElement("cDefine25");
			Element cDefine26 = VehicleDTO.addElement("cDefine26");
			Element cDefine36 = VehicleDTO.addElement("cDefine36");
			Element ddate = VehicleDTO.addElement("ddate");
			Element cWhName = VehicleDTO.addElement("cWhName");

			GUID.addText(uuid);

			cInvSN.addText(rdrecords01.getcInvSN() == null ? "" : rdrecords01.getcInvSN());
			cInvCode.addText(rdrecords01.getCinvcode());

			csocode.addText(rdrecords01.getCdefine29() == null ? "" : rdrecords01.getCdefine29());

			cDefine22.addText(rdrecords01.getcSNDefine1() == null ? "" : rdrecords01.getcSNDefine1());
			cDefine23.addText(rdrecords01.getcSNDefine2() == null ? "" : rdrecords01.getcSNDefine2());
			cDefine24.addText(rdrecords01.getcSNDefine3() == null ? "" : rdrecords01.getcSNDefine3());
			cDefine25.addText(rdrecords01.getcSNDefine4() == null ? "" : rdrecords01.getcSNDefine4());
			cDefine26.addText(rdrecords01.getcSNDefine5() == null ? "" : rdrecords01.getcSNDefine5());
			cDefine36.addText((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord01.getDdate()));
			ddate.addText((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord01.getDdate()));
			cWhName.addText(rdrecord01.getCwhcode() == null ? "" : rdrecord01.getCwhcode().toString());

		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);

		String res_xml = ehrToLesService.toDms(req_xml, "vehicleinfo");
		System.out.println("----------" + res_xml);

		sysQrtLog.setCodeNo(rdrecord01.getCcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				rdrecord01Mapper.updateRdrecord01(rdrecord01.getId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				// System.out.println("123456"+feedbackCode);
				rdrecord01Mapper.updateRdrecord01(rdrecord01.getId(), "F");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("车辆销司入库（采购）接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// ERP开票信息接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toKP(SaleBillVouch saleBillVouch) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("36");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element invoiceDTO = interfaceDTO.addElement("InvoiceDTO");
		Element GUID = invoiceDTO.addElement("GUID");

		Element cSBVCode = invoiceDTO.addElement("cSBVCode");
		Element dDate = invoiceDTO.addElement("dDate");
		Element bReturnFlag = invoiceDTO.addElement("bReturnFlag");
		Element iNatSumAll = invoiceDTO.addElement("iNatSum");

		Element cCusCode = invoiceDTO.addElement("cCusCode");

		GUID.addText(UUID.randomUUID().toString());
		cSBVCode.addText(saleBillVouch.getCsbvcode());

		dDate.addText((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(saleBillVouch.getDdate()));

		bReturnFlag.addText(saleBillVouch.getBreturnflag() == false ? "0" : "1");

		// iNatSumAll.addText(saleBillVouch.getin);
		cCusCode.addText(saleBillVouch.getCcuscode());

		List list = saleBillVouchsMapper.selectByKPVIN(saleBillVouch.getSbvid());
		BigDecimal totalAmount = new BigDecimal(0);

		for (int i = 0; i < list.size(); i++) {
			SaleBillVouchs saleBillVouchs = (SaleBillVouchs) list.get(i);// 获取每一个Example对象
			Element invoiceItem = invoiceDTO.addElement("invoiceItem");

			Element cSOCode = invoiceItem.addElement("cSOCode");//
			Element cDefine23 = invoiceItem.addElement("cDefine23");//

			Element cInvSN = invoiceItem.addElement("cInvSN");//
			Element iNatSum = invoiceItem.addElement("iNatSum");//

			cSOCode.addText(saleBillVouchs.getCsocode());
			cInvSN.addText(saleBillVouchs.getCdefine28());
			cDefine23.addText(saleBillVouchs.getCdefine23() == null ? "" : saleBillVouchs.getCdefine23());
			iNatSum.addText(saleBillVouchs.getInatsum().toString());
			totalAmount = totalAmount.add(new BigDecimal(saleBillVouchs.getInatsum().toString()));
		}
		iNatSumAll.addText(totalAmount.toString());
		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		// String res_xml ="";
		// String res_xml =
		// ehrToLesService.toInventory(req_xml,"TransferFormInterface");
		String res_xml = ehrToLesService.toDms(req_xml, "invoiceinfo");
		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(saleBillVouch.getCsbvcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				saleBillVouchMapper.updateSaleBillVouch(saleBillVouch.getSbvid(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
				// System.out.println("123456"+feedbackCode);
				saleBillVouchMapper.updateSaleBillVouch(saleBillVouch.getSbvid(), "F");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("ERP开票信息接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	@Override
	@DataSourceChange("slave")
	public SysQrtzLog toSCRKQT(Rdrecord08 rdrecord08) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("48");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
		String uuid = UUID.randomUUID().toString();
		Element interfaceDTO = doc.addElement("InterfaceDTO");
		List list = this.rdrecords08Mapper.selectBySCRKCGVINQT(rdrecord08.getId());

		Element rootElm;
		for(int i = 0; i < list.size(); ++i) {
			Rdrecords08 rdrecords08 = (Rdrecords08)list.get(i);
			Element VehicleDTO = interfaceDTO.addElement("VehicleDTO");
			Element GUID = VehicleDTO.addElement("GUID");
			Element cInvSN = VehicleDTO.addElement("cInvSN");
			Element cInvCode = VehicleDTO.addElement("cInvCode");
			Element csocode = VehicleDTO.addElement("csocode");
			Element cDefine22 = VehicleDTO.addElement("cDefine22");
			rootElm = VehicleDTO.addElement("cDefine23");
			Element cDefine24 = VehicleDTO.addElement("cDefine24");
			Element cDefine25 = VehicleDTO.addElement("cDefine25");
			Element cDefine26 = VehicleDTO.addElement("cDefine26");
			Element cDefine36 = VehicleDTO.addElement("cDefine36");
			Element ddate = VehicleDTO.addElement("ddate");
			Element cWhName = VehicleDTO.addElement("cWhName");
			GUID.addText(uuid);
			cInvSN.addText(rdrecords08.getcInvSN() == null ? "" : rdrecords08.getcInvSN());
			cInvCode.addText(rdrecords08.getCinvcode());
			csocode.addText(rdrecords08.getCdefine29() == null ? "" : rdrecords08.getCdefine29());
			cDefine22.addText(rdrecords08.getcSNDefine1() == null ? "" : rdrecords08.getcSNDefine1());
			rootElm.addText(rdrecords08.getcSNDefine2() == null ? "" : rdrecords08.getcSNDefine2());
			cDefine24.addText(rdrecords08.getcSNDefine3() == null ? "" : rdrecords08.getcSNDefine3());
			cDefine25.addText(rdrecords08.getcSNDefine4() == null ? "" : rdrecords08.getcSNDefine4());
			cDefine26.addText(rdrecords08.getcSNDefine5() == null ? "" : rdrecords08.getcSNDefine5());
			cDefine36.addText((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord08.getDdate()));
			ddate.addText((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(rdrecord08.getDdate()));
			cWhName.addText(rdrecord08.getCwhcode() == null ? "" : rdrecord08.getCwhcode().toString());
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);

		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException var26) {
			var26.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		System.out.println(req_xml);
		String res_xml = this.ehrToLesService.toDms(req_xml, "vehicleinfo");
		System.out.println("----------" + res_xml);
		sysQrtLog.setCodeNo(rdrecord08.getCcode());

		try {
			String ERR_MESSAGE;
			try {
				String RESULT_FLAG = "";
				ERR_MESSAGE = "";
				Document document = DocumentHelper.parseText(res_xml);
				rootElm = document.getRootElement();
				RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
				System.out.println("----------" + RESULT_FLAG);
				String logStatus = "";
				if ("10011001".equals(RESULT_FLAG)) {
					this.rdrecord08Mapper.updateRdrecord08(rdrecord08.getId(), "T");
					logStatus = "1";
				} else {
					logStatus = "0";
					ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();
					this.rdrecord08Mapper.updateRdrecord08(rdrecord08.getId(), "F");
				}

				String message = ERR_MESSAGE.toString();
				if (message.length() > 3000) {
					message = message.substring(0, 3000);
				}

				sysQrtLog.setLogStatus(logStatus);
				sysQrtLog.setDescription(message);
				sysQrtLog.setCreateDate(new Date());
			} catch (Exception var27) {
				LOGGER.error("\u8f66\u8f86\u9500\u53f8\u5165\u5e93\uff08\u5176\u4ed6\uff09\u63a5\u53e3\u5f02\u5e38{}", var27);
				sysQrtLog.setLogStatus("0");
				ERR_MESSAGE = var27.toString();
				if (ERR_MESSAGE.length() > 3000) {
					ERR_MESSAGE = ERR_MESSAGE.substring(0, 3000);
				}

				sysQrtLog.setDescription(ERR_MESSAGE);
				sysQrtLog.setCreateDate(new Date());
			}
		} finally {
			;
		}

		return sysQrtLog;
	}

	// 库存校验信息反馈接
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toKCFK(SOSOMain sOSOMain) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("37");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		Element interfaceDTO = doc.addElement("InterfaceDTO");
		Element partOrderFeedbackDTO = interfaceDTO.addElement("PartOrderFeedbackDTO");
		Element GUID = partOrderFeedbackDTO.addElement("GUID");

		Element cSOCode = partOrderFeedbackDTO.addElement("cSOCode");
		Element ID = partOrderFeedbackDTO.addElement("ID");
		Element TYPE = partOrderFeedbackDTO.addElement("TYPE");

		GUID.addText(UUID.randomUUID().toString());
		cSOCode.addText(sOSOMain.getCsocode());
		ID.addText(sOSOMain.getId().toString());
		String cstcode = sOSOMain.getCstcode().toString();
		if (cstcode.equals("10") || cstcode.equals("11")) {
			TYPE.addText("39051001");
		} else {
			TYPE.addText("39051003");
		}

		List list = sOSODetailsMapper.selectByALLSOSODetails(sOSOMain.getId());

		for (int i = 0; i < list.size(); i++) {
			SOSODetails sOSODetails = (SOSODetails) list.get(i);// 获取每一个Example对象
			Element partOrderFeedbackItemDTO = partOrderFeedbackDTO.addElement("partOrderFeedbackItemDTO");

			Element iRowNo = partOrderFeedbackItemDTO.addElement("iRowNo");// 行号

			Element cInvCode = partOrderFeedbackItemDTO.addElement("cInvCode");//
			Element iQuantity = partOrderFeedbackItemDTO.addElement("iQuantity");//
			Element AutoID = partOrderFeedbackItemDTO.addElement("AutoID");//

			iRowNo.addText(sOSODetails.getIrowno().toString());
			cInvCode.addText(sOSODetails.getCinvcode());
			iQuantity.addText(sOSODetails.getIquantity().toString());
			AutoID.addText(sOSODetails.getIsosid().toString());

		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);

		String res_xml = ehrToLesService.toDms(req_xml, "partorderfeedbackinfo");
		System.out.println("----------" + res_xml);

		sysQrtLog.setCodeNo(sOSOMain.getCsocode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);

			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				sOSOMainMapper.updateSOSOMain(sOSOMain.getId(), "T");
				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();

				sOSOMainMapper.updateSOSOMain(sOSOMain.getId(), "F");

			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("库存校验信息反馈接异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 审核接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toFHSH(DispatchList dispatchList) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("40");// 日志类型 -12：审核接口
		String sender = Global.getSenderDMS();
		String id = dispatchList.getDlid().toString();
		sysQrtLog.setCodeNo(dispatchList.getCdlcode());

		String requestXml = "";
		try {

			if (dispatchList.getBreturnflag() == false) {

				requestXml = "<ufinterface sender=\"" + sender + "\" receiver=\"u8\" roottag=\"u8api\" proc=\"verify\">"
						+ " <u8apiservice>" + " <context>"
						+ " <param name=\"VoucherType\" value=\"9\" datatype=\"int\"/>" + " </context>"
						+ "  <apiurl value=\"U8API/Consignment/Audit\"></apiurl>" + "  <apiParams>"
						+ "   <param name=\"bVerify\" value=\"true\" datatype=\"bool\"/>"
						+ " <param name=\"domHead\" datatype=\"IXMLDOMDocument2\">" + "  <![CDATA["
						+ " <xml xmlns:s=\"uuid:BDC6E3F0-6DA3-11d1-A2A3-00AA00C14882\" xmlns:dt=\"uuid:C2F41010-65B3-11d1-A29F-00AA00C14882\" xmlns:rs=\"urn:schemas-microsoft-com:rowset\" xmlns:z=\"#RowsetSchema\" makevoucherruleid=\"\">"
						+ " 	<rs:data><z:row dlid=\"" + dispatchList.getDlid().toString()
						+ "\"  breturnflag=\"0\"  /><ischeck>false</ischeck></rs:data></xml>" + " 	]]>" + " </param>"
						+ "  </apiParams>" + " <returnParams>" + "  <param name=\"VouchId\"/>"
						+ "   <param name=\"errMsg\"/>" + "  </returnParams>" + "  </u8apiservice>" + " </ufinterface>";

			} else {
				System.out.println("tuihuo");
				requestXml = "<ufinterface sender=\"" + sender + "\" receiver=\"u8\" roottag=\"u8api\" proc=\"verify\">"
						+ " <u8apiservice>" + " <context>"
						+ " <param name=\"VoucherType\" value=\"10\" datatype=\"int\"/>" + " </context>"
						+ "  <apiurl value=\"U8API/ReturnOrder/Audit\"></apiurl>" + "  <apiParams>"
						+ "   <param name=\"bVerify\" value=\"true\" datatype=\"bool\"/>"
						+ " <param name=\"domHead\" datatype=\"IXMLDOMDocument2\">" + "  <![CDATA["
						+ " <xml xmlns:s=\"uuid:BDC6E3F0-6DA3-11d1-A2A3-00AA00C14882\" xmlns:dt=\"uuid:C2F41010-65B3-11d1-A29F-00AA00C14882\" xmlns:rs=\"urn:schemas-microsoft-com:rowset\" xmlns:z=\"#RowsetSchema\" makevoucherruleid=\"\">"
						+ " 	<rs:data><z:row dlid=\"" + dispatchList.getDlid().toString()
						+ "\"  breturnflag=\"1\"  /><ischeck>false</ischeck></rs:data></xml>" + " 	]]>" + " </param>"
						+ "  </apiParams>" + " <returnParams>" + "  <param name=\"VouchId\"/>"
						+ "   <param name=\"errMsg\"/>" + "  </returnParams>" + "  </u8apiservice>" + " </ufinterface>";
			}

			URL url = new URL(Global.getu8UR());

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000000);
			con.setReadTimeout(3000000);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
			con.setRequestProperty("ContentType", "text/xml;charset=utf-8");

			// 发送Request消息

			OutputStream out = con.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);

			System.out.println(requestXml.getBytes("UTF-8"));
			System.out.println("222" + requestXml);
			dos.write(requestXml.getBytes("UTF-8"));
			dos.close();
			// 获取Response消息
			InputStream in = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			StringBuilder sb = new StringBuilder();

			String s = null;
			while ((s = br.readLine()) != null) {

				sb.append(s);
			}
			String res_xml = sb.toString();
			br.close();

			System.out.println("----------" + res_xml);
			// String res_xml="";

			// 解析返回的xml
			String feedbackCode = "";

			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			Element u8apireturn = rootElm.element("u8apireturn");

			feedbackCode = u8apireturn.attribute("issuccess").getValue().trim().toString();//
			sysQrtLog.setCodeNo(dispatchList.getCdlcode());

			System.out.println("----------" + feedbackCode);
			// System.out.println("----------"+inventory.getiId());
			String message = "";
			String logStatus = "";
			if ("true".equals(feedbackCode)) {
				dispatchListMapper.updateDispatchList(dispatchList.getDlid(), "T");
				logStatus = "1";
				message = "SUCCESS";
			} else {
				logStatus = "0";
				message = u8apireturn.element("error").getText().trim();
				dispatchListMapper.updateDispatchList(dispatchList.getDlid(), "F");
			}

			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("dms审核接口异常{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	// 排产计划反馈接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toJHFK(MomOrderdetail momOrderdetail) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("34");//
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();

		String uuid = UUID.randomUUID().toString();

		Element interfaceDTO = doc.addElement("InterfaceDTO");

		Element vehicleProductionPlanFeedbackDTO = interfaceDTO.addElement("VehicleProductionPlanFeedbackDTO");
		Element GUID = vehicleProductionPlanFeedbackDTO.addElement("GUID");

		Element FoCode = vehicleProductionPlanFeedbackDTO.addElement("FoCode");
		Element cInvCode = vehicleProductionPlanFeedbackDTO.addElement("cInvCode");

		GUID.addText(uuid);

		FoCode.addText(momOrderdetail.getSocode());
		cInvCode.addText(momOrderdetail.getCinvcode());

		List list = momOrderdetailMapper.selectByMomOrderdetailJHFKMX(momOrderdetail.getSocode(),
				momOrderdetail.getCinvcode());

		for (int i = 0; i < list.size(); i++) {
			MomOrderdetail momOrderdetailmx = (MomOrderdetail) list.get(i);// 获取每一个Example对象
			Element vehicleProductionPlanFeedbackItem = vehicleProductionPlanFeedbackDTO
					.addElement("vehicleProductionPlanFeedbackItem");

			Element Fqty = vehicleProductionPlanFeedbackItem.addElement("Fqty");
			Element StartDate = vehicleProductionPlanFeedbackItem.addElement("StartDate");
			Element EndDate = vehicleProductionPlanFeedbackItem.addElement("EndDate");

			Fqty.addText(momOrderdetailmx.getQty().toString());

			StartDate.addText(
					(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(momOrderdetailmx.getStartdate()));

			EndDate.addText(
					(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(momOrderdetailmx.getDuedate()));
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("UTF-8");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw = new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toDms(req_xml, "vehicleproductionplanfeedbackinfo");
		System.out.println("----------" + res_xml);
		sysQrtLog.setCodeNo(momOrderdetail.getSocode() + ":" + momOrderdetail.getCinvcode());
		try {
			// 解析返回的xml
			String RESULT_FLAG = "";
			String ERR_MESSAGE = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();

			RESULT_FLAG = rootElm.element("RESULT_FLAG").getText().trim();
			System.out.println("----------" + RESULT_FLAG);
			String logStatus = "";
			if ("10011001".equals(RESULT_FLAG)) {
				for (int i = 0; i < list.size(); i++) {
					MomOrderdetail momOrderdetailmx = (MomOrderdetail) list.get(i);// 获取每一个Example对象
					momOrderdetailMapper.updateMomOrderdetailJHFK(momOrderdetailmx.getModid(), "T");
				}

				logStatus = "1";
			} else {
				logStatus = "0";
				ERR_MESSAGE = rootElm.element("ERR_MESSAGE").getText().trim();

				for (int i = 0; i < list.size(); i++) {
					MomOrderdetail momOrderdetailmx = (MomOrderdetail) list.get(i);// 获取每一个Example对象
					momOrderdetailMapper.updateMomOrderdetailJHFK(momOrderdetailmx.getModid(), "F");
				}
			}

			String message = ERR_MESSAGE.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("排产计划反馈接口{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}

	}

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog updateSOSOMainStatus(int autoid, String cdefine25) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("47");//

		try {
			int i = sOSOMainMapper.updateSOSOMainStatus(autoid, cdefine25);
			String logStatus = "";

			if (i >= 1) {

				logStatus = "1";
			} else {

				logStatus = "0";
			}
			Integer autoidInt = autoid;
			sysQrtLog.setCodeNo(autoidInt.toString());
			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription("更改订单成功");

			sysQrtLog.setCreateDate(new Date());
			return sysQrtLog;
		} catch (Exception e) {
			LOGGER.error("同步库存反馈接口{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}
	}

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog updateSosomainChange(int autoid,String cinvcode, String csocode, BigDecimal currentIquantity) {
		SysQrtzLog sysQrtLog = new SysQrtzLog("47");//

		try {
			int i = sOSOMainMapper.updateSosomainChange(autoid, currentIquantity.intValue());
			String logStatus = ""; 

			if (i >= 1) {

				logStatus = "1";
			} else {

				logStatus = "0";
			}
			sysQrtLog.setCodeNo(cinvcode + "+" + csocode);
			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription("更改订单行成功");

			sysQrtLog.setCreateDate(new Date());
			return sysQrtLog;
		} catch (Exception e) {
			LOGGER.error("同步库存反馈接口{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}
	}

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog closeSOSODetails(Integer autoid, String cinvcode, String csocode) {

		String closePeople = "haqcPeople";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String closeDate = dateFormat.format(new Date());

		SysQrtzLog sysQrtLog = new SysQrtzLog("47");//

		try {
			int i = sOSOMainMapper.closeSOSODetails(autoid, closePeople, closeDate);
			String logStatus = "";

			if (i >= 1) {

				logStatus = "1";
			} else {

				logStatus = "0";
			}
			sysQrtLog.setCodeNo(cinvcode + "+" + csocode);
			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription("关闭订单行成功");

			sysQrtLog.setCreateDate(new Date());

			return sysQrtLog;
		} catch (Exception e) {
			LOGGER.error("同步库存接口{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}
	}

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog closeSOSOmain(Integer id) {
		String closePeople = "haqcPeople";

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String closeDate = dateFormat.format(new Date());
		SysQrtzLog sysQrtLog = new SysQrtzLog("47");//

		try {
			int i = sOSOMainMapper.closeSOSOmain(id, closePeople, closeDate);
			String logStatus = "";

			if (i >= 1) {

				logStatus = "1";
			} else {

				logStatus = "0";
			}
			Integer autoidInt = id;
			sysQrtLog.setCodeNo(autoidInt.toString());
			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription("关闭订单成功");

			sysQrtLog.setCreateDate(new Date());

			return sysQrtLog;
		} catch (Exception e) {
			LOGGER.error("同步库存接口反馈接口{}", e);
			sysQrtLog.setLogStatus("0");
			String ms = e.toString();
			if (ms.length() > 3000) {
				ms = ms.substring(0, 3000);
			}

			sysQrtLog.setDescription(ms);

			sysQrtLog.setCreateDate(new Date());

		} finally {
			return sysQrtLog;
		}
	}

}
