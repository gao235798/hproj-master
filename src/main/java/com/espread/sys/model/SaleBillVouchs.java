package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SaleBillVouchs implements Serializable {
    private Integer autoid;

    private Integer sbvid;

    private String cwhcode;

    private String cinvcode;

    private BigDecimal iquantity;

    private BigDecimal inum;

    private BigDecimal iquotedprice;

    private BigDecimal iunitprice;

    private BigDecimal itaxunitprice;

    private BigDecimal imoney;

    private BigDecimal itax;

    private BigDecimal isum;

    private BigDecimal idiscount;

    private BigDecimal inatunitprice;

    private BigDecimal inatmoney;

    private BigDecimal inattax;

    private BigDecimal inatsum;

    private BigDecimal inatdiscount;

    private Integer isbvid;

    private BigDecimal imoneysum;

    private BigDecimal iexchsum;

    private String cclue;

    private String cincomesub;

    private String ctaxsub;

    private Date dsigndate;

    private String cmemo;

    private Integer ibatch;

    private String cbatch;

    private Boolean bsettleall;

    private String cfree1;

    private String cfree2;

    private Integer rdsid;

    private Byte itb;

    private Date dvdate;

    private BigDecimal tbquantity;

    private BigDecimal tbnum;

    private Integer isosid;

    private Integer idlsid;

    private BigDecimal kl;

    private BigDecimal kl2;

    private String cinvname;

    private BigDecimal itaxrate;

    private String cdefine22;

    private String cdefine23;

    private String cdefine24;

    private String cdefine25;

    private Double cdefine26;

    private Double cdefine27;

    private BigDecimal foutquantity;

    private BigDecimal foutnum;

    private String citemcode;

    private String citemClass;

    private BigDecimal fsalecost;

    private BigDecimal fsaleprice;

    private String citemname;

    private String citemCname;

    private String cfree3;

    private String cfree4;

    private String cfree5;

    private String cfree6;

    private String cfree7;

    private String cfree8;

    private String cfree9;

    private String cfree10;

    private BigDecimal iinvexchrate;

    private String cunitid;

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

    private Date dmdate;

    private Integer ipbvsid;

    private String ccode;

    private String csocode;

    private Boolean bgsp;

    private Integer ippartseqid;

    private Integer ippartid;

    private BigDecimal ippartqty;

    private String ccontractid;

    private String ccontracttagcode;

    private String ccontractrowguid;

    private Integer imassdate;

    private Short cmassunit;

    private Boolean bqaneedcheck;

    private Boolean bqaurgency;

    private String ccusinvcode;

    private String ccusinvname;

    private String cbaccounter;

    private Boolean bcosting;

    private String cordercode;

    private Long iorderrowno;

    private BigDecimal fcusminprice;

    private String cvmivencode;

    private String cvenabbname;

    private Long irowno;

    private Short iexpiratdatecalcu;

    private Date dexpirationdate;

    private String cexpirationdate;

    private BigDecimal cbatchproperty1;

    private BigDecimal cbatchproperty2;

    private BigDecimal cbatchproperty3;

    private BigDecimal cbatchproperty4;

    private BigDecimal cbatchproperty5;

    private String cbatchproperty6;

    private String cbatchproperty7;

    private String cbatchproperty8;

    private String cbatchproperty9;

    private Date cbatchproperty10;

    private Short idemandtype;

    private String cdemandcode;

    private String cdemandmemo;

    private String cdemandid;

    private Long idemandseq;

    private String cbdlcode;

    private Integer iinvsncount;

    private String cinvsn;

    private String creasoncode;

    private String cvencode;

    private Boolean bneedsign;

    private String cgathingcode;

    private BigDecimal ftaxpasum;

    private BigDecimal fpasum;

    private BigDecimal fnattaxpasum;

    private BigDecimal fnatpasum;

    private String bodyOutid;

    private String cpznum;

    private String cinvouchtype;

    private String cbookwhcode;

    private BigDecimal icostquantity;

    private BigDecimal icostsum;

    private String cposition;

    private Date dkeepdate;

    private Long isaleoutid;

    private Boolean bsaleprice;

    private Boolean bgift;

    private String cbsaleout;

    private Boolean bmpforderclosed;

    private String cbsysbarcode;

    private BigDecimal fchildrate;

    private String cparentcode;

    private String cchildcode;

    private BigDecimal fchildqty;

    private Byte icalctype;

    private BigDecimal fretailrealamount;

    private BigDecimal fretailapportionamount;

    private BigDecimal fretailsettleamount;

    private String cfactorycode;

    private Integer gcsourceid;

    private Integer gcsourceids;

    private static final long serialVersionUID = 1L;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public Integer getSbvid() {
        return sbvid;
    }

    public void setSbvid(Integer sbvid) {
        this.sbvid = sbvid;
    }

    public String getCwhcode() {
        return cwhcode;
    }

    public void setCwhcode(String cwhcode) {
        this.cwhcode = cwhcode == null ? null : cwhcode.trim();
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

    public BigDecimal getItaxunitprice() {
        return itaxunitprice;
    }

    public void setItaxunitprice(BigDecimal itaxunitprice) {
        this.itaxunitprice = itaxunitprice;
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

    public Integer getIsbvid() {
        return isbvid;
    }

    public void setIsbvid(Integer isbvid) {
        this.isbvid = isbvid;
    }

    public BigDecimal getImoneysum() {
        return imoneysum;
    }

    public void setImoneysum(BigDecimal imoneysum) {
        this.imoneysum = imoneysum;
    }

    public BigDecimal getIexchsum() {
        return iexchsum;
    }

    public void setIexchsum(BigDecimal iexchsum) {
        this.iexchsum = iexchsum;
    }

    public String getCclue() {
        return cclue;
    }

    public void setCclue(String cclue) {
        this.cclue = cclue == null ? null : cclue.trim();
    }

    public String getCincomesub() {
        return cincomesub;
    }

    public void setCincomesub(String cincomesub) {
        this.cincomesub = cincomesub == null ? null : cincomesub.trim();
    }

    public String getCtaxsub() {
        return ctaxsub;
    }

    public void setCtaxsub(String ctaxsub) {
        this.ctaxsub = ctaxsub == null ? null : ctaxsub.trim();
    }

    public Date getDsigndate() {
        return dsigndate;
    }

    public void setDsigndate(Date dsigndate) {
        this.dsigndate = dsigndate;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Integer getIbatch() {
        return ibatch;
    }

    public void setIbatch(Integer ibatch) {
        this.ibatch = ibatch;
    }

    public String getCbatch() {
        return cbatch;
    }

    public void setCbatch(String cbatch) {
        this.cbatch = cbatch == null ? null : cbatch.trim();
    }

    public Boolean getBsettleall() {
        return bsettleall;
    }

    public void setBsettleall(Boolean bsettleall) {
        this.bsettleall = bsettleall;
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

    public Integer getRdsid() {
        return rdsid;
    }

    public void setRdsid(Integer rdsid) {
        this.rdsid = rdsid;
    }

    public Byte getItb() {
        return itb;
    }

    public void setItb(Byte itb) {
        this.itb = itb;
    }

    public Date getDvdate() {
        return dvdate;
    }

    public void setDvdate(Date dvdate) {
        this.dvdate = dvdate;
    }

    public BigDecimal getTbquantity() {
        return tbquantity;
    }

    public void setTbquantity(BigDecimal tbquantity) {
        this.tbquantity = tbquantity;
    }

    public BigDecimal getTbnum() {
        return tbnum;
    }

    public void setTbnum(BigDecimal tbnum) {
        this.tbnum = tbnum;
    }

    public Integer getIsosid() {
        return isosid;
    }

    public void setIsosid(Integer isosid) {
        this.isosid = isosid;
    }

    public Integer getIdlsid() {
        return idlsid;
    }

    public void setIdlsid(Integer idlsid) {
        this.idlsid = idlsid;
    }

    public BigDecimal getKl() {
        return kl;
    }

    public void setKl(BigDecimal kl) {
        this.kl = kl;
    }

    public BigDecimal getKl2() {
        return kl2;
    }

    public void setKl2(BigDecimal kl2) {
        this.kl2 = kl2;
    }

    public String getCinvname() {
        return cinvname;
    }

    public void setCinvname(String cinvname) {
        this.cinvname = cinvname == null ? null : cinvname.trim();
    }

    public BigDecimal getItaxrate() {
        return itaxrate;
    }

    public void setItaxrate(BigDecimal itaxrate) {
        this.itaxrate = itaxrate;
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

    public BigDecimal getFoutquantity() {
        return foutquantity;
    }

    public void setFoutquantity(BigDecimal foutquantity) {
        this.foutquantity = foutquantity;
    }

    public BigDecimal getFoutnum() {
        return foutnum;
    }

    public void setFoutnum(BigDecimal foutnum) {
        this.foutnum = foutnum;
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

    public BigDecimal getFsalecost() {
        return fsalecost;
    }

    public void setFsalecost(BigDecimal fsalecost) {
        this.fsalecost = fsalecost;
    }

    public BigDecimal getFsaleprice() {
        return fsaleprice;
    }

    public void setFsaleprice(BigDecimal fsaleprice) {
        this.fsaleprice = fsaleprice;
    }

    public String getCitemname() {
        return citemname;
    }

    public void setCitemname(String citemname) {
        this.citemname = citemname == null ? null : citemname.trim();
    }

    public String getCitemCname() {
        return citemCname;
    }

    public void setCitemCname(String citemCname) {
        this.citemCname = citemCname == null ? null : citemCname.trim();
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

    public BigDecimal getIinvexchrate() {
        return iinvexchrate;
    }

    public void setIinvexchrate(BigDecimal iinvexchrate) {
        this.iinvexchrate = iinvexchrate;
    }

    public String getCunitid() {
        return cunitid;
    }

    public void setCunitid(String cunitid) {
        this.cunitid = cunitid == null ? null : cunitid.trim();
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

    public Date getDmdate() {
        return dmdate;
    }

    public void setDmdate(Date dmdate) {
        this.dmdate = dmdate;
    }

    public Integer getIpbvsid() {
        return ipbvsid;
    }

    public void setIpbvsid(Integer ipbvsid) {
        this.ipbvsid = ipbvsid;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
    }

    public String getCsocode() {
        return csocode;
    }

    public void setCsocode(String csocode) {
        this.csocode = csocode == null ? null : csocode.trim();
    }

    public Boolean getBgsp() {
        return bgsp;
    }

    public void setBgsp(Boolean bgsp) {
        this.bgsp = bgsp;
    }

    public Integer getIppartseqid() {
        return ippartseqid;
    }

    public void setIppartseqid(Integer ippartseqid) {
        this.ippartseqid = ippartseqid;
    }

    public Integer getIppartid() {
        return ippartid;
    }

    public void setIppartid(Integer ippartid) {
        this.ippartid = ippartid;
    }

    public BigDecimal getIppartqty() {
        return ippartqty;
    }

    public void setIppartqty(BigDecimal ippartqty) {
        this.ippartqty = ippartqty;
    }

    public String getCcontractid() {
        return ccontractid;
    }

    public void setCcontractid(String ccontractid) {
        this.ccontractid = ccontractid == null ? null : ccontractid.trim();
    }

    public String getCcontracttagcode() {
        return ccontracttagcode;
    }

    public void setCcontracttagcode(String ccontracttagcode) {
        this.ccontracttagcode = ccontracttagcode == null ? null : ccontracttagcode.trim();
    }

    public String getCcontractrowguid() {
        return ccontractrowguid;
    }

    public void setCcontractrowguid(String ccontractrowguid) {
        this.ccontractrowguid = ccontractrowguid == null ? null : ccontractrowguid.trim();
    }

    public Integer getImassdate() {
        return imassdate;
    }

    public void setImassdate(Integer imassdate) {
        this.imassdate = imassdate;
    }

    public Short getCmassunit() {
        return cmassunit;
    }

    public void setCmassunit(Short cmassunit) {
        this.cmassunit = cmassunit;
    }

    public Boolean getBqaneedcheck() {
        return bqaneedcheck;
    }

    public void setBqaneedcheck(Boolean bqaneedcheck) {
        this.bqaneedcheck = bqaneedcheck;
    }

    public Boolean getBqaurgency() {
        return bqaurgency;
    }

    public void setBqaurgency(Boolean bqaurgency) {
        this.bqaurgency = bqaurgency;
    }

    public String getCcusinvcode() {
        return ccusinvcode;
    }

    public void setCcusinvcode(String ccusinvcode) {
        this.ccusinvcode = ccusinvcode == null ? null : ccusinvcode.trim();
    }

    public String getCcusinvname() {
        return ccusinvname;
    }

    public void setCcusinvname(String ccusinvname) {
        this.ccusinvname = ccusinvname == null ? null : ccusinvname.trim();
    }

    public String getCbaccounter() {
        return cbaccounter;
    }

    public void setCbaccounter(String cbaccounter) {
        this.cbaccounter = cbaccounter == null ? null : cbaccounter.trim();
    }

    public Boolean getBcosting() {
        return bcosting;
    }

    public void setBcosting(Boolean bcosting) {
        this.bcosting = bcosting;
    }

    public String getCordercode() {
        return cordercode;
    }

    public void setCordercode(String cordercode) {
        this.cordercode = cordercode == null ? null : cordercode.trim();
    }

    public Long getIorderrowno() {
        return iorderrowno;
    }

    public void setIorderrowno(Long iorderrowno) {
        this.iorderrowno = iorderrowno;
    }

    public BigDecimal getFcusminprice() {
        return fcusminprice;
    }

    public void setFcusminprice(BigDecimal fcusminprice) {
        this.fcusminprice = fcusminprice;
    }

    public String getCvmivencode() {
        return cvmivencode;
    }

    public void setCvmivencode(String cvmivencode) {
        this.cvmivencode = cvmivencode == null ? null : cvmivencode.trim();
    }

    public String getCvenabbname() {
        return cvenabbname;
    }

    public void setCvenabbname(String cvenabbname) {
        this.cvenabbname = cvenabbname == null ? null : cvenabbname.trim();
    }

    public Long getIrowno() {
        return irowno;
    }

    public void setIrowno(Long irowno) {
        this.irowno = irowno;
    }

    public Short getIexpiratdatecalcu() {
        return iexpiratdatecalcu;
    }

    public void setIexpiratdatecalcu(Short iexpiratdatecalcu) {
        this.iexpiratdatecalcu = iexpiratdatecalcu;
    }

    public Date getDexpirationdate() {
        return dexpirationdate;
    }

    public void setDexpirationdate(Date dexpirationdate) {
        this.dexpirationdate = dexpirationdate;
    }

    public String getCexpirationdate() {
        return cexpirationdate;
    }

    public void setCexpirationdate(String cexpirationdate) {
        this.cexpirationdate = cexpirationdate == null ? null : cexpirationdate.trim();
    }

    public BigDecimal getCbatchproperty1() {
        return cbatchproperty1;
    }

    public void setCbatchproperty1(BigDecimal cbatchproperty1) {
        this.cbatchproperty1 = cbatchproperty1;
    }

    public BigDecimal getCbatchproperty2() {
        return cbatchproperty2;
    }

    public void setCbatchproperty2(BigDecimal cbatchproperty2) {
        this.cbatchproperty2 = cbatchproperty2;
    }

    public BigDecimal getCbatchproperty3() {
        return cbatchproperty3;
    }

    public void setCbatchproperty3(BigDecimal cbatchproperty3) {
        this.cbatchproperty3 = cbatchproperty3;
    }

    public BigDecimal getCbatchproperty4() {
        return cbatchproperty4;
    }

    public void setCbatchproperty4(BigDecimal cbatchproperty4) {
        this.cbatchproperty4 = cbatchproperty4;
    }

    public BigDecimal getCbatchproperty5() {
        return cbatchproperty5;
    }

    public void setCbatchproperty5(BigDecimal cbatchproperty5) {
        this.cbatchproperty5 = cbatchproperty5;
    }

    public String getCbatchproperty6() {
        return cbatchproperty6;
    }

    public void setCbatchproperty6(String cbatchproperty6) {
        this.cbatchproperty6 = cbatchproperty6 == null ? null : cbatchproperty6.trim();
    }

    public String getCbatchproperty7() {
        return cbatchproperty7;
    }

    public void setCbatchproperty7(String cbatchproperty7) {
        this.cbatchproperty7 = cbatchproperty7 == null ? null : cbatchproperty7.trim();
    }

    public String getCbatchproperty8() {
        return cbatchproperty8;
    }

    public void setCbatchproperty8(String cbatchproperty8) {
        this.cbatchproperty8 = cbatchproperty8 == null ? null : cbatchproperty8.trim();
    }

    public String getCbatchproperty9() {
        return cbatchproperty9;
    }

    public void setCbatchproperty9(String cbatchproperty9) {
        this.cbatchproperty9 = cbatchproperty9 == null ? null : cbatchproperty9.trim();
    }

    public Date getCbatchproperty10() {
        return cbatchproperty10;
    }

    public void setCbatchproperty10(Date cbatchproperty10) {
        this.cbatchproperty10 = cbatchproperty10;
    }

    public Short getIdemandtype() {
        return idemandtype;
    }

    public void setIdemandtype(Short idemandtype) {
        this.idemandtype = idemandtype;
    }

    public String getCdemandcode() {
        return cdemandcode;
    }

    public void setCdemandcode(String cdemandcode) {
        this.cdemandcode = cdemandcode == null ? null : cdemandcode.trim();
    }

    public String getCdemandmemo() {
        return cdemandmemo;
    }

    public void setCdemandmemo(String cdemandmemo) {
        this.cdemandmemo = cdemandmemo == null ? null : cdemandmemo.trim();
    }

    public String getCdemandid() {
        return cdemandid;
    }

    public void setCdemandid(String cdemandid) {
        this.cdemandid = cdemandid == null ? null : cdemandid.trim();
    }

    public Long getIdemandseq() {
        return idemandseq;
    }

    public void setIdemandseq(Long idemandseq) {
        this.idemandseq = idemandseq;
    }

    public String getCbdlcode() {
        return cbdlcode;
    }

    public void setCbdlcode(String cbdlcode) {
        this.cbdlcode = cbdlcode == null ? null : cbdlcode.trim();
    }

    public Integer getIinvsncount() {
        return iinvsncount;
    }

    public void setIinvsncount(Integer iinvsncount) {
        this.iinvsncount = iinvsncount;
    }

    public String getCinvsn() {
        return cinvsn;
    }

    public void setCinvsn(String cinvsn) {
        this.cinvsn = cinvsn == null ? null : cinvsn.trim();
    }

    public String getCreasoncode() {
        return creasoncode;
    }

    public void setCreasoncode(String creasoncode) {
        this.creasoncode = creasoncode == null ? null : creasoncode.trim();
    }

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
    }

    public Boolean getBneedsign() {
        return bneedsign;
    }

    public void setBneedsign(Boolean bneedsign) {
        this.bneedsign = bneedsign;
    }

    public String getCgathingcode() {
        return cgathingcode;
    }

    public void setCgathingcode(String cgathingcode) {
        this.cgathingcode = cgathingcode == null ? null : cgathingcode.trim();
    }

    public BigDecimal getFtaxpasum() {
        return ftaxpasum;
    }

    public void setFtaxpasum(BigDecimal ftaxpasum) {
        this.ftaxpasum = ftaxpasum;
    }

    public BigDecimal getFpasum() {
        return fpasum;
    }

    public void setFpasum(BigDecimal fpasum) {
        this.fpasum = fpasum;
    }

    public BigDecimal getFnattaxpasum() {
        return fnattaxpasum;
    }

    public void setFnattaxpasum(BigDecimal fnattaxpasum) {
        this.fnattaxpasum = fnattaxpasum;
    }

    public BigDecimal getFnatpasum() {
        return fnatpasum;
    }

    public void setFnatpasum(BigDecimal fnatpasum) {
        this.fnatpasum = fnatpasum;
    }

    public String getBodyOutid() {
        return bodyOutid;
    }

    public void setBodyOutid(String bodyOutid) {
        this.bodyOutid = bodyOutid == null ? null : bodyOutid.trim();
    }

    public String getCpznum() {
        return cpznum;
    }

    public void setCpznum(String cpznum) {
        this.cpznum = cpznum == null ? null : cpznum.trim();
    }

    public String getCinvouchtype() {
        return cinvouchtype;
    }

    public void setCinvouchtype(String cinvouchtype) {
        this.cinvouchtype = cinvouchtype == null ? null : cinvouchtype.trim();
    }

    public String getCbookwhcode() {
        return cbookwhcode;
    }

    public void setCbookwhcode(String cbookwhcode) {
        this.cbookwhcode = cbookwhcode == null ? null : cbookwhcode.trim();
    }

    public BigDecimal getIcostquantity() {
        return icostquantity;
    }

    public void setIcostquantity(BigDecimal icostquantity) {
        this.icostquantity = icostquantity;
    }

    public BigDecimal getIcostsum() {
        return icostsum;
    }

    public void setIcostsum(BigDecimal icostsum) {
        this.icostsum = icostsum;
    }

    public String getCposition() {
        return cposition;
    }

    public void setCposition(String cposition) {
        this.cposition = cposition == null ? null : cposition.trim();
    }

    public Date getDkeepdate() {
        return dkeepdate;
    }

    public void setDkeepdate(Date dkeepdate) {
        this.dkeepdate = dkeepdate;
    }

    public Long getIsaleoutid() {
        return isaleoutid;
    }

    public void setIsaleoutid(Long isaleoutid) {
        this.isaleoutid = isaleoutid;
    }

    public Boolean getBsaleprice() {
        return bsaleprice;
    }

    public void setBsaleprice(Boolean bsaleprice) {
        this.bsaleprice = bsaleprice;
    }

    public Boolean getBgift() {
        return bgift;
    }

    public void setBgift(Boolean bgift) {
        this.bgift = bgift;
    }

    public String getCbsaleout() {
        return cbsaleout;
    }

    public void setCbsaleout(String cbsaleout) {
        this.cbsaleout = cbsaleout == null ? null : cbsaleout.trim();
    }

    public Boolean getBmpforderclosed() {
        return bmpforderclosed;
    }

    public void setBmpforderclosed(Boolean bmpforderclosed) {
        this.bmpforderclosed = bmpforderclosed;
    }

    public String getCbsysbarcode() {
        return cbsysbarcode;
    }

    public void setCbsysbarcode(String cbsysbarcode) {
        this.cbsysbarcode = cbsysbarcode == null ? null : cbsysbarcode.trim();
    }

    public BigDecimal getFchildrate() {
        return fchildrate;
    }

    public void setFchildrate(BigDecimal fchildrate) {
        this.fchildrate = fchildrate;
    }

    public String getCparentcode() {
        return cparentcode;
    }

    public void setCparentcode(String cparentcode) {
        this.cparentcode = cparentcode == null ? null : cparentcode.trim();
    }

    public String getCchildcode() {
        return cchildcode;
    }

    public void setCchildcode(String cchildcode) {
        this.cchildcode = cchildcode == null ? null : cchildcode.trim();
    }

    public BigDecimal getFchildqty() {
        return fchildqty;
    }

    public void setFchildqty(BigDecimal fchildqty) {
        this.fchildqty = fchildqty;
    }

    public Byte getIcalctype() {
        return icalctype;
    }

    public void setIcalctype(Byte icalctype) {
        this.icalctype = icalctype;
    }

    public BigDecimal getFretailrealamount() {
        return fretailrealamount;
    }

    public void setFretailrealamount(BigDecimal fretailrealamount) {
        this.fretailrealamount = fretailrealamount;
    }

    public BigDecimal getFretailapportionamount() {
        return fretailapportionamount;
    }

    public void setFretailapportionamount(BigDecimal fretailapportionamount) {
        this.fretailapportionamount = fretailapportionamount;
    }

    public BigDecimal getFretailsettleamount() {
        return fretailsettleamount;
    }

    public void setFretailsettleamount(BigDecimal fretailsettleamount) {
        this.fretailsettleamount = fretailsettleamount;
    }

    public String getCfactorycode() {
        return cfactorycode;
    }

    public void setCfactorycode(String cfactorycode) {
        this.cfactorycode = cfactorycode == null ? null : cfactorycode.trim();
    }

    public Integer getGcsourceid() {
        return gcsourceid;
    }

    public void setGcsourceid(Integer gcsourceid) {
        this.gcsourceid = gcsourceid;
    }

    public Integer getGcsourceids() {
        return gcsourceids;
    }

    public void setGcsourceids(Integer gcsourceids) {
        this.gcsourceids = gcsourceids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", sbvid=").append(sbvid);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", inum=").append(inum);
        sb.append(", iquotedprice=").append(iquotedprice);
        sb.append(", iunitprice=").append(iunitprice);
        sb.append(", itaxunitprice=").append(itaxunitprice);
        sb.append(", imoney=").append(imoney);
        sb.append(", itax=").append(itax);
        sb.append(", isum=").append(isum);
        sb.append(", idiscount=").append(idiscount);
        sb.append(", inatunitprice=").append(inatunitprice);
        sb.append(", inatmoney=").append(inatmoney);
        sb.append(", inattax=").append(inattax);
        sb.append(", inatsum=").append(inatsum);
        sb.append(", inatdiscount=").append(inatdiscount);
        sb.append(", isbvid=").append(isbvid);
        sb.append(", imoneysum=").append(imoneysum);
        sb.append(", iexchsum=").append(iexchsum);
        sb.append(", cclue=").append(cclue);
        sb.append(", cincomesub=").append(cincomesub);
        sb.append(", ctaxsub=").append(ctaxsub);
        sb.append(", dsigndate=").append(dsigndate);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", ibatch=").append(ibatch);
        sb.append(", cbatch=").append(cbatch);
        sb.append(", bsettleall=").append(bsettleall);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", rdsid=").append(rdsid);
        sb.append(", itb=").append(itb);
        sb.append(", dvdate=").append(dvdate);
        sb.append(", tbquantity=").append(tbquantity);
        sb.append(", tbnum=").append(tbnum);
        sb.append(", isosid=").append(isosid);
        sb.append(", idlsid=").append(idlsid);
        sb.append(", kl=").append(kl);
        sb.append(", kl2=").append(kl2);
        sb.append(", cinvname=").append(cinvname);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", cdefine22=").append(cdefine22);
        sb.append(", cdefine23=").append(cdefine23);
        sb.append(", cdefine24=").append(cdefine24);
        sb.append(", cdefine25=").append(cdefine25);
        sb.append(", cdefine26=").append(cdefine26);
        sb.append(", cdefine27=").append(cdefine27);
        sb.append(", foutquantity=").append(foutquantity);
        sb.append(", foutnum=").append(foutnum);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", citemClass=").append(citemClass);
        sb.append(", fsalecost=").append(fsalecost);
        sb.append(", fsaleprice=").append(fsaleprice);
        sb.append(", citemname=").append(citemname);
        sb.append(", citemCname=").append(citemCname);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", iinvexchrate=").append(iinvexchrate);
        sb.append(", cunitid=").append(cunitid);
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
        sb.append(", dmdate=").append(dmdate);
        sb.append(", ipbvsid=").append(ipbvsid);
        sb.append(", ccode=").append(ccode);
        sb.append(", csocode=").append(csocode);
        sb.append(", bgsp=").append(bgsp);
        sb.append(", ippartseqid=").append(ippartseqid);
        sb.append(", ippartid=").append(ippartid);
        sb.append(", ippartqty=").append(ippartqty);
        sb.append(", ccontractid=").append(ccontractid);
        sb.append(", ccontracttagcode=").append(ccontracttagcode);
        sb.append(", ccontractrowguid=").append(ccontractrowguid);
        sb.append(", imassdate=").append(imassdate);
        sb.append(", cmassunit=").append(cmassunit);
        sb.append(", bqaneedcheck=").append(bqaneedcheck);
        sb.append(", bqaurgency=").append(bqaurgency);
        sb.append(", ccusinvcode=").append(ccusinvcode);
        sb.append(", ccusinvname=").append(ccusinvname);
        sb.append(", cbaccounter=").append(cbaccounter);
        sb.append(", bcosting=").append(bcosting);
        sb.append(", cordercode=").append(cordercode);
        sb.append(", iorderrowno=").append(iorderrowno);
        sb.append(", fcusminprice=").append(fcusminprice);
        sb.append(", cvmivencode=").append(cvmivencode);
        sb.append(", cvenabbname=").append(cvenabbname);
        sb.append(", irowno=").append(irowno);
        sb.append(", iexpiratdatecalcu=").append(iexpiratdatecalcu);
        sb.append(", dexpirationdate=").append(dexpirationdate);
        sb.append(", cexpirationdate=").append(cexpirationdate);
        sb.append(", cbatchproperty1=").append(cbatchproperty1);
        sb.append(", cbatchproperty2=").append(cbatchproperty2);
        sb.append(", cbatchproperty3=").append(cbatchproperty3);
        sb.append(", cbatchproperty4=").append(cbatchproperty4);
        sb.append(", cbatchproperty5=").append(cbatchproperty5);
        sb.append(", cbatchproperty6=").append(cbatchproperty6);
        sb.append(", cbatchproperty7=").append(cbatchproperty7);
        sb.append(", cbatchproperty8=").append(cbatchproperty8);
        sb.append(", cbatchproperty9=").append(cbatchproperty9);
        sb.append(", cbatchproperty10=").append(cbatchproperty10);
        sb.append(", idemandtype=").append(idemandtype);
        sb.append(", cdemandcode=").append(cdemandcode);
        sb.append(", cdemandmemo=").append(cdemandmemo);
        sb.append(", cdemandid=").append(cdemandid);
        sb.append(", idemandseq=").append(idemandseq);
        sb.append(", cbdlcode=").append(cbdlcode);
        sb.append(", iinvsncount=").append(iinvsncount);
        sb.append(", cinvsn=").append(cinvsn);
        sb.append(", creasoncode=").append(creasoncode);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", bneedsign=").append(bneedsign);
        sb.append(", cgathingcode=").append(cgathingcode);
        sb.append(", ftaxpasum=").append(ftaxpasum);
        sb.append(", fpasum=").append(fpasum);
        sb.append(", fnattaxpasum=").append(fnattaxpasum);
        sb.append(", fnatpasum=").append(fnatpasum);
        sb.append(", bodyOutid=").append(bodyOutid);
        sb.append(", cpznum=").append(cpznum);
        sb.append(", cinvouchtype=").append(cinvouchtype);
        sb.append(", cbookwhcode=").append(cbookwhcode);
        sb.append(", icostquantity=").append(icostquantity);
        sb.append(", icostsum=").append(icostsum);
        sb.append(", cposition=").append(cposition);
        sb.append(", dkeepdate=").append(dkeepdate);
        sb.append(", isaleoutid=").append(isaleoutid);
        sb.append(", bsaleprice=").append(bsaleprice);
        sb.append(", bgift=").append(bgift);
        sb.append(", cbsaleout=").append(cbsaleout);
        sb.append(", bmpforderclosed=").append(bmpforderclosed);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", fchildrate=").append(fchildrate);
        sb.append(", cparentcode=").append(cparentcode);
        sb.append(", cchildcode=").append(cchildcode);
        sb.append(", fchildqty=").append(fchildqty);
        sb.append(", icalctype=").append(icalctype);
        sb.append(", fretailrealamount=").append(fretailrealamount);
        sb.append(", fretailapportionamount=").append(fretailapportionamount);
        sb.append(", fretailsettleamount=").append(fretailsettleamount);
        sb.append(", cfactorycode=").append(cfactorycode);
        sb.append(", gcsourceid=").append(gcsourceid);
        sb.append(", gcsourceids=").append(gcsourceids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}