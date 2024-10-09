package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;

public class Rdrecord10 implements Serializable {
    private Long id;

    private Byte brdflag;

    private String cvouchtype;

    private String cbustype;

    private String csource;

    private String cbuscode;

    private String cwhcode;

    private Date ddate;

    private String ccode;

    private String crdcode;

    private String cdepcode;

    private String cpersoncode;

    private String cptcode;

    private String cstcode;

    private String ccuscode;

    private String cvencode;

    private String cordercode;

    private String carvcode;

    private Long cbillcode;

    private Long cdlcode;

    private String cprobatch;

    private String chandler;

    private String cmemo;

    private Boolean btransflag;

    private String caccounter;

    private String cmaker;

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

    private String dkeepdate;

    private Date dveridate;

    private Boolean bpufirst;

    private Boolean biafirst;

    private Double imquantity;

    private Date darvdate;

    private String cchkcode;

    private Date dchkdate;

    private String cchkperson;

    private Integer vtId;

    private Boolean bisstqc;

    private String cdefine11;

    private String cdefine12;

    private String cdefine13;

    private String cdefine14;

    private Integer cdefine15;

    private Double cdefine16;

    private String cmpocode;

    private String gspcheck;

    private Long ipurorderid;

    private Long iproorderid;

    private Double iexchrate;

    private String cexchName;

    private Boolean bomfirst;

    private Boolean bfrompreyear;

    private Boolean bislsquery;

    private Short biscomplement;

    private Byte idiscounttaxtype;

    private Integer ireturncount;

    private Integer iverifystate;

    private Integer iswfcontrolled;

    private String cmodifyperson;

    private Date dmodifydate;

    private Date dnmaketime;

    private Date dnmodifytime;

    private Date dnverifytime;

    private Integer bredvouch;

    private Integer iflowid;

    private String cpzid;

    private String csourcels;

    private String csourcecodels;

    private Integer iprintcount;

    private String csysbarcode;

    private String ccurrentauditor;

    private String outid;

    private String cchecksignflag;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getBrdflag() {
        return brdflag;
    }

    public void setBrdflag(Byte brdflag) {
        this.brdflag = brdflag;
    }

    public String getCvouchtype() {
        return cvouchtype;
    }

    public void setCvouchtype(String cvouchtype) {
        this.cvouchtype = cvouchtype == null ? null : cvouchtype.trim();
    }

    public String getCbustype() {
        return cbustype;
    }

    public void setCbustype(String cbustype) {
        this.cbustype = cbustype == null ? null : cbustype.trim();
    }

    public String getCsource() {
        return csource;
    }

    public void setCsource(String csource) {
        this.csource = csource == null ? null : csource.trim();
    }

    public String getCbuscode() {
        return cbuscode;
    }

    public void setCbuscode(String cbuscode) {
        this.cbuscode = cbuscode == null ? null : cbuscode.trim();
    }

    public String getCwhcode() {
        return cwhcode;
    }

    public void setCwhcode(String cwhcode) {
        this.cwhcode = cwhcode == null ? null : cwhcode.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode == null ? null : ccode.trim();
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

    public String getCptcode() {
        return cptcode;
    }

    public void setCptcode(String cptcode) {
        this.cptcode = cptcode == null ? null : cptcode.trim();
    }

    public String getCstcode() {
        return cstcode;
    }

    public void setCstcode(String cstcode) {
        this.cstcode = cstcode == null ? null : cstcode.trim();
    }

    public String getCcuscode() {
        return ccuscode;
    }

    public void setCcuscode(String ccuscode) {
        this.ccuscode = ccuscode == null ? null : ccuscode.trim();
    }

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
    }

    public String getCordercode() {
        return cordercode;
    }

    public void setCordercode(String cordercode) {
        this.cordercode = cordercode == null ? null : cordercode.trim();
    }

    public String getCarvcode() {
        return carvcode;
    }

    public void setCarvcode(String carvcode) {
        this.carvcode = carvcode == null ? null : carvcode.trim();
    }

    public Long getCbillcode() {
        return cbillcode;
    }

    public void setCbillcode(Long cbillcode) {
        this.cbillcode = cbillcode;
    }

    public Long getCdlcode() {
        return cdlcode;
    }

    public void setCdlcode(Long cdlcode) {
        this.cdlcode = cdlcode;
    }

    public String getCprobatch() {
        return cprobatch;
    }

    public void setCprobatch(String cprobatch) {
        this.cprobatch = cprobatch == null ? null : cprobatch.trim();
    }

    public String getChandler() {
        return chandler;
    }

