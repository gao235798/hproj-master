package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;

public class Vendor implements Serializable {
    private String cvencode;

    private String cvenname;

    private String cvenabbname;

    private String cvccode;

    private String cdccode;

    private String ctrade;

    private String cvenaddress;

    private String cvenpostcode;

    private String cvenregcode;

    private String cvenbank;

    private String cvenaccount;

    private Date dvendevdate;

    private String cvenlperson;

    private String cvenphone;

    private String cvenfax;

    private String cvenemail;

    private String cvenperson;

    private String cvenbp;

    private String cvenhand;

    private String cvenpperson;

    private Double ivendisrate;

    private String ivencregrade;

    private Double ivencreline;

    private Integer ivencredate;

    private String cvenpaycond;

    private String cveniaddress;

    private String cvenitype;

    private String cvenheadcode;

    private String cvenwhcode;

    private String cvendepart;

    private Double iapmoney;

    private Date dlastdate;

    private Double ilastmoney;

    private Date dlrdate;

    private Double ilrmoney;

    private Date denddate;

    private Integer ifrequency;

    private Boolean bventax;

    private String cvendefine1;

    private String cvendefine2;

    private String cvendefine3;

    private String ccreateperson;

    private String cmodifyperson;

    private Date dmodifydate;

    private String crelcustomer;

    private Integer iid;

    private String cbarcode;

    private String cvendefine4;

    private String cvendefine5;

    private String cvendefine6;

    private String cvendefine7;

    private String cvendefine8;

    private String cvendefine9;

    private String cvendefine10;

    private Integer cvendefine11;

    private Integer cvendefine12;

    private Double cvendefine13;

    private Double cvendefine14;

    private Date cvendefine15;

    private Date cvendefine16;

    private Double fregistfund;

    private Integer iemployeenum;

    private Short igradeabc;

    private String cmemo;

    private Boolean blicencedate;

    private Date dlicencesdate;

    private Date dlicenceedate;

    private Integer ilicenceadays;

    private Boolean bbusinessdate;

    private Date dbusinesssdate;

    private Date dbusinessedate;

    private Integer ibusinessadays;

    private Boolean bproxydate;

    private Date dproxysdate;

    private Date dproxyedate;

    private Integer iproxyadays;

    private Boolean bpassgmp;

    private Boolean bvencargo;

    private Boolean bproxyforeign;

    private Boolean bvenservice;

    private String cventradeccode;

    private String cvenbankcode;

    private String cvenexchName;

    private Short ivengsptype;

    private Short ivengspauth;

    private String cvengspauthno;

    private String cvenbusinessno;

    private String cvenlicenceno;

    private Boolean bvenoverseas;

    private Boolean bvenaccperiodmng;

    private String cvenpuomprotocol;

    private String cvenotherprotocol;

    private String cvencountrycode;

    private String cvenenname;

    private String cvenenaddr1;

    private String cvenenaddr2;

    private String cvenenaddr3;

    private String cvenenaddr4;

    private String cvenportcode;

    private String cvenprimaryven;

    private Double fvencommisionrate;

    private Double fveninsuerate;

    private Boolean bvenhomebranch;

    private String cvenbranchaddr;

    private String cvenbranchphone;

    private String cvenbranchperson;

    private String cvensscode;

    private String comwhcode;

    private String cvencmprotocol;

    private String cvenimprotocol;

    private Double iventaxrate;

    private Date dvencreatedatetime;

    private String cvenmnemcode;

    private String cvencontactcode;

    private String cvenbankall;

    private Boolean bisvenattachfile;

    private String clicencerange;

    private String cbusinessrange;

    private String cvengsprange;

    private Date dvengspedate;

    private Date dvengspsdate;

    private Integer ivengspadays;

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getTstatus() {
        return tstatus;
    }

