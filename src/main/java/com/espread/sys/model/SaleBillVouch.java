package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;

public class SaleBillVouch implements Serializable {
    private Integer sbvid;

    private String csbvcode;

    private String cvouchtype;

    private String cstcode;

    private Date ddate;

    private String csaleout;

    private String crdcode;

    private String cdepcode;

    private String cpersoncode;

    private String csocode;

    private String ccuscode;

    private String cpaycode;

    private String cexchName;

    private String cmemo;

    private Double iexchrate;

    private Double itaxrate;

    private Boolean breturnflag;

    private String cbcode;

    private String cbillver;

    private String cmaker;

    private String cinvalider;

    private String cverifier;

    private String cbustype;

    private Boolean bfirst;

    private String citemClass;

    private String citemcode;

    private String cheadcode;

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

    private String bpayment;

    private Short idisp;

    private String ccusname;

    private String cdlcode;

    private String caccounter;

    private String cchecker;

    private Integer ivtid;

    private Boolean biafirst;

    private String ccrechpname;

    private String cinfotypecode;

    private String csource;

    private String cdefine11;

    private String cdefine12;

    private String cdefine13;

    private String cdefine14;

    private Integer cdefine15;

    private Double cdefine16;

    private String csccode;

    private String cshipaddress;

    private String ccusbank;

    private String ccusaccount;

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

    private String cmodifier;

    private Date dmoddate;

    private Date dverifydate;

    private String ccusperson;

    private Date dcreatesystime;

    private Date dverifysystime;

    private Date dmodifysystime;

    private Integer iflowid;

    private Boolean bcashsale;

    private String retailId;

    private String cbookdepcode;

    private String cbooktype;

    private String ccuspersoncode;

    private Integer iprintcount;

    private Date darverifydate;

    private Date darverifysystime;

    private String csysbarcode;

    private String ccurrentauditor;

    private String csscode;

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

    private Byte itaxbillstate;

    private String ctaxbillcode;

    private String cgcroutecode;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

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

    public String getCsaleout() {
        return csaleout;
    }

