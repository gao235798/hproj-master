package com.espread.sys.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "DispatchList")
public class DispatchList implements Serializable {
    private Integer dlid;

    private String cdlcode;

    private String cvouchtype;

    private String cdefine17;

    private String cstcode;

    private Date ddate;

    private String crdcode;

    private String cdepcode;

    private String cpersoncode;

    private Integer sbvid;

    private String csbvcode;

    private String csocode;

    private String ccuscode;

    private String cpaycode;

    private String csccode;

    private String cshipaddress;

    private String cexchName;

    private Double iexchrate;

    private Double itaxrate;

    private Boolean bfirst;

    private Boolean breturnflag;

    private Boolean bsettleall;

    private String cmemo;

    private String csaleout;

    private String cdefine1;

    private String cdefine2;

    private String cdefine3;

    private Date cdefine4;

    private Integer cdefine5;

    private Date cdefine6;

    private Double cdefine7;

    private String cdefine8;

    private String cdefine9;

    private String cdefine10;

    private String cverifier;

    private String cmaker;

    private Float inetlock;

    private Short isale;

    private String ccusname;

    private Integer ivtid;

    private String cbustype;

    private String ccloser;

    private String caccounter;

    private String ccrechpname;

    private String cdefine11;

    private String cdefine12;

    private String cdefine13;

    private String cdefine14;

    private Integer cdefine15;

    private Double cdefine16;

    private Boolean biafirst;

    private Integer ioutgolden;

    private String cgatheringplan;

    private Date dcreditstart;

    private Date dgatheringdate;

    private Integer icreditdays;

    private Boolean bcredit;

    private String caddcode;

    private Integer iverifystate;

    private Byte ireturncount;

    private Byte iswfcontrolled;

    private String icreditstate;

    private Boolean barfirst;

    private String cmodifier;

    private Date dmoddate;

    private Date dverifydate;

    private String ccusperson;

    private Date dcreatesystime;

    private Date dverifysystime;

    private Date dmodifysystime;

    private String csvouchtype;

    private Integer iflowid;

    private Boolean bsigncreate;

    private Boolean bcashsale;

    private String cgathingcode;

    private String cchanger;

    private String cchangememo;

    private String outid;

    private Boolean bmustbook;

    private String cbookdepcode;

    private String cbooktype;

    private Boolean bsaused;

    private Boolean bneedbill;

    private Boolean baccswitchflag;

    private Integer iprintcount;

    private String ccuspersoncode;

    private String csourcecode;

    private Boolean bsaleoutcreatebill;

    private String csysbarcode;

    private String ccurrentauditor;

    private String csscode;

    private String cinvoicecompany;

    private BigDecimal febweight;

    private String cebweightunit;

    private String cebexpresscode;

    private Long iebexpresscoid;

    private Integer separateid;

    private Byte bnottogoldtax;

    private String cebtrnumber;

    private String cebbuyer;

    private String cebbuyernote;

    private String ccontactname;

    private String cebprovince;

    private String cebcity;

    private String cebdistrict;

    private String cmobilephone;

    private String cinvoicecusname;

    private String cweighter;

    private Date dweighttime;

    private String cpickvouchcode;

    private String cgcroutecode;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getDlid() {
        return dlid;
    }

    public void setDlid(Integer dlid) {
        this.dlid = dlid;
    }

    public String getCdlcode() {
        return cdlcode;
    }

    public void setCdlcode(String cdlcode) {
        this.cdlcode = cdlcode == null ? null : cdlcode.trim();
    }

    public String getCvouchtype() {
        return cvouchtype;
    }

    public void setCvouchtype(String cvouchtype) {
        this.cvouchtype = cvouchtype == null ? null : cvouchtype.trim();
    }

    public String getCstcode() {
        return cstcode;
    }