    public void setTstatus(String tstatus) {
        this.tstatus = tstatus;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    private String ttype;

    private String tstatus;

    private Integer iId;

    private byte[] pubufts;

    private static final long serialVersionUID = 1L;

    public String getCvencode() {
        return cvencode;
    }

    public void setCvencode(String cvencode) {
        this.cvencode = cvencode == null ? null : cvencode.trim();
    }

    public String getCvenname() {
        return cvenname;
    }

    public void setCvenname(String cvenname) {
        this.cvenname = cvenname == null ? null : cvenname.trim();
    }

    public String getCvenabbname() {
        return cvenabbname;
    }

    public void setCvenabbname(String cvenabbname) {
        this.cvenabbname = cvenabbname == null ? null : cvenabbname.trim();
    }

    public String getCvccode() {
        return cvccode;
    }

    public void setCvccode(String cvccode) {
        this.cvccode = cvccode == null ? null : cvccode.trim();
    }

    public String getCdccode() {
        return cdccode;
    }

    public void setCdccode(String cdccode) {
        this.cdccode = cdccode == null ? null : cdccode.trim();
    }

    public String getCtrade() {
        return ctrade;
    }

    public void setCtrade(String ctrade) {
        this.ctrade = ctrade == null ? null : ctrade.trim();
    }

    public String getCvenaddress() {
        return cvenaddress;
    }

    public void setCvenaddress(String cvenaddress) {
        this.cvenaddress = cvenaddress == null ? null : cvenaddress.trim();
    }

    public String getCvenpostcode() {
        return cvenpostcode;
    }

    public void setCvenpostcode(String cvenpostcode) {
        this.cvenpostcode = cvenpostcode == null ? null : cvenpostcode.trim();
    }

    public String getCvenregcode() {
        return cvenregcode;
    }

    public void setCvenregcode(String cvenregcode) {
        this.cvenregcode = cvenregcode == null ? null : cvenregcode.trim();
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

    public Date getDvendevdate() {
        return dvendevdate;
    }

    public void setDvendevdate(Date dvendevdate) {
        this.dvendevdate = dvendevdate;
    }

    public String getCvenlperson() {
        return cvenlperson;
    }

    public void setCvenlperson(String cvenlperson) {
        this.cvenlperson = cvenlperson == null ? null : cvenlperson.trim();
    }

    public String getCvenphone() {
        return cvenphone;
    }

    public void setCvenphone(String cvenphone) {
        this.cvenphone = cvenphone == null ? null : cvenphone.trim();
    }

    public String getCvenfax() {
        return cvenfax;
    }

    public void setCvenfax(String cvenfax) {
        this.cvenfax = cvenfax == null ? null : cvenfax.trim();
    }

    public String getCvenemail() {
        return cvenemail;
    }

    public void setCvenemail(String cvenemail) {
        this.cvenemail = cvenemail == null ? null : cvenemail.trim();
    }

    public String getCvenperson() {
        return cvenperson;
    }

    public void setCvenperson(String cvenperson) {
        this.cvenperson = cvenperson == null ? null : cvenperson.trim();
    }

    public String getCvenbp() {
        return cvenbp;
    }

    public void setCvenbp(String cvenbp) {
        this.cvenbp = cvenbp == null ? null : cvenbp.trim();
    }

    public String getCvenhand() {
        return cvenhand;
    }

    public void setCvenhand(String cvenhand) {
        this.cvenhand = cvenhand == null ? null : cvenhand.trim();
    }

    public String getCvenpperson() {
        return cvenpperson;
    }

    public void setCvenpperson(String cvenpperson) {
        this.cvenpperson = cvenpperson == null ? null : cvenpperson.trim();
    }

    public Double getIvendisrate() {
        return ivendisrate;
    }

    public void setIvendisrate(Double ivendisrate) {
        this.ivendisrate = ivendisrate;
    }

    public String getIvencregrade() {
        return ivencregrade;
    }

    public void setIvencregrade(String ivencregrade) {
        this.ivencregrade = ivencregrade == null ? null : ivencregrade.trim();
    }

    public Double getIvencreline() {
        return ivencreline;
    }

    public void setIvencreline(Double ivencreline) {
        this.ivencreline = ivencreline;
    }

    public Integer getIvencredate() {
        return ivencredate;
    }

    public void setIvencredate(Integer ivencredate) {
        this.ivencredate = ivencredate;
    }

    public String getCvenpaycond() {
        return cvenpaycond;
    }

    public void setCvenpaycond(String cvenpaycond) {
        this.cvenpaycond = cvenpaycond == null ? null : cvenpaycond.trim();
    }

    public String getCveniaddress() {
        return cveniaddress;
    }

    public void setCveniaddress(String cveniaddress) {
        this.cveniaddress = cveniaddress == null ? null : cveniaddress.trim();
    }

    public String getCvenitype() {
        return cvenitype;
    }

    public void setCvenitype(String cvenitype) {
        this.cvenitype = cvenitype == null ? null : cvenitype.trim();
    }

    public String getCvenheadcode() {
        return cvenheadcode;
    }

    public void setCvenheadcode(String cvenheadcode) {
        this.cvenheadcode = cvenheadcode == null ? null : cvenheadcode.trim();
    }

    public String getCvenwhcode() {
        return cvenwhcode;
    }

    public void setCvenwhcode(String cvenwhcode) {
        this.cvenwhcode = cvenwhcode == null ? null : cvenwhcode.trim();
    }

    public String getCvendepart() {
        return cvendepart;
    }

    public void setCvendepart(String cvendepart) {
        this.cvendepart = cvendepart == null ? null : cvendepart.trim();
    }

    public Double getIapmoney() {
        return iapmoney;
    }

    public void setIapmoney(Double iapmoney) {
        this.iapmoney = iapmoney;
    }

    public Date getDlastdate() {
        return dlastdate;
    }

    public void setDlastdate(Date dlastdate) {
        this.dlastdate = dlastdate;
    }

    public Double getIlastmoney() {
        return ilastmoney;
    }

    public void setIlastmoney(Double ilastmoney) {
        this.ilastmoney = ilastmoney;
    }

    public Date getDlrdate() {
        return dlrdate;
    }

    public void setDlrdate(Date dlrdate) {
        this.dlrdate = dlrdate;
    }

    public Double getIlrmoney() {
        return ilrmoney;
    }

    public void setIlrmoney(Double ilrmoney) {
        this.ilrmoney = ilrmoney;
    }

    public Date getDenddate() {
        return denddate;
    }

    public void setDenddate(Date denddate) {
        this.denddate = denddate;
    }

    public Integer getIfrequency() {
        return ifrequency;
    }

    public void setIfrequency(Integer ifrequency) {
        this.ifrequency = ifrequency;
    }

    public Boolean getBventax() {
        return bventax;
    }

    public void setBventax(Boolean bventax) {
        this.bventax = bventax;
    }

    public String getCvendefine1() {
        return cvendefine1;
    }

    public void setCvendefine1(String cvendefine1) {
        this.cvendefine1 = cvendefine1 == null ? null : cvendefine1.trim();
    }

    public String getCvendefine2() {
        return cvendefine2;
    }

    public void setCvendefine2(String cvendefine2) {
        this.cvendefine2 = cvendefine2 == null ? null : cvendefine2.trim();
    }

    public String getCvendefine3() {
        return cvendefine3;
    }

    public void setCvendefine3(String cvendefine3) {
        this.cvendefine3 = cvendefine3 == null ? null : cvendefine3.trim();
    }

    public String getCcreateperson() {
        return ccreateperson;
    }

    public void setCcreateperson(String ccreateperson) {
        this.ccreateperson = ccreateperson == null ? null : ccreateperson.trim();
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

    public String getCrelcustomer() {
        return crelcustomer;
    }

    public void setCrelcustomer(String crelcustomer) {
        this.crelcustomer = crelcustomer == null ? null : crelcustomer.trim();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getCbarcode() {
        return cbarcode;
    }

    public void setCbarcode(String cbarcode) {
        this.cbarcode = cbarcode == null ? null : cbarcode.trim();
    }

    public String getCvendefine4() {
        return cvendefine4;
    }

    public void setCvendefine4(String cvendefine4) {
        this.cvendefine4 = cvendefine4 == null ? null : cvendefine4.trim();
    }

    public String getCvendefine5() {
        return cvendefine5;
    }

    public void setCvendefine5(String cvendefine5) {
        this.cvendefine5 = cvendefine5 == null ? null : cvendefine5.trim();
    }

    public String getCvendefine6() {
        return cvendefine6;
    }

    public void setCvendefine6(String cvendefine6) {
        this.cvendefine6 = cvendefine6 == null ? null : cvendefine6.trim();
    }

    public String getCvendefine7() {
        return cvendefine7;
    }

    public void setCvendefine7(String cvendefine7) {
        this.cvendefine7 = cvendefine7 == null ? null : cvendefine7.trim();
    }

    public String getCvendefine8() {
        return cvendefine8;
    }

    public void setCvendefine8(String cvendefine8) {
        this.cvendefine8 = cvendefine8 == null ? null : cvendefine8.trim();
    }

    public String getCvendefine9() {
        return cvendefine9;
    }

    public void setCvendefine9(String cvendefine9) {
        this.cvendefine9 = cvendefine9 == null ? null : cvendefine9.trim();
    }

    public String getCvendefine10() {
        return cvendefine10;
    }

    public void setCvendefine10(String cvendefine10) {
        this.cvendefine10 = cvendefine10 == null ? null : cvendefine10.trim();
    }

    public Integer getCvendefine11() {
        return cvendefine11;
    }

    public void setCvendefine11(Integer cvendefine11) {
        this.cvendefine11 = cvendefine11;
    }

    public Integer getCvendefine12() {
        return cvendefine12;
    }

    public void setCvendefine12(Integer cvendefine12) {
        this.cvendefine12 = cvendefine12;
    }

    public Double getCvendefine13() {
        return cvendefine13;
    }

    public void setCvendefine13(Double cvendefine13) {
        this.cvendefine13 = cvendefine13;
    }

    public Double getCvendefine14() {
        return cvendefine14;
    }

    public void setCvendefine14(Double cvendefine14) {
        this.cvendefine14 = cvendefine14;
    }

    public Date getCvendefine15() {
        return cvendefine15;
    }

    public void setCvendefine15(Date cvendefine15) {
        this.cvendefine15 = cvendefine15;
    }

    public Date getCvendefine16() {
        return cvendefine16;
    }

    public void setCvendefine16(Date cvendefine16) {
        this.cvendefine16 = cvendefine16;
    }

    public Double getFregistfund() {
        return fregistfund;
    }

    public void setFregistfund(Double fregistfund) {
        this.fregistfund = fregistfund;
    }

    public Integer getIemployeenum() {
        return iemployeenum;
    }

    public void setIemployeenum(Integer iemployeenum) {
        this.iemployeenum = iemployeenum;
    }

    public Short getIgradeabc() {
        return igradeabc;
    }

    public void setIgradeabc(Short igradeabc) {
        this.igradeabc = igradeabc;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public Boolean getBlicencedate() {
        return blicencedate;
    }

    public void setBlicencedate(Boolean blicencedate) {
        this.blicencedate = blicencedate;
    }

    public Date getDlicencesdate() {
        return dlicencesdate;
    }

    public void setDlicencesdate(Date dlicencesdate) {
        this.dlicencesdate = dlicencesdate;
    }

    public Date getDlicenceedate() {
        return dlicenceedate;
    }

    public void setDlicenceedate(Date dlicenceedate) {
        this.dlicenceedate = dlicenceedate;
    }

    public Integer getIlicenceadays() {
        return ilicenceadays;
    }

    public void setIlicenceadays(Integer ilicenceadays) {
        this.ilicenceadays = ilicenceadays;
    }

    public Boolean getBbusinessdate() {
        return bbusinessdate;
    }

    public void setBbusinessdate(Boolean bbusinessdate) {
        this.bbusinessdate = bbusinessdate;
    }

    public Date getDbusinesssdate() {
        return dbusinesssdate;
    }

    public void setDbusinesssdate(Date dbusinesssdate) {
        this.dbusinesssdate = dbusinesssdate;
    }

    public Date getDbusinessedate() {
        return dbusinessedate;
    }

    public void setDbusinessedate(Date dbusinessedate) {
        this.dbusinessedate = dbusinessedate;
    }

    public Integer getIbusinessadays() {
        return ibusinessadays;
    }

    public void setIbusinessadays(Integer ibusinessadays) {
        this.ibusinessadays = ibusinessadays;
    }

    public Boolean getBproxydate() {
        return bproxydate;
    }

    public void setBproxydate(Boolean bproxydate) {
        this.bproxydate = bproxydate;
    }

    public Date getDproxysdate() {
        return dproxysdate;
    }

    public void setDproxysdate(Date dproxysdate) {
        this.dproxysdate = dproxysdate;
    }

    public Date getDproxyedate() {
        return dproxyedate;
    }

    public void setDproxyedate(Date dproxyedate) {
        this.dproxyedate = dproxyedate;
    }

    public Integer getIproxyadays() {
        return iproxyadays;
    }

    public void setIproxyadays(Integer iproxyadays) {
        this.iproxyadays = iproxyadays;
    }

    public Boolean getBpassgmp() {
        return bpassgmp;
    }

    public void setBpassgmp(Boolean bpassgmp) {
        this.bpassgmp = bpassgmp;
    }

    public Boolean getBvencargo() {
        return bvencargo;
    }

    public void setBvencargo(Boolean bvencargo) {
        this.bvencargo = bvencargo;
    }

    public Boolean getBproxyforeign() {
        return bproxyforeign;
    }

    public void setBproxyforeign(Boolean bproxyforeign) {
        this.bproxyforeign = bproxyforeign;
    }

    public Boolean getBvenservice() {
        return bvenservice;
    }

    public void setBvenservice(Boolean bvenservice) {
        this.bvenservice = bvenservice;
    }

    public String getCventradeccode() {
        return cventradeccode;
    }

    public void setCventradeccode(String cventradeccode) {
        this.cventradeccode = cventradeccode == null ? null : cventradeccode.trim();
    }

    public String getCvenbankcode() {
        return cvenbankcode;
    }

    public void setCvenbankcode(String cvenbankcode) {
        this.cvenbankcode = cvenbankcode == null ? null : cvenbankcode.trim();
    }

    public String getCvenexchName() {
        return cvenexchName;
    }

    public void setCvenexchName(String cvenexchName) {
        this.cvenexchName = cvenexchName == null ? null : cvenexchName.trim();
    }

    public Short getIvengsptype() {
        return ivengsptype;
    }

    public void setIvengsptype(Short ivengsptype) {
        this.ivengsptype = ivengsptype;
    }

    public Short getIvengspauth() {
        return ivengspauth;
    }

    public void setIvengspauth(Short ivengspauth) {
        this.ivengspauth = ivengspauth;
    }

    public String getCvengspauthno() {
        return cvengspauthno;
    }

    public void setCvengspauthno(String cvengspauthno) {
        this.cvengspauthno = cvengspauthno == null ? null : cvengspauthno.trim();
    }

    public String getCvenbusinessno() {
        return cvenbusinessno;
    }

    public void setCvenbusinessno(String cvenbusinessno) {
        this.cvenbusinessno = cvenbusinessno == null ? null : cvenbusinessno.trim();
    }

    public String getCvenlicenceno() {
        return cvenlicenceno;
    }

    public void setCvenlicenceno(String cvenlicenceno) {
        this.cvenlicenceno = cvenlicenceno == null ? null : cvenlicenceno.trim();
    }

    public Boolean getBvenoverseas() {
        return bvenoverseas;
    }

    public void setBvenoverseas(Boolean bvenoverseas) {
        this.bvenoverseas = bvenoverseas;
    }

    public Boolean getBvenaccperiodmng() {
        return bvenaccperiodmng;
    }

    public void setBvenaccperiodmng(Boolean bvenaccperiodmng) {
        this.bvenaccperiodmng = bvenaccperiodmng;
    }

    public String getCvenpuomprotocol() {
        return cvenpuomprotocol;
    }

    public void setCvenpuomprotocol(String cvenpuomprotocol) {
        this.cvenpuomprotocol = cvenpuomprotocol == null ? null : cvenpuomprotocol.trim();
    }

    public String getCvenotherprotocol() {
        return cvenotherprotocol;
    }

    public void setCvenotherprotocol(String cvenotherprotocol) {
        this.cvenotherprotocol = cvenotherprotocol == null ? null : cvenotherprotocol.trim();
    }

    public String getCvencountrycode() {
        return cvencountrycode;
    }

    public void setCvencountrycode(String cvencountrycode) {
        this.cvencountrycode = cvencountrycode == null ? null : cvencountrycode.trim();
    }

    public String getCvenenname() {
        return cvenenname;
    }

    public void setCvenenname(String cvenenname) {
        this.cvenenname = cvenenname == null ? null : cvenenname.trim();
    }

    public String getCvenenaddr1() {
        return cvenenaddr1;
    }

    public void setCvenenaddr1(String cvenenaddr1) {
        this.cvenenaddr1 = cvenenaddr1 == null ? null : cvenenaddr1.trim();
    }

    public String getCvenenaddr2() {
        return cvenenaddr2;
    }

    public void setCvenenaddr2(String cvenenaddr2) {
        this.cvenenaddr2 = cvenenaddr2 == null ? null : cvenenaddr2.trim();
    }

    public String getCvenenaddr3() {
        return cvenenaddr3;
    }

    public void setCvenenaddr3(String cvenenaddr3) {
        this.cvenenaddr3 = cvenenaddr3 == null ? null : cvenenaddr3.trim();
    }

    public String getCvenenaddr4() {
        return cvenenaddr4;
    }

    public void setCvenenaddr4(String cvenenaddr4) {
        this.cvenenaddr4 = cvenenaddr4 == null ? null : cvenenaddr4.trim();
    }

    public String getCvenportcode() {
        return cvenportcode;
    }

    public void setCvenportcode(String cvenportcode) {
        this.cvenportcode = cvenportcode == null ? null : cvenportcode.trim();
    }

    public String getCvenprimaryven() {
        return cvenprimaryven;
    }

    public void setCvenprimaryven(String cvenprimaryven) {
        this.cvenprimaryven = cvenprimaryven == null ? null : cvenprimaryven.trim();
    }

    public Double getFvencommisionrate() {
        return fvencommisionrate;
    }

    public void setFvencommisionrate(Double fvencommisionrate) {
        this.fvencommisionrate = fvencommisionrate;
    }

    public Double getFveninsuerate() {
        return fveninsuerate;
    }

    public void setFveninsuerate(Double fveninsuerate) {
        this.fveninsuerate = fveninsuerate;
    }

    public Boolean getBvenhomebranch() {
        return bvenhomebranch;
    }

    public void setBvenhomebranch(Boolean bvenhomebranch) {
        this.bvenhomebranch = bvenhomebranch;
    }

    public String getCvenbranchaddr() {
        return cvenbranchaddr;
    }

    public void setCvenbranchaddr(String cvenbranchaddr) {
        this.cvenbranchaddr = cvenbranchaddr == null ? null : cvenbranchaddr.trim();
    }

    public String getCvenbranchphone() {
        return cvenbranchphone;
    }

    public void setCvenbranchphone(String cvenbranchphone) {
        this.cvenbranchphone = cvenbranchphone == null ? null : cvenbranchphone.trim();
    }

    public String getCvenbranchperson() {
        return cvenbranchperson;
    }

    public void setCvenbranchperson(String cvenbranchperson) {
        this.cvenbranchperson = cvenbranchperson == null ? null : cvenbranchperson.trim();
    }

    public String getCvensscode() {
        return cvensscode;
    }

    public void setCvensscode(String cvensscode) {
        this.cvensscode = cvensscode == null ? null : cvensscode.trim();
    }

    public String getComwhcode() {
        return comwhcode;
    }

    public void setComwhcode(String comwhcode) {
        this.comwhcode = comwhcode == null ? null : comwhcode.trim();
    }

    public String getCvencmprotocol() {
        return cvencmprotocol;
    }

    public void setCvencmprotocol(String cvencmprotocol) {
        this.cvencmprotocol = cvencmprotocol == null ? null : cvencmprotocol.trim();
    }

    public String getCvenimprotocol() {
        return cvenimprotocol;
    }

    public void setCvenimprotocol(String cvenimprotocol) {
        this.cvenimprotocol = cvenimprotocol == null ? null : cvenimprotocol.trim();
    }

    public Double getIventaxrate() {
        return iventaxrate;
    }

    public void setIventaxrate(Double iventaxrate) {
        this.iventaxrate = iventaxrate;
    }

    public Date getDvencreatedatetime() {
        return dvencreatedatetime;
    }

    public void setDvencreatedatetime(Date dvencreatedatetime) {
        this.dvencreatedatetime = dvencreatedatetime;
    }

    public String getCvenmnemcode() {
        return cvenmnemcode;
    }

    public void setCvenmnemcode(String cvenmnemcode) {
        this.cvenmnemcode = cvenmnemcode == null ? null : cvenmnemcode.trim();
    }

    public String getCvencontactcode() {
        return cvencontactcode;
    }

    public void setCvencontactcode(String cvencontactcode) {
        this.cvencontactcode = cvencontactcode == null ? null : cvencontactcode.trim();
    }

    public String getCvenbankall() {
        return cvenbankall;
    }

    public void setCvenbankall(String cvenbankall) {
        this.cvenbankall = cvenbankall == null ? null : cvenbankall.trim();
    }

    public Boolean getBisvenattachfile() {
        return bisvenattachfile;
    }

    public void setBisvenattachfile(Boolean bisvenattachfile) {
        this.bisvenattachfile = bisvenattachfile;
    }

    public String getClicencerange() {
        return clicencerange;
    }

    public void setClicencerange(String clicencerange) {
        this.clicencerange = clicencerange == null ? null : clicencerange.trim();
    }

    public String getCbusinessrange() {
        return cbusinessrange;
    }

    public void setCbusinessrange(String cbusinessrange) {
        this.cbusinessrange = cbusinessrange == null ? null : cbusinessrange.trim();
    }

    public String getCvengsprange() {
        return cvengsprange;
    }

    public void setCvengsprange(String cvengsprange) {
        this.cvengsprange = cvengsprange == null ? null : cvengsprange.trim();
    }

    public Date getDvengspedate() {
        return dvengspedate;
    }

    public void setDvengspedate(Date dvengspedate) {
        this.dvengspedate = dvengspedate;
    }

    public Date getDvengspsdate() {
        return dvengspsdate;
    }

    public void setDvengspsdate(Date dvengspsdate) {
        this.dvengspsdate = dvengspsdate;
    }

    public Integer getIvengspadays() {
        return ivengspadays;
    }

    public void setIvengspadays(Integer ivengspadays) {
        this.ivengspadays = ivengspadays;
    }

    public byte[] getPubufts() {
        return pubufts;
    }

    public void setPubufts(byte[] pubufts) {
        this.pubufts = pubufts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cvencode=").append(cvencode);
        sb.append(", cvenname=").append(cvenname);
        sb.append(", cvenabbname=").append(cvenabbname);
        sb.append(", cvccode=").append(cvccode);
        sb.append(", cdccode=").append(cdccode);
        sb.append(", ctrade=").append(ctrade);
        sb.append(", cvenaddress=").append(cvenaddress);
        sb.append(", cvenpostcode=").append(cvenpostcode);
        sb.append(", cvenregcode=").append(cvenregcode);
        sb.append(", cvenbank=").append(cvenbank);
        sb.append(", cvenaccount=").append(cvenaccount);
        sb.append(", dvendevdate=").append(dvendevdate);
        sb.append(", cvenlperson=").append(cvenlperson);
        sb.append(", cvenphone=").append(cvenphone);
        sb.append(", cvenfax=").append(cvenfax);
        sb.append(", cvenemail=").append(cvenemail);
        sb.append(", cvenperson=").append(cvenperson);
        sb.append(", cvenbp=").append(cvenbp);
        sb.append(", cvenhand=").append(cvenhand);
        sb.append(", cvenpperson=").append(cvenpperson);
        sb.append(", ivendisrate=").append(ivendisrate);
        sb.append(", ivencregrade=").append(ivencregrade);
        sb.append(", ivencreline=").append(ivencreline);
        sb.append(", ivencredate=").append(ivencredate);
        sb.append(", cvenpaycond=").append(cvenpaycond);
        sb.append(", cveniaddress=").append(cveniaddress);
        sb.append(", cvenitype=").append(cvenitype);
        sb.append(", cvenheadcode=").append(cvenheadcode);
        sb.append(", cvenwhcode=").append(cvenwhcode);
        sb.append(", cvendepart=").append(cvendepart);
        sb.append(", iapmoney=").append(iapmoney);
        sb.append(", dlastdate=").append(dlastdate);
        sb.append(", ilastmoney=").append(ilastmoney);
        sb.append(", dlrdate=").append(dlrdate);
        sb.append(", ilrmoney=").append(ilrmoney);
        sb.append(", denddate=").append(denddate);
        sb.append(", ifrequency=").append(ifrequency);
        sb.append(", bventax=").append(bventax);
        sb.append(", cvendefine1=").append(cvendefine1);
        sb.append(", cvendefine2=").append(cvendefine2);
        sb.append(", cvendefine3=").append(cvendefine3);
        sb.append(", ccreateperson=").append(ccreateperson);
        sb.append(", cmodifyperson=").append(cmodifyperson);
        sb.append(", dmodifydate=").append(dmodifydate);
        sb.append(", crelcustomer=").append(crelcustomer);
        sb.append(", iid=").append(iid);
        sb.append(", cbarcode=").append(cbarcode);
        sb.append(", cvendefine4=").append(cvendefine4);
        sb.append(", cvendefine5=").append(cvendefine5);
        sb.append(", cvendefine6=").append(cvendefine6);
        sb.append(", cvendefine7=").append(cvendefine7);
        sb.append(", cvendefine8=").append(cvendefine8);
        sb.append(", cvendefine9=").append(cvendefine9);
        sb.append(", cvendefine10=").append(cvendefine10);
        sb.append(", cvendefine11=").append(cvendefine11);
        sb.append(", cvendefine12=").append(cvendefine12);
        sb.append(", cvendefine13=").append(cvendefine13);
        sb.append(", cvendefine14=").append(cvendefine14);
        sb.append(", cvendefine15=").append(cvendefine15);
        sb.append(", cvendefine16=").append(cvendefine16);
        sb.append(", fregistfund=").append(fregistfund);
        sb.append(", iemployeenum=").append(iemployeenum);
        sb.append(", igradeabc=").append(igradeabc);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", blicencedate=").append(blicencedate);
        sb.append(", dlicencesdate=").append(dlicencesdate);
        sb.append(", dlicenceedate=").append(dlicenceedate);
        sb.append(", ilicenceadays=").append(ilicenceadays);
        sb.append(", bbusinessdate=").append(bbusinessdate);
        sb.append(", dbusinesssdate=").append(dbusinesssdate);
        sb.append(", dbusinessedate=").append(dbusinessedate);
        sb.append(", ibusinessadays=").append(ibusinessadays);
        sb.append(", bproxydate=").append(bproxydate);
        sb.append(", dproxysdate=").append(dproxysdate);
        sb.append(", dproxyedate=").append(dproxyedate);
        sb.append(", iproxyadays=").append(iproxyadays);
        sb.append(", bpassgmp=").append(bpassgmp);
        sb.append(", bvencargo=").append(bvencargo);
        sb.append(", bproxyforeign=").append(bproxyforeign);
        sb.append(", bvenservice=").append(bvenservice);
        sb.append(", cventradeccode=").append(cventradeccode);
        sb.append(", cvenbankcode=").append(cvenbankcode);
        sb.append(", cvenexchName=").append(cvenexchName);
        sb.append(", ivengsptype=").append(ivengsptype);
        sb.append(", ivengspauth=").append(ivengspauth);
        sb.append(", cvengspauthno=").append(cvengspauthno);
        sb.append(", cvenbusinessno=").append(cvenbusinessno);
        sb.append(", cvenlicenceno=").append(cvenlicenceno);
        sb.append(", bvenoverseas=").append(bvenoverseas);
        sb.append(", bvenaccperiodmng=").append(bvenaccperiodmng);
        sb.append(", cvenpuomprotocol=").append(cvenpuomprotocol);
        sb.append(", cvenotherprotocol=").append(cvenotherprotocol);
        sb.append(", cvencountrycode=").append(cvencountrycode);
        sb.append(", cvenenname=").append(cvenenname);
        sb.append(", cvenenaddr1=").append(cvenenaddr1);
        sb.append(", cvenenaddr2=").append(cvenenaddr2);
        sb.append(", cvenenaddr3=").append(cvenenaddr3);
        sb.append(", cvenenaddr4=").append(cvenenaddr4);
        sb.append(", cvenportcode=").append(cvenportcode);
        sb.append(", cvenprimaryven=").append(cvenprimaryven);
        sb.append(", fvencommisionrate=").append(fvencommisionrate);
        sb.append(", fveninsuerate=").append(fveninsuerate);
        sb.append(", bvenhomebranch=").append(bvenhomebranch);
        sb.append(", cvenbranchaddr=").append(cvenbranchaddr);
        sb.append(", cvenbranchphone=").append(cvenbranchphone);
        sb.append(", cvenbranchperson=").append(cvenbranchperson);
        sb.append(", cvensscode=").append(cvensscode);
        sb.append(", comwhcode=").append(comwhcode);
        sb.append(", cvencmprotocol=").append(cvencmprotocol);
        sb.append(", cvenimprotocol=").append(cvenimprotocol);
        sb.append(", iventaxrate=").append(iventaxrate);
        sb.append(", dvencreatedatetime=").append(dvencreatedatetime);
        sb.append(", cvenmnemcode=").append(cvenmnemcode);
        sb.append(", cvencontactcode=").append(cvencontactcode);
        sb.append(", cvenbankall=").append(cvenbankall);
        sb.append(", bisvenattachfile=").append(bisvenattachfile);
        sb.append(", clicencerange=").append(clicencerange);
        sb.append(", cbusinessrange=").append(cbusinessrange);
        sb.append(", cvengsprange=").append(cvengsprange);
        sb.append(", dvengspedate=").append(dvengspedate);
        sb.append(", dvengspsdate=").append(dvengspsdate);
        sb.append(", ivengspadays=").append(ivengspadays);
        sb.append(", pubufts=").append(pubufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}