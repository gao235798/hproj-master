package com.espread.sys.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.espread.sys.mapper.DepartmentMapper;
import com.espread.sys.mapper.InventoryMapper;
import com.espread.sys.mapper.MomMoallocateMapper;
import com.espread.sys.mapper.MomOrderdetailMapper;
import com.espread.sys.mapper.Mom_SndetailMapper;
import com.espread.sys.mapper.POPodetailsMapper;
import com.espread.sys.mapper.POPomainMapper;
import com.espread.sys.mapper.Rdrecord10Mapper;
import com.espread.sys.mapper.Rdrecord11Mapper;
import com.espread.sys.mapper.Rdrecords10Mapper;
import com.espread.sys.mapper.Rdrecords11Mapper;
import com.espread.sys.mapper.TransVouchMapper;
import com.espread.sys.mapper.TransVouchsMapper;
import com.espread.sys.mapper.VendorMapper;
import com.espread.sys.mapper.WarehouseMapper;
import com.espread.sys.mapper.fitemss02Mapper;
import com.espread.sys.model.Department;
import com.espread.sys.model.Inventory;
import com.espread.sys.model.MomMoallocate;
import com.espread.sys.model.MomOrderdetail;
import com.espread.sys.model.Mom_Sndetail;
import com.espread.sys.model.POPodetails;
import com.espread.sys.model.POPomain;
import com.espread.sys.model.Rdrecord10;
import com.espread.sys.model.Rdrecord11;
import com.espread.sys.model.Rdrecords10;
import com.espread.sys.model.Rdrecords11;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.TransVouch;
import com.espread.sys.model.TransVouchs;
import com.espread.sys.model.Vendor;
import com.espread.sys.model.Warehouse;
import com.espread.sys.model.fitemss02;
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
public class EhrToLesXmlImpl implements EhrToLesXml {
	private static Logger LOGGER = LoggerFactory.getLogger(EhrToLesXmlImpl.class);

	@Autowired
	private EhrToLesService ehrToLesService;
	@Autowired
	private InventoryService inventoryService;
	@Autowired
	private InventoryMapper inventoryMapper;
	
	@Autowired
	private TransVouchMapper transVouchMapper;
	
	 @Autowired
	 private TransVouchsMapper transVouchsMapper;
	 
	 @Autowired
	 private Rdrecord10Mapper rdrecord10Mapper;
	 
	 @Autowired
	 private Rdrecords10Mapper rdrecords10Mapper;
	 
	 @Autowired
	 private POPomainMapper pOPomainMapper;
	 
	 @Autowired
	 private POPodetailsMapper pOPodetailsMapper;
	 
	 
	 @Autowired
	 private MomMoallocateMapper momMoallocateMapper;
	 
	 @Autowired
	 private Mom_SndetailMapper mom_SndetailMapper;
	 
	 @Autowired
	 private MomOrderdetailMapper momOrderdetailMapper;
	 
	 @Autowired
	 private Rdrecord11Mapper rdrecord11Mapper;
	 @Autowired
	 private Rdrecords11Mapper rdrecords11Mapper;
	 
	 
	 @Autowired
	 private WarehouseMapper warehouseMapper;
	 
	 
	 @Autowired
	 private fitemss02Mapper fitemss02Mapper;
	 
	 @Autowired
	 private DepartmentMapper departmentMapper; 
	 