    public void setCstcode(String cstcode) {
        this.cstcode = cstcode == null ? null : cstcode.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getCrdcode() {
        return crdcode;
    }

    public void setCrdcode(String crdcode) {
        this.crdcode = crdcode == null ? null : crdcode.trim();
    }

    public String getCdepcode() {
        return cdepcode;
    }

    public void setCdepcode(String cdepcode) {
        this.cdepcode = cdepcode == null ? null : cdepcode.trim();
    }

    public String getCpersoncode() {
        return cpersoncode;
    }

    public void setCpersoncode(String cpersoncode) {
        this.cpersoncode = cpersoncode == null ? null : cpersoncode.trim();
    }

    public Integer getSbvid() {
        return sbvid;
    }

    public void setSbvid(Integer sbvid) {
        this.sbvid = sbvid;
    }

    public String getCsbvcode() {
        return csbvcode;
    }

    public void setCsbvcode(String csbvcode) {
        this.csbvcode = csbvcode == null ? null : csbvcode.trim();
    }

    public String getCsocode() {
        return csocode;
    }

    public void setCsocode(String csocode) {
        this.csocode = csocode == null ? null : csocode.trim();
    }

    public String getCcuscode() {
        return ccuscode;
    }

    public void setCcuscode(String ccuscode) {
        this.ccuscode = ccuscode == null ? null : ccuscode.trim();
    }

    public String getCpaycode() {
        return cpaycode;
    }

    public void setCpaycode(String cpaycode) {
        this.cpaycode = cpaycode == null ? null : cpaycode.trim();
    }

    public String getCsccode() {
        return csccode;
    }

    public void setCsccode(String csccode) {
        this.csccode = csccode == null ? null : csccode.trim();
    }

    public String getCshipaddress() {
        return cshipaddress;
    }

    public void setCshipaddress(String cshipaddress) {
        this.cshipaddress = cshipaddress == null ? null : cshipaddress.trim();
    }

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
    }

    public Double getIexchrate() {
        return iexchrate;
    }

    public void setIexchrate(Double iexchrate) {
        this.iexchrate = iexchrate;
    }

    public Double getItaxrate() {
        return itaxrate;
    }

    public void setItaxrate(Double itaxrate) {
        this.itaxrate = itaxrate;
    }

    public Boolean getBfirst() {
        return bfirst;
    }

    public void setBfirst(Boolean bfirst) {
        this.bfirst = bfirst;
    }

    public Boolean getBreturnflag() {
        return breturnflag;
    }

    public void setBreturnflag(Boolean breturnflag) {
        this.breturnflag = breturnflag;
    }

    public Boolean getBsettleall() {
        return bsettleall;
    }

