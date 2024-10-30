package com.espread.sys.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.espread.common.constant.YXContant;
import com.espread.sys.job.ApplicationContextHelper;
import com.espread.sys.model.SysQrtzLog;
//import .util.CommonUtil;
//import com.cf.core.util.ToolUtil;
import com.espread.sys.service.HaService;
import com.espread.sys.service.SysQtrzLogService;

@Service
public class HaServiceImpl implements HaService {

	private static Logger LOGGER = LoggerFactory.getLogger(HaServiceImpl.class);

	@Override
	public void uploadAllInvenroty() {

		String sql = "select CNotPatentName, BPropertyCheck, CPackingType, bSolitude,ccomunitname, binvmodel, dreplacedate, cinvplancode, fconvertrate, bforeexpland, cshopunit, cInvStd, fminsplit,bspecialorder,btracksalebill,fbuyexcess,ioverlapday,fmaxsupply,bpiece,bsrvitem,bsrvfittings,\r\n"
				+ "        isurenesstype,idatetype,idatesum,idynamicsurenesstype,ibestrowsum,ipercentumsum,binbyprocheck,bbommain,bproductbill,icheckatp,iinvatpid,iplantfday,bbomsub,\r\n"
				+ "        iimptaxrate,iexptaxrate,bexpsale,idrawbatch,bcheckbsatp,cinvprojectcode,\r\n"
				+ "        itestrule,crulecode,bcheckfree1,bcheckfree2,bcheckfree3,bcheckfree4,bcheckfree5,bcheckfree6,bcheckfree7,bcheckfree8,bcheckfree9,bcheckfree10,\r\n"
				+ "        irequiretrackstyle,ibomexpandunittype,iexpiratdatecalcu,bpurpricefree1,\r\n"
				+ "        bpurpricefree2,bpurpricefree3,bpurpricefree4,bpurpricefree5,bpurpricefree6,bpurpricefree7,bpurpricefree8,bpurpricefree9,bpurpricefree10,\r\n"
				+ "        bompricefree1,bompricefree2,bompricefree3,bompricefree4,bompricefree5,bompricefree6,bompricefree7,bompricefree8,bompricefree9,bompricefree10,\r\n"
				+ "        bbatchproperty2,bbatchproperty3,bbatchproperty4,bbatchproperty5,bbatchproperty6,bbatchproperty7,bbatchproperty8,bbatchproperty9,bbatchproperty10,\r\n"
				+ "        finvoutuplimit,bbatchcreate,bbatchproperty1,bbondedinv,bsalepricefree1,bsalepricefree2,bsalepricefree3,bsalepricefree4,bsalepricefree5,bsalepricefree6,bsalepricefree7,bsalepricefree8,bsalepricefree9,bsalepricefree10,\r\n"
				+ "        fcurlvarmanucost,fcurlfixmanucost,fnextlvarmanucost,imaintenancecycleunit,binvkeypart,fcurlomcost,fnextllaborcost,\r\n"
				+ "        fnextlfixmanucost,fnextlomcost,dinvcreatedatetime,bpuquota,binvrohs,fprjmatlimit,bprjmat,binvasset,bsrvproduct,fcurllaborcost,finvciqexch,iwarrantyperiod,bmaintenance,imaintenancecycle,iwarrantyunit,\r\n"
				+ "        bcontrolfreerange1,bcontrolfreerange2,bcontrolfreerange3,bcontrolfreerange4,bcontrolfreerange5,bcontrolfreerange6,bcontrolfreerange7,bcontrolfreerange8,bcontrolfreerange9,bcontrolfreerange10,\r\n"
				+ "        iacceptdelaydays,iacceptearlydays,cInvMnemCode,iPlanCheckDay,iMaterialsCycle,idrawtype,bSCkeyProjections,iSupplyPeriodType,iTimeBucketId,iAvailabilityDate,fmaterialcost,inearrejectdays,bimport,bsuitretail,bcoupon,bstorecard,bprocessproduct,bprocessmaterial, bCheckBatch,bMngOldpart,iOldpartMngRule,froundfactor,bchecksubitemcost,bconsiderfreestock,breceiptbydt,bkccutmantissa,iPlanDefault,iPFBatchQty,iAllocatePrintDgt,\r\n"
				+ "        iAvailabilityDate,fmaterialcost,inearrejectdays,bimport,bsuitretail,bcoupon,bstorecard,bprocessproduct,bprocessmaterial, bCheckBatch,bMngOldpart,iOldpartMngRule,froundfactor,bchecksubitemcost,bconsiderfreestock,breceiptbydt,bkccutmantissa,iPlanDefault,iPFBatchQty,iAllocatePrintDgt,\r\n"
				+ " bfirstbusimedicine, bimportmedicine, a.* , d.*, b.*, c.*, i.*\r\n"
				+ "				  from xzys_ch_Inventory a LEFT JOIN InventoryClass b ON a.cInvCCode=b.cInvCCode  \r\n"
				+ "				 left join  ComputationUnit c  on a.cComUnitCode=c.cComUnitCode \r\n"
				+ "				  LEFT JOIN  Inventory_extradefine d on a.cinvcode=d.cinvcode  left join Inventory_Sub i on a.cInvCode=i.cInvSubCode \r\n"
				+ "    where a.tstatus='0' and ttype = '1' and a.dsdate >= '" + YXContant.getTime().toString()
				+ "' order by a.ttype";
		System.out.println(sql);
		List<HashMap> invenrotyList = selectMap(sql, "GC");

		if (!ObjectUtils.isEmpty(invenrotyList)) {
			for (HashMap inv : invenrotyList) {
				String result = uploadInvenroty(inv);
				SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
				SysQrtzLog sysQrtzLog = new SysQrtzLog("46"); // 日志编码
				String logStatus = "";
				String sucSql = " update xzys_ch_Inventory \r\n" + "    	set tstatus ='1' \r\n"
						+ "    	where I_id = '" + inv.get("I_id") + "'";
				String sucSql1 = " update xzys_ch_Inventory \r\n" + "    	set tstatus ='2' \r\n"
						+ "    	where I_id = '" + inv.get("I_id") + "'";
				if ("上传U8成功！".equals(result)) {
					LOGGER.debug("上传U8成功！");
					updateMap(sucSql, "GC");
					logStatus = "1";

					String sucSql2 = "update Inventory_extradefine set " + "cidefine1='"
							+ getString(inv.get("cidefine1")) + "'," + "cidefine2='" + getString(inv.get("cidefine2"))
							+ "'," + "cidefine3='" + getString(inv.get("cidefine3")) + "'," + "cidefine4='"
							+ getString(inv.get("cidefine4")) + "'," + "cidefine5='" + getString(inv.get("cidefine5"))
							+ "'," + "cidefine6='" + getString(inv.get("cidefine6")) + "'," + "cidefine7='"
							+ getString(inv.get("cidefine7")) + "'," + "cidefine8='" + getString(inv.get("cidefine8"))
							+ "'," + "cidefine9='" + getString(inv.get("cidefine9")) + "'," + "cidefine10='"
							+ getString(inv.get("cidefine10")) + "'," + "cidefine11='"
							+ getString(inv.get("cidefine11")) + "'," + "cidefine12='"
							+ getString(inv.get("cidefine12")) + "'," + "cidefine13='"
							+ getString(inv.get("cidefine13")) + "'," + "cidefine14=" + inv.get("cidefine14") + ""
							+ " where cInvCode='" + inv.get("cInvCode") + "';";
					
					System.out.println(sucSql2);
					updateMap(sucSql2, "YX");
				} else {
					logStatus = "2";
					updateMap(sucSql1, "GC");
					LOGGER.debug("上传U8失败！");
				}
				sysQrtzLog.setLogStatus(logStatus);
				sysQrtzLog.setDescription(result);
				sysQrtzLog.setCodeNo(inv.get("cInvCode").toString());
				sysQrtzLog.setCreateDate(new Date());
				sysQtrzLogService.save(sysQrtzLog);
			}
		} // 添加
		
		String sqlEdit = "select CNotPatentName, BPropertyCheck, CPackingType, bSolitude,ccomunitname, binvmodel, dreplacedate, cinvplancode, fconvertrate, bforeexpland, cshopunit, cInvStd, fminsplit,bspecialorder,btracksalebill,fbuyexcess,ioverlapday,fmaxsupply,bpiece,bsrvitem,bsrvfittings,\r\n"
				+ "        isurenesstype,idatetype,idatesum,idynamicsurenesstype,ibestrowsum,ipercentumsum,binbyprocheck,bbommain,bproductbill,icheckatp,iinvatpid,iplantfday,bbomsub,\r\n"
				+ "        iimptaxrate,iexptaxrate,bexpsale,idrawbatch,bcheckbsatp,cinvprojectcode,\r\n"
				+ "        itestrule,crulecode,bcheckfree1,bcheckfree2,bcheckfree3,bcheckfree4,bcheckfree5,bcheckfree6,bcheckfree7,bcheckfree8,bcheckfree9,bcheckfree10,\r\n"
				+ "        irequiretrackstyle,ibomexpandunittype,iexpiratdatecalcu,bpurpricefree1,\r\n"
				+ "        bpurpricefree2,bpurpricefree3,bpurpricefree4,bpurpricefree5,bpurpricefree6,bpurpricefree7,bpurpricefree8,bpurpricefree9,bpurpricefree10,\r\n"
				+ "        bompricefree1,bompricefree2,bompricefree3,bompricefree4,bompricefree5,bompricefree6,bompricefree7,bompricefree8,bompricefree9,bompricefree10,\r\n"
				+ "        bbatchproperty2,bbatchproperty3,bbatchproperty4,bbatchproperty5,bbatchproperty6,bbatchproperty7,bbatchproperty8,bbatchproperty9,bbatchproperty10,\r\n"
				+ "        finvoutuplimit,bbatchcreate,bbatchproperty1,bbondedinv,bsalepricefree1,bsalepricefree2,bsalepricefree3,bsalepricefree4,bsalepricefree5,bsalepricefree6,bsalepricefree7,bsalepricefree8,bsalepricefree9,bsalepricefree10,\r\n"
				+ "        fcurlvarmanucost,fcurlfixmanucost,fnextlvarmanucost,imaintenancecycleunit,binvkeypart,fcurlomcost,fnextllaborcost,\r\n"
				+ "        fnextlfixmanucost,fnextlomcost,dinvcreatedatetime,bpuquota,binvrohs,fprjmatlimit,bprjmat,binvasset,bsrvproduct,fcurllaborcost,finvciqexch,iwarrantyperiod,bmaintenance,imaintenancecycle,iwarrantyunit,\r\n"
				+ "        bcontrolfreerange1,bcontrolfreerange2,bcontrolfreerange3,bcontrolfreerange4,bcontrolfreerange5,bcontrolfreerange6,bcontrolfreerange7,bcontrolfreerange8,bcontrolfreerange9,bcontrolfreerange10,\r\n"
				+ "        iacceptdelaydays,iacceptearlydays,cInvMnemCode,iPlanCheckDay,iMaterialsCycle,idrawtype,bSCkeyProjections,iSupplyPeriodType,iTimeBucketId,iAvailabilityDate,fmaterialcost,inearrejectdays,bimport,bsuitretail,bcoupon,bstorecard,bprocessproduct,bprocessmaterial, bCheckBatch,bMngOldpart,iOldpartMngRule,froundfactor,bchecksubitemcost,bconsiderfreestock,breceiptbydt,bkccutmantissa,iPlanDefault,iPFBatchQty,iAllocatePrintDgt,\r\n"
				+ "        iAvailabilityDate,fmaterialcost,inearrejectdays,bimport,bsuitretail,bcoupon,bstorecard,bprocessproduct,bprocessmaterial, bCheckBatch,bMngOldpart,iOldpartMngRule,froundfactor,bchecksubitemcost,bconsiderfreestock,breceiptbydt,bkccutmantissa,iPlanDefault,iPFBatchQty,iAllocatePrintDgt,\r\n"
				+ " bfirstbusimedicine, bimportmedicine, a.* , d.*, b.*, c.*, i.*\r\n"
				+ "				  from xzys_ch_Inventory a LEFT JOIN InventoryClass b ON a.cInvCCode=b.cInvCCode  \r\n"
				+ "				 left join  ComputationUnit c  on a.cComUnitCode=c.cComUnitCode \r\n"
				+ "				  LEFT JOIN  Inventory_extradefine d on a.cinvcode=d.cinvcode  left join Inventory_Sub i on a.cInvCode=i.cInvSubCode \r\n"
				+ "    where a.tstatus='0' and ttype = '2' " 
				+ " order by a.ttype, a.dModifyDate";
		List<HashMap> invenrotyListEdit = selectMap(sqlEdit, "GC");

		System.out.println(sqlEdit);
		if (!ObjectUtils.isEmpty(invenrotyListEdit)) {
			for (HashMap inv : invenrotyListEdit) {
				String result = uploadInvenroty(inv);
				SysQtrzLogService sysQtrzLogService = ApplicationContextHelper.getBean(SysQtrzLogService.class);
				SysQrtzLog sysQrtzLog = new SysQrtzLog("46"); // 日志编码
				String logStatus = "";
				String sucSql = " update xzys_ch_Inventory \r\n" + "    	set tstatus ='1' \r\n"
						+ "    	where I_id = '" + inv.get("I_id") + "'";
				String sucSql1 = " update xzys_ch_Inventory \r\n" + "    	set tstatus ='2' \r\n"
						+ "    	where I_id = '" + inv.get("I_id") + "'";

				if ("上传U8成功！".equals(result)) {
					LOGGER.debug("上传U8成功！");
					updateMap(sucSql, "GC");
					logStatus = "1";

					String sucSql2 = "update Inventory_extradefine set " + "cidefine1='"
							+ getString(inv.get("cidefine1")) + "'," + "cidefine2='" + getString(inv.get("cidefine2"))
							+ "'," + "cidefine3='" + getString(inv.get("cidefine3")) + "'," + "cidefine4='"
							+ getString(inv.get("cidefine4")) + "'," + "cidefine5='" + getString(inv.get("cidefine5"))
							+ "'," + "cidefine6='" + getString(inv.get("cidefine6")) + "'," + "cidefine7='"
							+ getString(inv.get("cidefine7")) + "'," + "cidefine8='" + getString(inv.get("cidefine8"))
							+ "'," + "cidefine9='" + getString(inv.get("cidefine9")) + "'," + "cidefine10='"
							+ getString(inv.get("cidefine10")) + "'," + "cidefine11='"
							+ getString(inv.get("cidefine11")) + "'," + "cidefine12='"
							+ getString(inv.get("cidefine12")) + "'," + "cidefine13='"
							+ getString(inv.get("cidefine13")) + "'," + "cidefine14=" + inv.get("cidefine14") + ""
							+ " where cInvCode='" + inv.get("cInvCode") + "';";
					System.out.println(sucSql2);
					
					updateMap(sucSql2, "YX");

				} else {
					LOGGER.debug("上传U8失败！");
					updateMap(sucSql1, "GC");
					logStatus = "2";
				}
				sysQrtzLog.setLogStatus(logStatus);
				sysQrtzLog.setDescription(result);
				sysQrtzLog.setCodeNo(inv.get("cInvCode").toString());
				sysQrtzLog.setCreateDate(new Date());
				sysQtrzLogService.save(sysQrtzLog);
			}
		} // 修改

	}