	 @Autowired
	 private VendorMapper vendorMapper; 
	 
	 
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toInventory(Inventory inventory) {

		SysQrtzLog sysQrtLog= new SysQrtzLog("1");
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
	
		
	
		Element arrayOfMaterialModelElt = doc.addElement("ArrayOfMaterialModel");
		Element materialModelElt = arrayOfMaterialModelElt.addElement("MaterialModel");
		Element factoryCode = materialModelElt.addElement("FactoryCode");// 工厂

		Element code = materialModelElt.addElement("Code");// 编码

		Element figureNo = materialModelElt.addElement("FigureNo");// 图号

		Element name = materialModelElt.addElement("Name");// 名称
		Element spec = materialModelElt.addElement("Spec");// 规格型号
		Element validPeriod = materialModelElt.addElement("ValidPeriod");// 有效期限（天）
		Element categoryCode = materialModelElt.addElement("CategoryCode");// 物料类别
		Element aBCClassification = materialModelElt.addElement("ABCClassification");// 

		Element unit = materialModelElt.addElement("Unit");// 单位
		Element orderNo = materialModelElt.addElement("OrderNo");// 顺序号
		Element isDisabled = materialModelElt.addElement("IsDisabled");// 是否禁用
		Element isDeleted = materialModelElt.addElement("IsDeleted");// 是否删除

		factoryCode.addText("002");
		code.addText(inventory.getCinvcode());
		figureNo.addText("");
		name.addText(inventory.getCinvname() == null ? "" : inventory.getCinvname());
		spec.addText(inventory.getCinvstd() == null ? "" : inventory.getCinvstd());
		validPeriod.addText("");
		orderNo.addText("");
		categoryCode.addText(inventory.getCinvccode() == null ? "" : inventory.getCinvccode());
		aBCClassification.addText(inventory.getCinvabc() == null ? "" : inventory.getCinvabc());
		unit.addText(inventory.getcComUnitName() == null ? "" : inventory.getcComUnitName());
		isDisabled.addText(inventory.getDedate() == null ? "0" : "1");
		isDeleted.addText(inventory.getTtype().equals("3") ? "1" : "0");

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("gb2312");

		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw= new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		
//		req_xml="<?xml version=\"1.0\" encoding=\"GB2312\"?>"
//
//		+"<ArrayOfMaterialModel>"
//
//
//		+"<MaterialModel>"
//
//		+"<FactoryCode>002</FactoryCode>"
//
//		+"<Code>10100070003</Code>"
//
//		+"<Name>开平板-侧围外板</Name>"
//
//		+"<Spec>DC06/0.7/2865*1655</Spec>"
//
//		+"<ValidPeriod>0</ValidPeriod>"
//
//		+"<CategoryCode>X01</CategoryCode>"
//
//		+"<Unit>吨</Unit>"
//
//		+"<OrderNo>1</OrderNo>"
//
//		+"<IsDisabled>false</IsDisabled>"
//
//		+"<IsDeleted>false</IsDeleted>"
//
//		+"</MaterialModel>"
//
//		+"</ArrayOfMaterialModel>";

		System.out.println(req_xml);
		String res_xml = ehrToLesService.toInventory(req_xml,"MaterialInterface");

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(inventory.getCinvcode());
		try {
			// 解析返回的xml
			String feedbackCode = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			feedbackCode = rootElm.element("feedbackCode").getText().trim();
			System.out.println("----------" + feedbackCode);
			System.out.println("----------" + inventory.getiId());
			String logStatus = "";
			if ("SUCCESS".equals(feedbackCode)) {
				inventoryMapper.updateInventory(inventory.getiId(),"1");
				logStatus = "1";
			} else {
				logStatus = "0";
				inventoryMapper.updateInventory(inventory.getiId(),"2");
				// System.out.println("123456"+feedbackCode);

			}

			String message = feedbackCode.toString();
			if (message.length() > 3000) 
			{
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("存货接口异常{}", e);
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

	// 仓库
	 
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toWarehouse(Warehouse warehouse) {

		SysQrtzLog sysQrtLog= new SysQrtzLog("2");// 日志类型 -2：同步仓库主数据
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
		
		Element arrayOfWarehouseModel = doc.addElement("ArrayOfWarehouseModel");
		Element warehouseModel = arrayOfWarehouseModel.addElement("WarehouseModel");
		Element factoryCode = warehouseModel.addElement("FactoryCode");// 工厂

		Element name = warehouseModel.addElement("Name");// 名称
		Element Short = warehouseModel.addElement("Short");// 简称
		Element code = warehouseModel.addElement("Code");// 编码

		Element warehouseType = warehouseModel.addElement("WarehouseType");// 仓库类别
																				// 10.物流仓库
																				// 20.虚拟仓库
																				// 30.生产线边仓库
																				// -e
																				// WarehouseType

		Element isPackage = warehouseModel.addElement("IsPackage");// 是否按箱管理
		Element erpCode = warehouseModel.addElement("ErpCode");// ERP 仓库代码
		Element IsOnShelf = warehouseModel.addElement("IsOnShelf");// 是否启用上下架管理
		Element isDisabled = warehouseModel.addElement("IsDisabled");// 是否禁用
		Element isDeleted = warehouseModel.addElement("IsDeleted");// 是否删除

		factoryCode.addText("002");
		name.addText(warehouse.getCwhname() == null ? "" : warehouse.getCwhname());
		Short.addText(warehouse.getCwhname() == null ? "" : warehouse.getCwhname());
		code.addText(warehouse.getCwhcode() == null ? "" : warehouse.getCwhcode());
		//warehouseType.addText(warehouse.getCwaregroupcode() == null ? "" : warehouse.getCwaregroupcode());
		warehouseType.addText("10");//????
		isPackage.addText("");
		erpCode.addText("");
		IsOnShelf.addText("");

		isDisabled.addText(warehouse.getDwhenddate() == null ? "0" : "1");
		
		isDeleted.addText(warehouse.getTtype().equals("3") ? "1" : "0");

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("gb2312");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw= new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		
		System.out.println(req_xml);
		String res_xml = ehrToLesService.toInventory(req_xml,"WarehouseInterface");

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(warehouse.getCwhcode());
		try {
			// 解析返回的xml
			String feedbackCode = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			feedbackCode = rootElm.element("feedbackCode").getText().trim();
			System.out.println("----------" + feedbackCode);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("SUCCESS".equals(feedbackCode)) {
				warehouseMapper.updateWarehouse(warehouse.getiId(),"1");
				// inventoryService.updateInventory(inventory.getiId());
				logStatus = "1";
			} else {
				warehouseMapper.updateWarehouse(warehouse.getiId(),"2");
				logStatus = "0";
				// System.out.println("123456"+feedbackCode);

			}

			String message = feedbackCode.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("仓库接口异常{}", e);
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

	// 部门

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toDepartment(Department department) {

		SysQrtzLog sysQrtLog= new SysQrtzLog("3");// 日志类型 -3：同步成本中心
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
		
		Element arrayOfCostCenterModel = doc.addElement("ArrayOfCostCenterModel");
		Element CostCenterModel = arrayOfCostCenterModel.addElement("CostCenterModel");
		Element factoryCode = CostCenterModel.addElement("FactoryCode");// 工厂

		Element name = CostCenterModel.addElement("Name");// 名称
		// Element Short = materialModelElt.addElement("Short");//简称
		Element code = CostCenterModel.addElement("Code");// 编码

		// Element warehouseType =
		// materialModelElt.addElement("WarehouseType");//仓库类别 10.物流仓库 20.虚拟仓库
		// 30.生产线边仓库 -e WarehouseType

		// Element isPackage = materialModelElt.addElement("IsPackage");//是否按箱管理
		// Element erpCode = materialModelElt.addElement("ErpCode");//ERP 仓库代码
		// Element IsOnShelf =
		// materialModelElt.addElement("IsOnShelf");//是否启用上下架管理
		Element OrderNo = CostCenterModel.addElement("OrderNo");// 顺序号
		Element isDisabled = CostCenterModel.addElement("IsDisabled");// 是否禁用
		Element isDeleted = CostCenterModel.addElement("IsDeleted");// 是否删除

		factoryCode.addText("002");
		name.addText(department.getCdepname() == null ? "" : department.getCdepname());

		code.addText(department.getCdepcode() == null ? "" : department.getCdepcode());

		OrderNo.addText("");

		isDisabled.addText(department.getDdependdate() == null ? "0" : "1");

		isDeleted.addText(department.getTtype().equals("3") ? "1" : "0");

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("gb2312");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw= new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		
		System.out.println(req_xml);
		String res_xml = ehrToLesService.toInventory(req_xml,"CostCenterInterface");
		//String res_xml = ehrToLesService.toInventory(req_xml,"SayHello");
		

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(department.getCdepcode());
		try {
			// 解析返回的xml
			String feedbackCode = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			feedbackCode = rootElm.element("feedbackCode").getText().trim();
			System.out.println("----------" + feedbackCode);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("SUCCESS".equals(feedbackCode)) {
				// inventoryService.updateInventory(inventory.getiId());
				departmentMapper.updateDepartment(department.getiId(),"1");
				logStatus = "1";
			} else {
				logStatus = "0";
				departmentMapper.updateDepartment(department.getiId(),"2");
				// System.out.println("123456"+feedbackCode);

			}

			String message = feedbackCode.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("部门接口异常{}", e);
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

	// 供应商

	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toVendor(Vendor vendor) {

		SysQrtzLog sysQrtLog= new SysQrtzLog("4");// 日志类型 -4：同步供应商主数据
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
		
		Element arrayOfSupplierModel = doc.addElement("ArrayOfSupplierModel");
		Element supplierModel = arrayOfSupplierModel.addElement("SupplierModel");
		Element factoryCode = supplierModel.addElement("FactoryCode");// 工厂

		Element name = supplierModel.addElement("Name");// 名称
		Element enName = supplierModel.addElement("EnName");// 英文名称
		Element category = supplierModel.addElement("Category");// 企业类别
																	// 10.供应商
																	// 20.客户
																	// -默认10
		Element typeCode = supplierModel.addElement("TypeCode");// 企业类型

		Element code = supplierModel.addElement("Code");// 编码
		Element abbreviate = supplierModel.addElement("Abbreviate");// 缩写

		Element duns = supplierModel.addElement("Duns");// 邓白氏编码

		Element address = supplierModel.addElement("Address");// 地址
		Element postCode = supplierModel.addElement("PostCode");// 邮政编码
		Element contact = supplierModel.addElement("Contact");// 联系人
		Element tel = supplierModel.addElement("Tel");// 电话
		Element fax = supplierModel.addElement("Fax");// 传真
		Element email = supplierModel.addElement("Email");// 邮箱

		Element OrderNo = supplierModel.addElement("OrderNo");// 顺序号
		Element isDisabled = supplierModel.addElement("IsDisabled");// 是否禁用
		Element isDeleted = supplierModel.addElement("IsDeleted");// 是否删除

		factoryCode.addText("002");
		name.addText(vendor.getCvenname() == null ? "" : vendor.getCvenname());
		enName.addText("");
		category.addText("10");
		typeCode.addText("");
		code.addText(vendor.getCvencode() == null ? "" : vendor.getCvencode());

		//abbreviate.addText(vendor.getCvenabbname() == null ? "" : vendor.getCvenabbname());
		abbreviate.addText("");

		duns.addText("");
		address.addText(vendor.getCvenaddress() == null ? "" : vendor.getCvenaddress());
		postCode.addText(vendor.getCvenpostcode() == null ? "" : vendor.getCvenpostcode());
		contact.addText(vendor.getCvenperson() == null ? "" : vendor.getCvenperson());
		tel.addText(vendor.getCvenhand() == null ? "" : vendor.getCvenhand());
		fax.addText(vendor.getCvenfax() == null ? "" : vendor.getCvenfax());
		email.addText(vendor.getCvenemail() == null ? "" : vendor.getCvenemail());

		OrderNo.addText("");

		isDisabled.addText(vendor.getDenddate() == null ? "0" : "1");
		
		isDeleted.addText(vendor.getTtype().equals("3") ? "1" : "0");

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("gb2312");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw= new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		
		System.out.println(req_xml);
		String res_xml = ehrToLesService.toInventory(req_xml,"SupplierInterface");

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(vendor.getCvencode());
		try {
			// 解析返回的xml
			String feedbackCode = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			feedbackCode = rootElm.element("feedbackCode").getText().trim();
			System.out.println("----------" + feedbackCode);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("SUCCESS".equals(feedbackCode)) {
				// inventoryService.updateInventory(inventory.getiId());
				vendorMapper.updateVendor(vendor.getiId(),"1");
				
				logStatus = "1";
			} else {
				vendorMapper.updateVendor(vendor.getiId(),"2");
				logStatus = "0";
				// System.out.println("123456"+feedbackCode);

			}

			String message = feedbackCode.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("供应商接口异常{}", e);
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
//调拨领料单接口
	@Override
	@DataSourceChange(Const.DATASOURCE_SLAVE)
	public SysQrtzLog toDbll(TransVouch transVouch) {
		SysQrtzLog sysQrtLog= new SysQrtzLog("5");// 日志类型 -5：调拨领料单接口
		DocumentFactory df = DocumentFactory.getInstance();
		Document doc = df.createDocument();
		
		Element arrayOfTransferFormModel = doc.addElement("ArrayOfTransferFormModel");
		Element transferFormModel = arrayOfTransferFormModel.addElement("TransferFormModel");
		Element factoryCode = transferFormModel.addElement("FactoryCode");// 工厂

		Element no = transferFormModel.addElement("No");// 单据号
		Element moveTypeCode = transferFormModel.addElement("MoveTypeCode");// 移库类型
		Element moveCategory = transferFormModel.addElement("MoveCategory");// 移库计划类型: 10.入库 20.出库 30.外部移库 40.内部移库
		Element sourceWarehouseCode = transferFormModel.addElement("SourceWarehouseCode");// 来源仓库代码

		Element sourceCompanyCode = transferFormModel.addElement("SourceCompanyCode");// 来源企业代码
		Element sourceName = transferFormModel.addElement("SourceName");// 来源名称
		
		Element inboundERPCode = transferFormModel.addElement("InboundERPCode");// 调出代码
		
		Element outboundERPCode = transferFormModel.addElement("OutboundERPCode");// 调入代码

		Element targetWarehouseCode = transferFormModel.addElement("TargetWarehouseCode");// 目标仓库代码

		Element targetCompanyCode = transferFormModel.addElement("TargetCompanyCode");// 目标企业代码
		Element targetName = transferFormModel.addElement("TargetName");// 目标名称
		Element comment = transferFormModel.addElement("Comment");// 备注
		Element transferFormItemModels = transferFormModel.addElement("TransferFormItemModels");// 
		
		

		factoryCode.addText("002");
		no.addText(transVouch.getCtvcode() == null ? "" : transVouch.getCtvcode());
		moveTypeCode.addText("100");
		
		moveCategory.addText(transVouch.getCordcode() == null ? "" : transVouch.getCordcode());//??????
		
		sourceWarehouseCode.addText(transVouch.getCowhcode() == null ? "" : transVouch.getCowhcode());
		sourceCompanyCode.addText("");
		sourceName.addText("");


		targetWarehouseCode.addText(transVouch.getCiwhcode() == null ? "" : transVouch.getCiwhcode());
		targetCompanyCode.addText("");
		targetName.addText("");
		
		inboundERPCode.addText(transVouch.getCirdcode() == null ? "" : transVouch.getCirdcode());
		outboundERPCode.addText(transVouch.getCordcode() == null ? "" : transVouch.getCordcode());
		comment.addText(transVouch.getCtvmemo() == null ? "" : transVouch.getCtvmemo());
		
		
		List list = transVouchsMapper.selectByTransVouchs(transVouch.getId());
		
		for (int i = 0; i < list.size(); i++) {
			TransVouchs transVouchs = (TransVouchs) list.get(i);// 获取每一个Example对象
			
			Element transferFormItemModel = transferFormItemModels.addElement("TransferFormItemModel");// 
			Element itemNo = transferFormItemModel.addElement("ItemNo");// 行号

			Element materialCode = transferFormItemModel.addElement("MaterialCode");//物料代码
			Element supplierCode = transferFormItemModel.addElement("SupplierCode");// 供应商代码
			Element batchNumber = transferFormItemModel.addElement("BatchNumber");// 批次号
			
			Element quantity = transferFormItemModel.addElement("Quantity");// 数量
			Element comment1 = transferFormItemModel.addElement("Comment");// 备注
			
			itemNo.addText(transVouchs.getIrowno() == null ? "" : transVouchs.getIrowno().toString());
			materialCode.addText(transVouchs.getCinvcode() == null ? "" : transVouchs.getCinvcode());
			supplierCode.addText(transVouchs.getCbvencode() == null ? "" : transVouchs.getCbvencode());
			batchNumber.addText(transVouchs.getCdefine33() == null ? "" : transVouchs.getCdefine33());
			quantity.addText(transVouchs.getItvquantity() == null ? "" : transVouchs.getItvquantity().toString());
			comment1.addText(transVouchs.getCbmemo() == null ? "" : transVouchs.getCbmemo());
			
		}

		OutputFormat formate = OutputFormat.createPrettyPrint();
		formate.setEncoding("gb2312");
		StringWriter writerStr = new StringWriter();
		XMLWriter xmlw= new XMLWriter(writerStr, formate);
		try {
			xmlw.write(doc);
			xmlw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String req_xml = writerStr.getBuffer().toString();
		
		System.out.println(req_xml);
		String res_xml = ehrToLesService.toInventory(req_xml,"TransferFormInterface");

		System.out.println("----------" + res_xml);
		// String res_xml="";

		sysQrtLog.setCodeNo(transVouch.getCtvcode());
		try {
			// 解析返回的xml
			String feedbackCode = "";
			Document document = DocumentHelper.parseText(res_xml);
			Element rootElm = document.getRootElement();
			// Element returnModel=rootElm.element("ReturnModel");

			feedbackCode = rootElm.element("feedbackCode").getText().trim();
			System.out.println("----------" + feedbackCode);
			// System.out.println("----------"+inventory.getiId());
			String logStatus = "";
			if ("SUCCESS".equals(feedbackCode)) {
				transVouchMapper.updateTransVouch(transVouch.getId(),"T");
				logStatus = "1";
			} else {
				logStatus = "0";
				// System.out.println("123456"+feedbackCode);
				transVouchMapper.updateTransVouch(transVouch.getId(),"F");

			}

			String message = feedbackCode.toString();
			if (message.length() > 3000) {
				message = message.substring(0, 3000);
			}

			// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

			sysQrtLog.setLogStatus(logStatus);
			sysQrtLog.setDescription(message);

			sysQrtLog.setCreateDate(new Date());

		} catch (Exception e) {
			LOGGER.error("调拨领料单接口异常{}", e);
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
	
	
	//物料退库接口
		@Override
		@DataSourceChange(Const.DATASOURCE_SLAVE)
		public SysQrtzLog toWltk(TransVouch transVouch) {
			SysQrtzLog sysQrtLog= new SysQrtzLog("7");// 日志类型 -7：物料退库接口
			DocumentFactory df = DocumentFactory.getInstance();
			Document doc = df.createDocument();
			
			Element arrayOfMaterialReturnModel = doc.addElement("ArrayOfMaterialReturnModel");
			Element materialReturnModel = arrayOfMaterialReturnModel.addElement("MaterialReturnModel");
			Element factoryCode = materialReturnModel.addElement("FactoryCode");// 工厂

			Element no = materialReturnModel.addElement("No");// 单据号
			Element moveTypeCode = materialReturnModel.addElement("MoveTypeCode");// 移库类型
//			Element moveCategory = transferFormModel.addElement("MoveCategory");// 移库计划类型: 10.入库 20.出库 30.外部移库 40.内部移库
			Element sourceWarehouseCode = materialReturnModel.addElement("SourceWarehouseCode");// 来源仓库代码
			
			Element targetWarehouseCode = materialReturnModel.addElement("TargetWarehouseCode");// 目标仓库代码
//
//			Element sourceCompanyCode = transferFormModel.addElement("SourceCompanyCode");// 来源企业代码
//			Element sourceName = transferFormModel.addElement("SourceName");// 来源名称
//
//			Element warehouseCode = materialReturnModel.addElement("WarehouseCode");// 目标仓库代码
//
//			Element targetCompanyCode = transferFormModel.addElement("TargetCompanyCode");// 目标企业代码
//			Element targetName = transferFormModel.addElement("TargetName");// 目标名称
			
			Element inboundERPCode = materialReturnModel.addElement("InboundERPCode");// 调入代码
			
			Element outboundERPCode = materialReturnModel.addElement("OutboundERPCode");// 调出代码
			Element comment = materialReturnModel.addElement("Comment");// 备注
			Element materialReturnItemModels = materialReturnModel.addElement("MaterialReturnItemModels");// 
			
			

			factoryCode.addText("002");
			no.addText(transVouch.getCtvcode() == null ? "" : transVouch.getCtvcode());
			moveTypeCode.addText("120");
			
			//moveCategory.addText(transVouch.getCordcode() == null ? "" : transVouch.getCordcode());//??????
//			moveCategory.addText("");//
//			
//			sourceWarehouseCode.addText(transVouch.getCowhcode() == null ? "" : transVouch.getCowhcode());
//			sourceCompanyCode.addText("");
//			sourceName.addText("");


//			warehouseCode.addText(transVouch.getCiwhcode() == null ? "" : transVouch.getCiwhcode());
//			targetCompanyCode.addText("");
//			targetName.addText("");
			
			sourceWarehouseCode.addText(transVouch.getCowhcode() == null ? "" : transVouch.getCowhcode());
		


			targetWarehouseCode.addText(transVouch.getCiwhcode() == null ? "" : transVouch.getCiwhcode());
			inboundERPCode.addText(transVouch.getCirdcode() == null ? "" : transVouch.getCirdcode());
			outboundERPCode.addText(transVouch.getCordcode() == null ? "" : transVouch.getCordcode());
			comment.addText(transVouch.getCtvmemo() == null ? "" : transVouch.getCtvmemo());
			
			
			List list = transVouchsMapper.selectByTransVouchs(transVouch.getId());
			
			for (int i = 0; i < list.size(); i++) {
				TransVouchs transVouchs = (TransVouchs) list.get(i);// 获取每一个Example对象
				
				Element materialReturnItemModel = materialReturnItemModels.addElement("MaterialReturnItemModel");// 
				Element itemNo = materialReturnItemModel.addElement("ItemNo");// 行号

				Element materialCode = materialReturnItemModel.addElement("MaterialCode");//物料代码
				Element supplierCode = materialReturnItemModel.addElement("SupplierCode");// 供应商代码
				Element batchNumber = materialReturnItemModel.addElement("BatchNumber");// 批次号
				
				Element quantity = materialReturnItemModel.addElement("Quantity");// 数量
				Element comment1 = materialReturnItemModel.addElement("Comment");// 备注
				
				itemNo.addText(transVouchs.getIrowno() == null ? "" : transVouchs.getIrowno().toString());
				materialCode.addText(transVouchs.getCinvcode() == null ? "" : transVouchs.getCinvcode());
				supplierCode.addText(transVouchs.getCbvencode() == null ? "" : transVouchs.getCbvencode());
				batchNumber.addText(transVouchs.getCdefine33() == null ? "" : transVouchs.getCdefine33());
				quantity.addText(transVouchs.getItvquantity() == null ? "" : transVouchs.getItvquantity().toString());
				comment1.addText(transVouchs.getCbmemo() == null ? "" : transVouchs.getCbmemo());
				
			}

			OutputFormat formate = OutputFormat.createPrettyPrint();
			formate.setEncoding("gb2312");
			StringWriter writerStr = new StringWriter();
			XMLWriter xmlw= new XMLWriter(writerStr, formate);
			try {
				xmlw.write(doc);
				xmlw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			String req_xml = writerStr.getBuffer().toString();
			
			System.out.println(req_xml);
			String res_xml = ehrToLesService.toInventory(req_xml,"MaterialReturnInterface");

			System.out.println("----------" + res_xml);
			// String res_xml="";

			sysQrtLog.setCodeNo(transVouch.getCtvcode());
			try {
				// 解析返回的xml
				String feedbackCode = "";
				Document document = DocumentHelper.parseText(res_xml);
				Element rootElm = document.getRootElement();
				// Element returnModel=rootElm.element("ReturnModel");

				feedbackCode = rootElm.element("feedbackCode").getText().trim();
				System.out.println("----------" + feedbackCode);
				// System.out.println("----------"+inventory.getiId());
				String logStatus = "";
				if ("SUCCESS".equals(feedbackCode)) {
					transVouchMapper.updateTransVouch(transVouch.getId(),"T");
					logStatus = "1";
				} else {
					logStatus = "0";
					// System.out.println("123456"+feedbackCode);
					transVouchMapper.updateTransVouch(transVouch.getId(),"F");

				}

				String message = feedbackCode.toString();
				if (message.length() > 3000) {
					message = message.substring(0, 3000);
				}

				// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

				sysQrtLog.setLogStatus(logStatus);
				sysQrtLog.setDescription(message);

				sysQrtLog.setCreateDate(new Date());

			} catch (Exception e) {
				LOGGER.error("物料退库接口异常{}", e);
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
		
		
		//物料报废接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toBf(Rdrecord11 rdrecord11) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("11");// 日志类型 -11：物料报废接口
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfMaterialScrapModel = doc.addElement("ArrayOfMaterialScrapModel");
				Element materialScrapModel = arrayOfMaterialScrapModel.addElement("MaterialScrapModel");
				Element factoryCode = materialScrapModel.addElement("FactoryCode");// 工厂

				Element no = materialScrapModel.addElement("No");// 单据号
				Element moveTypeCode = materialScrapModel.addElement("MoveTypeCode");// 移库类型
//				Element moveCategory = transferFormModel.addElement("MoveCategory");// 移库计划类型: 10.入库 20.出库 30.外部移库 40.内部移库
//				Element sourceWarehouseCode = transferFormModel.addElement("SourceWarehouseCode");// 来源仓库代码
	//
//				Element sourceCompanyCode = transferFormModel.addElement("SourceCompanyCode");// 来源企业代码
//				Element sourceName = transferFormModel.addElement("SourceName");// 来源名称
	//
				Element warehouseCode = materialScrapModel.addElement("WarehouseCode");// 目标仓库代码
	//
//				Element targetCompanyCode = transferFormModel.addElement("TargetCompanyCode");// 目标企业代码
//				Element targetName = transferFormModel.addElement("TargetName");// 目标名称
				Element eRPNo = materialScrapModel.addElement("ERPNo");//
				
				Element inboundERPCode = materialScrapModel.addElement("InboundERPCode");// 调入代码
				
				Element outboundERPCode = materialScrapModel.addElement("OutboundERPCode");// 调出代码
				Element comment = materialScrapModel.addElement("Comment");// 备注
				Element materialScrapItemModels = materialScrapModel.addElement("MaterialScrapItemModels");// 
				
				

				factoryCode.addText("002");
				no.addText(rdrecord11.getCdefine10() == null ? "" : rdrecord11.getCdefine10());
				moveTypeCode.addText("110");
				
				//moveCategory.addText(transVouch.getCordcode() == null ? "" : transVouch.getCordcode());//??????
//				moveCategory.addText("");//
//				
//				sourceWarehouseCode.addText(transVouch.getCowhcode() == null ? "" : transVouch.getCowhcode());
//				sourceCompanyCode.addText("");
//				sourceName.addText("");


				warehouseCode.addText(rdrecord11.getCwhcode()== null ? "" : rdrecord11.getCwhcode());
//				targetCompanyCode.addText("");
//				targetName.addText("");
				inboundERPCode.addText("");
				outboundERPCode.addText(rdrecord11.getCrdcode()== null ? "" : rdrecord11.getCrdcode());
				comment.addText(rdrecord11.getCmemo() == null ? "" : rdrecord11.getCmemo());
				
				
				List list = rdrecords11Mapper.selectByRdrecords11(rdrecord11.getId());
				
				for (int i = 0; i < list.size(); i++) {
					Rdrecords11 rdrecords11 = (Rdrecords11) list.get(i);// 获取每一个Example对象
					
					Element materialScrapItemModel = materialScrapItemModels.addElement("MaterialScrapItemModel");// 
					Element itemNo = materialScrapItemModel.addElement("ItemNo");// 行号

					Element materialCode = materialScrapItemModel.addElement("MaterialCode");//物料代码
					Element supplierCode = materialScrapItemModel.addElement("SupplierCode");// 供应商代码
					Element batchNumber = materialScrapItemModel.addElement("BatchNumber");// 批次号
					
					Element quantity = materialScrapItemModel.addElement("Quantity");// 数量
					Element comment1 = materialScrapItemModel.addElement("Comment");// 备注
					
					itemNo.addText(rdrecords11.getIrowno() == null ? "" : rdrecords11.getIrowno().toString());
					materialCode.addText(rdrecords11.getCinvcode() == null ? "" : rdrecords11.getCinvcode());
					supplierCode.addText(rdrecords11.getCbvencode() == null ? "" : rdrecords11.getCbvencode());
					batchNumber.addText(rdrecords11.getCdefine33() == null ? "" : rdrecords11.getCdefine33());
					quantity.addText(rdrecords11.getIquantity() == null ? "" : rdrecords11.getIquantity().toString());
					comment1.addText(rdrecords11.getCbmemo() == null ? "" : rdrecords11.getCbmemo());
					
				}

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"MaterialScrapInterface");

				System.out.println("----------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(rdrecord11.getCcode());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						rdrecord11Mapper.updateRdrecord11(rdrecord11.getId(),"T");
						logStatus = "1";
					} else {
						logStatus = "0";
						// System.out.println("123456"+feedbackCode);
						rdrecord11Mapper.updateRdrecord11(rdrecord11.getId(),"F");

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("物料报废接口异常{}", e);
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


		//半成品入库接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toRdrecord10(Rdrecord10 rdrecord10) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("6");// 日志类型 -6：半成品入库接口
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfHarfProductInboundModel = doc.addElement("ArrayOfHarfProductInboundModel");
				Element harfProductInboundModel = arrayOfHarfProductInboundModel.addElement("HarfProductInboundModel");
				Element factoryCode = harfProductInboundModel.addElement("FactoryCode");// 工厂

				Element no = harfProductInboundModel.addElement("No");// 单据号
				Element moveTypeCode = harfProductInboundModel.addElement("MoveTypeCode");// 移库类型
				Element moveCategory = harfProductInboundModel.addElement("MoveCategory");// 移库计划类型: 10.入库 20.出库 30.外部移库 40.内部移库
//				Element sourceWarehouseCode = harfProductInboundModel.addElement("SourceWarehouseCode");// 来源仓库代码
//
//				Element sourceCompanyCode = harfProductInboundModel.addElement("SourceCompanyCode");// 来源企业代码
//				Element sourceName = harfProductInboundModel.addElement("SourceName");// 来源名称
//
				Element warehouseCode = harfProductInboundModel.addElement("WarehouseCode");// 目标仓库代码
				Element eRPNo = harfProductInboundModel.addElement("ERPNo");// 
//
//				Element targetCompanyCode = harfProductInboundModel.addElement("TargetCompanyCode");// 目标企业代码
//				Element targetName = harfProductInboundModel.addElement("TargetName");// 目标名称
				Element comment = harfProductInboundModel.addElement("Comment");// 备注
				Element harfProductInboundItemModels = harfProductInboundModel.addElement("HarfProductInboundItemModels");// 
				
				

				factoryCode.addText("002");
				no.addText(rdrecord10.getCcode() == null ? "" : rdrecord10.getCcode());
				moveTypeCode.addText("110");
				
				moveCategory.addText("");//
				


				warehouseCode.addText(rdrecord10.getCwhcode() == null ? "" : rdrecord10.getCwhcode());
			
				eRPNo.addText("");
				comment.addText(rdrecord10.getCmemo() == null ? "" : rdrecord10.getCmemo());
				
				
				List list = rdrecords10Mapper.selectByRdrecords10(rdrecord10.getId());
				
				for (int i = 0; i < list.size(); i++) {
					Rdrecords10 rdrecords10 = (Rdrecords10) list.get(i);// 获取每一个Example对象
					
					Element harfProductInboundItemModel = harfProductInboundItemModels.addElement("HarfProductInboundItemModel");// 
					Element itemNo = harfProductInboundItemModel.addElement("ItemNo");// 行号

					Element materialCode = harfProductInboundItemModel.addElement("MaterialCode");//物料代码
					Element supplierCode = harfProductInboundItemModel.addElement("SupplierCode");// 供应商代码
					Element batchNumber = harfProductInboundItemModel.addElement("BatchNumber");// 批次号
					
					Element quantity = harfProductInboundItemModel.addElement("Quantity");// 数量
					Element comment1 = harfProductInboundItemModel.addElement("Comment");// 备注
					
					itemNo.addText(rdrecords10.getIrowno() == null ? "" : rdrecords10.getIrowno().toString());
					materialCode.addText(rdrecords10.getCinvcode() == null ? "" : rdrecords10.getCinvcode());
					supplierCode.addText(rdrecords10.getCbvencode() == null ? "" : rdrecords10.getCbvencode());
					batchNumber.addText(rdrecords10.getCbatch() == null ? "" : rdrecords10.getCbatch());
					quantity.addText(rdrecords10.getIquantity() == null ? "" : rdrecords10.getIquantity().toString());
					comment1.addText("");
					
				}

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"HarfProductInboundInterface");

				System.out.println("----------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(rdrecord10.getCcode());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						rdrecord10Mapper.updateRdrecord10(rdrecord10.getId(),"T");
						logStatus = "1";
					} else {
						logStatus = "0";
						rdrecord10Mapper.updateRdrecord10(rdrecord10.getId(),"F");

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("半成品入库接口{}", e);
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
			//物料采购订单接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toPOPomain(POPomain pOPomain) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("9");// 日志类型 -9：物料采购订单接口
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfMaterialPurchaseOrderModel = doc.addElement("ArrayOfMaterialPurchaseOrderModel");
				Element materialPurchaseOrderModel = arrayOfMaterialPurchaseOrderModel.addElement("MaterialPurchaseOrderModel");
				Element factoryCode = materialPurchaseOrderModel.addElement("FactoryCode");// 工厂
				Element ERPID = materialPurchaseOrderModel.addElement("ERPID");// 表头id
				
				Element no = materialPurchaseOrderModel.addElement("No");// 单据号
				Element supplierCode = materialPurchaseOrderModel.addElement("SupplierCode");// 供应商
				Element departmentCode = materialPurchaseOrderModel.addElement("DepartmentCode");// 部门编号
				
				Element salesman = materialPurchaseOrderModel.addElement("Salesman");// 业务员编号
				
				
				Element purchaseOrderType = materialPurchaseOrderModel.addElement("PurchaseOrderType");// 
				
				Element isUrgent = materialPurchaseOrderModel.addElement("IsUrgent");// 

				Element comment = materialPurchaseOrderModel.addElement("Comment");// 备注
				Element materialPurchaseOrderItemModels = materialPurchaseOrderModel.addElement("MaterialPurchaseOrderItemModels");// 
				
				ERPID.addText(pOPomain.getPoid().toString());

				factoryCode.addText("002");
				no.addText(pOPomain.getCpoid() == null ? "" : pOPomain.getCpoid());
				supplierCode.addText(pOPomain.getCvencode() == null ? "" : pOPomain.getCvencode());
				
				departmentCode.addText(pOPomain.getCdepcode() == null ? "" : pOPomain.getCdepcode());
				
				salesman.addText(pOPomain.getCpersoncode() == null ? "" : pOPomain.getCpersoncode());
				
				purchaseOrderType.addText(pOPomain.getCptcode()== null ? "" : pOPomain.getCptcode());
				
				isUrgent.addText((pOPomain.getCdefine2()==null ? "" : pOPomain.getCdefine2()).equals("是")==true ? "true":"false");
				
				comment.addText(pOPomain.getCmemo() == null ? "" : pOPomain.getCmemo());
				
				
				List list = pOPodetailsMapper.selectByALLPOPodetails(pOPomain.getPoid());
				
				for (int i = 0; i < list.size(); i++) {
					POPodetails pOPodetails = (POPodetails) list.get(i);// 获取每一个Example对象			
					Element MaterialPurchaseOrderItemModel = materialPurchaseOrderItemModels.addElement("MaterialPurchaseOrderItemModel");// 
					Element itemNo = MaterialPurchaseOrderItemModel.addElement("ItemNo");// 行号
					Element ERPItemID = MaterialPurchaseOrderItemModel.addElement("ERPItemID");// 行号					
					Element materialCode = MaterialPurchaseOrderItemModel.addElement("MaterialCode");//物料代码
					Element warehouseCode = MaterialPurchaseOrderItemModel.addElement("WarehouseCode");// 仓库
					Element quantity = MaterialPurchaseOrderItemModel.addElement("Quantity");// 数量
					ERPItemID.addText(pOPodetails.getId().toString());
					itemNo.addText(pOPodetails.getIvouchrowno() == null ? "" : pOPodetails.getIvouchrowno().toString());
					materialCode.addText(pOPodetails.getCinvcode() == null ? "" : pOPodetails.getCinvcode());
					warehouseCode.addText(pOPodetails.getCdefwarehouse() == null ? "" : pOPodetails.getCdefwarehouse());
					quantity.addText(pOPodetails.getIquantity() == null ? "" : pOPodetails.getIquantity().toString());							
				}

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"MaterialPurchaseOrderInterface");

				System.out.println("----------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(pOPomain.getCpoid());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						pOPomainMapper.updatePOPomain(pOPomain.getPoid(),"T");
						logStatus = "1";
					} else {
						logStatus = "0";
						pOPomainMapper.updatePOPomain(pOPomain.getPoid(),"F");

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("物料采购订单接口{}", e);
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
			
			
			//生产订单BOM下发接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toMomOrderdetail(MomOrderdetail momOrderdetail) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("10");// 日志类型 -10：生产订单BOM下发接口
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfWorkPlanModel = doc.addElement("ArrayOfWorkPlanModel");
				Element workPlanModel = arrayOfWorkPlanModel.addElement("WorkPlanModel");
				Element factoryCode = workPlanModel.addElement("FactoryCode");// 工厂
				
				Element lineCode = workPlanModel.addElement("LineCode");// 产线代码
				Element no = workPlanModel.addElement("No");//计划编号
				
				Element productCode = workPlanModel.addElement("ProductCode");// 产品编号
				
				Element previousExt = workPlanModel.addElement("PreviousExt");// 
				
				Element startDate = workPlanModel.addElement("StartDate");// 计划开始日期
				
				Element endDate = workPlanModel.addElement("EndDate");// 计划结束日期
				
				Element quantity = workPlanModel.addElement("Quantity");// 计划数量
				
				Element finishedQuantity = workPlanModel.addElement("FinishedQuantity");// 完成数量
				
				Element status = workPlanModel.addElement("Status");// 状态 0.正常 99.已撤销
				
				Element carModelCode = workPlanModel.addElement("CarModelCode");// 车型代码
				
				Element unit = workPlanModel.addElement("Unit");// 单位
				
				Element orderNo = workPlanModel.addElement("OrderNo");// 顺序号
				
				Element isDisabled_1 = workPlanModel.addElement("IsDisabled");//是否禁用
				Element isDeleted_1 = workPlanModel.addElement("IsDeleted");//是否删除
				
				factoryCode.addText("002");
				lineCode.addText(momOrderdetail.getDefine22() == null ? "" : momOrderdetail.getDefine22());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				no.addText(momOrderdetail.getMocode() == null ? "" : momOrderdetail.getMocode());
				productCode.addText(momOrderdetail.getInvcode() == null ? "" : momOrderdetail.getInvcode());
				previousExt.addText(momOrderdetail.getModid() == null ? "" : momOrderdetail.getModid().toString());
				startDate.addText(momOrderdetail.getStartdate() == null ? "" :  sdf.format(momOrderdetail.getStartdate()));
				endDate.addText(momOrderdetail.getDuedate()== null ? "" : sdf.format(momOrderdetail.getDuedate()));
				quantity.addText(momOrderdetail.getQty()== null ? "" : momOrderdetail.getQty().toString());
				finishedQuantity.addText(momOrderdetail.getQty()== null ? "" : momOrderdetail.getQty().toString());
		
				status.addText(String.valueOf((momOrderdetail.getStatus()== (byte)3 ? (byte)0 : (byte)99) & 0xFF));
				carModelCode.addText(momOrderdetail.getInvcode() == null ? "" : momOrderdetail.getInvcode());
				unit.addText(momOrderdetail.getCcomunitname() == null ? "" : momOrderdetail.getCcomunitname() );
				
				orderNo.addText("");
				isDisabled_1.addText("0");
				isDeleted_1.addText("0");
				Element workPlanBOMModels = workPlanModel.addElement("WorkPlanBOMModels");// 
				List list = momMoallocateMapper.selectByALLMomMoallocate(momOrderdetail.getModid());
				
				for (int i = 0; i < list.size(); i++) {
					MomMoallocate momMoallocate = (MomMoallocate) list.get(i);// 获取每一个Example对象
					
					Element workPlanBOMModel = workPlanBOMModels.addElement("WorkPlanBOMModel");// 
					Element parentMaterialCode = workPlanBOMModel.addElement("ParentMaterialCode");//父级物料号
					Element materialCode = workPlanBOMModel.addElement("MaterialCode");//物料编码
					Element quantity_z = workPlanBOMModel.addElement("Quantity");//需求数量
					Element unit_z = workPlanBOMModel.addElement("Unit");//需求单位
					Element orderNo_z = workPlanBOMModel.addElement("OrderNo");//顺序号
					Element isDisabled_z = workPlanBOMModel.addElement("IsDisabled");//是否禁用
					Element isDeleted_z = workPlanBOMModel.addElement("IsDeleted");//是否删除
					
					
					parentMaterialCode.addText("");
					materialCode.addText(momMoallocate.getInvcode() == null ? "" : momMoallocate.getInvcode()  );
					quantity_z.addText(momMoallocate.getQty() == null ? "" : momMoallocate.getQty().toString()  );
					unit_z.addText(momMoallocate.getCcomunitname() == null ? "" : momMoallocate.getCcomunitname()  );
					orderNo_z.addText(momMoallocate.getSortseq() == null ? "" : momMoallocate.getSortseq().toString()  );
					isDisabled_z.addText("0");
					isDeleted_z.addText("0");
				}

				Element workPlanVINModels = workPlanModel.addElement("WorkPlanVINModels");// 
				List listvin = mom_SndetailMapper.selectByALLMomSndetail(momOrderdetail.getModid());
				
				

				for (int i = 0; i < listvin.size(); i++) {
					Mom_Sndetail mom_Sndetail = (Mom_Sndetail) listvin.get(i);// 获取每一个Example对象
					
					Element workPlanVINModel = workPlanVINModels.addElement("WorkPlanVINModel");// 
					
					Element vIN = workPlanVINModel.addElement("VIN");//VIN编码
					
					Element orderNo_zz = workPlanVINModel.addElement("OrderNo");//顺序号
					Element isDisabled_zz = workPlanVINModel.addElement("IsDisabled");//是否禁用
					Element isDeleted_zz = workPlanVINModel.addElement("IsDeleted");//是否删除
					
					
					
					vIN.addText(mom_Sndetail.getCinvsn() == null ? "" : mom_Sndetail.getCinvsn()  );
					
					orderNo_zz.addText(mom_Sndetail.getIrowno() == null ? "" : mom_Sndetail.getIrowno() .toString()  );
					isDisabled_zz.addText("0");
					isDeleted_zz.addText("0");
				}

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"WorkPlanInterface");

				System.out.println("----richie20190910------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(momOrderdetail.getMocode()+"-"+momOrderdetail.getSortseq().toString());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						momOrderdetailMapper.updateMomOrderdetail(momOrderdetail.getModid(),"T");
						logStatus = "1";
					} else {
						logStatus = "0";
						 System.out.println("123456"+feedbackCode);
						momOrderdetailMapper.updateMomOrderdetail(momOrderdetail.getModid(),"F");

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("生产订单BOM下发接口{}", e);
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
			
			
			//审核接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toSH(TransVouch transVouch) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("12");// 日志类型 -12：审核接口
				String sender=Global.getSender();
				String id =transVouch.getId().toString();
				sysQrtLog.setCodeNo(transVouch.getCtvcode());
				try {
				 String requestXml="<?xml version=\"1.0\" encoding=\"utf-8\"?>"
						 +"<ufinterface sender=\""+sender+"\" receiver=\"u8\" roottag=\"u8api\" proc=\"verify\">"
							  +"<u8apiservice>"
							    +"<apiurl value=\"U8API/TransVouch/Audit\"></apiurl>"
							    +"<apiParams>"
							      +"<param name=\"sVouchType\" value=\"12\" datatype=\"String\"/>"
							      +"<param name=\"VouchId\" value=\""+id+"\" datatype=\"string\"/>"
							      +"<param name=\"cnnFrom\" datatype=\"ADODB.Connection\"/>"
							      +"<param name=\"TimeStamp\" value=\"\"  datatype=\"object\"/>"
							      +"<param name=\"domMsg\" datatype=\"IXMLDOMDocument2\"/>"
							      +"<param name=\"bCheck\" value=\"false\" datatype=\"bool\"/>"
							      +"<param name=\"bBeforCheckStock\" value=\"false\" datatype=\"bool\"/>"
							   +"</apiParams>"
							    
							    +"<returnParams>"
							      +"<param name=\"VouchId\"/>"
							      +"<param name=\"errMsg\"/>"
							    +"</returnParams>"
							  +"</u8apiservice>"
							+"</ufinterface>";
											
				 URL url = new URL(Global.getu8UR());
				 
				  HttpURLConnection con = (HttpURLConnection)url.openConnection();
		            con.setConnectTimeout(3000000);
		            con.setReadTimeout(3000000);
		            con.setDoInput(true);
		            con.setDoOutput(true);
		            con.setAllowUserInteraction(false);
		            con.setUseCaches(false);
		            con.setRequestMethod("POST");
		            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
		           
		            con.setRequestProperty("ContentType","text/xml;charset=utf-8"); 

			 //发送Request消息

			 OutputStream out = con.getOutputStream();
			 DataOutputStream dos = new DataOutputStream(out);
			 //System.out.println(requestXml);
			 System.out.println(requestXml.getBytes("UTF-8"));
			 System.out.println("222"+requestXml);
			 dos.write(requestXml.getBytes("UTF-8")); //通过文件流读取数据
			 dos.close();
			 //获取Response消息
			 InputStream in = con.getInputStream();
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 StringBuilder sb = new StringBuilder();

			 String s = null;
			 while ((s = br.readLine()) != null) 
			 {			
				sb.append(s);
			 }
			 String res_xml = sb.toString();         
			 br.close();
			 			
				System.out.println("----------" + res_xml);
			
					// 解析返回的xml
					String feedbackCode = "";
					
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					
					Element u8apireturn = rootElm.element("u8apireturn");

					feedbackCode = u8apireturn.attribute("issuccess").getValue().trim().toString();//
	
					System.out.println("----------" + feedbackCode);
					String message="";
					String logStatus = "";
					if ("true".equals(feedbackCode)) {
						transVouchMapper.updateTransVouch(transVouch.getId(),"T");
						logStatus = "1";
						message="SUCCESS";
					} else {
						logStatus = "0";
						message = u8apireturn.element("error").getText().trim();
						transVouchMapper.updateTransVouch(transVouch.getId(),"F");
					}
					
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);
					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("审核接口异常{}", e);
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
			
			
			
			//物料采购订关闭单接口
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toPOPomainGb(POPomain pOPomain) {
				SysQrtzLog sysQrtLog= new SysQrtzLog("13");// 日志类型 -13：物料采购订关闭单接口
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfPurchaseOrderCloseModel = doc.addElement("ArrayOfPurchaseOrderCloseModel");
				Element purchaseOrderCloseModel = arrayOfPurchaseOrderCloseModel.addElement("PurchaseOrderCloseModel");
				
				Element no = purchaseOrderCloseModel.addElement("No");// 单据号
	
				
				Element isClose = purchaseOrderCloseModel.addElement("IsClose");// 

				Element comment = purchaseOrderCloseModel.addElement("Comment");// 备注
				
				
			
				
				no.addText(pOPomain.getCpoid() == null ? "" : pOPomain.getCpoid());

				
				if (pOPomain.getCcloser() == null || pOPomain.getCcloser() == ""){
					isClose.addText("2");
					
				}else{
					isClose.addText("1");
				}
				
			
				
				comment.addText(pOPomain.getCmemo() == null ? "" : pOPomain.getCmemo());
				
				Element purchaseOrderItemCloseModels = purchaseOrderCloseModel.addElement("PurchaseOrderItemCloseModels");
				
				
				List list = pOPodetailsMapper.selectByALLPOPodetailsGb(pOPomain.getPoid());
				
				for (int i = 0; i < list.size(); i++) {
					POPodetails pOPodetails = (POPodetails) list.get(i);// 获取每一个Example对象
					
					Element purchaseOrderItemCloseModel = purchaseOrderItemCloseModels.addElement("PurchaseOrderItemCloseModel");// 
	
					
					Element materialCode = purchaseOrderItemCloseModel.addElement("MaterialCode");//物料代码
					
					Element isClose1 = purchaseOrderItemCloseModel.addElement("IsClose");// 
					
					Element ItemNo = purchaseOrderItemCloseModel.addElement("ItemNo");// 
					
					Element comment1 = purchaseOrderItemCloseModel.addElement("Comment");// 备注
				
					materialCode.addText(pOPodetails.getCinvcode() == null ? "" : pOPodetails.getCinvcode());
					
					if (pOPodetails.getCbcloser() == null || pOPodetails.getCbcloser() == ""){
						isClose1.addText("2");
						
					}else{
						isClose1.addText("1");
					}
					ItemNo.addText(pOPodetails.getIvouchrowno() == null ? "" : pOPodetails.getIvouchrowno().toString() );
					comment1.addText(pOPodetails.getCbmemo() == null ? "" : pOPodetails.getCbmemo() );
					
				}

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"PurchaseOrderCloseInterface");

				System.out.println("----------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(pOPomain.getCpoid());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						pOPomainMapper.updatePOPomainGb(pOPomain.getPoid(),"T");
						logStatus = "1";
					} else {
						logStatus = "0";
						pOPomainMapper.updatePOPomainGb(pOPomain.getPoid(),"F");

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("物料采购订关闭单接口{}", e);
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
			
			
			
			// 项目
			 
			@Override
			@DataSourceChange(Const.DATASOURCE_SLAVE)
			public SysQrtzLog toFitemss02(fitemss02 fitemss02) {

				SysQrtzLog sysQrtLog= new SysQrtzLog("14");// 日志类型 -2：项目
				DocumentFactory df = DocumentFactory.getInstance();
				Document doc = df.createDocument();
				
				Element arrayOfProjectModel = doc.addElement("ArrayOfProjectModel");
				Element projectModel = arrayOfProjectModel.addElement("ProjectModel");
				Element factoryCode = projectModel.addElement("FactoryCode");// 工厂

				Element projectTypeCode = projectModel.addElement("ProjectTypeCode");//
				Element name = projectModel.addElement("Name");//
				Element code = projectModel.addElement("Code");// 

				Element orderNo = projectModel.addElement("OrderNo");

			
				Element isDisabled = projectModel.addElement("IsDisabled");// 是否禁用
				Element isDeleted = projectModel.addElement("IsDeleted");// 是否删除

				factoryCode.addText("002");
				projectTypeCode.addText(fitemss02.getCitemccode()== null ? "" : fitemss02.getCitemccode());
				name.addText(fitemss02.getCitemname() == null ? "" : fitemss02.getCitemname());
				
				
				code.addText(fitemss02.getCitemcode() == null ? "" : fitemss02.getCitemcode());
				//warehouseType.addText(warehouse.getCwaregroupcode() == null ? "" : warehouse.getCwaregroupcode());
				
				orderNo.addText("");
				isDisabled.addText("0");
				
				isDeleted.addText(fitemss02.getTtype().equals("3") ? "1" : "0");

				OutputFormat formate = OutputFormat.createPrettyPrint();
				formate.setEncoding("gb2312");
				StringWriter writerStr = new StringWriter();
				XMLWriter xmlw= new XMLWriter(writerStr, formate);
				try {
					xmlw.write(doc);
					xmlw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				String req_xml = writerStr.getBuffer().toString();
				
				System.out.println(req_xml);
				String res_xml = ehrToLesService.toInventory(req_xml,"ProjectInterface");

				System.out.println("----------" + res_xml);
				// String res_xml="";

				sysQrtLog.setCodeNo(fitemss02.getCitemcode());
				try {
					// 解析返回的xml
					String feedbackCode = "";
					Document document = DocumentHelper.parseText(res_xml);
					Element rootElm = document.getRootElement();
					// Element returnModel=rootElm.element("ReturnModel");

					feedbackCode = rootElm.element("feedbackCode").getText().trim();
					System.out.println("----------" + feedbackCode);
					// System.out.println("----------"+inventory.getiId());
					String logStatus = "";
					if ("SUCCESS".equals(feedbackCode)) {
						fitemss02Mapper.updateFitemss02(fitemss02.getiId(),"1");
						// inventoryService.updateInventory(inventory.getiId());
						logStatus = "1";
					} else {
						fitemss02Mapper.updateFitemss02(fitemss02.getiId(),"2");
						logStatus = "0";
						// System.out.println("123456"+feedbackCode);

					}

					String message = feedbackCode.toString();
					if (message.length() > 3000) {
						message = message.substring(0, 3000);
					}

					// SysQrtzLog SysQrtzLog sysQrtLog= new SysQrtzLog("1");

					sysQrtLog.setLogStatus(logStatus);
					sysQrtLog.setDescription(message);

					sysQrtLog.setCreateDate(new Date());

				} catch (Exception e) {
					LOGGER.error("项目接口异常{}", e);
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