    public void setBsettleall(Boolean bsettleall) {
        this.bsettleall = bsettleall;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public String getCsaleout() {
        return csaleout;
    }

    public void setCsaleout(String csaleout) {
        this.csaleout = csaleout == null ? null : csaleout.trim();
    }

    public String getCdefine1() {
        return cdefine1;
    }

    public void setCdefine1(String cdefine1) {
        this.cdefine1 = cdefine1 == null ? null : cdefine1.trim();
    }

    public String getCdefine2() {
        return cdefine2;
    }

    public void setCdefine2(String cdefine2) {
        this.cdefine2 = cdefine2 == null ? null : cdefine2.trim();
    }

    public String getCdefine3() {
        return cdefine3;
    }

    public void setCdefine3(String cdefine3) {
        this.cdefine3 = cdefine3 == null ? null : cdefine3.trim();
    }

    public Date getCdefine4() {
        return cdefine4;
    }

    public void setCdefine4(Date cdefine4) {
        this.cdefine4 = cdefine4;
    }

    public Integer getCdefine5() {
        return cdefine5;
    }

    public void setCdefine5(Integer cdefine5) {
        this.cdefine5 = cdefine5;
    }

    public Date getCdefine6() {
        return cdefine6;
    }

    public void setCdefine6(Date cdefine6) {
        this.cdefine6 = cdefine6;
    }

    public Double getCdefine7() {
        return cdefine7;
    }

    public void setCdefine7(Double cdefine7) {
        this.cdefine7 = cdefine7;
    }

    public String getCdefine8() {
        return cdefine8;
    }

    public void setCdefine8(String cdefine8) {
        this.cdefine8 = cdefine8 == null ? null : cdefine8.trim();
    }

    public String getCdefine9() {
        return cdefine9;
    }

    public void setCdefine9(String cdefine9) {
        this.cdefine9 = cdefine9 == null ? null : cdefine9.trim();
    }

    public String getCdefine10() {
        return cdefine10;
    }

    public void setCdefine10(String cdefine10) {
        this.cdefine10 = cdefine10 == null ? null : cdefine10.trim();
    }

    public String getCverifier() {
        return cverifier;
    }

    public void setCverifier(String cverifier) {
        this.cverifier = cverifier == null ? null : cverifier.trim();
    }

    public String getCmaker() {
        return cmaker;
    }

    public void setCmaker(String cmaker) {
        this.cmaker = cmaker == null ? null : cmaker.trim();
    }

    public Float getInetlock() {
        return inetlock;
    }

    public void setInetlock(Float inetlock) {
        this.inetlock = inetlock;
    }

    public Short getIsale() {
        return isale;
    }

    public void setIsale(Short isale) {
        this.isale = isale;
    }

    public String getCcusname() {
        return ccusname;
    }

    public void setCcusname(String ccusname) {
        this.ccusname = ccusname == null ? null : ccusname.trim();
    }

    public Integer getIvtid() {
        return ivtid;
    }

    public void setIvtid(Integer ivtid) {
        this.ivtid = ivtid;
    }

    public String getCbustype() {
        return cbustype;
    }

    public void setCbustype(String cbustype) {
        this.cbustype = cbustype == null ? null : cbustype.trim();
    }

    public String getCcloser() {
        return ccloser;
    }

    public void setCcloser(String ccloser) {
        this.ccloser = ccloser == null ? null : ccloser.trim();
    }

    public String getCaccounter() {
        return caccounter;
    }

    public void setCaccounter(String caccounter) {
        this.caccounter = caccounter == null ? null : caccounter.trim();
    }

    public String getCcrechpname() {
        return ccrechpname;
    }

    public void setCcrechpname(String ccrechpname) {
        this.ccrechpname = ccrechpname == null ? null : ccrechpname.trim();
    }

    public String getCdefine11() {
        return cdefine11;
    }

    public void setCdefine11(String cdefine11) {
        this.cdefine11 = cdefine11 == null ? null : cdefine11.trim();
    }

    public String getCdefine12() {
        return cdefine12;
    }

    public void setCdefine12(String cdefine12) {
        this.cdefine12 = cdefine12 == null ? null : cdefine12.trim();
    }

    public String getCdefine13() {
        return cdefine13;
    }

    public void setCdefine13(String cdefine13) {
        this.cdefine13 = cdefine13 == null ? null : cdefine13.trim();
    }

    public String getCdefine14() {
        return cdefine14;
    }

    public void setCdefine14(String cdefine14) {
        this.cdefine14 = cdefine14 == null ? null : cdefine14.trim();
    }

    public Integer getCdefine15() {
        return cdefine15;
    }

    public void setCdefine15(Integer cdefine15) {
        this.cdefine15 = cdefine15;
    }

    public Double getCdefine16() {
        return cdefine16;
    }

    public void setCdefine16(Double cdefine16) {
        this.cdefine16 = cdefine16;
    }

    public Boolean getBiafirst() {
        return biafirst;
    }

    public void setBiafirst(Boolean biafirst) {
        this.biafirst = biafirst;
    }

    public Integer getIoutgolden() {
        return ioutgolden;
    }

    public void setIoutgolden(Integer ioutgolden) {
        this.ioutgolden = ioutgolden;
    }

    public String getCgatheringplan() {
        return cgatheringplan;
    }

    public void setCgatheringplan(String cgatheringplan) {
        this.cgatheringplan = cgatheringplan == null ? null : cgatheringplan.trim();
    }

    public Date getDcreditstart() {
        return dcreditstart;
    }

    public void setDcreditstart(Date dcreditstart) {
        this.dcreditstart = dcreditstart;
    }

    public Date getDgatheringdate() {
        return dgatheringdate;
    }

    public void setDgatheringdate(Date dgatheringdate) {
        this.dgatheringdate = dgatheringdate;
    }

    public Integer getIcreditdays() {
        return icreditdays;
    }

    public void setIcreditdays(Integer icreditdays) {
        this.icreditdays = icreditdays;
    }

    public Boolean getBcredit() {
        return bcredit;
    }

    public void setBcredit(Boolean bcredit) {
        this.bcredit = bcredit;
    }

    public String getCaddcode() {
        return caddcode;
    }

    public void setCaddcode(String caddcode) {
        this.caddcode = caddcode == null ? null : caddcode.trim();
    }

    public Integer getIverifystate() {
        return iverifystate;
    }

    public void setIverifystate(Integer iverifystate) {
        this.iverifystate = iverifystate;
    }

    public Byte getIreturncount() {
        return ireturncount;
    }

    public void setIreturncount(Byte ireturncount) {
        this.ireturncount = ireturncount;
    }

    public Byte getIswfcontrolled() {
        return iswfcontrolled;
    }

    public void setIswfcontrolled(Byte iswfcontrolled) {
        this.iswfcontrolled = iswfcontrolled;
    }

    public String getIcreditstate() {
        return icreditstate;
    }

    public void setIcreditstate(String icreditstate) {
        this.icreditstate = icreditstate == null ? null : icreditstate.trim();
    }

    public Boolean getBarfirst() {
        return barfirst;
    }

    public void setBarfirst(Boolean barfirst) {
        this.barfirst = barfirst;
    }

    public String getCmodifier() {
        return cmodifier;
    }

    public void setCmodifier(String cmodifier) {
        this.cmodifier = cmodifier == null ? null : cmodifier.trim();
    }

    public Date getDmoddate() {
        return dmoddate;
    }

    public void setDmoddate(Date dmoddate) {
        this.dmoddate = dmoddate;
    }

    public Date getDverifydate() {
        return dverifydate;
    }

    public void setDverifydate(Date dverifydate) {
        this.dverifydate = dverifydate;
    }

    public String getCcusperson() {
        return ccusperson;
    }

    public void setCcusperson(String ccusperson) {
        this.ccusperson = ccusperson == null ? null : ccusperson.trim();
    }

    public Date getDcreatesystime() {
        return dcreatesystime;
    }

    public void setDcreatesystime(Date dcreatesystime) {
        this.dcreatesystime = dcreatesystime;
    }

    public Date getDverifysystime() {
        return dverifysystime;
    }

    public void setDverifysystime(Date dverifysystime) {
        this.dverifysystime = dverifysystime;
    }

    public Date getDmodifysystime() {
        return dmodifysystime;
    }

    public void setDmodifysystime(Date dmodifysystime) {
        this.dmodifysystime = dmodifysystime;
    }

    public String getCsvouchtype() {
        return csvouchtype;
    }

    public void setCsvouchtype(String csvouchtype) {
        this.csvouchtype = csvouchtype == null ? null : csvouchtype.trim();
    }

    public Integer getIflowid() {
        return iflowid;
    }

    public void setIflowid(Integer iflowid) {
        this.iflowid = iflowid;
    }

    public Boolean getBsigncreate() {
        return bsigncreate;
    }

    public void setBsigncreate(Boolean bsigncreate) {
        this.bsigncreate = bsigncreate;
    }

    public Boolean getBcashsale() {
        return bcashsale;
    }

    public void setBcashsale(Boolean bcashsale) {
        this.bcashsale = bcashsale;
    }

    public String getCgathingcode() {
        return cgathingcode;
    }

    public void setCgathingcode(String cgathingcode) {
        this.cgathingcode = cgathingcode == null ? null : cgathingcode.trim();
    }

    public String getCchanger() {
        return cchanger;
    }

    public void setCchanger(String cchanger) {
        this.cchanger = cchanger == null ? null : cchanger.trim();
    }

    public String getCchangememo() {
        return cchangememo;
    }

    public void setCchangememo(String cchangememo) {
        this.cchangememo = cchangememo == null ? null : cchangememo.trim();
    }

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public Boolean getBmustbook() {
        return bmustbook;
    }

    public void setBmustbook(Boolean bmustbook) {
        this.bmustbook = bmustbook;
    }

    public String getCbookdepcode() {
        return cbookdepcode;
    }

    public void setCbookdepcode(String cbookdepcode) {
        this.cbookdepcode = cbookdepcode == null ? null : cbookdepcode.trim();
    }

    public String getCbooktype() {
        return cbooktype;
    }

    public void setCbooktype(String cbooktype) {
        this.cbooktype = cbooktype == null ? null : cbooktype.trim();
    }

    public Boolean getBsaused() {
        return bsaused;
    }

    public void setBsaused(Boolean bsaused) {
        this.bsaused = bsaused;
    }

    public Boolean getBneedbill() {
        return bneedbill;
    }

    public void setBneedbill(Boolean bneedbill) {
        this.bneedbill = bneedbill;
    }

    public Boolean getBaccswitchflag() {
        return baccswitchflag;
    }

    public void setBaccswitchflag(Boolean baccswitchflag) {
        this.baccswitchflag = baccswitchflag;
    }

    public Integer getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
    }

