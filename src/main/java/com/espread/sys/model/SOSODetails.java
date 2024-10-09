package com.espread.sys.model;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "SO_SODetails")
@Data
public class SOSODetails implements Serializable {
    private Integer autoid;

    private String csocode;

    private String cinvcode;

    private Date dpredate;

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

    private BigDecimal ifhnum;

    private BigDecimal ifhquantity;

    private BigDecimal ifhmoney;

    private BigDecimal ikpquantity;

    private BigDecimal ikpnum;

    private BigDecimal ikpmoney;

    private String cmemo;

    private String cfree1;

    private String cfree2;

    private Integer bfh;

    private Integer isosid;

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

    private String citemcode;

    private String citemClass;

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

    private Integer id;

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

    private BigDecimal fpurquan;

    private BigDecimal fsalecost;

    private BigDecimal fsaleprice;

    private String cquocode;

    private Integer iquoid;

    private String cscloser;

    private Date dpremodate;

    private Integer irowno;

    private Integer icusbomid;

    private BigDecimal imoquantity;

    private String ccontractid;

    private String ccontracttagcode;

    private String ccontractrowguid;

    private Integer ippartseqid;

    private Integer ippartid;

    private BigDecimal ippartqty;

    private String ccusinvcode;

    private String ccusinvname;

    private BigDecimal iprekeepquantity;

    private BigDecimal iprekeepnum;

    private BigDecimal iprekeeptotquantity;

    private BigDecimal iprekeeptotnum;

    private Date dreleasedate;

    private BigDecimal fcusminprice;

    private BigDecimal fimquantity;

    private BigDecimal fomquantity;

    private Boolean ballpurchase;

    private BigDecimal finquantity;

    private BigDecimal icostquantity;

    private BigDecimal icostsum;

    private BigDecimal foutquantity;

    private BigDecimal foutnum;

    private BigDecimal iexchsum;

    private BigDecimal imoneysum;

    private Integer iaoids;

    private String cpreordercode;

    private BigDecimal fretquantity;

    private BigDecimal fretnum;

    private Date dbclosedate;

    private Date dbclosesystime;

    private Boolean borderbom;

    private Byte borderbomover;

    private Short idemandtype;

    private String cdemandcode;

    private String cdemandmemo;

    private BigDecimal fpursum;

    private BigDecimal fpurbillqty;

    private BigDecimal fpurbillsum;

    private Long iimid;

    private String ccorvouchtype;

    private Integer icorrowno;

    private Boolean busecusbom;

    private String bodyOutid;

    private BigDecimal fveridispqty;

    private BigDecimal fveridispsum;

    private Boolean bsaleprice;

    private Boolean bgift;

    private Integer forecastdid;

    private String cdetailsdemandcode;

    private String cdetailsdemandmemo;

    private BigDecimal ftransedqty;

    private String cbsysbarcode;

    private BigDecimal fappqty;

    private String cparentcode;

    private String cchildcode;

    private BigDecimal fchildqty;

    private BigDecimal fchildrate;

    private Byte icalctype;

    private Long icurpartid;

    private String cfactorycode;

    private Integer gcsourceid;

    private Integer gcsourceids;

    private byte[] dufts;

    private static final long serialVersionUID = 1L;


    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getCsocode() {
        return csocode;
    }

