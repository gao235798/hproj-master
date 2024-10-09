package com.espread.sys.service;

import java.io.IOException;
import java.io.StringWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.espread.sys.mapper.InventoryMapper;
import com.espread.sys.model.Department;
import com.espread.sys.model.Inventory;
import com.espread.sys.model.MomOrderdetail;
import com.espread.sys.model.POPomain;
import com.espread.sys.model.Rdrecord10;
import com.espread.sys.model.Rdrecord11;
import com.espread.sys.model.SysQrtzLog;
import com.espread.sys.model.TransVouch;
import com.espread.sys.model.Vendor;
import com.espread.sys.model.Warehouse;
import com.espread.sys.model.fitemss02;
import com.espread.sys.service.InventoryService;
import com.espread.sys.service.SysLogService;


public interface EhrToLesXml {
	
	public SysQrtzLog toInventory(Inventory inventory);
			
			
	public SysQrtzLog toWarehouse(Warehouse warehouse);	
	
	public SysQrtzLog toFitemss02(fitemss02 fitemss02);	
	
	public SysQrtzLog toDepartment(Department department);	
	
	public SysQrtzLog toVendor(Vendor vendor);	

	public SysQrtzLog toDbll(TransVouch transVouch);	
	
	public SysQrtzLog toWltk(TransVouch transVouch);	
	public SysQrtzLog toBf(Rdrecord11 rdrecord11);	
	public SysQrtzLog toSH(TransVouch transVouch);	
	public SysQrtzLog toRdrecord10(Rdrecord10 rdrecord10);	
	
	public SysQrtzLog toPOPomain(POPomain pOPomain);	
	public SysQrtzLog toPOPomainGb(POPomain pOPomain);	
	
	public SysQrtzLog toMomOrderdetail(MomOrderdetail momOrderdetail);	
	
	
}