    public String getCcuspersoncode() {
        return ccuspersoncode;
    }

    public void setCcuspersoncode(String ccuspersoncode) {
        this.ccuspersoncode = ccuspersoncode == null ? null : ccuspersoncode.trim();
    }

    public String getCsourcecode() {
        return csourcecode;
    }

    public void setCsourcecode(String csourcecode) {
        this.csourcecode = csourcecode == null ? null : csourcecode.trim();
    }

    public Boolean getBsaleoutcreatebill() {
        return bsaleoutcreatebill;
    }

    public void setBsaleoutcreatebill(Boolean bsaleoutcreatebill) {
        this.bsaleoutcreatebill = bsaleoutcreatebill;
    }

    public String getCsysbarcode() {
        return csysbarcode;
    }

    public void setCsysbarcode(String csysbarcode) {
        this.csysbarcode = csysbarcode == null ? null : csysbarcode.trim();
    }

    public String getCcurrentauditor() {
        return ccurrentauditor;
    }

    public void setCcurrentauditor(String ccurrentauditor) {
        this.ccurrentauditor = ccurrentauditor == null ? null : ccurrentauditor.trim();
    }

    public String getCsscode() {
        return csscode;
    }

    public void setCsscode(String csscode) {
        this.csscode = csscode == null ? null : csscode.trim();
    }