    public void setChandler(String chandler) {
        this.chandler = chandler == null ? null : chandler.trim();
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Boolean getBtransflag() {
        return btransflag;
    }

    public void setBtransflag(Boolean btransflag) {
        this.btransflag = btransflag;
    }

    public String getCaccounter() {
        return caccounter;
    }

    public void setCaccounter(String caccounter) {
        this.caccounter = caccounter == null ? null : caccounter.trim();
    }

    public String getCmaker() {
        return cmaker;
    }

    public void setCmaker(String cmaker) {
        this.cmaker = cmaker == null ? null : cmaker.trim();
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

    public String getDkeepdate() {
        return dkeepdate;
    }

    public void setDkeepdate(String dkeepdate) {
        this.dkeepdate = dkeepdate == null ? null : dkeepdate.trim();
    }

    public Date getDveridate() {
        return dveridate;
    }

    public void setDveridate(Date dveridate) {
        this.dveridate = dveridate;
    }

    public Boolean getBpufirst() {
        return bpufirst;
    }

    public void setBpufirst(Boolean bpufirst) {
        this.bpufirst = bpufirst;
    }

    public Boolean getBiafirst() {
        return biafirst;
    }

    public void setBiafirst(Boolean biafirst) {
        this.biafirst = biafirst;
    }

    public Double getImquantity() {
        return imquantity;
    }

    public void setImquantity(Double imquantity) {
        this.imquantity = imquantity;
    }

    public Date getDarvdate() {
        return darvdate;
    }

    public void setDarvdate(Date darvdate) {
        this.darvdate = darvdate;
    }

    public String getCchkcode() {
        return cchkcode;
    }

    public void setCchkcode(String cchkcode) {
        this.cchkcode = cchkcode == null ? null : cchkcode.trim();
    }

    public Date getDchkdate() {
        return dchkdate;
    }

    public void setDchkdate(Date dchkdate) {
        this.dchkdate = dchkdate;
    }

    public String getCchkperson() {
        return cchkperson;
    }

    public void setCchkperson(String cchkperson) {
        this.cchkperson = cchkperson == null ? null : cchkperson.trim();
    }

    public Integer getVtId() {
        return vtId;
    }

    public void setVtId(Integer vtId) {
        this.vtId = vtId;
    }

    public Boolean getBisstqc() {
        return bisstqc;
    }

    public void setBisstqc(Boolean bisstqc) {
        this.bisstqc = bisstqc;
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

    public String getCmpocode() {
        return cmpocode;
    }

    public void setCmpocode(String cmpocode) {
        this.cmpocode = cmpocode == null ? null : cmpocode.trim();
    }

    public String getGspcheck() {
        return gspcheck;
    }

    public void setGspcheck(String gspcheck) {
        this.gspcheck = gspcheck == null ? null : gspcheck.trim();
    }

    public Long getIpurorderid() {
        return ipurorderid;
    }

    public void setIpurorderid(Long ipurorderid) {
        this.ipurorderid = ipurorderid;
    }

    public Long getIproorderid() {
        return iproorderid;
    }

    public void setIproorderid(Long iproorderid) {
        this.iproorderid = iproorderid;
    }

    public Double getIexchrate() {
        return iexchrate;
    }

    public void setIexchrate(Double iexchrate) {
        this.iexchrate = iexchrate;
    }

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
    }

    public Boolean getBomfirst() {
        return bomfirst;
    }

    public void setBomfirst(Boolean bomfirst) {
        this.bomfirst = bomfirst;
    }

    public Boolean getBfrompreyear() {
        return bfrompreyear;
    }

    public void setBfrompreyear(Boolean bfrompreyear) {
        this.bfrompreyear = bfrompreyear;
    }

    public Boolean getBislsquery() {
        return bislsquery;
    }

    public void setBislsquery(Boolean bislsquery) {
        this.bislsquery = bislsquery;
    }

    public Short getBiscomplement() {
        return biscomplement;
    }

    public void setBiscomplement(Short biscomplement) {
        this.biscomplement = biscomplement;
    }

    public Byte getIdiscounttaxtype() {
        return idiscounttaxtype;
    }

    public void setIdiscounttaxtype(Byte idiscounttaxtype) {
        this.idiscounttaxtype = idiscounttaxtype;
    }

    public Integer getIreturncount() {
        return ireturncount;
    }

    public void setIreturncount(Integer ireturncount) {
        this.ireturncount = ireturncount;
    }

    public Integer getIverifystate() {
        return iverifystate;
    }

    public void setIverifystate(Integer iverifystate) {
        this.iverifystate = iverifystate;
    }

    public Integer getIswfcontrolled() {
        return iswfcontrolled;
    }

    public void setIswfcontrolled(Integer iswfcontrolled) {
        this.iswfcontrolled = iswfcontrolled;
    }

    public String getCmodifyperson() {
        return cmodifyperson;
    }

    public void setCmodifyperson(String cmodifyperson) {
        this.cmodifyperson = cmodifyperson == null ? null : cmodifyperson.trim();
    }

    public Date getDmodifydate() {
        return dmodifydate;
    }

    public void setDmodifydate(Date dmodifydate) {
        this.dmodifydate = dmodifydate;
    }

    public Date getDnmaketime() {
        return dnmaketime;
    }

    public void setDnmaketime(Date dnmaketime) {
        this.dnmaketime = dnmaketime;
    }

    public Date getDnmodifytime() {
        return dnmodifytime;
    }

    public void setDnmodifytime(Date dnmodifytime) {
        this.dnmodifytime = dnmodifytime;
    }

    public Date getDnverifytime() {
        return dnverifytime;
    }

    public void setDnverifytime(Date dnverifytime) {
        this.dnverifytime = dnverifytime;
    }

    public Integer getBredvouch() {
        return bredvouch;
    }

    public void setBredvouch(Integer bredvouch) {
        this.bredvouch = bredvouch;
    }

    public Integer getIflowid() {
        return iflowid;
    }

    public void setIflowid(Integer iflowid) {
        this.iflowid = iflowid;
    }

    public String getCpzid() {
        return cpzid;
    }

    public void setCpzid(String cpzid) {
        this.cpzid = cpzid == null ? null : cpzid.trim();
    }

    public String getCsourcels() {
        return csourcels;
    }

    public void setCsourcels(String csourcels) {
        this.csourcels = csourcels == null ? null : csourcels.trim();
    }

    public String getCsourcecodels() {
        return csourcecodels;
    }

    public void setCsourcecodels(String csourcecodels) {
        this.csourcecodels = csourcecodels == null ? null : csourcecodels.trim();
    }

    public Integer getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
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

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getCchecksignflag() {
        return cchecksignflag;
    }

    public void setCchecksignflag(String cchecksignflag) {
        this.cchecksignflag = cchecksignflag == null ? null : cchecksignflag.trim();
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
        sb.append(", brdflag=").append(brdflag);
        sb.append(", cvouchtype=").append(cvouchtype);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", csource=").append(csource);
        sb.append(", cbuscode=").append(cbuscode);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", ddate=").append(ddate);
        sb.append(", ccode=").append(ccode);
        sb.append(", crdcode=").append(crdcode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", cptcode=").append(cptcode);
        sb.append(", cstcode=").append(cstcode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", cordercode=").append(cordercode);
        sb.append(", carvcode=").append(carvcode);
        sb.append(", cbillcode=").append(cbillcode);
        sb.append(", cdlcode=").append(cdlcode);
        sb.append(", cprobatch=").append(cprobatch);
        sb.append(", chandler=").append(chandler);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", btransflag=").append(btransflag);
        sb.append(", caccounter=").append(caccounter);
        sb.append(", cmaker=").append(cmaker);
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
        sb.append(", dkeepdate=").append(dkeepdate);
        sb.append(", dveridate=").append(dveridate);
        sb.append(", bpufirst=").append(bpufirst);
        sb.append(", biafirst=").append(biafirst);
        sb.append(", imquantity=").append(imquantity);
        sb.append(", darvdate=").append(darvdate);
        sb.append(", cchkcode=").append(cchkcode);
        sb.append(", dchkdate=").append(dchkdate);
        sb.append(", cchkperson=").append(cchkperson);
        sb.append(", vtId=").append(vtId);
        sb.append(", bisstqc=").append(bisstqc);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", cmpocode=").append(cmpocode);
        sb.append(", gspcheck=").append(gspcheck);
        sb.append(", ipurorderid=").append(ipurorderid);
        sb.append(", iproorderid=").append(iproorderid);
        sb.append(", iexchrate=").append(iexchrate);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", bomfirst=").append(bomfirst);
        sb.append(", bfrompreyear=").append(bfrompreyear);
        sb.append(", bislsquery=").append(bislsquery);
        sb.append(", biscomplement=").append(biscomplement);
        sb.append(", idiscounttaxtype=").append(idiscounttaxtype);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", iverifystate=").append(iverifystate);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", cmodifyperson=").append(cmodifyperson);
        sb.append(", dmodifydate=").append(dmodifydate);
        sb.append(", dnmaketime=").append(dnmaketime);
        sb.append(", dnmodifytime=").append(dnmodifytime);
        sb.append(", dnverifytime=").append(dnverifytime);
        sb.append(", bredvouch=").append(bredvouch);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", cpzid=").append(cpzid);
        sb.append(", csourcels=").append(csourcels);
        sb.append(", csourcecodels=").append(csourcecodels);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", outid=").append(outid);
        sb.append(", cchecksignflag=").append(cchecksignflag);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}