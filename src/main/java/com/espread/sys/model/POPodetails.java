package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class POPodetails implements Serializable {
    private Integer id;

    private String cpoid;

    private String cinvcode;

    private BigDecimal iquantity;

    private BigDecimal inum;

    private BigDecimal iquotedprice;

    private BigDecimal iunitprice;

    private BigDecimal imoney;

    private BigDecimal itax;

    private BigDecimal isum;

    private BigDecimal idiscount;

    private BigDecimal inatunitprice;

    private BigDecimal inatmoney;

    private BigDecimal inattax;

    private BigDecimal inatsum;

    private BigDecimal inatdiscount;

    private Date darrivedate;

    private BigDecimal ireceivedqty;

    private BigDecimal ireceivednum;

    private BigDecimal ireceivedmoney;

    private BigDecimal iinvqty;

    private BigDecimal iinvnum;

    private BigDecimal iinvmoney;

    private String cfree1;

    private String cfree2;

    private BigDecimal inatinvmoney;

    private BigDecimal ioritotal;

    private BigDecimal itotal;

    private BigDecimal ipertaxrate;

    private String cdefine22;

    private String cdefine23;

    private String cdefine24;

    private String cdefine25;

    private Double cdefine26;

    private Double cdefine27;

    private Byte iflag;

    private String citemcode;

    private String citemClass;

    private Integer ppcids;

    private String citemname;

    private String cfree3;

    private String cfree4;

    private String cfree5;

    private String cfree6;

    private String cfree7;

    private String cfree8;

    private String cfree9;

    private String cfree10;

    private Byte bgsp;

    private Integer poid;

    private String cunitid;

    private BigDecimal itaxprice;

    private BigDecimal iarrqty;

    private BigDecimal iarrnum;

    private BigDecimal iarrmoney;

    private BigDecimal inatarrmoney;

    private Integer iappids;

    private String cdefine28;

    private String cdefine29;

    private String cdefine30;

    private String cdefine31;

    private String cdefine32;

    private String cdefine33;

    private Integer cdefine34;

    private Integer cdefine35;

    private Date cdefine36;

    private Date cdefine37;

    private Integer isosid;

    private Boolean btaxcost;

    private String csource;

    private String cbcloser;

    private Integer ippartid;

    private BigDecimal ipquantity;

    private Integer iptoseq;

    private Byte sotype;

    private String sodid;

    private String contractrowguid;

    private String cupsocode;

    private BigDecimal iinvmpcost;

    private String contractcode;

    private String contractrowno;

    private BigDecimal fpovalidquantity;

    private BigDecimal fpovalidnum;

    private BigDecimal fpoarrquantity;

    private BigDecimal fpoarrnum;

    private BigDecimal fporetquantity;

    private BigDecimal fporetnum;

    private BigDecimal fporefusequantity;

    private BigDecimal fporefusenum;

    private Integer iorderdid;

    private Byte iordertype;

    private String csoordercode;

    private Integer iorderseq;

    private Date cbclosetime;

    private Date cbclosedate;

    private String cbgItemcode;

    private String cbgItemname;

    private String cbgCaliberkey1;

    private String cbgCaliberkeyname1;

    private String cbgCaliberkey2;

    private String cbgCaliberkeyname2;

    private String cbgCaliberkey3;

    private String cbgCaliberkeyname3;

    private String cbgCalibercode1;

    private String cbgCalibername1;

    private String cbgCalibercode2;

    private String cbgCalibername2;

    private String cbgCalibercode3;

    private String cbgCalibername3;

    private Byte ibgCtrl;

    private String cbgAuditopinion;

    private BigDecimal fexquantity;

    private BigDecimal fexnum;

    private Integer ivouchrowno;

    private String cbgCaliberkey4;

    private String cbgCaliberkeyname4;

    private String cbgCaliberkey5;

    private String cbgCaliberkeyname5;

    private String cbgCaliberkey6;

    private String cbgCaliberkeyname6;

    private String cbgCalibercode4;

    private String cbgCalibername4;

    private String cbgCalibercode5;

    private String cbgCalibername5;

    private String cbgCalibercode6;

    private String cbgCalibername6;

    private String csocode;

    private Integer irowno;

    private BigDecimal freceivedqty;

    private BigDecimal freceivednum;

    private String cxjspdids;

    private String cbmemo;

    private String cbsysbarcode;

    private String planlotnumber;

    private Short bgift;

    private String cfactorycode;
    public String getCdefwarehouse() {
		return cdefwarehouse;
	}

	public void setCdefwarehouse(String cdefwarehouse) {
		this.cdefwarehouse = cdefwarehouse;
	}

	private String cdefwarehouse;

    private byte[] dufts;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpoid() {
        return cpoid;
    }

    public void setCpoid(String cpoid) {
        this.cpoid = cpoid == null ? null : cpoid.trim();
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public BigDecimal getIquantity() {
        return iquantity;
    }

    public void setIquantity(BigDecimal iquantity) {
        this.iquantity = iquantity;
    }

    public BigDecimal getInum() {
        return inum;
    }

    public void setInum(BigDecimal inum) {
        this.inum = inum;
    }

    public BigDecimal getIquotedprice() {
        return iquotedprice;
    }

    public void setIquotedprice(BigDecimal iquotedprice) {
        this.iquotedprice = iquotedprice;
    }

    public BigDecimal getIunitprice() {
        return iunitprice;
    }

    public void setIunitprice(BigDecimal iunitprice) {
        this.iunitprice = iunitprice;
    }

    public BigDecimal getImoney() {
        return imoney;
    }

    public void setImoney(BigDecimal imoney) {
        this.imoney = imoney;
    }

    public BigDecimal getItax() {
        return itax;
    }

    public void setItax(BigDecimal itax) {
        this.itax = itax;
    }

    public BigDecimal getIsum() {
        return isum;
    }

    public void setIsum(BigDecimal isum) {
        this.isum = isum;
    }

    public BigDecimal getIdiscount() {
        return idiscount;
    }

    public void setIdiscount(BigDecimal idiscount) {
        this.idiscount = idiscount;
    }

    public BigDecimal getInatunitprice() {
        return inatunitprice;
    }

    public void setInatunitprice(BigDecimal inatunitprice) {
        this.inatunitprice = inatunitprice;
    }

    public BigDecimal getInatmoney() {
        return inatmoney;
    }

    public void setInatmoney(BigDecimal inatmoney) {
        this.inatmoney = inatmoney;
    }

    public BigDecimal getInattax() {
        return inattax;
    }

    public void setInattax(BigDecimal inattax) {
        this.inattax = inattax;
    }

    public BigDecimal getInatsum() {
        return inatsum;
    }

    public void setInatsum(BigDecimal inatsum) {
        this.inatsum = inatsum;
    }

    public BigDecimal getInatdiscount() {
        return inatdiscount;
    }

    public void setInatdiscount(BigDecimal inatdiscount) {
        this.inatdiscount = inatdiscount;
    }

    public Date getDarrivedate() {
        return darrivedate;
    }

    public void setDarrivedate(Date darrivedate) {
        this.darrivedate = darrivedate;
    }

    public BigDecimal getIreceivedqty() {
        return ireceivedqty;
    }

    public void setIreceivedqty(BigDecimal ireceivedqty) {
        this.ireceivedqty = ireceivedqty;
    }

    public BigDecimal getIreceivednum() {
        return ireceivednum;
    }

    public void setIreceivednum(BigDecimal ireceivednum) {
        this.ireceivednum = ireceivednum;
    }

    public BigDecimal getIreceivedmoney() {
        return ireceivedmoney;
    }

    public void setIreceivedmoney(BigDecimal ireceivedmoney) {
        this.ireceivedmoney = ireceivedmoney;
    }

    public BigDecimal getIinvqty() {
        return iinvqty;
    }

    public void setIinvqty(BigDecimal iinvqty) {
        this.iinvqty = iinvqty;
    }

    public BigDecimal getIinvnum() {
        return iinvnum;
    }

    public void setIinvnum(BigDecimal iinvnum) {
        this.iinvnum = iinvnum;
    }

    public BigDecimal getIinvmoney() {
        return iinvmoney;
    }

    public void setIinvmoney(BigDecimal iinvmoney) {
        this.iinvmoney = iinvmoney;
    }

    public String getCfree1() {
        return cfree1;
    }

    public void setCfree1(String cfree1) {
        this.cfree1 = cfree1 == null ? null : cfree1.trim();
    }

    public String getCfree2() {
        return cfree2;
    }

    public void setCfree2(String cfree2) {
        this.cfree2 = cfree2 == null ? null : cfree2.trim();
    }

    public BigDecimal getInatinvmoney() {
        return inatinvmoney;
    }

    public void setInatinvmoney(BigDecimal inatinvmoney) {
        this.inatinvmoney = inatinvmoney;
    }

    public BigDecimal getIoritotal() {
        return ioritotal;
    }

    public void setIoritotal(BigDecimal ioritotal) {
        this.ioritotal = ioritotal;
    }

    public BigDecimal getItotal() {
        return itotal;
    }

    public void setItotal(BigDecimal itotal) {
        this.itotal = itotal;
    }

    public BigDecimal getIpertaxrate() {
        return ipertaxrate;
    }

    public void setIpertaxrate(BigDecimal ipertaxrate) {
        this.ipertaxrate = ipertaxrate;
    }

    public String getCdefine22() {
        return cdefine22;
    }

    public void setCdefine22(String cdefine22) {
        this.cdefine22 = cdefine22 == null ? null : cdefine22.trim();
    }

    public String getCdefine23() {
        return cdefine23;
    }

    public void setCdefine23(String cdefine23) {
        this.cdefine23 = cdefine23 == null ? null : cdefine23.trim();
    }

    public String getCdefine24() {
        return cdefine24;
    }

    public void setCdefine24(String cdefine24) {
        this.cdefine24 = cdefine24 == null ? null : cdefine24.trim();
    }

    public String getCdefine25() {
        return cdefine25;
    }

    public void setCdefine25(String cdefine25) {
        this.cdefine25 = cdefine25 == null ? null : cdefine25.trim();
    }

    public Double getCdefine26() {
        return cdefine26;
    }

    public void setCdefine26(Double cdefine26) {
        this.cdefine26 = cdefine26;
    }

    public Double getCdefine27() {
        return cdefine27;
    }

    public void setCdefine27(Double cdefine27) {
        this.cdefine27 = cdefine27;
    }

    public Byte getIflag() {
        return iflag;
    }

    public void setIflag(Byte iflag) {
        this.iflag = iflag;
    }

    public String getCitemcode() {
        return citemcode;
    }

    public void setCitemcode(String citemcode) {
        this.citemcode = citemcode == null ? null : citemcode.trim();
    }

    public String getCitemClass() {
        return citemClass;
    }

    public void setCitemClass(String citemClass) {
        this.citemClass = citemClass == null ? null : citemClass.trim();
    }

    public Integer getPpcids() {
        return ppcids;
    }

    public void setPpcids(Integer ppcids) {
        this.ppcids = ppcids;
    }

    public String getCitemname() {
        return citemname;
    }

    public void setCitemname(String citemname) {
        this.citemname = citemname == null ? null : citemname.trim();
    }

    public String getCfree3() {
        return cfree3;
    }

    public void setCfree3(String cfree3) {
        this.cfree3 = cfree3 == null ? null : cfree3.trim();
    }

    public String getCfree4() {
        return cfree4;
    }

    public void setCfree4(String cfree4) {
        this.cfree4 = cfree4 == null ? null : cfree4.trim();
    }

    public String getCfree5() {
        return cfree5;
    }

    public void setCfree5(String cfree5) {
        this.cfree5 = cfree5 == null ? null : cfree5.trim();
    }

    public String getCfree6() {
        return cfree6;
    }

    public void setCfree6(String cfree6) {
        this.cfree6 = cfree6 == null ? null : cfree6.trim();
    }

    public String getCfree7() {
        return cfree7;
    }

    public void setCfree7(String cfree7) {
        this.cfree7 = cfree7 == null ? null : cfree7.trim();
    }

    public String getCfree8() {
        return cfree8;
    }

    public void setCfree8(String cfree8) {
        this.cfree8 = cfree8 == null ? null : cfree8.trim();
    }

    public String getCfree9() {
        return cfree9;
    }

    public void setCfree9(String cfree9) {
        this.cfree9 = cfree9 == null ? null : cfree9.trim();
    }

    public String getCfree10() {
        return cfree10;
    }

    public void setCfree10(String cfree10) {
        this.cfree10 = cfree10 == null ? null : cfree10.trim();
    }

    public Byte getBgsp() {
        return bgsp;
    }

    public void setBgsp(Byte bgsp) {
        this.bgsp = bgsp;
    }

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getCunitid() {
        return cunitid;
    }

    public void setCunitid(String cunitid) {
        this.cunitid = cunitid == null ? null : cunitid.trim();
    }

    public BigDecimal getItaxprice() {
        return itaxprice;
    }

    public void setItaxprice(BigDecimal itaxprice) {
        this.itaxprice = itaxprice;
    }

    public BigDecimal getIarrqty() {
        return iarrqty;
    }

    public void setIarrqty(BigDecimal iarrqty) {
        this.iarrqty = iarrqty;
    }

    public BigDecimal getIarrnum() {
        return iarrnum;
    }

    public void setIarrnum(BigDecimal iarrnum) {
        this.iarrnum = iarrnum;
    }

    public BigDecimal getIarrmoney() {
        return iarrmoney;
    }

    public void setIarrmoney(BigDecimal iarrmoney) {
        this.iarrmoney = iarrmoney;
    }

    public BigDecimal getInatarrmoney() {
        return inatarrmoney;
    }

    public void setInatarrmoney(BigDecimal inatarrmoney) {
        this.inatarrmoney = inatarrmoney;
    }

    public Integer getIappids() {
        return iappids;
    }

    public void setIappids(Integer iappids) {
        this.iappids = iappids;
    }

    public String getCdefine28() {
        return cdefine28;
    }

    public void setCdefine28(String cdefine28) {
        this.cdefine28 = cdefine28 == null ? null : cdefine28.trim();
    }

    public String getCdefine29() {
        return cdefine29;
    }

    public void setCdefine29(String cdefine29) {
        this.cdefine29 = cdefine29 == null ? null : cdefine29.trim();
    }

    public String getCdefine30() {
        return cdefine30;
    }

    public void setCdefine30(String cdefine30) {
        this.cdefine30 = cdefine30 == null ? null : cdefine30.trim();
    }

    public String getCdefine31() {
        return cdefine31;
    }

    public void setCdefine31(String cdefine31) {
        this.cdefine31 = cdefine31 == null ? null : cdefine31.trim();
    }

    public String getCdefine32() {
        return cdefine32;
    }

    public void setCdefine32(String cdefine32) {
        this.cdefine32 = cdefine32 == null ? null : cdefine32.trim();
    }

    public String getCdefine33() {
        return cdefine33;
    }

    public void setCdefine33(String cdefine33) {
        this.cdefine33 = cdefine33 == null ? null : cdefine33.trim();
    }

    public Integer getCdefine34() {
        return cdefine34;
    }

    public void setCdefine34(Integer cdefine34) {
        this.cdefine34 = cdefine34;
    }

    public Integer getCdefine35() {
        return cdefine35;
    }

    public void setCdefine35(Integer cdefine35) {
        this.cdefine35 = cdefine35;
    }

    public Date getCdefine36() {
        return cdefine36;
    }

    public void setCdefine36(Date cdefine36) {
        this.cdefine36 = cdefine36;
    }

    public Date getCdefine37() {
        return cdefine37;
    }

    public void setCdefine37(Date cdefine37) {
        this.cdefine37 = cdefine37;
    }

    public Integer getIsosid() {
        return isosid;
    }

    public void setIsosid(Integer isosid) {
        this.isosid = isosid;
    }

    public Boolean getBtaxcost() {
        return btaxcost;
    }

    public void setBtaxcost(Boolean btaxcost) {
        this.btaxcost = btaxcost;
    }

    public String getCsource() {
        return csource;
    }

    public void setCsource(String csource) {
        this.csource = csource == null ? null : csource.trim();
    }

    public String getCbcloser() {
        return cbcloser;
    }

    public void setCbcloser(String cbcloser) {
        this.cbcloser = cbcloser == null ? null : cbcloser.trim();
    }

    public Integer getIppartid() {
        return ippartid;
    }

    public void setIppartid(Integer ippartid) {
        this.ippartid = ippartid;
    }

    public BigDecimal getIpquantity() {
        return ipquantity;
    }

    public void setIpquantity(BigDecimal ipquantity) {
        this.ipquantity = ipquantity;
    }

    public Integer getIptoseq() {
        return iptoseq;
    }

    public void setIptoseq(Integer iptoseq) {
        this.iptoseq = iptoseq;
    }

    public Byte getSotype() {
        return sotype;
    }

    public void setSotype(Byte sotype) {
        this.sotype = sotype;
    }

    public String getSodid() {
        return sodid;
    }

    public void setSodid(String sodid) {
        this.sodid = sodid == null ? null : sodid.trim();
    }

    public String getContractrowguid() {
        return contractrowguid;
    }

    public void setContractrowguid(String contractrowguid) {
        this.contractrowguid = contractrowguid == null ? null : contractrowguid.trim();
    }

    public String getCupsocode() {
        return cupsocode;
    }

    public void setCupsocode(String cupsocode) {
        this.cupsocode = cupsocode == null ? null : cupsocode.trim();
    }

    public BigDecimal getIinvmpcost() {
        return iinvmpcost;
    }

    public void setIinvmpcost(BigDecimal iinvmpcost) {
        this.iinvmpcost = iinvmpcost;
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode == null ? null : contractcode.trim();
    }

    public String getContractrowno() {
        return contractrowno;
    }

    public void setContractrowno(String contractrowno) {
        this.contractrowno = contractrowno == null ? null : contractrowno.trim();
    }

    public BigDecimal getFpovalidquantity() {
        return fpovalidquantity;
    }

    public void setFpovalidquantity(BigDecimal fpovalidquantity) {
        this.fpovalidquantity = fpovalidquantity;
    }

    public BigDecimal getFpovalidnum() {
        return fpovalidnum;
    }

    public void setFpovalidnum(BigDecimal fpovalidnum) {
        this.fpovalidnum = fpovalidnum;
    }

    public BigDecimal getFpoarrquantity() {
        return fpoarrquantity;
    }

    public void setFpoarrquantity(BigDecimal fpoarrquantity) {
        this.fpoarrquantity = fpoarrquantity;
    }

    public BigDecimal getFpoarrnum() {
        return fpoarrnum;
    }

    public void setFpoarrnum(BigDecimal fpoarrnum) {
        this.fpoarrnum = fpoarrnum;
    }

    public BigDecimal getFporetquantity() {
        return fporetquantity;
    }

    public void setFporetquantity(BigDecimal fporetquantity) {
        this.fporetquantity = fporetquantity;
    }

    public BigDecimal getFporetnum() {
        return fporetnum;
    }

    public void setFporetnum(BigDecimal fporetnum) {
        this.fporetnum = fporetnum;
    }

    public BigDecimal getFporefusequantity() {
        return fporefusequantity;
    }

    public void setFporefusequantity(BigDecimal fporefusequantity) {
        this.fporefusequantity = fporefusequantity;
    }

    public BigDecimal getFporefusenum() {
        return fporefusenum;
    }

    public void setFporefusenum(BigDecimal fporefusenum) {
        this.fporefusenum = fporefusenum;
    }

    public Integer getIorderdid() {
        return iorderdid;
    }

    public void setIorderdid(Integer iorderdid) {
        this.iorderdid = iorderdid;
    }

    public Byte getIordertype() {
        return iordertype;
    }

    public void setIordertype(Byte iordertype) {
        this.iordertype = iordertype;
    }

    public String getCsoordercode() {
        return csoordercode;
    }

    public void setCsoordercode(String csoordercode) {
        this.csoordercode = csoordercode == null ? null : csoordercode.trim();
    }

    public Integer getIorderseq() {
        return iorderseq;
    }

    public void setIorderseq(Integer iorderseq) {
        this.iorderseq = iorderseq;
    }

    public Date getCbclosetime() {
        return cbclosetime;
    }

    public void setCbclosetime(Date cbclosetime) {
        this.cbclosetime = cbclosetime;
    }

    public Date getCbclosedate() {
        return cbclosedate;
    }

    public void setCbclosedate(Date cbclosedate) {
        this.cbclosedate = cbclosedate;
    }

    public String getCbgItemcode() {
        return cbgItemcode;
    }

    public void setCbgItemcode(String cbgItemcode) {
        this.cbgItemcode = cbgItemcode == null ? null : cbgItemcode.trim();
    }

    public String getCbgItemname() {
        return cbgItemname;
    }

    public void setCbgItemname(String cbgItemname) {
        this.cbgItemname = cbgItemname == null ? null : cbgItemname.trim();
    }

    public String getCbgCaliberkey1() {
        return cbgCaliberkey1;
    }

    public void setCbgCaliberkey1(String cbgCaliberkey1) {
        this.cbgCaliberkey1 = cbgCaliberkey1 == null ? null : cbgCaliberkey1.trim();
    }

    public String getCbgCaliberkeyname1() {
        return cbgCaliberkeyname1;
    }

    public void setCbgCaliberkeyname1(String cbgCaliberkeyname1) {
        this.cbgCaliberkeyname1 = cbgCaliberkeyname1 == null ? null : cbgCaliberkeyname1.trim();
    }

    public String getCbgCaliberkey2() {
        return cbgCaliberkey2;
    }

    public void setCbgCaliberkey2(String cbgCaliberkey2) {
        this.cbgCaliberkey2 = cbgCaliberkey2 == null ? null : cbgCaliberkey2.trim();
    }

    public String getCbgCaliberkeyname2() {
        return cbgCaliberkeyname2;
    }

    public void setCbgCaliberkeyname2(String cbgCaliberkeyname2) {
        this.cbgCaliberkeyname2 = cbgCaliberkeyname2 == null ? null : cbgCaliberkeyname2.trim();
    }

    public String getCbgCaliberkey3() {
        return cbgCaliberkey3;
    }

    public void setCbgCaliberkey3(String cbgCaliberkey3) {
        this.cbgCaliberkey3 = cbgCaliberkey3 == null ? null : cbgCaliberkey3.trim();
    }

    public String getCbgCaliberkeyname3() {
        return cbgCaliberkeyname3;
    }

    public void setCbgCaliberkeyname3(String cbgCaliberkeyname3) {
        this.cbgCaliberkeyname3 = cbgCaliberkeyname3 == null ? null : cbgCaliberkeyname3.trim();
    }

    public String getCbgCalibercode1() {
        return cbgCalibercode1;
    }

    public void setCbgCalibercode1(String cbgCalibercode1) {
        this.cbgCalibercode1 = cbgCalibercode1 == null ? null : cbgCalibercode1.trim();
    }

    public String getCbgCalibername1() {
        return cbgCalibername1;
    }

    public void setCbgCalibername1(String cbgCalibername1) {
        this.cbgCalibername1 = cbgCalibername1 == null ? null : cbgCalibername1.trim();
    }

    public String getCbgCalibercode2() {
        return cbgCalibercode2;
    }

    public void setCbgCalibercode2(String cbgCalibercode2) {
        this.cbgCalibercode2 = cbgCalibercode2 == null ? null : cbgCalibercode2.trim();
    }

    public String getCbgCalibername2() {
        return cbgCalibername2;
    }

    public void setCbgCalibername2(String cbgCalibername2) {
        this.cbgCalibername2 = cbgCalibername2 == null ? null : cbgCalibername2.trim();
    }

    public String getCbgCalibercode3() {
        return cbgCalibercode3;
    }

    public void setCbgCalibercode3(String cbgCalibercode3) {
        this.cbgCalibercode3 = cbgCalibercode3 == null ? null : cbgCalibercode3.trim();
    }

    public String getCbgCalibername3() {
        return cbgCalibername3;
    }

    public void setCbgCalibername3(String cbgCalibername3) {
        this.cbgCalibername3 = cbgCalibername3 == null ? null : cbgCalibername3.trim();
    }

    public Byte getIbgCtrl() {
        return ibgCtrl;
    }

    public void setIbgCtrl(Byte ibgCtrl) {
        this.ibgCtrl = ibgCtrl;
    }

    public String getCbgAuditopinion() {
        return cbgAuditopinion;
    }

    public void setCbgAuditopinion(String cbgAuditopinion) {
        this.cbgAuditopinion = cbgAuditopinion == null ? null : cbgAuditopinion.trim();
    }

    public BigDecimal getFexquantity() {
        return fexquantity;
    }

    public void setFexquantity(BigDecimal fexquantity) {
        this.fexquantity = fexquantity;
    }

    public BigDecimal getFexnum() {
        return fexnum;
    }

    public void setFexnum(BigDecimal fexnum) {
        this.fexnum = fexnum;
    }

    public Integer getIvouchrowno() {
        return ivouchrowno;
    }

    public void setIvouchrowno(Integer ivouchrowno) {
        this.ivouchrowno = ivouchrowno;
    }

    public String getCbgCaliberkey4() {
        return cbgCaliberkey4;
    }

    public void setCbgCaliberkey4(String cbgCaliberkey4) {
        this.cbgCaliberkey4 = cbgCaliberkey4 == null ? null : cbgCaliberkey4.trim();
    }

    public String getCbgCaliberkeyname4() {
        return cbgCaliberkeyname4;
    }

    public void setCbgCaliberkeyname4(String cbgCaliberkeyname4) {
        this.cbgCaliberkeyname4 = cbgCaliberkeyname4 == null ? null : cbgCaliberkeyname4.trim();
    }

    public String getCbgCaliberkey5() {
        return cbgCaliberkey5;
    }

    public void setCbgCaliberkey5(String cbgCaliberkey5) {
        this.cbgCaliberkey5 = cbgCaliberkey5 == null ? null : cbgCaliberkey5.trim();
    }

    public String getCbgCaliberkeyname5() {
        return cbgCaliberkeyname5;
    }

    public void setCbgCaliberkeyname5(String cbgCaliberkeyname5) {
        this.cbgCaliberkeyname5 = cbgCaliberkeyname5 == null ? null : cbgCaliberkeyname5.trim();
    }

    public String getCbgCaliberkey6() {
        return cbgCaliberkey6;
    }

    public void setCbgCaliberkey6(String cbgCaliberkey6) {
        this.cbgCaliberkey6 = cbgCaliberkey6 == null ? null : cbgCaliberkey6.trim();
    }

    public String getCbgCaliberkeyname6() {
        return cbgCaliberkeyname6;
    }

    public void setCbgCaliberkeyname6(String cbgCaliberkeyname6) {
        this.cbgCaliberkeyname6 = cbgCaliberkeyname6 == null ? null : cbgCaliberkeyname6.trim();
    }

    public String getCbgCalibercode4() {
        return cbgCalibercode4;
    }

    public void setCbgCalibercode4(String cbgCalibercode4) {
        this.cbgCalibercode4 = cbgCalibercode4 == null ? null : cbgCalibercode4.trim();
    }

    public String getCbgCalibername4() {
        return cbgCalibername4;
    }

    public void setCbgCalibername4(String cbgCalibername4) {
        this.cbgCalibername4 = cbgCalibername4 == null ? null : cbgCalibername4.trim();
    }

    public String getCbgCalibercode5() {
        return cbgCalibercode5;
    }

    public void setCbgCalibercode5(String cbgCalibercode5) {
        this.cbgCalibercode5 = cbgCalibercode5 == null ? null : cbgCalibercode5.trim();
    }

    public String getCbgCalibername5() {
        return cbgCalibername5;
    }

    public void setCbgCalibername5(String cbgCalibername5) {
        this.cbgCalibername5 = cbgCalibername5 == null ? null : cbgCalibername5.trim();
    }

    public String getCbgCalibercode6() {
        return cbgCalibercode6;
    }

    public void setCbgCalibercode6(String cbgCalibercode6) {
        this.cbgCalibercode6 = cbgCalibercode6 == null ? null : cbgCalibercode6.trim();
    }

    public String getCbgCalibername6() {
        return cbgCalibername6;
    }

    public void setCbgCalibername6(String cbgCalibername6) {
        this.cbgCalibername6 = cbgCalibername6 == null ? null : cbgCalibername6.trim();
    }

    public String getCsocode() {
        return csocode;
    }

    public void setCsocode(String csocode) {
        this.csocode = csocode == null ? null : csocode.trim();
    }

    public Integer getIrowno() {
        return irowno;
    }

    public void setIrowno(Integer irowno) {
        this.irowno = irowno;
    }

    public BigDecimal getFreceivedqty() {
        return freceivedqty;
    }

    public void setFreceivedqty(BigDecimal freceivedqty) {
        this.freceivedqty = freceivedqty;
    }

    public BigDecimal getFreceivednum() {
        return freceivednum;
    }

    public void setFreceivednum(BigDecimal freceivednum) {
        this.freceivednum = freceivednum;
    }

    public String getCxjspdids() {
        return cxjspdids;
    }

    public void setCxjspdids(String cxjspdids) {
        this.cxjspdids = cxjspdids == null ? null : cxjspdids.trim();
    }

    public String getCbmemo() {
        return cbmemo;
    }

    public void setCbmemo(String cbmemo) {
        this.cbmemo = cbmemo == null ? null : cbmemo.trim();
    }

    public String getCbsysbarcode() {
        return cbsysbarcode;
    }

    public void setCbsysbarcode(String cbsysbarcode) {
        this.cbsysbarcode = cbsysbarcode == null ? null : cbsysbarcode.trim();
    }

    public String getPlanlotnumber() {
        return planlotnumber;
    }

    public void setPlanlotnumber(String planlotnumber) {
        this.planlotnumber = planlotnumber == null ? null : planlotnumber.trim();
    }

    public Short getBgift() {
        return bgift;
    }

    public void setBgift(Short bgift) {
        this.bgift = bgift;
    }

    public String getCfactorycode() {
        return cfactorycode;
    }

    public void setCfactorycode(String cfactorycode) {
        this.cfactorycode = cfactorycode == null ? null : cfactorycode.trim();
    }

    public byte[] getDufts() {
        return dufts;
    }

    public void setDufts(byte[] dufts) {
        this.dufts = dufts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cpoid=").append(cpoid);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", inum=").append(inum);
        sb.append(", iquotedprice=").append(iquotedprice);
        sb.append(", iunitprice=").append(iunitprice);
        sb.append(", imoney=").append(imoney);
        sb.append(", itax=").append(itax);
        sb.append(", isum=").append(isum);
        sb.append(", idiscount=").append(idiscount);
        sb.append(", inatunitprice=").append(inatunitprice);
        sb.append(", inatmoney=").append(inatmoney);
        sb.append(", inattax=").append(inattax);
        sb.append(", inatsum=").append(inatsum);
        sb.append(", inatdiscount=").append(inatdiscount);
        sb.append(", darrivedate=").append(darrivedate);
        sb.append(", ireceivedqty=").append(ireceivedqty);
        sb.append(", ireceivednum=").append(ireceivednum);
        sb.append(", ireceivedmoney=").append(ireceivedmoney);
        sb.append(", iinvqty=").append(iinvqty);
        sb.append(", iinvnum=").append(iinvnum);
        sb.append(", iinvmoney=").append(iinvmoney);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", inatinvmoney=").append(inatinvmoney);
        sb.append(", ioritotal=").append(ioritotal);
        sb.append(", itotal=").append(itotal);
        sb.append(", ipertaxrate=").append(ipertaxrate);
        sb.append(", cdefine22=").append(cdefine22);
        sb.append(", cdefine23=").append(cdefine23);
        sb.append(", cdefine24=").append(cdefine24);
        sb.append(", cdefine25=").append(cdefine25);
        sb.append(", cdefine26=").append(cdefine26);
        sb.append(", cdefine27=").append(cdefine27);
        sb.append(", iflag=").append(iflag);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", citemClass=").append(citemClass);
        sb.append(", ppcids=").append(ppcids);
        sb.append(", citemname=").append(citemname);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", bgsp=").append(bgsp);
        sb.append(", poid=").append(poid);
        sb.append(", cunitid=").append(cunitid);
        sb.append(", itaxprice=").append(itaxprice);
        sb.append(", iarrqty=").append(iarrqty);
        sb.append(", iarrnum=").append(iarrnum);
        sb.append(", iarrmoney=").append(iarrmoney);
        sb.append(", inatarrmoney=").append(inatarrmoney);
        sb.append(", iappids=").append(iappids);
        sb.append(", cdefine28=").append(cdefine28);
        sb.append(", cdefine29=").append(cdefine29);
        sb.append(", cdefine30=").append(cdefine30);
        sb.append(", cdefine31=").append(cdefine31);
        sb.append(", cdefine32=").append(cdefine32);
        sb.append(", cdefine33=").append(cdefine33);
        sb.append(", cdefine34=").append(cdefine34);
        sb.append(", cdefine35=").append(cdefine35);
        sb.append(", cdefine36=").append(cdefine36);
        sb.append(", cdefine37=").append(cdefine37);
        sb.append(", isosid=").append(isosid);
        sb.append(", btaxcost=").append(btaxcost);
        sb.append(", csource=").append(csource);
        sb.append(", cbcloser=").append(cbcloser);
        sb.append(", ippartid=").append(ippartid);
        sb.append(", ipquantity=").append(ipquantity);
        sb.append(", iptoseq=").append(iptoseq);
        sb.append(", sotype=").append(sotype);
        sb.append(", sodid=").append(sodid);
        sb.append(", contractrowguid=").append(contractrowguid);
        sb.append(", cupsocode=").append(cupsocode);
        sb.append(", iinvmpcost=").append(iinvmpcost);
        sb.append(", contractcode=").append(contractcode);
        sb.append(", contractrowno=").append(contractrowno);
        sb.append(", fpovalidquantity=").append(fpovalidquantity);
        sb.append(", fpovalidnum=").append(fpovalidnum);
        sb.append(", fpoarrquantity=").append(fpoarrquantity);
        sb.append(", fpoarrnum=").append(fpoarrnum);
        sb.append(", fporetquantity=").append(fporetquantity);
        sb.append(", fporetnum=").append(fporetnum);
        sb.append(", fporefusequantity=").append(fporefusequantity);
        sb.append(", fporefusenum=").append(fporefusenum);
        sb.append(", iorderdid=").append(iorderdid);
        sb.append(", iordertype=").append(iordertype);
        sb.append(", csoordercode=").append(csoordercode);
        sb.append(", iorderseq=").append(iorderseq);
        sb.append(", cbclosetime=").append(cbclosetime);
        sb.append(", cbclosedate=").append(cbclosedate);
        sb.append(", cbgItemcode=").append(cbgItemcode);
        sb.append(", cbgItemname=").append(cbgItemname);
        sb.append(", cbgCaliberkey1=").append(cbgCaliberkey1);
        sb.append(", cbgCaliberkeyname1=").append(cbgCaliberkeyname1);
        sb.append(", cbgCaliberkey2=").append(cbgCaliberkey2);
        sb.append(", cbgCaliberkeyname2=").append(cbgCaliberkeyname2);
        sb.append(", cbgCaliberkey3=").append(cbgCaliberkey3);
        sb.append(", cbgCaliberkeyname3=").append(cbgCaliberkeyname3);
        sb.append(", cbgCalibercode1=").append(cbgCalibercode1);
        sb.append(", cbgCalibername1=").append(cbgCalibername1);
        sb.append(", cbgCalibercode2=").append(cbgCalibercode2);
        sb.append(", cbgCalibername2=").append(cbgCalibername2);
        sb.append(", cbgCalibercode3=").append(cbgCalibercode3);
        sb.append(", cbgCalibername3=").append(cbgCalibername3);
        sb.append(", ibgCtrl=").append(ibgCtrl);
        sb.append(", cbgAuditopinion=").append(cbgAuditopinion);
        sb.append(", fexquantity=").append(fexquantity);
        sb.append(", fexnum=").append(fexnum);
        sb.append(", ivouchrowno=").append(ivouchrowno);
        sb.append(", cbgCaliberkey4=").append(cbgCaliberkey4);
        sb.append(", cbgCaliberkeyname4=").append(cbgCaliberkeyname4);
        sb.append(", cbgCaliberkey5=").append(cbgCaliberkey5);
        sb.append(", cbgCaliberkeyname5=").append(cbgCaliberkeyname5);
        sb.append(", cbgCaliberkey6=").append(cbgCaliberkey6);
        sb.append(", cbgCaliberkeyname6=").append(cbgCaliberkeyname6);
        sb.append(", cbgCalibercode4=").append(cbgCalibercode4);
        sb.append(", cbgCalibername4=").append(cbgCalibername4);
        sb.append(", cbgCalibercode5=").append(cbgCalibercode5);
        sb.append(", cbgCalibername5=").append(cbgCalibername5);
        sb.append(", cbgCalibercode6=").append(cbgCalibercode6);
        sb.append(", cbgCalibername6=").append(cbgCalibername6);
        sb.append(", csocode=").append(csocode);
        sb.append(", irowno=").append(irowno);
        sb.append(", freceivedqty=").append(freceivedqty);
        sb.append(", freceivednum=").append(freceivednum);
        sb.append(", cxjspdids=").append(cxjspdids);
        sb.append(", cbmemo=").append(cbmemo);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", planlotnumber=").append(planlotnumber);
        sb.append(", bgift=").append(bgift);
        sb.append(", cfactorycode=").append(cfactorycode);
        sb.append(", dufts=").append(dufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}