    public String getCinvoicecompany() {
        return cinvoicecompany;
    }

    public void setCinvoicecompany(String cinvoicecompany) {
        this.cinvoicecompany = cinvoicecompany == null ? null : cinvoicecompany.trim();
    }

    public BigDecimal getFebweight() {
        return febweight;
    }

    public void setFebweight(BigDecimal febweight) {
        this.febweight = febweight;
    }

    public String getCebweightunit() {
        return cebweightunit;
    }

    public void setCebweightunit(String cebweightunit) {
        this.cebweightunit = cebweightunit == null ? null : cebweightunit.trim();
    }

    public String getCebexpresscode() {
        return cebexpresscode;
    }

    public void setCebexpresscode(String cebexpresscode) {
        this.cebexpresscode = cebexpresscode == null ? null : cebexpresscode.trim();
    }

    public Long getIebexpresscoid() {
        return iebexpresscoid;
    }

    public void setIebexpresscoid(Long iebexpresscoid) {
        this.iebexpresscoid = iebexpresscoid;
    }

    public Integer getSeparateid() {
        return separateid;
    }

    public void setSeparateid(Integer separateid) {
        this.separateid = separateid;
    }

    public Byte getBnottogoldtax() {
        return bnottogoldtax;
    }

    public void setBnottogoldtax(Byte bnottogoldtax) {
        this.bnottogoldtax = bnottogoldtax;
    }

    public String getCebtrnumber() {
        return cebtrnumber;
    }

