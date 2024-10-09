package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Rdrecords11 implements Serializable {
    private Long autoid;

    private Long id;

    private String cinvcode;

    private BigDecimal inum;

    private BigDecimal iquantity;

    private BigDecimal iunitcost;

    private BigDecimal iprice;

    private BigDecimal iaprice;

    private BigDecimal ipunitcost;

    private BigDecimal ipprice;

    private String cbatch;

    private String cobjcode;

    private Long cvouchcode;

    private String cinvouchcode;

    private String cinvouchtype;

    private BigDecimal isoutquantity;

    private BigDecimal isoutnum;

    private Long coutvouchid;

    private String coutvouchtype;

    private BigDecimal isredoutquantity;

    private BigDecimal isredoutnum;

    private String cfree1;

    private String cfree2;

    private Byte iflag;

    private BigDecimal isquantity;

    private BigDecimal isnum;

    private BigDecimal ifnum;

    private BigDecimal ifquantity;

    private Date dvdate;

    private Long itrids;

    private String cposition;

    private String cdefine22;

    private String cdefine23;

    private String cdefine24;

    private String cdefine25;

    private Double cdefine26;

    private Double cdefine27;

    private String citemClass;

    private String citemcode;

    private String cname;

    private String citemcname;

    private String cfree3;

    private String cfree4;

    private String cfree5;

    private String cfree6;

    private String cfree7;

    private String cfree8;

    private String cfree9;

    private String cfree10;

    private String cbarcode;

    private BigDecimal inquantity;

    private BigDecimal innum;

    private String cassunit;

    private Date dmadedate;

    private Integer imassdate;

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

    private Long impoids;

    private Long icheckids;

    private String cbvencode;

    private Boolean bgsp;

    private String cgspstate;

    private String ccheckcode;

    private Long icheckidbaks;

    private String crejectcode;

    private Long irejectids;

    private String ccheckpersoncode;

    private Date dcheckdate;

    private Short cmassunit;

    private String cmolotcode;

    private BigDecimal imaterialfee;

    private BigDecimal iprocesscost;

    private BigDecimal iprocessfee;

    private Date dmsdate;

    private BigDecimal ismaterialfee;

    private BigDecimal isprocessfee;

    private Integer iomodid;

    private Long bfilled;

    private Boolean bchecked;

    private Long iomomid;

    private String cmworkcentercode;

    private Boolean blpusefree;

    private Integer irsrowno;

    private Long ioritrackid;

    private String coritracktype;

    private String cbaccounter;

    private Date dbkeepdate;

    private Boolean bcosting;

    private Boolean bvmiused;

    private BigDecimal ivmisettlequantity;

    private BigDecimal ivmisettlenum;

    private String cvmivencode;

    private Integer iinvsncount;

    private String cwhpersoncode;

    private String cwhpersonname;

    private Long imaids;

    private String cserviceoid;

    private String cbserviceoid;

    private BigDecimal iinvexchrate;

    private String corufts;

    private String comcode;

    private String cmocode;

    private String invcode;

    private Integer imoseq;

    private String iopseq;

    private String copdesc;

    private String strcontractguid;

    private Short iexpiratdatecalcu;

    private String cexpirationdate;

    private Date dexpirationdate;

    private String cciqbookcode;

    private BigDecimal ibondedsumqty;

    private Integer productinids;

    private Integer iorderdid;

    private Byte iordertype;

    private String iordercode;

    private Integer iorderseq;

    private String isodid;

    private Byte isotype;

    private String csocode;

    private Integer isoseq;

    private String ipesodid;

    private Byte ipesotype;

    private String cpesocode;

    private Integer ipesoseq;

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

    private String cbmemo;

    private Integer applydid;

    private String applycode;

    private Integer irowno;

    private String strowguid;

    private String cservicecode;

    private BigDecimal ipreuseqty;

    private BigDecimal ipreuseinum;

    private Integer bsupersede;

    private BigDecimal isupersedeqty;

    private Integer isupersedempoids;

    private String imoallocatesubid;

    private Integer cinvoucherlineid;

    private String cinvouchercode;

    private String cinvouchertype;

    private String cbsysbarcode;

    private String csourcemocode;

    private Integer isourcemodetailsid;

    private String cplanlotcode;

    private Integer bcanreplace;

    private Short iposflag;

    private Short boutmaterials;

    private byte[] rowufts;

    private static final long serialVersionUID = 1L;

    public Long getAutoid() {
        return autoid;
    }

    public void setAutoid(Long autoid) {
        this.autoid = autoid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public BigDecimal getInum() {
        return inum;
    }

    public void setInum(BigDecimal inum) {
        this.inum = inum;
    }

    public BigDecimal getIquantity() {
        return iquantity;
    }

    public void setIquantity(BigDecimal iquantity) {
        this.iquantity = iquantity;
    }

    public BigDecimal getIunitcost() {
        return iunitcost;
    }

    public void setIunitcost(BigDecimal iunitcost) {
        this.iunitcost = iunitcost;
    }

    public BigDecimal getIprice() {
        return iprice;
    }

    public void setIprice(BigDecimal iprice) {
        this.iprice = iprice;
    }

    public BigDecimal getIaprice() {
        return iaprice;
    }

    public void setIaprice(BigDecimal iaprice) {
        this.iaprice = iaprice;
    }

    public BigDecimal getIpunitcost() {
        return ipunitcost;
    }

    public void setIpunitcost(BigDecimal ipunitcost) {
        this.ipunitcost = ipunitcost;
    }

    public BigDecimal getIpprice() {
        return ipprice;
    }

    public void setIpprice(BigDecimal ipprice) {
        this.ipprice = ipprice;
    }

    public String getCbatch() {
        return cbatch;
    }

    public void setCbatch(String cbatch) {
        this.cbatch = cbatch == null ? null : cbatch.trim();
    }

    public String getCobjcode() {
        return cobjcode;
    }

    public void setCobjcode(String cobjcode) {
        this.cobjcode = cobjcode == null ? null : cobjcode.trim();
    }

    public Long getCvouchcode() {
        return cvouchcode;
    }

    public void setCvouchcode(Long cvouchcode) {
        this.cvouchcode = cvouchcode;
    }

    public String getCinvouchcode() {
        return cinvouchcode;
    }

    public void setCinvouchcode(String cinvouchcode) {
        this.cinvouchcode = cinvouchcode == null ? null : cinvouchcode.trim();
    }

    public String getCinvouchtype() {
        return cinvouchtype;
    }

    public void setCinvouchtype(String cinvouchtype) {
        this.cinvouchtype = cinvouchtype == null ? null : cinvouchtype.trim();
    }

    public BigDecimal getIsoutquantity() {
        return isoutquantity;
    }

    public void setIsoutquantity(BigDecimal isoutquantity) {
        this.isoutquantity = isoutquantity;
    }

    public BigDecimal getIsoutnum() {
        return isoutnum;
    }

    public void setIsoutnum(BigDecimal isoutnum) {
        this.isoutnum = isoutnum;
    }

    public Long getCoutvouchid() {
        return coutvouchid;
    }

    public void setCoutvouchid(Long coutvouchid) {
        this.coutvouchid = coutvouchid;
    }

    public String getCoutvouchtype() {
        return coutvouchtype;
    }

    public void setCoutvouchtype(String coutvouchtype) {
        this.coutvouchtype = coutvouchtype == null ? null : coutvouchtype.trim();
    }

    public BigDecimal getIsredoutquantity() {
        return isredoutquantity;
    }

    public void setIsredoutquantity(BigDecimal isredoutquantity) {
        this.isredoutquantity = isredoutquantity;
    }

    public BigDecimal getIsredoutnum() {
        return isredoutnum;
    }

    public void setIsredoutnum(BigDecimal isredoutnum) {
        this.isredoutnum = isredoutnum;
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

    public Byte getIflag() {
        return iflag;
    }

    public void setIflag(Byte iflag) {
        this.iflag = iflag;
    }

    public BigDecimal getIsquantity() {
        return isquantity;
    }

    public void setIsquantity(BigDecimal isquantity) {
        this.isquantity = isquantity;
    }

    public BigDecimal getIsnum() {
        return isnum;
    }

    public void setIsnum(BigDecimal isnum) {
        this.isnum = isnum;
    }

    public BigDecimal getIfnum() {
        return ifnum;
    }

    public void setIfnum(BigDecimal ifnum) {
        this.ifnum = ifnum;
    }

    public BigDecimal getIfquantity() {
        return ifquantity;
    }

    public void setIfquantity(BigDecimal ifquantity) {
        this.ifquantity = ifquantity;
    }

    public Date getDvdate() {
        return dvdate;
    }

    public void setDvdate(Date dvdate) {
        this.dvdate = dvdate;
    }

    public Long getItrids() {
        return itrids;
    }

    public void setItrids(Long itrids) {
        this.itrids = itrids;
    }

    public String getCposition() {
        return cposition;
    }

    public void setCposition(String cposition) {
        this.cposition = cposition == null ? null : cposition.trim();
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

    public String getCitemClass() {
        return citemClass;
    }

    public void setCitemClass(String citemClass) {
        this.citemClass = citemClass == null ? null : citemClass.trim();
    }

    public String getCitemcode() {
        return citemcode;
    }

    public void setCitemcode(String citemcode) {
        this.citemcode = citemcode == null ? null : citemcode.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCitemcname() {
        return citemcname;
    }

    public void setCitemcname(String citemcname) {
        this.citemcname = citemcname == null ? null : citemcname.trim();
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

    public String getCbarcode() {
        return cbarcode;
    }

    public void setCbarcode(String cbarcode) {
        this.cbarcode = cbarcode == null ? null : cbarcode.trim();
    }

    public BigDecimal getInquantity() {
        return inquantity;
    }

    public void setInquantity(BigDecimal inquantity) {
        this.inquantity = inquantity;
    }

    public BigDecimal getInnum() {
        return innum;
    }

    public void setInnum(BigDecimal innum) {
        this.innum = innum;
    }

    public String getCassunit() {
        return cassunit;
    }

    public void setCassunit(String cassunit) {
        this.cassunit = cassunit == null ? null : cassunit.trim();
    }

    public Date getDmadedate() {
        return dmadedate;
    }

    public void setDmadedate(Date dmadedate) {
        this.dmadedate = dmadedate;
    }

    public Integer getImassdate() {
        return imassdate;
    }

    public void setImassdate(Integer imassdate) {
        this.imassdate = imassdate;
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

    public Long getImpoids() {
        return impoids;
    }

    public void setImpoids(Long impoids) {
        this.impoids = impoids;
    }

    public Long getIcheckids() {
        return icheckids;
    }

    public void setIcheckids(Long icheckids) {
        this.icheckids = icheckids;
    }

    public String getCbvencode() {
        return cbvencode;
    }

    public void setCbvencode(String cbvencode) {
        this.cbvencode = cbvencode == null ? null : cbvencode.trim();
    }

    public Boolean getBgsp() {
        return bgsp;
    }

    public void setBgsp(Boolean bgsp) {
        this.bgsp = bgsp;
    }

    public String getCgspstate() {
        return cgspstate;
    }

    public void setCgspstate(String cgspstate) {
        this.cgspstate = cgspstate == null ? null : cgspstate.trim();
    }

    public String getCcheckcode() {
        return ccheckcode;
    }

    public void setCcheckcode(String ccheckcode) {
        this.ccheckcode = ccheckcode == null ? null : ccheckcode.trim();
    }

    public Long getIcheckidbaks() {
        return icheckidbaks;
    }

    public void setIcheckidbaks(Long icheckidbaks) {
        this.icheckidbaks = icheckidbaks;
    }

    public String getCrejectcode() {
        return crejectcode;
    }

    public void setCrejectcode(String crejectcode) {
        this.crejectcode = crejectcode == null ? null : crejectcode.trim();
    }

    public Long getIrejectids() {
        return irejectids;
    }

    public void setIrejectids(Long irejectids) {
        this.irejectids = irejectids;
    }

    public String getCcheckpersoncode() {
        return ccheckpersoncode;
    }

    public void setCcheckpersoncode(String ccheckpersoncode) {
        this.ccheckpersoncode = ccheckpersoncode == null ? null : ccheckpersoncode.trim();
    }

    public Date getDcheckdate() {
        return dcheckdate;
    }

    public void setDcheckdate(Date dcheckdate) {
        this.dcheckdate = dcheckdate;
    }

    public Short getCmassunit() {
        return cmassunit;
    }

    public void setCmassunit(Short cmassunit) {
        this.cmassunit = cmassunit;
    }

    public String getCmolotcode() {
        return cmolotcode;
    }

    public void setCmolotcode(String cmolotcode) {
        this.cmolotcode = cmolotcode == null ? null : cmolotcode.trim();
    }

    public BigDecimal getImaterialfee() {
        return imaterialfee;
    }

    public void setImaterialfee(BigDecimal imaterialfee) {
        this.imaterialfee = imaterialfee;
    }

    public BigDecimal getIprocesscost() {
        return iprocesscost;
    }

    public void setIprocesscost(BigDecimal iprocesscost) {
        this.iprocesscost = iprocesscost;
    }

    public BigDecimal getIprocessfee() {
        return iprocessfee;
    }

    public void setIprocessfee(BigDecimal iprocessfee) {
        this.iprocessfee = iprocessfee;
    }

    public Date getDmsdate() {
        return dmsdate;
    }

    public void setDmsdate(Date dmsdate) {
        this.dmsdate = dmsdate;
    }

    public BigDecimal getIsmaterialfee() {
        return ismaterialfee;
    }

    public void setIsmaterialfee(BigDecimal ismaterialfee) {
        this.ismaterialfee = ismaterialfee;
    }

    public BigDecimal getIsprocessfee() {
        return isprocessfee;
    }

    public void setIsprocessfee(BigDecimal isprocessfee) {
        this.isprocessfee = isprocessfee;
    }

    public Integer getIomodid() {
        return iomodid;
    }

    public void setIomodid(Integer iomodid) {
        this.iomodid = iomodid;
    }

    public Long getBfilled() {
        return bfilled;
    }

    public void setBfilled(Long bfilled) {
        this.bfilled = bfilled;
    }

    public Boolean getBchecked() {
        return bchecked;
    }

    public void setBchecked(Boolean bchecked) {
        this.bchecked = bchecked;
    }

    public Long getIomomid() {
        return iomomid;
    }

    public void setIomomid(Long iomomid) {
        this.iomomid = iomomid;
    }

    public String getCmworkcentercode() {
        return cmworkcentercode;
    }

    public void setCmworkcentercode(String cmworkcentercode) {
        this.cmworkcentercode = cmworkcentercode == null ? null : cmworkcentercode.trim();
    }

    public Boolean getBlpusefree() {
        return blpusefree;
    }

    public void setBlpusefree(Boolean blpusefree) {
        this.blpusefree = blpusefree;
    }

    public Integer getIrsrowno() {
        return irsrowno;
    }

    public void setIrsrowno(Integer irsrowno) {
        this.irsrowno = irsrowno;
    }

    public Long getIoritrackid() {
        return ioritrackid;
    }

    public void setIoritrackid(Long ioritrackid) {
        this.ioritrackid = ioritrackid;
    }

    public String getCoritracktype() {
        return coritracktype;
    }

    public void setCoritracktype(String coritracktype) {
        this.coritracktype = coritracktype == null ? null : coritracktype.trim();
    }

    public String getCbaccounter() {
        return cbaccounter;
    }

    public void setCbaccounter(String cbaccounter) {
        this.cbaccounter = cbaccounter == null ? null : cbaccounter.trim();
    }

    public Date getDbkeepdate() {
        return dbkeepdate;
    }

    public void setDbkeepdate(Date dbkeepdate) {
        this.dbkeepdate = dbkeepdate;
    }

    public Boolean getBcosting() {
        return bcosting;
    }

    public void setBcosting(Boolean bcosting) {
        this.bcosting = bcosting;
    }

    public Boolean getBvmiused() {
        return bvmiused;
    }

    public void setBvmiused(Boolean bvmiused) {
        this.bvmiused = bvmiused;
    }

    public BigDecimal getIvmisettlequantity() {
        return ivmisettlequantity;
    }

    public void setIvmisettlequantity(BigDecimal ivmisettlequantity) {
        this.ivmisettlequantity = ivmisettlequantity;
    }

    public BigDecimal getIvmisettlenum() {
        return ivmisettlenum;
    }

    public void setIvmisettlenum(BigDecimal ivmisettlenum) {
        this.ivmisettlenum = ivmisettlenum;
    }

    public String getCvmivencode() {
        return cvmivencode;
    }

    public void setCvmivencode(String cvmivencode) {
        this.cvmivencode = cvmivencode == null ? null : cvmivencode.trim();
    }

    public Integer getIinvsncount() {
        return iinvsncount;
    }

    public void setIinvsncount(Integer iinvsncount) {
        this.iinvsncount = iinvsncount;
    }

    public String getCwhpersoncode() {
        return cwhpersoncode;
    }

    public void setCwhpersoncode(String cwhpersoncode) {
        this.cwhpersoncode = cwhpersoncode == null ? null : cwhpersoncode.trim();
    }

    public String getCwhpersonname() {
        return cwhpersonname;
    }

    public void setCwhpersonname(String cwhpersonname) {
        this.cwhpersonname = cwhpersonname == null ? null : cwhpersonname.trim();
    }

    public Long getImaids() {
        return imaids;
    }

    public void setImaids(Long imaids) {
        this.imaids = imaids;
    }

    public String getCserviceoid() {
        return cserviceoid;
    }

    public void setCserviceoid(String cserviceoid) {
        this.cserviceoid = cserviceoid == null ? null : cserviceoid.trim();
    }

    public String getCbserviceoid() {
        return cbserviceoid;
    }

    public void setCbserviceoid(String cbserviceoid) {
        this.cbserviceoid = cbserviceoid == null ? null : cbserviceoid.trim();
    }

    public BigDecimal getIinvexchrate() {
        return iinvexchrate;
    }

    public void setIinvexchrate(BigDecimal iinvexchrate) {
        this.iinvexchrate = iinvexchrate;
    }

    public String getCorufts() {
        return corufts;
    }

    public void setCorufts(String corufts) {
        this.corufts = corufts == null ? null : corufts.trim();
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public String getCmocode() {
        return cmocode;
    }

    public void setCmocode(String cmocode) {
        this.cmocode = cmocode == null ? null : cmocode.trim();
    }

    public String getInvcode() {
        return invcode;
    }

    public void setInvcode(String invcode) {
        this.invcode = invcode == null ? null : invcode.trim();
    }

    public Integer getImoseq() {
        return imoseq;
    }

    public void setImoseq(Integer imoseq) {
        this.imoseq = imoseq;
    }

    public String getIopseq() {
        return iopseq;
    }

    public void setIopseq(String iopseq) {
        this.iopseq = iopseq == null ? null : iopseq.trim();
    }

    public String getCopdesc() {
        return copdesc;
    }

    public void setCopdesc(String copdesc) {
        this.copdesc = copdesc == null ? null : copdesc.trim();
    }

    public String getStrcontractguid() {
        return strcontractguid;
    }

    public void setStrcontractguid(String strcontractguid) {
        this.strcontractguid = strcontractguid == null ? null : strcontractguid.trim();
    }

    public Short getIexpiratdatecalcu() {
        return iexpiratdatecalcu;
    }

    public void setIexpiratdatecalcu(Short iexpiratdatecalcu) {
        this.iexpiratdatecalcu = iexpiratdatecalcu;
    }

    public String getCexpirationdate() {
        return cexpirationdate;
    }

    public void setCexpirationdate(String cexpirationdate) {
        this.cexpirationdate = cexpirationdate == null ? null : cexpirationdate.trim();
    }

    public Date getDexpirationdate() {
        return dexpirationdate;
    }

    public void setDexpirationdate(Date dexpirationdate) {
        this.dexpirationdate = dexpirationdate;
    }

    public String getCciqbookcode() {
        return cciqbookcode;
    }

    public void setCciqbookcode(String cciqbookcode) {
        this.cciqbookcode = cciqbookcode == null ? null : cciqbookcode.trim();
    }

    public BigDecimal getIbondedsumqty() {
        return ibondedsumqty;
    }

    public void setIbondedsumqty(BigDecimal ibondedsumqty) {
        this.ibondedsumqty = ibondedsumqty;
    }

    public Integer getProductinids() {
        return productinids;
    }

    public void setProductinids(Integer productinids) {
        this.productinids = productinids;
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

    public String getIordercode() {
        return iordercode;
    }

    public void setIordercode(String iordercode) {
        this.iordercode = iordercode == null ? null : iordercode.trim();
    }

    public Integer getIorderseq() {
        return iorderseq;
    }

    public void setIorderseq(Integer iorderseq) {
        this.iorderseq = iorderseq;
    }

    public String getIsodid() {
        return isodid;
    }

    public void setIsodid(String isodid) {
        this.isodid = isodid == null ? null : isodid.trim();
    }

    public Byte getIsotype() {
        return isotype;
    }

    public void setIsotype(Byte isotype) {
        this.isotype = isotype;
    }

    public String getCsocode() {
        return csocode;
    }

    public void setCsocode(String csocode) {
        this.csocode = csocode == null ? null : csocode.trim();
    }

    public Integer getIsoseq() {
        return isoseq;
    }

    public void setIsoseq(Integer isoseq) {
        this.isoseq = isoseq;
    }

    public String getIpesodid() {
        return ipesodid;
    }

    public void setIpesodid(String ipesodid) {
        this.ipesodid = ipesodid == null ? null : ipesodid.trim();
    }

    public Byte getIpesotype() {
        return ipesotype;
    }

    public void setIpesotype(Byte ipesotype) {
        this.ipesotype = ipesotype;
    }

    public String getCpesocode() {
        return cpesocode;
    }

    public void setCpesocode(String cpesocode) {
        this.cpesocode = cpesocode == null ? null : cpesocode.trim();
    }

    public Integer getIpesoseq() {
        return ipesoseq;
    }

    public void setIpesoseq(Integer ipesoseq) {
        this.ipesoseq = ipesoseq;
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

    public String getCbmemo() {
        return cbmemo;
    }

    public void setCbmemo(String cbmemo) {
        this.cbmemo = cbmemo == null ? null : cbmemo.trim();
    }

    public Integer getApplydid() {
        return applydid;
    }

    public void setApplydid(Integer applydid) {
        this.applydid = applydid;
    }

    public String getApplycode() {
        return applycode;
    }

    public void setApplycode(String applycode) {
        this.applycode = applycode == null ? null : applycode.trim();
    }

    public Integer getIrowno() {
        return irowno;
    }

    public void setIrowno(Integer irowno) {
        this.irowno = irowno;
    }

    public String getStrowguid() {
        return strowguid;
    }

    public void setStrowguid(String strowguid) {
        this.strowguid = strowguid == null ? null : strowguid.trim();
    }

    public String getCservicecode() {
        return cservicecode;
    }

    public void setCservicecode(String cservicecode) {
        this.cservicecode = cservicecode == null ? null : cservicecode.trim();
    }

    public BigDecimal getIpreuseqty() {
        return ipreuseqty;
    }

    public void setIpreuseqty(BigDecimal ipreuseqty) {
        this.ipreuseqty = ipreuseqty;
    }

    public BigDecimal getIpreuseinum() {
        return ipreuseinum;
    }

    public void setIpreuseinum(BigDecimal ipreuseinum) {
        this.ipreuseinum = ipreuseinum;
    }

    public Integer getBsupersede() {
        return bsupersede;
    }

    public void setBsupersede(Integer bsupersede) {
        this.bsupersede = bsupersede;
    }

    public BigDecimal getIsupersedeqty() {
        return isupersedeqty;
    }

    public void setIsupersedeqty(BigDecimal isupersedeqty) {
        this.isupersedeqty = isupersedeqty;
    }

    public Integer getIsupersedempoids() {
        return isupersedempoids;
    }

    public void setIsupersedempoids(Integer isupersedempoids) {
        this.isupersedempoids = isupersedempoids;
    }

    public String getImoallocatesubid() {
        return imoallocatesubid;
    }

    public void setImoallocatesubid(String imoallocatesubid) {
        this.imoallocatesubid = imoallocatesubid == null ? null : imoallocatesubid.trim();
    }

    public Integer getCinvoucherlineid() {
        return cinvoucherlineid;
    }

    public void setCinvoucherlineid(Integer cinvoucherlineid) {
        this.cinvoucherlineid = cinvoucherlineid;
    }

    public String getCinvouchercode() {
        return cinvouchercode;
    }

    public void setCinvouchercode(String cinvouchercode) {
        this.cinvouchercode = cinvouchercode == null ? null : cinvouchercode.trim();
    }

    public String getCinvouchertype() {
        return cinvouchertype;
    }

    public void setCinvouchertype(String cinvouchertype) {
        this.cinvouchertype = cinvouchertype == null ? null : cinvouchertype.trim();
    }

    public String getCbsysbarcode() {
        return cbsysbarcode;
    }

    public void setCbsysbarcode(String cbsysbarcode) {
        this.cbsysbarcode = cbsysbarcode == null ? null : cbsysbarcode.trim();
    }

    public String getCsourcemocode() {
        return csourcemocode;
    }

    public void setCsourcemocode(String csourcemocode) {
        this.csourcemocode = csourcemocode == null ? null : csourcemocode.trim();
    }

    public Integer getIsourcemodetailsid() {
        return isourcemodetailsid;
    }

    public void setIsourcemodetailsid(Integer isourcemodetailsid) {
        this.isourcemodetailsid = isourcemodetailsid;
    }

    public String getCplanlotcode() {
        return cplanlotcode;
    }

    public void setCplanlotcode(String cplanlotcode) {
        this.cplanlotcode = cplanlotcode == null ? null : cplanlotcode.trim();
    }

    public Integer getBcanreplace() {
        return bcanreplace;
    }

    public void setBcanreplace(Integer bcanreplace) {
        this.bcanreplace = bcanreplace;
    }

    public Short getIposflag() {
        return iposflag;
    }

    public void setIposflag(Short iposflag) {
        this.iposflag = iposflag;
    }

    public Short getBoutmaterials() {
        return boutmaterials;
    }

    public void setBoutmaterials(Short boutmaterials) {
        this.boutmaterials = boutmaterials;
    }

    public byte[] getRowufts() {
        return rowufts;
    }

    public void setRowufts(byte[] rowufts) {
        this.rowufts = rowufts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", id=").append(id);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", inum=").append(inum);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", iunitcost=").append(iunitcost);
        sb.append(", iprice=").append(iprice);
        sb.append(", iaprice=").append(iaprice);
        sb.append(", ipunitcost=").append(ipunitcost);
        sb.append(", ipprice=").append(ipprice);
        sb.append(", cbatch=").append(cbatch);
        sb.append(", cobjcode=").append(cobjcode);
        sb.append(", cvouchcode=").append(cvouchcode);
        sb.append(", cinvouchcode=").append(cinvouchcode);
        sb.append(", cinvouchtype=").append(cinvouchtype);
        sb.append(", isoutquantity=").append(isoutquantity);
        sb.append(", isoutnum=").append(isoutnum);
        sb.append(", coutvouchid=").append(coutvouchid);
        sb.append(", coutvouchtype=").append(coutvouchtype);
        sb.append(", isredoutquantity=").append(isredoutquantity);
        sb.append(", isredoutnum=").append(isredoutnum);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", iflag=").append(iflag);
        sb.append(", isquantity=").append(isquantity);
        sb.append(", isnum=").append(isnum);
        sb.append(", ifnum=").append(ifnum);
        sb.append(", ifquantity=").append(ifquantity);
        sb.append(", dvdate=").append(dvdate);
        sb.append(", itrids=").append(itrids);
        sb.append(", cposition=").append(cposition);
        sb.append(", cdefine22=").append(cdefine22);
        sb.append(", cdefine23=").append(cdefine23);
        sb.append(", cdefine24=").append(cdefine24);
        sb.append(", cdefine25=").append(cdefine25);
        sb.append(", cdefine26=").append(cdefine26);
        sb.append(", cdefine27=").append(cdefine27);
        sb.append(", citemClass=").append(citemClass);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", cname=").append(cname);
        sb.append(", citemcname=").append(citemcname);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", cbarcode=").append(cbarcode);
        sb.append(", inquantity=").append(inquantity);
        sb.append(", innum=").append(innum);
        sb.append(", cassunit=").append(cassunit);
        sb.append(", dmadedate=").append(dmadedate);
        sb.append(", imassdate=").append(imassdate);
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
        sb.append(", impoids=").append(impoids);
        sb.append(", icheckids=").append(icheckids);
        sb.append(", cbvencode=").append(cbvencode);
        sb.append(", bgsp=").append(bgsp);
        sb.append(", cgspstate=").append(cgspstate);
        sb.append(", ccheckcode=").append(ccheckcode);
        sb.append(", icheckidbaks=").append(icheckidbaks);
        sb.append(", crejectcode=").append(crejectcode);
        sb.append(", irejectids=").append(irejectids);
        sb.append(", ccheckpersoncode=").append(ccheckpersoncode);
        sb.append(", dcheckdate=").append(dcheckdate);
        sb.append(", cmassunit=").append(cmassunit);
        sb.append(", cmolotcode=").append(cmolotcode);
        sb.append(", imaterialfee=").append(imaterialfee);
        sb.append(", iprocesscost=").append(iprocesscost);
        sb.append(", iprocessfee=").append(iprocessfee);
        sb.append(", dmsdate=").append(dmsdate);
        sb.append(", ismaterialfee=").append(ismaterialfee);
        sb.append(", isprocessfee=").append(isprocessfee);
        sb.append(", iomodid=").append(iomodid);
        sb.append(", bfilled=").append(bfilled);
        sb.append(", bchecked=").append(bchecked);
        sb.append(", iomomid=").append(iomomid);
        sb.append(", cmworkcentercode=").append(cmworkcentercode);
        sb.append(", blpusefree=").append(blpusefree);
        sb.append(", irsrowno=").append(irsrowno);
        sb.append(", ioritrackid=").append(ioritrackid);
        sb.append(", coritracktype=").append(coritracktype);
        sb.append(", cbaccounter=").append(cbaccounter);
        sb.append(", dbkeepdate=").append(dbkeepdate);
        sb.append(", bcosting=").append(bcosting);
        sb.append(", bvmiused=").append(bvmiused);
        sb.append(", ivmisettlequantity=").append(ivmisettlequantity);
        sb.append(", ivmisettlenum=").append(ivmisettlenum);
        sb.append(", cvmivencode=").append(cvmivencode);
        sb.append(", iinvsncount=").append(iinvsncount);
        sb.append(", cwhpersoncode=").append(cwhpersoncode);
        sb.append(", cwhpersonname=").append(cwhpersonname);
        sb.append(", imaids=").append(imaids);
        sb.append(", cserviceoid=").append(cserviceoid);
        sb.append(", cbserviceoid=").append(cbserviceoid);
        sb.append(", iinvexchrate=").append(iinvexchrate);
        sb.append(", corufts=").append(corufts);
        sb.append(", comcode=").append(comcode);
        sb.append(", cmocode=").append(cmocode);
        sb.append(", invcode=").append(invcode);
        sb.append(", imoseq=").append(imoseq);
        sb.append(", iopseq=").append(iopseq);
        sb.append(", copdesc=").append(copdesc);
        sb.append(", strcontractguid=").append(strcontractguid);
        sb.append(", iexpiratdatecalcu=").append(iexpiratdatecalcu);
        sb.append(", cexpirationdate=").append(cexpirationdate);
        sb.append(", dexpirationdate=").append(dexpirationdate);
        sb.append(", cciqbookcode=").append(cciqbookcode);
        sb.append(", ibondedsumqty=").append(ibondedsumqty);
        sb.append(", productinids=").append(productinids);
        sb.append(", iorderdid=").append(iorderdid);
        sb.append(", iordertype=").append(iordertype);
        sb.append(", iordercode=").append(iordercode);
        sb.append(", iorderseq=").append(iorderseq);
        sb.append(", isodid=").append(isodid);
        sb.append(", isotype=").append(isotype);
        sb.append(", csocode=").append(csocode);
        sb.append(", isoseq=").append(isoseq);
        sb.append(", ipesodid=").append(ipesodid);
        sb.append(", ipesotype=").append(ipesotype);
        sb.append(", cpesocode=").append(cpesocode);
        sb.append(", ipesoseq=").append(ipesoseq);
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
        sb.append(", cbmemo=").append(cbmemo);
        sb.append(", applydid=").append(applydid);
        sb.append(", applycode=").append(applycode);
        sb.append(", irowno=").append(irowno);
        sb.append(", strowguid=").append(strowguid);
        sb.append(", cservicecode=").append(cservicecode);
        sb.append(", ipreuseqty=").append(ipreuseqty);
        sb.append(", ipreuseinum=").append(ipreuseinum);
        sb.append(", bsupersede=").append(bsupersede);
        sb.append(", isupersedeqty=").append(isupersedeqty);
        sb.append(", isupersedempoids=").append(isupersedempoids);
        sb.append(", imoallocatesubid=").append(imoallocatesubid);
        sb.append(", cinvoucherlineid=").append(cinvoucherlineid);
        sb.append(", cinvouchercode=").append(cinvouchercode);
        sb.append(", cinvouchertype=").append(cinvouchertype);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", csourcemocode=").append(csourcemocode);
        sb.append(", isourcemodetailsid=").append(isourcemodetailsid);
        sb.append(", cplanlotcode=").append(cplanlotcode);
        sb.append(", bcanreplace=").append(bcanreplace);
        sb.append(", iposflag=").append(iposflag);
        sb.append(", boutmaterials=").append(boutmaterials);
        sb.append(", rowufts=").append(rowufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}