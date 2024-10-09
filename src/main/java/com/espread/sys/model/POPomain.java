package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class POPomain implements Serializable {
    private Integer poid;

    private String cpoid;

    private Date dpodate;

    private String cvencode;

    private String cdepcode;

    private String cpersoncode;

    private String cptcode;

    private String carrivalplace;

    private String csccode;

    private String cexchName;

    private Double nflat;

    private Double itaxrate;

    private String cpaycode;

    private BigDecimal icost;

    private BigDecimal ibargain;

    private String cmemo;

    private Byte cstate;

    private String cperiod;

    private String cmaker;

    private String cverifier;

    private String ccloser;

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

    private Integer ivtid;

    private String cchanger;

    private String cbustype;

    private String cdefine11;

    private String cdefine12;

    private String cdefine13;

    private String cdefine14;

    private Integer cdefine15;

    private Double cdefine16;

    private String clocker;

    private Byte idiscounttaxtype;

    private Integer iverifystateex;

    private Integer ireturncount;

    private Boolean iswfcontrolled;

    private Date cmaketime;

    private Date cmodifytime;

    private Date caudittime;

    private Date cauditdate;

    private Date cmodifydate;

    private String creviser;

    private String cvenpuomprotocol;

    private String cchangverifier;

    private Date cchangaudittime;

    private Date cchangauditdate;

    private Short ibgOverflag;

    private String cbgAuditor;

    private String cbgAudittime;

    private Short controlresult;

    private Integer iflowid;

    private Integer iprintcount;

    private Date dclosedate;

    private Date dclosetime;

    private String ccleanver;

    private String ccontactcode;

    private String cvenperson;

    private String cvenbank;

    private String cvenaccount;

    private String cappcode;

    private String csysbarcode;

    private String ccurrentauditor;

    private String cgcroutecode;

    private Boolean bgctransforming;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    public String getCpoid() {
        return cpoid;
    }

    public void setCpoid(String cpoid) {
        this.cpoid = cpoid == null ? null : cpoid.trim();
    }

    public Date getDpodate() {
        return dpodate;
    }

    public void setDpodate(Date dpodate) {
        this.dpodate = dpodate;
    }

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
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

    public String getCptcode() {
        return cptcode;
    }

    public void setCptcode(String cptcode) {
        this.cptcode = cptcode == null ? null : cptcode.trim();
    }

    public String getCarrivalplace() {
        return carrivalplace;
    }

    public void setCarrivalplace(String carrivalplace) {
        this.carrivalplace = carrivalplace == null ? null : carrivalplace.trim();
    }

    public String getCsccode() {
        return csccode;
    }

    public void setCsccode(String csccode) {
        this.csccode = csccode == null ? null : csccode.trim();
    }

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
    }

    public Double getNflat() {
        return nflat;
    }

    public void setNflat(Double nflat) {
        this.nflat = nflat;
    }

    public Double getItaxrate() {
        return itaxrate;
    }

    public void setItaxrate(Double itaxrate) {
        this.itaxrate = itaxrate;
    }

    public String getCpaycode() {
        return cpaycode;
    }

    public void setCpaycode(String cpaycode) {
        this.cpaycode = cpaycode == null ? null : cpaycode.trim();
    }

    public BigDecimal getIcost() {
        return icost;
    }

    public void setIcost(BigDecimal icost) {
        this.icost = icost;
    }

    public BigDecimal getIbargain() {
        return ibargain;
    }

    public void setIbargain(BigDecimal ibargain) {
        this.ibargain = ibargain;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Byte getCstate() {
        return cstate;
    }

    public void setCstate(Byte cstate) {
        this.cstate = cstate;
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod == null ? null : cperiod.trim();
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

    public String getClocker() {
        return clocker;
    }

    public void setClocker(String clocker) {
        this.clocker = clocker == null ? null : clocker.trim();
    }

    public Byte getIdiscounttaxtype() {
        return idiscounttaxtype;
    }

    public void setIdiscounttaxtype(Byte idiscounttaxtype) {
        this.idiscounttaxtype = idiscounttaxtype;
    }

    public Integer getIverifystateex() {
        return iverifystateex;
    }

    public void setIverifystateex(Integer iverifystateex) {
        this.iverifystateex = iverifystateex;
    }

    public Integer getIreturncount() {
        return ireturncount;
    }

    public void setIreturncount(Integer ireturncount) {
        this.ireturncount = ireturncount;
    }

    public Boolean getIswfcontrolled() {
        return iswfcontrolled;
    }

    public void setIswfcontrolled(Boolean iswfcontrolled) {
        this.iswfcontrolled = iswfcontrolled;
    }

    public Date getCmaketime() {
        return cmaketime;
    }

    public void setCmaketime(Date cmaketime) {
        this.cmaketime = cmaketime;
    }

    public Date getCmodifytime() {
        return cmodifytime;
    }

    public void setCmodifytime(Date cmodifytime) {
        this.cmodifytime = cmodifytime;
    }

    public Date getCaudittime() {
        return caudittime;
    }

    public void setCaudittime(Date caudittime) {
        this.caudittime = caudittime;
    }

    public Date getCauditdate() {
        return cauditdate;
    }

    public void setCauditdate(Date cauditdate) {
        this.cauditdate = cauditdate;
    }

    public Date getCmodifydate() {
        return cmodifydate;
    }

    public void setCmodifydate(Date cmodifydate) {
        this.cmodifydate = cmodifydate;
    }

    public String getCreviser() {
        return creviser;
    }

    public void setCreviser(String creviser) {
        this.creviser = creviser == null ? null : creviser.trim();
    }

    public String getCvenpuomprotocol() {
        return cvenpuomprotocol;
    }

    public void setCvenpuomprotocol(String cvenpuomprotocol) {
        this.cvenpuomprotocol = cvenpuomprotocol == null ? null : cvenpuomprotocol.trim();
    }

    public String getCchangverifier() {
        return cchangverifier;
    }

    public void setCchangverifier(String cchangverifier) {
        this.cchangverifier = cchangverifier == null ? null : cchangverifier.trim();
    }

    public Date getCchangaudittime() {
        return cchangaudittime;
    }

    public void setCchangaudittime(Date cchangaudittime) {
        this.cchangaudittime = cchangaudittime;
    }

    public Date getCchangauditdate() {
        return cchangauditdate;
    }

    public void setCchangauditdate(Date cchangauditdate) {
        this.cchangauditdate = cchangauditdate;
    }

    public Short getIbgOverflag() {
        return ibgOverflag;
    }

    public void setIbgOverflag(Short ibgOverflag) {
        this.ibgOverflag = ibgOverflag;
    }

    public String getCbgAuditor() {
        return cbgAuditor;
    }

    public void setCbgAuditor(String cbgAuditor) {
        this.cbgAuditor = cbgAuditor == null ? null : cbgAuditor.trim();
    }

    public String getCbgAudittime() {
        return cbgAudittime;
    }

    public void setCbgAudittime(String cbgAudittime) {
        this.cbgAudittime = cbgAudittime == null ? null : cbgAudittime.trim();
    }

    public Short getControlresult() {
        return controlresult;
    }

    public void setControlresult(Short controlresult) {
        this.controlresult = controlresult;
    }

    public Integer getIflowid() {
        return iflowid;
    }

    public void setIflowid(Integer iflowid) {
        this.iflowid = iflowid;
    }

    public Integer getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
    }

    public Date getDclosedate() {
        return dclosedate;
    }

    public void setDclosedate(Date dclosedate) {
        this.dclosedate = dclosedate;
    }

    public Date getDclosetime() {
        return dclosetime;
    }

    public void setDclosetime(Date dclosetime) {
        this.dclosetime = dclosetime;
    }

    public String getCcleanver() {
        return ccleanver;
    }

    public void setCcleanver(String ccleanver) {
        this.ccleanver = ccleanver == null ? null : ccleanver.trim();
    }

    public String getCcontactcode() {
        return ccontactcode;
    }

    public void setCcontactcode(String ccontactcode) {
        this.ccontactcode = ccontactcode == null ? null : ccontactcode.trim();
    }

    public String getCvenperson() {
        return cvenperson;
    }

    public void setCvenperson(String cvenperson) {
        this.cvenperson = cvenperson == null ? null : cvenperson.trim();
    }

    public String getCvenbank() {
        return cvenbank;
    }

    public void setCvenbank(String cvenbank) {
        this.cvenbank = cvenbank == null ? null : cvenbank.trim();
    }

    public String getCvenaccount() {
        return cvenaccount;
    }

    public void setCvenaccount(String cvenaccount) {
        this.cvenaccount = cvenaccount == null ? null : cvenaccount.trim();
    }

    public String getCappcode() {
        return cappcode;
    }

    public void setCappcode(String cappcode) {
        this.cappcode = cappcode == null ? null : cappcode.trim();
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

    public String getCgcroutecode() {
        return cgcroutecode;
    }

    public void setCgcroutecode(String cgcroutecode) {
        this.cgcroutecode = cgcroutecode == null ? null : cgcroutecode.trim();
    }

    public Boolean getBgctransforming() {
        return bgctransforming;
    }

    public void setBgctransforming(Boolean bgctransforming) {
        this.bgctransforming = bgctransforming;
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
        sb.append(", poid=").append(poid);
        sb.append(", cpoid=").append(cpoid);
        sb.append(", dpodate=").append(dpodate);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", cptcode=").append(cptcode);
        sb.append(", carrivalplace=").append(carrivalplace);
        sb.append(", csccode=").append(csccode);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", nflat=").append(nflat);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", cpaycode=").append(cpaycode);
        sb.append(", icost=").append(icost);
        sb.append(", ibargain=").append(ibargain);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", cstate=").append(cstate);
        sb.append(", cperiod=").append(cperiod);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", cverifier=").append(cverifier);
        sb.append(", ccloser=").append(ccloser);
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
        sb.append(", ivtid=").append(ivtid);
        sb.append(", cchanger=").append(cchanger);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", clocker=").append(clocker);
        sb.append(", idiscounttaxtype=").append(idiscounttaxtype);
        sb.append(", iverifystateex=").append(iverifystateex);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", cmaketime=").append(cmaketime);
        sb.append(", cmodifytime=").append(cmodifytime);
        sb.append(", caudittime=").append(caudittime);
        sb.append(", cauditdate=").append(cauditdate);
        sb.append(", cmodifydate=").append(cmodifydate);
        sb.append(", creviser=").append(creviser);
        sb.append(", cvenpuomprotocol=").append(cvenpuomprotocol);
        sb.append(", cchangverifier=").append(cchangverifier);
        sb.append(", cchangaudittime=").append(cchangaudittime);
        sb.append(", cchangauditdate=").append(cchangauditdate);
        sb.append(", ibgOverflag=").append(ibgOverflag);
        sb.append(", cbgAuditor=").append(cbgAuditor);
        sb.append(", cbgAudittime=").append(cbgAudittime);
        sb.append(", controlresult=").append(controlresult);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", dclosedate=").append(dclosedate);
        sb.append(", dclosetime=").append(dclosetime);
        sb.append(", ccleanver=").append(ccleanver);
        sb.append(", ccontactcode=").append(ccontactcode);
        sb.append(", cvenperson=").append(cvenperson);
        sb.append(", cvenbank=").append(cvenbank);
        sb.append(", cvenaccount=").append(cvenaccount);
        sb.append(", cappcode=").append(cappcode);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", cgcroutecode=").append(cgcroutecode);
        sb.append(", bgctransforming=").append(bgctransforming);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}