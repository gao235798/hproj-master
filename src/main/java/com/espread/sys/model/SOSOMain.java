package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SOSOMain implements Serializable {
    private Integer id;

    private String cstcode;

    private Date ddate;

    private String csocode;

    private String ccuscode;

    private String cdepcode;

    private String cpersoncode;

    private String csccode;

    private String ccusoaddress;

    private String cpaycode;

    private String cexchName;

    private Double iexchrate;

    private Double itaxrate;

    private BigDecimal imoney;

    private String cmemo;

    private Byte istatus;

    private String cmaker;

    private String cverifier;

    private String ccloser;

    private Boolean bdisflag;

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

    private Boolean breturnflag;

    private String ccusname;

    private Boolean border;

    private Integer ivtid;

    private String cchanger;

    private String cbustype;

    private String ccrechpname;

    private String cdefine11;

    private String cdefine12;

    private String cdefine13;

    private String cdefine14;

    private Integer cdefine15;

    private Double cdefine16;

    private String coppcode;

    private String clocker;

    private Date dpremodatebt;

    private Date dpredatebt;

    private String cgatheringplan;

    private String caddcode;

    private Integer iverifystate;

    private Byte ireturncount;

    private Byte iswfcontrolled;

    private String icreditstate;

    private String cmodifier;

    private Date dmoddate;

    private Date dverifydate;

    private String ccusperson;

    private Date dcreatesystime;

    private Date dverifysystime;

    private Date dmodifysystime;

    private Integer iflowid;

    private Boolean bcashsale;

    private String cgathingcode;

    private String cchangeverifier;

    private Date dchangeverifydate;

    private Date dchangeverifytime;

    private String outid;

    private String ccuspersoncode;

    private Date dclosedate;

    private Date dclosesystime;

    private Double iprintcount;

    private Double fbookratio;

    private Boolean bmustbook;

    private BigDecimal fbooksum;

    private BigDecimal fbooknatsum;

    private BigDecimal fgbooksum;

    private BigDecimal fgbooknatsum;

    private String csvouchtype;

    private String ccrmpersoncode;

    private String ccrmpersonname;

    private String cmainpersoncode;

    private String csysbarcode;

    private Integer ioppid;

    private String optntyName;

    private String ccurrentauditor;

    private Short contractStatus;

    private String csscode;

    private String cinvoicecompany;

    private String cattachment;

    private String cebtrnumber;

    private String cebbuyer;

    private String cebbuyernote;

    private String ccontactname;

    private String cebprovince;

    private String cebcity;

    private String cebdistrict;

    private String cmobilephone;

    private String cinvoicecusname;

    private String cgcroutecode;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCsccode() {
        return csccode;
    }

    public void setCsccode(String csccode) {
        this.csccode = csccode == null ? null : csccode.trim();
    }

    public String getCcusoaddress() {
        return ccusoaddress;
    }

    public void setCcusoaddress(String ccusoaddress) {
        this.ccusoaddress = ccusoaddress == null ? null : ccusoaddress.trim();
    }

    public String getCpaycode() {
        return cpaycode;
    }

    public void setCpaycode(String cpaycode) {
        this.cpaycode = cpaycode == null ? null : cpaycode.trim();
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

    public BigDecimal getImoney() {
        return imoney;
    }

    public void setImoney(BigDecimal imoney) {
        this.imoney = imoney;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Byte getIstatus() {
        return istatus;
    }

    public void setIstatus(Byte istatus) {
        this.istatus = istatus;
    }

    public String getCmaker() {
        return cmaker;
    }

    public void setCmaker(String cmaker) {
        this.cmaker = cmaker == null ? null : cmaker.trim();
    }

    public String getCverifier() {
        return cverifier;
    }

    public void setCverifier(String cverifier) {
        this.cverifier = cverifier == null ? null : cverifier.trim();
    }

    public String getCcloser() {
        return ccloser;
    }

    public void setCcloser(String ccloser) {
        this.ccloser = ccloser == null ? null : ccloser.trim();
    }

    public Boolean getBdisflag() {
        return bdisflag;
    }

    public void setBdisflag(Boolean bdisflag) {
        this.bdisflag = bdisflag;
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

    public Boolean getBreturnflag() {
        return breturnflag;
    }

    public void setBreturnflag(Boolean breturnflag) {
        this.breturnflag = breturnflag;
    }

    public String getCcusname() {
        return ccusname;
    }

    public void setCcusname(String ccusname) {
        this.ccusname = ccusname == null ? null : ccusname.trim();
    }

    public Boolean getBorder() {
        return border;
    }

    public void setBorder(Boolean border) {
        this.border = border;
    }

    public Integer getIvtid() {
        return ivtid;
    }

    public void setIvtid(Integer ivtid) {
        this.ivtid = ivtid;
    }

    public String getCchanger() {
        return cchanger;
    }

    public void setCchanger(String cchanger) {
        this.cchanger = cchanger == null ? null : cchanger.trim();
    }

    public String getCbustype() {
        return cbustype;
    }

    public void setCbustype(String cbustype) {
        this.cbustype = cbustype == null ? null : cbustype.trim();
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

    public String getCoppcode() {
        return coppcode;
    }

    public void setCoppcode(String coppcode) {
        this.coppcode = coppcode == null ? null : coppcode.trim();
    }

    public String getClocker() {
        return clocker;
    }

    public void setClocker(String clocker) {
        this.clocker = clocker == null ? null : clocker.trim();
    }

    public Date getDpremodatebt() {
        return dpremodatebt;
    }

    public void setDpremodatebt(Date dpremodatebt) {
        this.dpremodatebt = dpremodatebt;
    }

    public Date getDpredatebt() {
        return dpredatebt;
    }

    public void setDpredatebt(Date dpredatebt) {
        this.dpredatebt = dpredatebt;
    }

    public String getCgatheringplan() {
        return cgatheringplan;
    }

    public void setCgatheringplan(String cgatheringplan) {
        this.cgatheringplan = cgatheringplan == null ? null : cgatheringplan.trim();
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

    public Integer getIflowid() {
        return iflowid;
    }

    public void setIflowid(Integer iflowid) {
        this.iflowid = iflowid;
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

    public String getCchangeverifier() {
        return cchangeverifier;
    }

    public void setCchangeverifier(String cchangeverifier) {
        this.cchangeverifier = cchangeverifier == null ? null : cchangeverifier.trim();
    }

    public Date getDchangeverifydate() {
        return dchangeverifydate;
    }

    public void setDchangeverifydate(Date dchangeverifydate) {
        this.dchangeverifydate = dchangeverifydate;
    }

    public Date getDchangeverifytime() {
        return dchangeverifytime;
    }

    public void setDchangeverifytime(Date dchangeverifytime) {
        this.dchangeverifytime = dchangeverifytime;
    }

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getCcuspersoncode() {
        return ccuspersoncode;
    }

    public void setCcuspersoncode(String ccuspersoncode) {
        this.ccuspersoncode = ccuspersoncode == null ? null : ccuspersoncode.trim();
    }

    public Date getDclosedate() {
        return dclosedate;
    }

    public void setDclosedate(Date dclosedate) {
        this.dclosedate = dclosedate;
    }

    public Date getDclosesystime() {
        return dclosesystime;
    }

    public void setDclosesystime(Date dclosesystime) {
        this.dclosesystime = dclosesystime;
    }

    public Double getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Double iprintcount) {
        this.iprintcount = iprintcount;
    }

    public Double getFbookratio() {
        return fbookratio;
    }

    public void setFbookratio(Double fbookratio) {
        this.fbookratio = fbookratio;
    }

    public Boolean getBmustbook() {
        return bmustbook;
    }

    public void setBmustbook(Boolean bmustbook) {
        this.bmustbook = bmustbook;
    }

    public BigDecimal getFbooksum() {
        return fbooksum;
    }

    public void setFbooksum(BigDecimal fbooksum) {
        this.fbooksum = fbooksum;
    }

    public BigDecimal getFbooknatsum() {
        return fbooknatsum;
    }

    public void setFbooknatsum(BigDecimal fbooknatsum) {
        this.fbooknatsum = fbooknatsum;
    }

    public BigDecimal getFgbooksum() {
        return fgbooksum;
    }

    public void setFgbooksum(BigDecimal fgbooksum) {
        this.fgbooksum = fgbooksum;
    }

    public BigDecimal getFgbooknatsum() {
        return fgbooknatsum;
    }

    public void setFgbooknatsum(BigDecimal fgbooknatsum) {
        this.fgbooknatsum = fgbooknatsum;
    }

    public String getCsvouchtype() {
        return csvouchtype;
    }

    public void setCsvouchtype(String csvouchtype) {
        this.csvouchtype = csvouchtype == null ? null : csvouchtype.trim();
    }

    public String getCcrmpersoncode() {
        return ccrmpersoncode;
    }

    public void setCcrmpersoncode(String ccrmpersoncode) {
        this.ccrmpersoncode = ccrmpersoncode == null ? null : ccrmpersoncode.trim();
    }

    public String getCcrmpersonname() {
        return ccrmpersonname;
    }

    public void setCcrmpersonname(String ccrmpersonname) {
        this.ccrmpersonname = ccrmpersonname == null ? null : ccrmpersonname.trim();
    }

    public String getCmainpersoncode() {
        return cmainpersoncode;
    }

    public void setCmainpersoncode(String cmainpersoncode) {
        this.cmainpersoncode = cmainpersoncode == null ? null : cmainpersoncode.trim();
    }

    public String getCsysbarcode() {
        return csysbarcode;
    }

    public void setCsysbarcode(String csysbarcode) {
        this.csysbarcode = csysbarcode == null ? null : csysbarcode.trim();
    }

    public Integer getIoppid() {
        return ioppid;
    }

    public void setIoppid(Integer ioppid) {
        this.ioppid = ioppid;
    }

    public String getOptntyName() {
        return optntyName;
    }

    public void setOptntyName(String optntyName) {
        this.optntyName = optntyName == null ? null : optntyName.trim();
    }

    public String getCcurrentauditor() {
        return ccurrentauditor;
    }

    public void setCcurrentauditor(String ccurrentauditor) {
        this.ccurrentauditor = ccurrentauditor == null ? null : ccurrentauditor.trim();
    }

    public Short getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Short contractStatus) {
        this.contractStatus = contractStatus;
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

    public String getCattachment() {
        return cattachment;
    }

    public void setCattachment(String cattachment) {
        this.cattachment = cattachment == null ? null : cattachment.trim();
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
        sb.append(", id=").append(id);
        sb.append(", cstcode=").append(cstcode);
        sb.append(", ddate=").append(ddate);
        sb.append(", csocode=").append(csocode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", csccode=").append(csccode);
        sb.append(", ccusoaddress=").append(ccusoaddress);
        sb.append(", cpaycode=").append(cpaycode);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", iexchrate=").append(iexchrate);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", imoney=").append(imoney);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", istatus=").append(istatus);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", cverifier=").append(cverifier);
        sb.append(", ccloser=").append(ccloser);
        sb.append(", bdisflag=").append(bdisflag);
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
        sb.append(", breturnflag=").append(breturnflag);
        sb.append(", ccusname=").append(ccusname);
        sb.append(", border=").append(border);
        sb.append(", ivtid=").append(ivtid);
        sb.append(", cchanger=").append(cchanger);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", ccrechpname=").append(ccrechpname);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", coppcode=").append(coppcode);
        sb.append(", clocker=").append(clocker);
        sb.append(", dpremodatebt=").append(dpremodatebt);
        sb.append(", dpredatebt=").append(dpredatebt);
        sb.append(", cgatheringplan=").append(cgatheringplan);
        sb.append(", caddcode=").append(caddcode);
        sb.append(", iverifystate=").append(iverifystate);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", icreditstate=").append(icreditstate);
        sb.append(", cmodifier=").append(cmodifier);
        sb.append(", dmoddate=").append(dmoddate);
        sb.append(", dverifydate=").append(dverifydate);
        sb.append(", ccusperson=").append(ccusperson);
        sb.append(", dcreatesystime=").append(dcreatesystime);
        sb.append(", dverifysystime=").append(dverifysystime);
        sb.append(", dmodifysystime=").append(dmodifysystime);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", bcashsale=").append(bcashsale);
        sb.append(", cgathingcode=").append(cgathingcode);
        sb.append(", cchangeverifier=").append(cchangeverifier);
        sb.append(", dchangeverifydate=").append(dchangeverifydate);
        sb.append(", dchangeverifytime=").append(dchangeverifytime);
        sb.append(", outid=").append(outid);
        sb.append(", ccuspersoncode=").append(ccuspersoncode);
        sb.append(", dclosedate=").append(dclosedate);
        sb.append(", dclosesystime=").append(dclosesystime);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", fbookratio=").append(fbookratio);
        sb.append(", bmustbook=").append(bmustbook);
        sb.append(", fbooksum=").append(fbooksum);
        sb.append(", fbooknatsum=").append(fbooknatsum);
        sb.append(", fgbooksum=").append(fgbooksum);
        sb.append(", fgbooknatsum=").append(fgbooknatsum);
        sb.append(", csvouchtype=").append(csvouchtype);
        sb.append(", ccrmpersoncode=").append(ccrmpersoncode);
        sb.append(", ccrmpersonname=").append(ccrmpersonname);
        sb.append(", cmainpersoncode=").append(cmainpersoncode);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ioppid=").append(ioppid);
        sb.append(", optntyName=").append(optntyName);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", csscode=").append(csscode);
        sb.append(", cinvoicecompany=").append(cinvoicecompany);
        sb.append(", cattachment=").append(cattachment);
        sb.append(", cebtrnumber=").append(cebtrnumber);
        sb.append(", cebbuyer=").append(cebbuyer);
        sb.append(", cebbuyernote=").append(cebbuyernote);
        sb.append(", ccontactname=").append(ccontactname);
        sb.append(", cebprovince=").append(cebprovince);
        sb.append(", cebcity=").append(cebcity);
        sb.append(", cebdistrict=").append(cebdistrict);
        sb.append(", cmobilephone=").append(cmobilephone);
        sb.append(", cinvoicecusname=").append(cinvoicecusname);
        sb.append(", cgcroutecode=").append(cgcroutecode);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}