    public void setCsaleout(String csaleout) {
        this.csaleout = csaleout == null ? null : csaleout.trim();
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

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
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

    public Boolean getBreturnflag() {
        return breturnflag;
    }

    public void setBreturnflag(Boolean breturnflag) {
        this.breturnflag = breturnflag;
    }

    public String getCbcode() {
        return cbcode;
    }

    public void setCbcode(String cbcode) {
        this.cbcode = cbcode == null ? null : cbcode.trim();
    }

    public String getCbillver() {
        return cbillver;
    }

    public void setCbillver(String cbillver) {
        this.cbillver = cbillver == null ? null : cbillver.trim();
    }

    public String getCmaker() {
        return cmaker;
    }

    public void setCmaker(String cmaker) {
        this.cmaker = cmaker == null ? null : cmaker.trim();
    }

    public String getCinvalider() {
        return cinvalider;
    }

    public void setCinvalider(String cinvalider) {
        this.cinvalider = cinvalider == null ? null : cinvalider.trim();
    }

    public String getCverifier() {
        return cverifier;
    }

    public void setCverifier(String cverifier) {
        this.cverifier = cverifier == null ? null : cverifier.trim();
    }

    public String getCbustype() {
        return cbustype;
    }

    public void setCbustype(String cbustype) {
        this.cbustype = cbustype == null ? null : cbustype.trim();
    }

    public Boolean getBfirst() {
        return bfirst;
    }

    public void setBfirst(Boolean bfirst) {
        this.bfirst = bfirst;
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

    public String getCheadcode() {
        return cheadcode;
    }

    public void setCheadcode(String cheadcode) {
        this.cheadcode = cheadcode == null ? null : cheadcode.trim();
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

    public String getBpayment() {
        return bpayment;
    }

    public void setBpayment(String bpayment) {
        this.bpayment = bpayment == null ? null : bpayment.trim();
    }

    public Short getIdisp() {
        return idisp;
    }

    public void setIdisp(Short idisp) {
        this.idisp = idisp;
    }

    public String getCcusname() {
        return ccusname;
    }

    public void setCcusname(String ccusname) {
        this.ccusname = ccusname == null ? null : ccusname.trim();
    }

    public String getCdlcode() {
        return cdlcode;
    }

    public void setCdlcode(String cdlcode) {
        this.cdlcode = cdlcode == null ? null : cdlcode.trim();
    }

    public String getCaccounter() {
        return caccounter;
    }

    public void setCaccounter(String caccounter) {
        this.caccounter = caccounter == null ? null : caccounter.trim();
    }

    public String getCchecker() {
        return cchecker;
    }

    public void setCchecker(String cchecker) {
        this.cchecker = cchecker == null ? null : cchecker.trim();
    }

    public Integer getIvtid() {
        return ivtid;
    }

    public void setIvtid(Integer ivtid) {
        this.ivtid = ivtid;
    }

    public Boolean getBiafirst() {
        return biafirst;
    }

    public void setBiafirst(Boolean biafirst) {
        this.biafirst = biafirst;
    }

    public String getCcrechpname() {
        return ccrechpname;
    }

    public void setCcrechpname(String ccrechpname) {
        this.ccrechpname = ccrechpname == null ? null : ccrechpname.trim();
    }

    public String getCinfotypecode() {
        return cinfotypecode;
    }

    public void setCinfotypecode(String cinfotypecode) {
        this.cinfotypecode = cinfotypecode == null ? null : cinfotypecode.trim();
    }

    public String getCsource() {
        return csource;
    }

    public void setCsource(String csource) {
        this.csource = csource == null ? null : csource.trim();
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

    public String getCcusbank() {
        return ccusbank;
    }

    public void setCcusbank(String ccusbank) {
        this.ccusbank = ccusbank == null ? null : ccusbank.trim();
    }

    public String getCcusaccount() {
        return ccusaccount;
    }

    public void setCcusaccount(String ccusaccount) {
        this.ccusaccount = ccusaccount == null ? null : ccusaccount.trim();
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

    public String getRetailId() {
        return retailId;
    }

    public void setRetailId(String retailId) {
        this.retailId = retailId == null ? null : retailId.trim();
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

    public String getCcuspersoncode() {
        return ccuspersoncode;
    }

    public void setCcuspersoncode(String ccuspersoncode) {
        this.ccuspersoncode = ccuspersoncode == null ? null : ccuspersoncode.trim();
    }

    public Integer getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
    }

    public Date getDarverifydate() {
        return darverifydate;
    }

    public void setDarverifydate(Date darverifydate) {
        this.darverifydate = darverifydate;
    }

    public Date getDarverifysystime() {
        return darverifysystime;
    }

    public void setDarverifysystime(Date darverifysystime) {
        this.darverifysystime = darverifysystime;
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

    public Byte getItaxbillstate() {
        return itaxbillstate;
    }

    public void setItaxbillstate(Byte itaxbillstate) {
        this.itaxbillstate = itaxbillstate;
    }

    public String getCtaxbillcode() {
        return ctaxbillcode;
    }

    public void setCtaxbillcode(String ctaxbillcode) {
        this.ctaxbillcode = ctaxbillcode == null ? null : ctaxbillcode.trim();
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
        sb.append(", sbvid=").append(sbvid);
        sb.append(", csbvcode=").append(csbvcode);
        sb.append(", cvouchtype=").append(cvouchtype);
        sb.append(", cstcode=").append(cstcode);
        sb.append(", ddate=").append(ddate);
        sb.append(", csaleout=").append(csaleout);
        sb.append(", crdcode=").append(crdcode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", csocode=").append(csocode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cpaycode=").append(cpaycode);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", iexchrate=").append(iexchrate);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", breturnflag=").append(breturnflag);
        sb.append(", cbcode=").append(cbcode);
        sb.append(", cbillver=").append(cbillver);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", cinvalider=").append(cinvalider);
        sb.append(", cverifier=").append(cverifier);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", bfirst=").append(bfirst);
        sb.append(", citemClass=").append(citemClass);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", cheadcode=").append(cheadcode);
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
        sb.append(", bpayment=").append(bpayment);
        sb.append(", idisp=").append(idisp);
        sb.append(", ccusname=").append(ccusname);
        sb.append(", cdlcode=").append(cdlcode);
        sb.append(", caccounter=").append(caccounter);
        sb.append(", cchecker=").append(cchecker);
        sb.append(", ivtid=").append(ivtid);
        sb.append(", biafirst=").append(biafirst);
        sb.append(", ccrechpname=").append(ccrechpname);
        sb.append(", cinfotypecode=").append(cinfotypecode);
        sb.append(", csource=").append(csource);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", csccode=").append(csccode);
        sb.append(", cshipaddress=").append(cshipaddress);
        sb.append(", ccusbank=").append(ccusbank);
        sb.append(", ccusaccount=").append(ccusaccount);
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
        sb.append(", cmodifier=").append(cmodifier);
        sb.append(", dmoddate=").append(dmoddate);
        sb.append(", dverifydate=").append(dverifydate);
        sb.append(", ccusperson=").append(ccusperson);
        sb.append(", dcreatesystime=").append(dcreatesystime);
        sb.append(", dverifysystime=").append(dverifysystime);
        sb.append(", dmodifysystime=").append(dmodifysystime);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", bcashsale=").append(bcashsale);
        sb.append(", retailId=").append(retailId);
        sb.append(", cbookdepcode=").append(cbookdepcode);
        sb.append(", cbooktype=").append(cbooktype);
        sb.append(", ccuspersoncode=").append(ccuspersoncode);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", darverifydate=").append(darverifydate);
        sb.append(", darverifysystime=").append(darverifysystime);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", csscode=").append(csscode);
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
        sb.append(", itaxbillstate=").append(itaxbillstate);
        sb.append(", ctaxbillcode=").append(ctaxbillcode);
        sb.append(", cgcroutecode=").append(cgcroutecode);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}