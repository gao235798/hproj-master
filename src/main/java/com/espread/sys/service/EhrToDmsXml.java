package com.espread.sys.service;

import java.math.BigDecimal;
import java.util.List;

import com.espread.sys.model.*;


public interface EhrToDmsXml {

    public SysQrtzLog toCH(DMSInventory dMSInventory);


    public SysQrtzLog toPJ(DMSInventory dMSInventory);

    public SysQrtzLog toPJQT(DMSInventory dMSInventory);

    public SysQrtzLog toPJCX(DMSInventory dMSInventory);

    public SysQrtzLog toJG(List list);

    public SysQrtzLog toPJCK(Rdrecord32 rdrecord32);

    public SysQrtzLog toXCL();

    public SysQrtzLog toSCRK(Rdrecord10 rdrecord10);

    public SysQrtzLog toSCRKCG(RdRecord01 rdrecord01);

    public SysQrtzLog toKP(SaleBillVouch saleBillVouch);
    SysQrtzLog toSCRKQT(Rdrecord08 var1);

    public SysQrtzLog toKCFK(SOSOMain sOSOMain);

    public SysQrtzLog toFHSH(DispatchList dispatchList);

    public SysQrtzLog toJHFK(MomOrderdetail momOrderdetail);

    public SysQrtzLog updateSOSOMainStatus(int autoid, String cdefine25);

    public SysQrtzLog updateSosomainChange(int autoid, String cinvcode, String csocode, BigDecimal currentIquantity);


    public SysQrtzLog closeSOSODetails(Integer autoid, String cinvcode, String csocode);

    public SysQrtzLog closeSOSOmain(Integer id);
}