	public List<HashMap> selectMap(String sql, String zhangtao) {
		List<HashMap> result = new ArrayList<HashMap>();
		try {
			JDBCToChanjet jdbc = new JDBCToChanjet();
			if ("YX".equals(zhangtao)) {
				// result = jdbc.getGCConnection(sql);
			} else if ("GC".equals(zhangtao)) {
				result = jdbc.getGCConnection(sql);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void updateMap(String sql, String zhangtao) {
		try {
			JDBCToChanjet jdbc = new JDBCToChanjet();
			if ("YX".equals(zhangtao)) {
				jdbc.YXUpdate(sql);
			} else if ("GC".equals(zhangtao)) {
				jdbc.GCUpdate(sql);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String uploadInvenroty(HashMap h) {
		try {
			HashMap param = new HashMap();
			HashMap h2 = getAllInfoInventory(h);
			String str = "";
			param.put("formInformation", h2);
			param.put("roottag", "inventory"); // u8对应业务
			param.put("sender", h2.get("sender"));// eai注册编码
			param.put("u8ip", h2.get("u8ip"));// eaiIP
			if (h.get("ttype").equals("1")) {
				param.put("proc", "add");// 操作类型
				param.put("templaterPath", "u8templater/inventoryAdd");//

			} else if (h.get("ttype").equals("2")) {
				param.put("proc", "edit");// 操作类型
				param.put("templaterPath", "u8templater/inventoryEdit");//

			} else {

			}
			param.put("mainTableName", "cs_customer");//
			param.put("fElement", "header");
			param.put("sElement", "entry");
			str = uploadU8(param);
			System.out.println(str);
			if (str.equals("fail")) {
				str = "确认失败，请检查U8连接是否正常！";
			} else if (str.indexOf(" succeed=\"0\"") == -1) {
				str = "异常: " + str.substring(str.indexOf("dsc=\"") + 5, str.indexOf("\"></item>"));
			} else {
				str = "上传U8成功！";
			}
			return str;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public HashMap getAllInfoInventory(HashMap h) throws Exception {
		h.put("sender", YXContant.getGCZT());// EAI编码

		h.put("code", h.get("cInvCode"));
		h.put("name", h.get("cInvName"));
		h.put("InvAddCode", h.get("cInvAddCode"));
		h.put("specs", h.get("cInvStd"));
		h.put("sort_code", h.get("cInvCCode"));   //结构不同需要注释
		h.put("main_supplier", h.get("cVenCode"));
		h.put("main_measure", h.get("cComunitCode"));
		h.put("switch_item", h.get("cReplaceItem"));
		h.put("inv_position", h.get("cPosition"));

		h.put("sale_flag", h.get("bSale"));
		h.put("purchase_flag", ("true".equals(h.get("bPurchase") + "") ? "1" : "0"));
		h.put("selfmake_flag", h.get("bSelf"));
		h.put("prod_consu_flag", h.get("bComsume"));
		h.put("in_making_flag", ("true".equals(h.get("bProducing") + "") ? "1" : "0"));
		h.put("tax_serv_flag", ("true".equals(h.get("bService") + "") ? "1" : "0"));
		h.put("suit_flag", ("true".equals(h.get("bAccessary") + "") ? "1" : "0"));
		h.put("tax_rate", h.get("iTaxRate"));
		h.put("unit_weight", h.get("iInvWeight"));
		h.put("unit_volume", h.get("iVolume"));
		h.put("pro_sale_price", null);
		h.put("ref_cost", h.get("iInvSPrice"));
		h.put("ref_sale_price", h.get("iInvSCost"));
		h.put("bottom_sale_price", h.get("iInvLSCost"));
		h.put("new_cost", h.get("iInvNCost"));
		h.put("advance_period", h.get("iInvAdvance"));
		h.put("ecnomic_batch", h.get("iInvBatch"));
		h.put("safe_stock", h.get("iSafeNum"));
		h.put("top_stock", h.get("iTopSum"));
		h.put("bottom_stock", h.get("iLowSum"));
		h.put("ccomunitname", h.get("ccomunitname"));
		h.put("backlog", h.get("iOverStock"));
		h.put("qlty_guarantee_flag", ("true".equals(h.get("bInvQuality") + "") ? "1" : "0"));
		h.put("batch_flag", ("true".equals(h.get("bInvBatch") + "") ? "1" : "0"));
		h.put("entrust_flag", h.get("bInvEntrust"));
		h.put("backlog_flag", ("true".equals(h.get("bInvOverStock") + "") ? "1" : "0"));
		h.put("start_date", h.get("dSDate"));
		// h.put("end_date", h.get("dEDate"));
		h.put("free_item1", ("true".equals(h.get("bFree1") + "") ? "1" : "0"));
		h.put("free_item2", ("true".equals(h.get("bFree2") + "") ? "1" : "0"));
		h.put("self_define1", h.get("cInvDefine1"));
		h.put("self_define2", h.get("cInvDefine2"));
		h.put("self_define3", h.get("cInvDefine3"));
		h.put("discount_flag", ("true".equals(h.get("bFree2") + "") ? "1" : "0"));
		h.put("top_source_price", h.get("iInvMPCost"));
		h.put("quality", h.get("cQuality"));
		h.put("retailprice", h.get("iInvSaleCost"));
		h.put("price1", h.get("iInvSCost1"));
		h.put("price2", h.get("iInvSCost2"));
		h.put("price3", h.get("iInvSCost3"));
		h.put("CreatePerson", h.get("cCreatePerson"));
		h.put("ModifyPerson", h.get("cModifyPerson"));
		h.put("subscribe_point", h.get("fSubscribePoint"));
		h.put("avgquantity", h.get("fVagQuantity"));
		h.put("pricetype", "");// h.get("cValueType")
		h.put("bfixunit", ("true".equals(h.get("bFixExch") + "") ? "1" : "0"));
		h.put("outline", h.get("fOutExcess"));
		h.put("inline", h.get("fInExcess"));
		h.put("overdate", h.get("iMassDate"));
		h.put("warndays", h.get("iWarnDays"));
		h.put("expense_rate", h.get("fExpensesExch"));
		h.put("btrack", h.get("bTrack"));
		h.put("bserial", ("true".equals(h.get("bBarCode") + "") ? "1" : "0"));
		h.put("barcode", h.get("cBarCode"));
		h.put("auth_class", h.get("iId"));
		h.put("self_define4", h.get("cInvDefine4"));
		h.put("self_define5", h.get("cInvDefine5"));
		h.put("self_define6", h.get("cInvDefine6"));
		h.put("self_define7", h.get("cInvDefine7"));
		h.put("self_define8", h.get("cInvDefine8"));
		h.put("self_define9", h.get("cInvDefine9"));
		h.put("self_define10", h.get("cInvDefine10"));
		h.put("self_define11", h.get("cInvDefine11"));
		h.put("self_define12", h.get("cInvDefine12"));
		h.put("self_define13", h.get("cInvDefine13"));
		h.put("self_define14", h.get("cInvDefine14"));
		h.put("self_define15", h.get("cInvDefine15"));
		h.put("self_define16", h.get("cInvDefine16"));
		h.put("cidefine1", h.get("cidefine1"));
		h.put("cidefine2", h.get("cidefine2"));
		h.put("cidefine3", h.get("cidefine3"));

		h.put("free_item3", ("true".equals(h.get("bFree3") + "") ? "1" : "0"));
		h.put("free_item4", ("true".equals(h.get("bFree4") + "") ? "1" : "0"));
		h.put("free_item5", ("true".equals(h.get("bFree5") + "") ? "1" : "0"));
		h.put("free_item6", ("true".equals(h.get("bFree6") + "") ? "1" : "0"));
		h.put("free_item7", ("true".equals(h.get("bFree7") + "") ? "1" : "0"));
		h.put("free_item8", ("true".equals(h.get("bFree8") + "") ? "1" : "0"));
		h.put("free_item9", ("true".equals(h.get("bFree9") + "") ? "1" : "0"));
		h.put("free_item10", ("true".equals(h.get("bFree10") + "") ? "1" : "0"));
		h.put("unitgroup_type", h.get("iGroupType"));
		h.put("unitgroup_code", h.get("cGroupCode"));
		h.put("puunit_code", h.get("cPUComunitCode"));
		h.put("saunit_code", h.get("cSAComunitCode"));
		h.put("stunit_code", h.get("cSTComunitCode"));
		h.put("caunit_code", h.get("cCAComunitCode"));
		h.put("unitgroup_name", h.get("cGroupName"));
		h.put("puunit_name", h.get("cPUComunitName"));
		h.put("saunit_name", h.get("cSAComunitName"));
		h.put("stunit_name", h.get("cSTComunitName"));
		h.put("caunit_name", h.get("cCAComunitName"));
		h.put("puunit_ichangrate", h.get("iPUChangRate"));
		h.put("saunit_ichangrate", h.get("iSAChangRate"));
		h.put("stunit_ichangrate", h.get("iSTChangRate"));
		h.put("caunit_ichangrate", h.get("iCAChangRate"));
		h.put("check_frequency", h.get("cFrequency"));
		h.put("frequency", h.get("iFrequency"));
		h.put("check_day", h.get("iDays"));
		// h.put("lastcheck_date", h.get("dLastDate"));
		h.put("wastage", h.get("iWastage"));
		// h.put("solitude",h.get("bSolitude"));
		h.put("enterprise", h.get("cEnterprise"));
		h.put("address", h.get("cAddress"));
		h.put("file", h.get("cFile"));
		h.put("brand", h.get("cLabel"));
		h.put("checkout_no", h.get("cCheckOut"));
		h.put("licence", h.get("cLicence"));
		// h.put("specialties",h.get("bSpecialties"));
		// h.put("defwarehouse", h.get("cDefWareHouse"));
		if(h.get("cDefWareHouse").equals("XS01")) {
			
			h.put("defwarehouse", "XS01");
		} else {
			h.put("defwarehouse", "XS02");
			
		}
		h.put("salerate", h.get("iExpSaleRate"));
		h.put("advanceDate", h.get("IadvanceDate"));
		h.put("currencyName", h.get("cCurrencyName"));
		h.put("ProduceAddress", h.get("cProduceAddress"));
		h.put("produceNation", h.get("cProduceNation"));
		h.put("RegisterNo", h.get("cRegisterNo"));
		h.put("EnterNo", h.get("cEnterNo"));
		h.put("PackingType", h.get("cPackingType"));
		h.put("EnglishName", h.get("cEnglishName"));
		h.put("PropertyCheck", ("true".equals(h.get("BPropertyCheck") + "") ? "1" : "0"));
		h.put("PreparationType", h.get("cPreparationType"));
		h.put("Commodity", h.get("cCommodity"));
		h.put("RecipeBatch", h.get("iRecipeBatch"));
		h.put("NotPatentName", h.get("cNotPatentName"));
		h.put("cAssComunitCode", h.get("cAssComunitCode"));
		h.put("ROPMethod", h.get("iROPMethod"));
		h.put("SubscribePoint", h.get("fSubscribePoint"));
		h.put("BatchRule", h.get("iBatchRule"));
		h.put("AssureProvideDays", h.get("iAssureProvideDays"));
		h.put("VagQuantity", h.get("fVagQuantity"));
		h.put("TestStyle", h.get("iTestStyle"));
		h.put("DTMethod", h.get("iDTMethod"));
		h.put("DTRate", h.get("fDTRate"));
		h.put("DTNum", h.get("fDTNum"));
		h.put("DTUnit", h.get("cDTUnit"));
		h.put("DTStyle", h.get("iDTStyle"));
		h.put("QTMethod", h.get("iQTMethod"));
		h.put("cshopunit", h.get("cshopunit"));
		h.put("bforeexpland", ("true".equals(h.get("bforeexpland") + "") ? "1" : "0"));
		h.put("cinvplancode", h.get("cinvplancode"));
		h.put("fconvertrate", h.get("fconvertrate"));
		h.put("dreplacedate", h.get("dreplacedate"));
		h.put("binvmodel", ("true".equals(h.get("binvmodel") + "") ? "1" : "0"));

		h.put("iimptaxrate", h.get("iimptaxrate"));
		h.put("iexptaxrate", h.get("iexptaxrate"));
		h.put("idrawbatch", h.get("idrawbatch"));
		h.put("cinvprojectcode", h.get("cinvprojectcode"));
		h.put("itestrule", h.get("itestrule"));
		h.put("crulecode", h.get("crulecode"));
		h.put("bcheckfree1", ("true".equals(h.get("bcheckfree1") + "") ? "1" : "0"));
		h.put("bcheckfree2", ("true".equals(h.get("bcheckfree2") + "") ? "1" : "0"));
		h.put("bcheckfree3", ("true".equals(h.get("bcheckfree3") + "") ? "1" : "0"));
		h.put("bcheckfree4", ("true".equals(h.get("bcheckfree4") + "") ? "1" : "0"));
		h.put("bcheckfree5", ("true".equals(h.get("bcheckfree5") + "") ? "1" : "0"));
		h.put("bcheckfree6", ("true".equals(h.get("bcheckfree6") + "") ? "1" : "0"));
		h.put("bcheckfree7", ("true".equals(h.get("bcheckfree7") + "") ? "1" : "0"));
		h.put("bcheckfree8", ("true".equals(h.get("bcheckfree8") + "") ? "1" : "0"));
		h.put("bcheckfree9", ("true".equals(h.get("bcheckfree9") + "") ? "1" : "0"));
		h.put("bcheckfree10", ("true".equals(h.get("bcheckfree10") + "") ? "1" : "0"));
		h.put("bbommain", ("true".equals(h.get("bbommain") + "") ? "1" : "0"));
		h.put("bproductbill", ("true".equals(h.get("bproductbill") + "") ? "1" : "0"));
		h.put("icheckatp", h.get("icheckatp"));
		h.put("iinvatpid", h.get("iinvatpid"));
		h.put("iplantfday", h.get("iplantfday"));
		h.put("ioverlapday", h.get("ioverlapday"));
		h.put("bfirstbusimedicine", h.get("bfirstbusimedicine"));
		h.put("fmaxsupply", h.get("fmaxsupply"));

		h.put("fminsplit", h.get("fminsplit"));
		h.put("fbuyexcess", h.get("fbuyexcess"));
		h.put("isurenesstype", h.get("isurenesstype"));
		h.put("idatetype", h.get("idatetype"));
		h.put("idatesum", h.get("idatesum"));
		h.put("idynamicsurenesstype", h.get("idynamicsurenesstype"));
		h.put("ibestrowsum", h.get("ibestrowsum"));
		h.put("ipercentumsum", h.get("ipercentumsum"));
		h.put("irequiretrackstyle", h.get("irequiretrackstyle"));
		h.put("ibomexpandunittype", h.get("ibomexpandunittype"));
		h.put("iexpiratdatecalcu", h.get("iexpiratdatecalcu"));
		h.put("iacceptearlydays", h.get("iacceptearlydays"));

		h.put("bmaintenance", ("true".equals(h.get("bmaintenance") + "") ? "1" : "0"));
		h.put("binvkeypart", ("true".equals(h.get("binvkeypart") + "") ? "1" : "0"));
		h.put("bpuquota", ("true".equals(h.get("bpuquota") + "") ? "1" : "0"));
		h.put("binvrohs", ("true".equals(h.get("binvrohs") + "") ? "1" : "0"));
		h.put("bprjmat", ("true".equals(h.get("bprjmat") + "") ? "1" : "0"));
		h.put("binvasset", ("true".equals(h.get("binvasset") + "") ? "1" : "0"));
		h.put("bsrvproduct", ("true".equals(h.get("bsrvproduct") + "") ? "1" : "0"));
		h.put("bimport", ("true".equals(h.get("bimport") + "") ? "1" : "0"));
		h.put("bsuitretail", ("true".equals(h.get("bsuitretail") + "") ? "1" : "0"));
		h.put("bcoupon", ("true".equals(h.get("bcoupon") + "") ? "1" : "0"));
		h.put("bstorecard", ("true".equals(h.get("bstorecard") + "") ? "1" : "0"));
		h.put("bpurpricefree1", ("true".equals(h.get("bpurpricefree1") + "") ? "1" : "0"));
		h.put("bpurpricefree2", ("true".equals(h.get("bpurpricefree2") + "") ? "1" : "0"));
		h.put("bpurpricefree3", ("true".equals(h.get("bpurpricefree3") + "") ? "1" : "0"));
		h.put("bpurpricefree4", ("true".equals(h.get("bpurpricefree4") + "") ? "1" : "0"));
		h.put("bpurpricefree5", ("true".equals(h.get("bpurpricefree5") + "") ? "1" : "0"));
		h.put("bpurpricefree6", ("true".equals(h.get("bpurpricefree6") + "") ? "1" : "0"));
		h.put("bpurpricefree7", ("true".equals(h.get("bpurpricefree7") + "") ? "1" : "0"));
		h.put("bpurpricefree8", ("true".equals(h.get("bpurpricefree8") + "") ? "1" : "0"));
		h.put("bpurpricefree9", ("true".equals(h.get("bpurpricefree9") + "") ? "1" : "0"));
		h.put("bpurpricefree10", ("true".equals(h.get("bpurpricefree10") + "") ? "1" : "0"));
		h.put("bompricefree1", ("true".equals(h.get("bompricefree1") + "") ? "1" : "0"));
		h.put("bompricefree2", ("true".equals(h.get("bompricefree2") + "") ? "1" : "0"));
		h.put("bompricefree3", ("true".equals(h.get("bompricefree3") + "") ? "1" : "0"));
		h.put("bompricefree4", ("true".equals(h.get("bompricefree4") + "") ? "1" : "0"));
		h.put("bompricefree5", ("true".equals(h.get("bompricefree5") + "") ? "1" : "0"));
		h.put("bompricefree6", ("true".equals(h.get("bompricefree6") + "") ? "1" : "0"));
		h.put("bompricefree7", ("true".equals(h.get("bompricefree7") + "") ? "1" : "0"));
		h.put("bompricefree8", ("true".equals(h.get("bompricefree8") + "") ? "1" : "0"));
		h.put("bompricefree9", ("true".equals(h.get("bompricefree9") + "") ? "1" : "0"));
		h.put("bompricefree10", ("true".equals(h.get("bompricefree10") + "") ? "1" : "0"));
		h.put("bsalepricefree1", ("true".equals(h.get("bsalepricefree1") + "") ? "1" : "0"));
		h.put("bsalepricefree2", ("true".equals(h.get("bsalepricefree2") + "") ? "1" : "0"));
		h.put("bsalepricefree3", ("true".equals(h.get("bsalepricefree3") + "") ? "1" : "0"));
		h.put("bsalepricefree4", ("true".equals(h.get("bsalepricefree4") + "") ? "1" : "0"));
		h.put("bsalepricefree5", ("true".equals(h.get("bsalepricefree5") + "") ? "1" : "0"));
		h.put("bsalepricefree6", ("true".equals(h.get("bsalepricefree6") + "") ? "1" : "0"));
		h.put("bsalepricefree7", ("true".equals(h.get("bsalepricefree7") + "") ? "1" : "0"));
		h.put("bsalepricefree8", ("true".equals(h.get("bsalepricefree8") + "") ? "1" : "0"));
		h.put("bsalepricefree9", ("true".equals(h.get("bsalepricefree9") + "") ? "1" : "0"));
		h.put("bsalepricefree10", ("true".equals(h.get("bsalepricefree10") + "") ? "1" : "0"));
		h.put("finvoutuplimit", h.get("finvoutuplimit"));
		h.put("bbondedinv", ("true".equals(h.get("bbondedinv") + "") ? "1" : "0"));
		h.put("bbatchcreate", ("true".equals(h.get("bbatchcreate") + "") ? "1" : "0"));
		h.put("bbatchproperty1", ("true".equals(h.get("bbatchproperty1") + "") ? "1" : "0"));
		h.put("bbatchproperty2", ("true".equals(h.get("bbatchproperty2") + "") ? "1" : "0"));
		h.put("bbatchproperty3", ("true".equals(h.get("bbatchproperty3") + "") ? "1" : "0"));
		h.put("bbatchproperty4", ("true".equals(h.get("bbatchproperty4") + "") ? "1" : "0"));
		h.put("bbatchproperty5", ("true".equals(h.get("bbatchproperty5") + "") ? "1" : "0"));
		h.put("bbatchproperty6", ("true".equals(h.get("bbatchproperty6") + "") ? "1" : "0"));
		h.put("bbatchproperty7", ("true".equals(h.get("bbatchproperty7") + "") ? "1" : "0"));
		h.put("bbatchproperty8", ("true".equals(h.get("bbatchproperty8") + "") ? "1" : "0"));
		h.put("bbatchproperty9", ("true".equals(h.get("bbatchproperty9") + "") ? "1" : "0"));
		h.put("bbatchproperty10", ("true".equals(h.get("bbatchproperty10") + "") ? "1" : "0"));
		h.put("bcontrolfreerange1", ("true".equals(h.get("bcontrolfreerange1") + "") ? "1" : "0"));
		h.put("bcontrolfreerange2", ("true".equals(h.get("bcontrolfreerange2") + "") ? "1" : "0"));
		h.put("bcontrolfreerange3", ("true".equals(h.get("bcontrolfreerange3") + "") ? "1" : "0"));
		h.put("bcontrolfreerange4", ("true".equals(h.get("bcontrolfreerange4") + "") ? "1" : "0"));
		h.put("bcontrolfreerange5", ("true".equals(h.get("bcontrolfreerange5") + "") ? "1" : "0"));
		h.put("bcontrolfreerange6", ("true".equals(h.get("bcontrolfreerange6") + "") ? "1" : "0"));
		h.put("bcontrolfreerange7", ("true".equals(h.get("bcontrolfreerange7") + "") ? "1" : "0"));
		h.put("bcontrolfreerange8", ("true".equals(h.get("bcontrolfreerange8") + "") ? "1" : "0"));
		h.put("bcontrolfreerange9", ("true".equals(h.get("bcontrolfreerange9") + "") ? "1" : "0"));
		h.put("bcontrolfreerange10", ("true".equals(h.get("bcontrolfreerange10") + "") ? "1" : "0"));
		h.put("finvciqexch", h.get("finvciqexch"));
		h.put("iwarrantyperiod", h.get("iwarrantyperiod"));
		h.put("iwarrantyunit", h.get("iwarrantyunit"));
		h.put("imaintenancecycle", h.get("imaintenancecycle"));
		h.put("imaintenancecycleunit", h.get("imaintenancecycleunit"));
		h.put("iacceptearlydays", h.get("iacceptearlydays"));
		h.put("fcurllaborcost", h.get("fcurllaborcost"));
		h.put("fcurlvarmanucost", h.get("fcurlvarmanucost"));
		h.put("fcurlfixmanucost", h.get("fcurlfixmanucost"));
		h.put("fcurlomcost", h.get("fcurlomcost"));
		h.put("fnextllaborcost", h.get("fnextllaborcost"));
		h.put("bompricefree1", h.get("bompricefree1"));
		h.put("fnextlfixmanucost", h.get("fnextlfixmanucost"));
		h.put("fnextlomcost", h.get("fnextlomcost"));
		h.put("fprjmatlimit", h.get("fprjmatlimit"));
		h.put("iacceptdelaydays", h.get("iacceptdelaydays"));

		h.put("cInvMnemCode", h.get("cInvMnemCode"));
		h.put("iPlanCheckDay", h.get("iPlanCheckDay"));
		h.put("iMaterialsCycle", h.get("iMaterialsCycle"));
		h.put("idrawtype", "0");
		h.put("iSupplyType", "1");
		h.put("bSCkeyProjections", h.get("bSCkeyProjections"));
		h.put("iSupplyPeriodType", h.get("iSupplyPeriodType"));
		h.put("iTimeBucketId", h.get("iTimeBucketId"));

		h.put("iAvailabilityDate", h.get("iAvailabilityDate"));
		h.put("fmaterialcost", h.get("fmaterialcost"));
		h.put("inearrejectdays", h.get("inearrejectdays"));
		h.put("bprocessproduct", ("true".equals(h.get("bprocessproduct") + "") ? "1" : "0"));
		h.put("bprocessmaterial", ("true".equals(h.get("bprocessmaterial") + "") ? "1" : "0"));
		h.put("froundfactor", h.get("froundfactor"));
		h.put("bchecksubitemcost", ("true".equals(h.get("bchecksubitemcost") + "") ? "1" : "0"));
		h.put("bconsiderfreestock", ("true".equals(h.get("bconsiderfreestock") + "") ? "1" : "0"));
		h.put("breceiptbydt", ("true".equals(h.get("breceiptbydt") + "") ? "1" : "0"));
		h.put("bkccutmantissa", ("true".equals(h.get("bkccutmantissa") + "") ? "1" : "0"));
		h.put("iPlanDefault", h.get("iPlanDefault"));
		h.put("iPFBatchQty", h.get("iPFBatchQty"));
		h.put("iAllocatePrintDgt", h.get("iAllocatePrintDgt"));
		h.put("bCheckBatch", h.get("bCheckBatch"));
		h.put("bMngOldpart", h.get("bMngOldpart"));
		h.put("iOldpartMngRule", h.get("iOldpartMngRule"));

		h.put("selfmake_flag", ("true".equals(h.get("bSelf") + "") ? "1" : "0"));
		h.put("sale_flag", ("true".equals(h.get("bSale") + "") ? "1" : "0"));
		h.put("prod_consu_flag", ("true".equals(h.get("bComsume") + "") ? "1" : "0"));
		h.put("tax_rate", h.get("iTaxRate"));
		h.put("advance_period", h.get("iInvAdvance"));

		// h.put("ModifyDate",h.get("dModifyDate"));
		String modDate = h.get("dModifyDate") + "";
		if (!ObjectUtils.isEmpty(modDate)) {
			String datassss = modDate.substring(0, 19);
			h.put("ModifyDate", datassss);
		}

		String sdatt = h.get("dSDate") + "";
		if (!ObjectUtils.isEmpty(sdatt)) {
			String datassss = sdatt.substring(0, 19);
			h.put("start_date", datassss);
		}

		if (!ObjectUtils.isEmpty(h.get("dLastDate"))) {
			String dLastDate = h.get("dLastDate").toString();
			String datassss = dLastDate.substring(0, 19);
			h.put("lastcheck_date", datassss);
		}
		if (!ObjectUtils.isEmpty(h.get("dEDate"))) {
			String edatt = h.get("dEDate").toString();
			String datassss = edatt.substring(0, 19);
			h.put("end_date", datassss);
		}

		String time = h.get("dinvcreatedatetime") + "";
		if (!ObjectUtils.isEmpty(time)) {
			String datassss = time.substring(0, 19);
			h.put("dinvcreatedatetime", datassss);
		}
		h.put("btrack", ("true".equals(h.get("bTrack") + "") ? "1" : "0"));
		h.put("bSerial", ("true".equals(h.get("bSerial") + "") ? "1" : "0"));
		h.put("bbarcode", ("true".equals(h.get("bBarCode") + "") ? "1" : "0"));
		// param.put("defwarehouse",mainmap.get("cDefWareHouse"));
		h.put("bMPS", ("true".equals(h.get("bMPS") + "") ? "1" : "0"));
		h.put("bROP", ("true".equals(h.get("bROP") + "") ? "1" : "0"));
		h.put("bRePlan", ("true".equals(h.get("bRePlan") + "") ? "1" : "0"));
		h.put("bInTotalCost", ("true".equals(h.get("bInTotalCost") + "") ? "1" : "0"));
		h.put("iImpTaxRate", h.get("iImpTaxRate"));
		h.put("bBomMain", ("true".equals(h.get("bBomMain") + "") ? "1" : "0"));
		h.put("bProducing", ("true".equals(h.get("bProducing") + "") ? "1" : "0"));
		h.put("bbomsub", ("true".equals(h.get("bbomsub") + "") ? "1" : "0"));
		h.put("bService", ("true".equals(h.get("bService") + "") ? "1" : "0"));
		h.put("bAccessary", ("true".equals(h.get("bAccessary") + "") ? "1" : "0"));
		h.put("bService", ("true".equals(h.get("bService") + "") ? "1" : "0"));
		h.put("bService", ("true".equals(h.get("bService") + "") ? "1" : "0"));
		h.put("bProducing", ("true".equals(h.get("bProducing") + "") ? "1" : "0"));
		h.put("bInvQuality", ("true".equals(h.get("bInvQuality") + "") ? "1" : "0"));
		h.put("bInvBatch", ("true".equals(h.get("bInvBatch") + "") ? "1" : "0"));
		h.put("entrust_flag", ("true".equals(h.get("bInvEntrust") + "") ? "1" : "0"));
		h.put("bInvOverStock", ("true".equals(h.get("bInvOverStock") + "") ? "1" : "0"));
		h.put("bFree1", ("true".equals(h.get("bFree1") + "") ? "1" : "0"));
		h.put("bFree2", ("true".equals(h.get("bFree2") + "") ? "1" : "0"));
		h.put("bInvType", ("true".equals(h.get("bInvType") + "") ? "1" : "0"));
		h.put("bFixExch", ("true".equals(h.get("bFixExch") + "") ? "1" : "0"));
		h.put("bFree3", ("true".equals(h.get("bFree3") + "") ? "1" : "0"));
		h.put("bFree4", ("true".equals(h.get("bFree4") + "") ? "1" : "0"));
		h.put("bFree5", ("true".equals(h.get("bFree5") + "") ? "1" : "0"));
		h.put("bFree6", ("true".equals(h.get("bFree6") + "") ? "1" : "0"));
		h.put("bFree7", ("true".equals(h.get("bFree7") + "") ? "1" : "0"));
		h.put("bFree8", ("true".equals(h.get("bFree8") + "") ? "1" : "0"));
		h.put("bFree9", ("true".equals(h.get("bFree9") + "") ? "1" : "0"));
		h.put("bFree10", ("true".equals(h.get("bFree10") + "") ? "1" : "0"));
		h.put("bimportmedicine", ("true".equals(h.get("bimportmedicine") + "") ? "1" : "0"));
		h.put("bsrvfittings", ("true".equals(h.get("bsrvfittings") + "") ? "1" : "0"));
		h.put("bspecialorder", ("true".equals(h.get("bspecialorder") + "") ? "1" : "0"));
		h.put("binbyprocheck", ("true".equals(h.get("binbyprocheck") + "") ? "1" : "0"));
		h.put("bsrvitem", ("true".equals(h.get("bsrvitem") + "") ? "1" : "0"));
		h.put("bpiece", ("true".equals(h.get("bimportmedicine") + "") ? "1" : "0"));
		h.put("bfirstbusimedicine", ("true".equals(h.get("bfirstbusimedicine") + "") ? "1" : "0"));
		h.put("bcheckbsatp", ("true".equals(h.get("bcheckbsatp") + "") ? "1" : "0"));
		h.put("bexpsale", ("true".equals(h.get("bexpsale") + "") ? "1" : "0"));
		h.put("solitude", ("true".equals(h.get("bSolitude") + "") ? "1" : "0"));
		h.put("specialties", ("true".equals(h.get("bSpecialties") + "") ? "1" : "0"));
		h.put("bPlanInv", ("true".equals(h.get("bPlanInv") + "") ? "1" : "0"));
		h.put("bProxyForeign", ("true".equals(h.get("bProxyForeign") + "") ? "1" : "0"));
		h.put("bATOModel", ("true".equals(h.get("bATOModel") + "") ? "1" : "0"));
		h.put("bCheckItem", ("true".equals(h.get("bCheckItem") + "") ? "1" : "0"));
		h.put("bPTOModel", ("true".equals(h.get("bPTOModel") + "") ? "1" : "0"));
		h.put("bBillUnite", ("true".equals(h.get("bBillUnite") + "") ? "1" : "0"));
		h.put("bBillUnite", ("true".equals(h.get("bBillUnite") + "") ? "1" : "0"));
		h.put("bCutMantissa", ("true".equals(h.get("bCutMantissa") + "") ? "1" : "0"));
		h.put("bConfigFree1", ("true".equals(h.get("bConfigFree1") + "") ? "1" : "0"));
		h.put("bConfigFree2", ("true".equals(h.get("bConfigFree2") + "") ? "1" : "0"));
		h.put("bConfigFree3", ("true".equals(h.get("bConfigFree3") + "") ? "1" : "0"));
		h.put("bConfigFree4", ("true".equals(h.get("bConfigFree4") + "") ? "1" : "0"));
		h.put("bConfigFree5", ("true".equals(h.get("bConfigFree5") + "") ? "1" : "0"));
		h.put("bConfigFree6", ("true".equals(h.get("bConfigFree6") + "") ? "1" : "0"));
		h.put("bConfigFree7", ("true".equals(h.get("bConfigFree7") + "") ? "1" : "0"));
		h.put("bConfigFree8", ("true".equals(h.get("bConfigFree8") + "") ? "1" : "0"));
		h.put("bConfigFree9", ("true".equals(h.get("bConfigFree9") + "") ? "1" : "0"));
		h.put("bConfigFree10", ("true".equals(h.get("bConfigFree10") + "") ? "1" : "0"));
		h.put("bOutInvDT", ("true".equals(h.get("bOutInvDT") + "") ? "1" : "0"));
		h.put("bPeriodDT", ("true".equals(h.get("bPeriodDT") + "") ? "1" : "0"));
		h.put("bBackInvDT", ("true".equals(h.get("bBackInvDT") + "") ? "1" : "0"));
		h.put("bDTWarnInv", ("true".equals(h.get("bDTWarnInv") + "") ? "1" : "0"));
		h.put("bATOModel", ("true".equals(h.get("bATOModel") + "") ? "1" : "0"));
		h.put("bProductBill", ("true".equals(h.get("bProductBill") + "") ? "1" : "0"));
		h.put("btracksalebill", ("true".equals(h.get("btracksalebill") + "") ? "1" : "0"));
		h.put("bPurchase", ("true".equals(h.get("bPurchase") + "") ? "1" : "0"));
		h.put("bCheckBatch", ("true".equals(h.get("bCheckBatch") + "") ? "1" : "0"));
		h.put("bMngOldpart", ("true".equals(h.get("bMngOldpart") + "") ? "1" : "0"));
		h.put("bFeatureMatch", ("true".equals(h.get("bFeatureMatch") + "") ? "1" : "0"));
		h.put("bSCkeyProjections", ("true".equals(h.get("bSCkeyProjections") + "") ? "1" : "0"));

		return h;
	}

	public static String getString(Object s) {
		String ts = s + "";
		if (ObjectUtils.isEmpty(ts)) {
			return "";
		}
		return ts;
	}

	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(new Date());
		return time;
	}

	public static String uploadU8(HashMap param) {

		try {
			String xmlStr = readXMLone(param);

			xmlStr = cleanXml(xmlStr);

			System.out.println(xmlStr);

			URL url = new URL(YXContant.getU8URL().toString());

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000000);
			con.setReadTimeout(3000000);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-type", "text/xml; charset=utf-8");
			// 发送requset请求
			OutputStream out = (OutputStream) con.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.write(xmlStr.getBytes("UTF-8"));
			// 获取Response响应
			InputStream in = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String s = null;
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			String responseXml = sb.toString();
			System.out.println(responseXml);
			return responseXml;
			// return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}

	}

	private static String cleanXml(String xml) {
		xml = xml.replace(
				"<entry><mainid></mainid><inventorycode></inventorycode><isfee></isfee><indate></indate><quantity></quantity><number></number><originalprice></originalprice><originalmoney></originalmoney><originaltaxprice></originaltaxprice><originaltax></originaltax><originalsum></originalsum><price></price><money></money><assistantunit></assistantunit><tax></tax><sum></sum><allotmoney></allotmoney><reasonablelostquantity></reasonablelostquantity><unreasonablelostquantity></unreasonablelostquantity><unreasonablelostmoney></unreasonablelostmoney><voucherdate></voucherdate><cdebithead></cdebithead><free1></free1><free2></free2><taxrate></taxrate><define22></define22><define23></define23><define24></define24><define25></define25><define26></define26><define27></define27><define28></define28><define29></define29><define30></define30><define31></define31><define32></define32><define33></define33><define34></define34><define35></define35><define36></define36><define37></define37><itemclasscode></itemclasscode><itemcode></itemcode><unreasonablelosttype></unreasonablelosttype><buytax></buytax><itemname></itemname><free3></free3><free4></free4><free5></free5><free6></free6><free7></free7><free8></free8><free9></free9><free10></free10><unitid></unitid><oritaxcost></oritaxcost><ivouchrowno></ivouchrowno><btaxcost></btaxcost></entry>",
				"");
		xml = xml.replace(
				"<entry><cfactorycode></cfactorycode><inventorycode></inventorycode><checkflag></checkflag><unitcode></unitcode><quantity></quantity><num></num><quotedprice></quotedprice><price></price><taxprice></taxprice><money></money><tax></tax><sum></sum><discount></discount><assistantunit></assistantunit><natprice></natprice><natmoney></natmoney><nattax></nattax><natsum></natsum><natdiscount></natdiscount><taxrate></taxrate><item_class></item_class><item_code></item_code><item_name></item_name><arrivedate></arrivedate><define22></define22><define23></define23><define24></define24><define25></define25><define26></define26><define27></define27><define28></define28><define29></define29><define30></define30><define31></define31><define32></define32><define33></define33><define34></define34><define35></define35><define36></define36><define37></define37><free1></free1><free2></free2><free3></free3><free4></free4><free5></free5><free6></free6><free7></free7><free8></free8><free9></free9><free10></free10><ivouchrowno></ivouchrowno><btaxcost></btaxcost><sodid></sodid><sotype></sotype><csocode></csocode><irowno></irowno></entry>",
				"");
		return xml;
	}

	public static String readXMLone(HashMap param) {
		// 单据封装的上传信息
		HashMap formInformation = (HashMap) param.get("formInformation");
		/*
		 * String url = ""; if (formInformation.get("ttype").equals("1")) { url =
		 * YXContant.getXML().toString();// 操作类型
		 * 
		 * } else if (formInformation.get("ttype").equals("2")) { url =
		 * YXContant.getXML().toString();// 操作类型
		 * 
		 * }
		 */
		String url = YXContant.getXML().toString();
//        String url ="F:/u8/u8templater/inventory.xml";
		System.out.println(url);
		// 获取程序发布路径
		url = url.replaceAll("%20", " ");
		url = url.substring(0, url.indexOf("u8templater/inventory")) + param.get("templaterPath") + ".xml";
		SAXReader reader = new SAXReader();
		StringBuilder xmlStr = new StringBuilder();
		xmlStr.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		try {
			Document document = reader.read(url);
			Element element = document.getRootElement();
			List attributes = element.attributes(); // 获取跟节点的属性值
			String property = "";
			for (int i = 0; i < attributes.size(); i++) {
				Attribute attribute = (Attribute) attributes.get(i);
				if (attribute.getQualifiedName().equals("sender")) {
					property += " " + attribute.getQualifiedName() + "=" + "\"" + param.get("sender") + "\"";
				} else {
					property += " " + attribute.getQualifiedName() + "=" + "\"" + attribute.getValue() + "\"";
				}

			}
			xmlStr.append("<" + element.getQualifiedName() + property + ">");
			getSonElementone(element, xmlStr, formInformation, 0, param.get("fElement") + "",
					param.get("sElement") + "");
			xmlStr.append("</" + element.getQualifiedName() + ">");
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		System.out.print("");
		String xmls = xmlStr.toString();
		xmls = xmls.replace("<param>", "");
		xmls = xmls.replace("</param>", "");
		return xmls;
	}

	public static void getSonElementone(Element ele, StringBuilder xmlStr, HashMap formInformation, int index,
			String fElementName, String sElement) {
		// 获取当前节点的子节点
		List sons = ele.elements();
		if (0 != sons.size()) {
			for (Iterator i = ele.elementIterator(); i.hasNext();) {
				Element son = (Element) i.next();
				Element parent = son.getParent(); // 当前节点的父节点
				String value = "";
				// 判读父节点是否表头son
				if (parent.getName().equalsIgnoreCase(fElementName)) {
					value = formInformation.get(son.getName()) + "";
				} else if (parent.getName().equalsIgnoreCase("entry")) {
					List childValues = (List) formInformation.get("childTable");
					if (null == childValues || ObjectUtils.isEmpty(childValues) || index >= childValues.size()) {
						value = "";
					} else {
						HashMap childValue = (HashMap) childValues.get(index);
						value = childValue.get(son.getName()) + "";
					}
				} else if (parent.getName().equalsIgnoreCase("context")) {
					value = "<param name=\"VoucherType\" value=\"9\" datatype=\"int\"/>";
				} else if (parent.getName().equalsIgnoreCase("u8apiservice")) {
					value = formInformation.get(son.getName()) + "";
				}
				xmlStr.append("<" + son.getName() + ">");
				if (value.equalsIgnoreCase("null"))
					value = "";
				xmlStr.append(value);
				getSonElementone(son, xmlStr, formInformation, index, fElementName, sElement);
				xmlStr.append("</" + son.getName() + ">");
				// 判断正行数据是否封装完成
				if (son.getName().equals(sElement))
					index = index + 1;
			}
		}

	}

}