    public void setCebtrnumber(String cebtrnumber) {
        this.cebtrnumber = cebtrnumber == null ? null : cebtrnumber.trim();
    }

    public String getCebbuyer() {
        return cebbuyer;
    }

    public void setCebbuyer(String cebbuyer) {
        this.cebbuyer = cebbuyer == null ? null : cebbuyer.trim();
    }

    public String getCebbuyernote() {
        return cebbuyernote;
    }

    public void setCebbuyernote(String cebbuyernote) {
        this.cebbuyernote = cebbuyernote == null ? null : cebbuyernote.trim();
    }

    public String getCcontactname() {
        return ccontactname;
    }

    public void setCcontactname(String ccontactname) {
        this.ccontactname = ccontactname == null ? null : ccontactname.trim();
    }

    public String getCebprovince() {
        return cebprovince;
    }

    public void setCebprovince(String cebprovince) {
        this.cebprovince = cebprovince == null ? null : cebprovince.trim();
    }

    public String getCebcity() {
        return cebcity;
    }

    public void setCebcity(String cebcity) {
        this.cebcity = cebcity == null ? null : cebcity.trim();
    }

    public String getCebdistrict() {
        return cebdistrict;
    }

    public void setCebdistrict(String cebdistrict) {
        this.cebdistrict = cebdistrict == null ? null : cebdistrict.trim();
    }

    public String getCmobilephone() {
        return cmobilephone;
    }

    public void setCmobilephone(String cmobilephone) {
        this.cmobilephone = cmobilephone == null ? null : cmobilephone.trim();
    }

    public String getCinvoicecusname() {
        return cinvoicecusname;
    }

    public void setCinvoicecusname(String cinvoicecusname) {
        this.cinvoicecusname = cinvoicecusname == null ? null : cinvoicecusname.trim();
    }

    public String getCweighter() {
        return cweighter;
    }

    public void setCweighter(String cweighter) {
        this.cweighter = cweighter == null ? null : cweighter.trim();
    }

    public Date getDweighttime() {
        return dweighttime;
    }

    public void setDweighttime(Date dweighttime) {
        this.dweighttime = dweighttime;
    }

    public String getCpickvouchcode() {
        return cpickvouchcode;
    }

    public void setCpickvouchcode(String cpickvouchcode) {
        this.cpickvouchcode = cpickvouchcode == null ? null : cpickvouchcode.trim();
    }

    public String getCgcroutecode() {
        return cgcroutecode;
    }

    public void setCgcroutecode(String cgcroutecode) {
        this.cgcroutecode = cgcroutecode == null ? null : cgcroutecode.trim();
    }

    public byte[] getUfts() {
        return ufts;
    }