    public void setCsocode(String csocode) {
        this.csocode = csocode == null ? null : csocode.trim();
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public Date getDpredate() {
        return dpredate;
    }

    public void setDpredate(Date dpredate) {
        this.dpredate = dpredate;
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

    public BigDecimal getIfhnum() {
        return ifhnum;
    }

    public void setIfhnum(BigDecimal ifhnum) {
        this.ifhnum = ifhnum;
    }

    public BigDecimal getIfhquantity() {
        return ifhquantity;
    }

    public void setIfhquantity(BigDecimal ifhquantity) {
        this.ifhquantity = ifhquantity;
    }

    public BigDecimal getIfhmoney() {
        return ifhmoney;
    }

    public void setIfhmoney(BigDecimal ifhmoney) {
        this.ifhmoney = ifhmoney;
    }

    public BigDecimal getIkpquantity() {
        return ikpquantity;
    }

    public void setIkpquantity(BigDecimal ikpquantity) {
        this.ikpquantity = ikpquantity;
    }

    public BigDecimal getIkpnum() {
        return ikpnum;
    }

    public void setIkpnum(BigDecimal ikpnum) {
        this.ikpnum = ikpnum;
    }

    public BigDecimal getIkpmoney() {
        return ikpmoney;
    }

    public void setIkpmoney(BigDecimal ikpmoney) {
        this.ikpmoney = ikpmoney;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
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

    public Integer getBfh() {
        return bfh;
    }

    public void setBfh(Integer bfh) {
        this.bfh = bfh;
    }

    public Integer getIsosid() {
        return isosid;
    }

    public void setIsosid(Integer isosid) {
        this.isosid = isosid;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getFpurquan() {
        return fpurquan;
    }

    public void setFpurquan(BigDecimal fpurquan) {
        this.fpurquan = fpurquan;
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

    public String getCquocode() {
        return cquocode;
    }

    public void setCquocode(String cquocode) {
        this.cquocode = cquocode == null ? null : cquocode.trim();
    }

    public Integer getIquoid() {
        return iquoid;
    }

    public void setIquoid(Integer iquoid) {
        this.iquoid = iquoid;
    }

    public String getCscloser() {
        return cscloser;
    }

    public void setCscloser(String cscloser) {
        this.cscloser = cscloser == null ? null : cscloser.trim();
    }

    public Date getDpremodate() {
        return dpremodate;
    }

    public void setDpremodate(Date dpremodate) {
        this.dpremodate = dpremodate;
    }

    public Integer getIrowno() {
        return irowno;
    }

    public void setIrowno(Integer irowno) {
        this.irowno = irowno;
    }

    public Integer getIcusbomid() {
        return icusbomid;
    }

    public void setIcusbomid(Integer icusbomid) {
        this.icusbomid = icusbomid;
    }

    public BigDecimal getImoquantity() {
        return imoquantity;
    }

    public void setImoquantity(BigDecimal imoquantity) {
        this.imoquantity = imoquantity;
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

    public BigDecimal getIprekeepquantity() {
        return iprekeepquantity;
    }

    public void setIprekeepquantity(BigDecimal iprekeepquantity) {
        this.iprekeepquantity = iprekeepquantity;
    }

    public BigDecimal getIprekeepnum() {
        return iprekeepnum;
    }

    public void setIprekeepnum(BigDecimal iprekeepnum) {
        this.iprekeepnum = iprekeepnum;
    }

    public BigDecimal getIprekeeptotquantity() {
        return iprekeeptotquantity;
    }

    public void setIprekeeptotquantity(BigDecimal iprekeeptotquantity) {
        this.iprekeeptotquantity = iprekeeptotquantity;
    }

    public BigDecimal getIprekeeptotnum() {
        return iprekeeptotnum;
    }

    public void setIprekeeptotnum(BigDecimal iprekeeptotnum) {
        this.iprekeeptotnum = iprekeeptotnum;
    }

    public Date getDreleasedate() {
        return dreleasedate;
    }

    public void setDreleasedate(Date dreleasedate) {
        this.dreleasedate = dreleasedate;
    }

    public BigDecimal getFcusminprice() {
        return fcusminprice;
    }

    public void setFcusminprice(BigDecimal fcusminprice) {
        this.fcusminprice = fcusminprice;
    }

    public BigDecimal getFimquantity() {
        return fimquantity;
    }

    public void setFimquantity(BigDecimal fimquantity) {
        this.fimquantity = fimquantity;
    }

    public BigDecimal getFomquantity() {
        return fomquantity;
    }

    public void setFomquantity(BigDecimal fomquantity) {
        this.fomquantity = fomquantity;
    }

    public Boolean getBallpurchase() {
        return ballpurchase;
    }

    public void setBallpurchase(Boolean ballpurchase) {
        this.ballpurchase = ballpurchase;
    }

    public BigDecimal getFinquantity() {
        return finquantity;
    }

    public void setFinquantity(BigDecimal finquantity) {
        this.finquantity = finquantity;
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

    public BigDecimal getIexchsum() {
        return iexchsum;
    }

    public void setIexchsum(BigDecimal iexchsum) {
        this.iexchsum = iexchsum;
    }

    public BigDecimal getImoneysum() {
        return imoneysum;
    }

    public void setImoneysum(BigDecimal imoneysum) {
        this.imoneysum = imoneysum;
    }

    public Integer getIaoids() {
        return iaoids;
    }

    public void setIaoids(Integer iaoids) {
        this.iaoids = iaoids;
    }

    public String getCpreordercode() {
        return cpreordercode;
    }

    public void setCpreordercode(String cpreordercode) {
        this.cpreordercode = cpreordercode == null ? null : cpreordercode.trim();
    }

    public BigDecimal getFretquantity() {
        return fretquantity;
    }

    public void setFretquantity(BigDecimal fretquantity) {
        this.fretquantity = fretquantity;
    }

    public BigDecimal getFretnum() {
        return fretnum;
    }

    public void setFretnum(BigDecimal fretnum) {
        this.fretnum = fretnum;
    }

    public Date getDbclosedate() {
        return dbclosedate;
    }

    public void setDbclosedate(Date dbclosedate) {
        this.dbclosedate = dbclosedate;
    }

    public Date getDbclosesystime() {
        return dbclosesystime;
    }

    public void setDbclosesystime(Date dbclosesystime) {
        this.dbclosesystime = dbclosesystime;
    }

    public Boolean getBorderbom() {
        return borderbom;
    }

    public void setBorderbom(Boolean borderbom) {
        this.borderbom = borderbom;
    }

    public Byte getBorderbomover() {
        return borderbomover;
    }

    public void setBorderbomover(Byte borderbomover) {
        this.borderbomover = borderbomover;
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

    public BigDecimal getFpursum() {
        return fpursum;
    }

    public void setFpursum(BigDecimal fpursum) {
        this.fpursum = fpursum;
    }

    public BigDecimal getFpurbillqty() {
        return fpurbillqty;
    }

    public void setFpurbillqty(BigDecimal fpurbillqty) {
        this.fpurbillqty = fpurbillqty;
    }

    public BigDecimal getFpurbillsum() {
        return fpurbillsum;
    }

    public void setFpurbillsum(BigDecimal fpurbillsum) {
        this.fpurbillsum = fpurbillsum;
    }

    public Long getIimid() {
        return iimid;
    }

    public void setIimid(Long iimid) {
        this.iimid = iimid;
    }

    public String getCcorvouchtype() {
        return ccorvouchtype;
    }

    public void setCcorvouchtype(String ccorvouchtype) {
        this.ccorvouchtype = ccorvouchtype == null ? null : ccorvouchtype.trim();
    }

    public Integer getIcorrowno() {
        return icorrowno;
    }

    public void setIcorrowno(Integer icorrowno) {
        this.icorrowno = icorrowno;
    }

    public Boolean getBusecusbom() {
        return busecusbom;
    }

    public void setBusecusbom(Boolean busecusbom) {
        this.busecusbom = busecusbom;
    }

    public String getBodyOutid() {
        return bodyOutid;
    }

    public void setBodyOutid(String bodyOutid) {
        this.bodyOutid = bodyOutid == null ? null : bodyOutid.trim();
    }

    public BigDecimal getFveridispqty() {
        return fveridispqty;
    }

    public void setFveridispqty(BigDecimal fveridispqty) {
        this.fveridispqty = fveridispqty;
    }

    public BigDecimal getFveridispsum() {
        return fveridispsum;
    }

    public void setFveridispsum(BigDecimal fveridispsum) {
        this.fveridispsum = fveridispsum;
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

    public Integer getForecastdid() {
        return forecastdid;
    }

    public void setForecastdid(Integer forecastdid) {
        this.forecastdid = forecastdid;
    }

    public String getCdetailsdemandcode() {
        return cdetailsdemandcode;
    }

    public void setCdetailsdemandcode(String cdetailsdemandcode) {
        this.cdetailsdemandcode = cdetailsdemandcode == null ? null : cdetailsdemandcode.trim();
    }

    public String getCdetailsdemandmemo() {
        return cdetailsdemandmemo;
    }

    public void setCdetailsdemandmemo(String cdetailsdemandmemo) {
        this.cdetailsdemandmemo = cdetailsdemandmemo == null ? null : cdetailsdemandmemo.trim();
    }

    public BigDecimal getFtransedqty() {
        return ftransedqty;
    }

    public void setFtransedqty(BigDecimal ftransedqty) {
        this.ftransedqty = ftransedqty;
    }

    public String getCbsysbarcode() {
        return cbsysbarcode;
    }

    public void setCbsysbarcode(String cbsysbarcode) {
        this.cbsysbarcode = cbsysbarcode == null ? null : cbsysbarcode.trim();
    }

    public BigDecimal getFappqty() {
        return fappqty;
    }

    public void setFappqty(BigDecimal fappqty) {
        this.fappqty = fappqty;
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

    public BigDecimal getFchildrate() {
        return fchildrate;
    }

    public void setFchildrate(BigDecimal fchildrate) {
        this.fchildrate = fchildrate;
    }

    public Byte getIcalctype() {
        return icalctype;
    }

    public void setIcalctype(Byte icalctype) {
        this.icalctype = icalctype;
    }

    public Long getIcurpartid() {
        return icurpartid;
    }

    public void setIcurpartid(Long icurpartid) {
        this.icurpartid = icurpartid;
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
        sb.append(", autoid=").append(autoid);
        sb.append(", csocode=").append(csocode);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", dpredate=").append(dpredate);
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
        sb.append(", ifhnum=").append(ifhnum);
        sb.append(", ifhquantity=").append(ifhquantity);
        sb.append(", ifhmoney=").append(ifhmoney);
        sb.append(", ikpquantity=").append(ikpquantity);
        sb.append(", ikpnum=").append(ikpnum);
        sb.append(", ikpmoney=").append(ikpmoney);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", bfh=").append(bfh);
        sb.append(", isosid=").append(isosid);
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
        sb.append(", citemcode=").append(citemcode);
        sb.append(", citemClass=").append(citemClass);
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
        sb.append(", id=").append(id);
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
        sb.append(", fpurquan=").append(fpurquan);
        sb.append(", fsalecost=").append(fsalecost);
        sb.append(", fsaleprice=").append(fsaleprice);
        sb.append(", cquocode=").append(cquocode);
        sb.append(", iquoid=").append(iquoid);
        sb.append(", cscloser=").append(cscloser);
        sb.append(", dpremodate=").append(dpremodate);
        sb.append(", irowno=").append(irowno);
        sb.append(", icusbomid=").append(icusbomid);
        sb.append(", imoquantity=").append(imoquantity);
        sb.append(", ccontractid=").append(ccontractid);
        sb.append(", ccontracttagcode=").append(ccontracttagcode);
        sb.append(", ccontractrowguid=").append(ccontractrowguid);
        sb.append(", ippartseqid=").append(ippartseqid);
        sb.append(", ippartid=").append(ippartid);
        sb.append(", ippartqty=").append(ippartqty);
        sb.append(", ccusinvcode=").append(ccusinvcode);
        sb.append(", ccusinvname=").append(ccusinvname);
        sb.append(", iprekeepquantity=").append(iprekeepquantity);
        sb.append(", iprekeepnum=").append(iprekeepnum);
        sb.append(", iprekeeptotquantity=").append(iprekeeptotquantity);
        sb.append(", iprekeeptotnum=").append(iprekeeptotnum);
        sb.append(", dreleasedate=").append(dreleasedate);
        sb.append(", fcusminprice=").append(fcusminprice);
        sb.append(", fimquantity=").append(fimquantity);
        sb.append(", fomquantity=").append(fomquantity);
        sb.append(", ballpurchase=").append(ballpurchase);
        sb.append(", finquantity=").append(finquantity);
        sb.append(", icostquantity=").append(icostquantity);
        sb.append(", icostsum=").append(icostsum);
        sb.append(", foutquantity=").append(foutquantity);
        sb.append(", foutnum=").append(foutnum);
        sb.append(", iexchsum=").append(iexchsum);
        sb.append(", imoneysum=").append(imoneysum);
        sb.append(", iaoids=").append(iaoids);
        sb.append(", cpreordercode=").append(cpreordercode);
        sb.append(", fretquantity=").append(fretquantity);
        sb.append(", fretnum=").append(fretnum);
        sb.append(", dbclosedate=").append(dbclosedate);
        sb.append(", dbclosesystime=").append(dbclosesystime);
        sb.append(", borderbom=").append(borderbom);
        sb.append(", borderbomover=").append(borderbomover);
        sb.append(", idemandtype=").append(idemandtype);
        sb.append(", cdemandcode=").append(cdemandcode);
        sb.append(", cdemandmemo=").append(cdemandmemo);
        sb.append(", fpursum=").append(fpursum);
        sb.append(", fpurbillqty=").append(fpurbillqty);
        sb.append(", fpurbillsum=").append(fpurbillsum);
        sb.append(", iimid=").append(iimid);
        sb.append(", ccorvouchtype=").append(ccorvouchtype);
        sb.append(", icorrowno=").append(icorrowno);
        sb.append(", busecusbom=").append(busecusbom);
        sb.append(", bodyOutid=").append(bodyOutid);
        sb.append(", fveridispqty=").append(fveridispqty);
        sb.append(", fveridispsum=").append(fveridispsum);
        sb.append(", bsaleprice=").append(bsaleprice);
        sb.append(", bgift=").append(bgift);
        sb.append(", forecastdid=").append(forecastdid);
        sb.append(", cdetailsdemandcode=").append(cdetailsdemandcode);
        sb.append(", cdetailsdemandmemo=").append(cdetailsdemandmemo);
        sb.append(", ftransedqty=").append(ftransedqty);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", fappqty=").append(fappqty);
        sb.append(", cparentcode=").append(cparentcode);
        sb.append(", cchildcode=").append(cchildcode);
        sb.append(", fchildqty=").append(fchildqty);
        sb.append(", fchildrate=").append(fchildrate);
        sb.append(", icalctype=").append(icalctype);
        sb.append(", icurpartid=").append(icurpartid);
        sb.append(", cfactorycode=").append(cfactorycode);
        sb.append(", gcsourceid=").append(gcsourceid);
        sb.append(", gcsourceids=").append(gcsourceids);
        sb.append(", dufts=").append(dufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}