    public void setUfts(byte[] ufts) {
        this.ufts = ufts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dlid=").append(dlid);
        sb.append(", cdlcode=").append(cdlcode);
        sb.append(", cvouchtype=").append(cvouchtype);
        sb.append(", cstcode=").append(cstcode);
        sb.append(", ddate=").append(ddate);
        sb.append(", crdcode=").append(crdcode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", sbvid=").append(sbvid);
        sb.append(", csbvcode=").append(csbvcode);
        sb.append(", csocode=").append(csocode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cpaycode=").append(cpaycode);
        sb.append(", csccode=").append(csccode);
        sb.append(", cshipaddress=").append(cshipaddress);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", iexchrate=").append(iexchrate);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", bfirst=").append(bfirst);
        sb.append(", breturnflag=").append(breturnflag);
        sb.append(", bsettleall=").append(bsettleall);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", csaleout=").append(csaleout);
        sb.append(", cdefine1=").append(cdefine1);
        sb.append(", cdefine2=").append(cdefine2);
        sb.append(", cdefine3=").append(cdefine3);
        sb.append(", cdefine4=").append(cdefine4);
        sb.append(", cdefine5=").append(cdefine5);
        sb.append(", cdefine6=").append(cdefine6);
        sb.append(", cdefine7=").append(cdefine7);
        sb.append(", cdefine8=").append(cdefine8);
        sb.append(", cdefine9=").append(cdefine9);
        sb.append(", cdefine10=").append(cdefine10);
        sb.append(", cdefine17=").append(cdefine17);
        sb.append(", cverifier=").append(cverifier);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", inetlock=").append(inetlock);
        sb.append(", isale=").append(isale);
        sb.append(", ccusname=").append(ccusname);
        sb.append(", ivtid=").append(ivtid);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", ccloser=").append(ccloser);
        sb.append(", caccounter=").append(caccounter);
        sb.append(", ccrechpname=").append(ccrechpname);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", biafirst=").append(biafirst);
        sb.append(", ioutgolden=").append(ioutgolden);
        sb.append(", cgatheringplan=").append(cgatheringplan);
        sb.append(", dcreditstart=").append(dcreditstart);
        sb.append(", dgatheringdate=").append(dgatheringdate);
        sb.append(", icreditdays=").append(icreditdays);
        sb.append(", bcredit=").append(bcredit);
        sb.append(", caddcode=").append(caddcode);
        sb.append(", iverifystate=").append(iverifystate);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", icreditstate=").append(icreditstate);
        sb.append(", barfirst=").append(barfirst);
        sb.append(", cmodifier=").append(cmodifier);
        sb.append(", dmoddate=").append(dmoddate);
        sb.append(", dverifydate=").append(dverifydate);
        sb.append(", ccusperson=").append(ccusperson);
        sb.append(", dcreatesystime=").append(dcreatesystime);
        sb.append(", dverifysystime=").append(dverifysystime);
        sb.append(", dmodifysystime=").append(dmodifysystime);
        sb.append(", csvouchtype=").append(csvouchtype);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", bsigncreate=").append(bsigncreate);
        sb.append(", bcashsale=").append(bcashsale);
        sb.append(", cgathingcode=").append(cgathingcode);
        sb.append(", cchanger=").append(cchanger);
        sb.append(", cchangememo=").append(cchangememo);
        sb.append(", outid=").append(outid);
        sb.append(", bmustbook=").append(bmustbook);
        sb.append(", cbookdepcode=").append(cbookdepcode);
        sb.append(", cbooktype=").append(cbooktype);
        sb.append(", bsaused=").append(bsaused);
        sb.append(", bneedbill=").append(bneedbill);
        sb.append(", baccswitchflag=").append(baccswitchflag);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", ccuspersoncode=").append(ccuspersoncode);
        sb.append(", csourcecode=").append(csourcecode);
        sb.append(", bsaleoutcreatebill=").append(bsaleoutcreatebill);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", csscode=").append(csscode);
        sb.append(", cinvoicecompany=").append(cinvoicecompany);
        sb.append(", febweight=").append(febweight);
        sb.append(", cebweightunit=").append(cebweightunit);
        sb.append(", cebexpresscode=").append(cebexpresscode);
        sb.append(", iebexpresscoid=").append(iebexpresscoid);
        sb.append(", separateid=").append(separateid);
        sb.append(", bnottogoldtax=").append(bnottogoldtax);
        sb.append(", cebtrnumber=").append(cebtrnumber);
        sb.append(", cebbuyer=").append(cebbuyer);
        sb.append(", cebbuyernote=").append(cebbuyernote);
        sb.append(", ccontactname=").append(ccontactname);
        sb.append(", cebprovince=").append(cebprovince);
        sb.append(", cebcity=").append(cebcity);
        sb.append(", cebdistrict=").append(cebdistrict);
        sb.append(", cmobilephone=").append(cmobilephone);
        sb.append(", cinvoicecusname=").append(cinvoicecusname);
        sb.append(", cweighter=").append(cweighter);
        sb.append(", dweighttime=").append(dweighttime);
        sb.append(", cpickvouchcode=").append(cpickvouchcode);
        sb.append(", cgcroutecode=").append(cgcroutecode);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public String getCdefine17() {
        return cdefine17;
    }

    public void setCdefine17(String cdefine17) {
        this.cdefine17 = cdefine17;
    }
}