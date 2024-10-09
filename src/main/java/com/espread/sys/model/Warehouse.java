package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;

public class Warehouse implements Serializable {
	 public Integer getiId() {
		return iId;
	}

	public void setiId(Integer iId) {
		this.iId = iId;
	}

	private Integer iId;
	
    private String cwhcode;

    private String cwhname;

    private String cdepcode;

    private String cwhaddress;

    private String cwhphone;

    private String cwhperson;

    private String cwhvaluestyle;

    private Boolean bwhpos;

    private Double iwhfundquota;

    private String cmonth;

    private String cwhmemo;

    private Boolean bfreeze;

    private String cbarcode;

    private Boolean bmrp;

    private Boolean brop;

    private Short ifrequency;

    private String cfrequency;

    private Short idays;

    private Date dlastdate;

    private Short iwhproperty;

    private Boolean bshop;

    private Boolean bcontrolserial;

    private Boolean bincost;

    private Boolean binavailcalcu;

    private Boolean bproxywh;

    private Short isaconmode;

    private Short iexconmode;

    private Short istconmode;

    private Boolean bbondedwh;

    private Boolean bwhasset;

    private Double fwhquota;

    private Date dwhenddate;

    private Boolean bchecksubitemcost;

    private String cpickpos;

    private Boolean beb;

    private Date dmodifydate;

    private String cwaregroupcode;

    private String cprovince;

    private String ccity;

    private String ccounty;

    private String cfactorycode;
    
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

	private String ttype;

    private String tstatus;

    private byte[] pubufts;

    private static final long serialVersionUID = 1L;

    public String getCwhcode() {
        return cwhcode;
    }

    public void setCwhcode(String cwhcode) {
        this.cwhcode = cwhcode == null ? null : cwhcode.trim();
    }

    public String getCwhname() {
        return cwhname;
    }

    public void setCwhname(String cwhname) {
        this.cwhname = cwhname == null ? null : cwhname.trim();
    }

    public String getCdepcode() {
        return cdepcode;
    }

    public void setCdepcode(String cdepcode) {
        this.cdepcode = cdepcode == null ? null : cdepcode.trim();
    }

    public String getCwhaddress() {
        return cwhaddress;
    }

    public void setCwhaddress(String cwhaddress) {
        this.cwhaddress = cwhaddress == null ? null : cwhaddress.trim();
    }

    public String getCwhphone() {
        return cwhphone;
    }

    public void setCwhphone(String cwhphone) {
        this.cwhphone = cwhphone == null ? null : cwhphone.trim();
    }

    public String getCwhperson() {
        return cwhperson;
    }

    public void setCwhperson(String cwhperson) {
        this.cwhperson = cwhperson == null ? null : cwhperson.trim();
    }

    public String getCwhvaluestyle() {
        return cwhvaluestyle;
    }

    public void setCwhvaluestyle(String cwhvaluestyle) {
        this.cwhvaluestyle = cwhvaluestyle == null ? null : cwhvaluestyle.trim();
    }

    public Boolean getBwhpos() {
        return bwhpos;
    }

    public void setBwhpos(Boolean bwhpos) {
        this.bwhpos = bwhpos;
    }

    public Double getIwhfundquota() {
        return iwhfundquota;
    }

    public void setIwhfundquota(Double iwhfundquota) {
        this.iwhfundquota = iwhfundquota;
    }

    public String getCmonth() {
        return cmonth;
    }

    public void setCmonth(String cmonth) {
        this.cmonth = cmonth == null ? null : cmonth.trim();
    }

    public String getCwhmemo() {
        return cwhmemo;
    }

    public void setCwhmemo(String cwhmemo) {
        this.cwhmemo = cwhmemo == null ? null : cwhmemo.trim();
    }

    public Boolean getBfreeze() {
        return bfreeze;
    }

    public void setBfreeze(Boolean bfreeze) {
        this.bfreeze = bfreeze;
    }

    public String getCbarcode() {
        return cbarcode;
    }

    public void setCbarcode(String cbarcode) {
        this.cbarcode = cbarcode == null ? null : cbarcode.trim();
    }

    public Boolean getBmrp() {
        return bmrp;
    }

    public void setBmrp(Boolean bmrp) {
        this.bmrp = bmrp;
    }

    public Boolean getBrop() {
        return brop;
    }

    public void setBrop(Boolean brop) {
        this.brop = brop;
    }

    public Short getIfrequency() {
        return ifrequency;
    }

    public void setIfrequency(Short ifrequency) {
        this.ifrequency = ifrequency;
    }

    public String getCfrequency() {
        return cfrequency;
    }

    public void setCfrequency(String cfrequency) {
        this.cfrequency = cfrequency == null ? null : cfrequency.trim();
    }

    public Short getIdays() {
        return idays;
    }

    public void setIdays(Short idays) {
        this.idays = idays;
    }

    public Date getDlastdate() {
        return dlastdate;
    }

    public void setDlastdate(Date dlastdate) {
        this.dlastdate = dlastdate;
    }

    public Short getIwhproperty() {
        return iwhproperty;
    }

    public void setIwhproperty(Short iwhproperty) {
        this.iwhproperty = iwhproperty;
    }

    public Boolean getBshop() {
        return bshop;
    }

    public void setBshop(Boolean bshop) {
        this.bshop = bshop;
    }

    public Boolean getBcontrolserial() {
        return bcontrolserial;
    }

    public void setBcontrolserial(Boolean bcontrolserial) {
        this.bcontrolserial = bcontrolserial;
    }

    public Boolean getBincost() {
        return bincost;
    }

    public void setBincost(Boolean bincost) {
        this.bincost = bincost;
    }

    public Boolean getBinavailcalcu() {
        return binavailcalcu;
    }

    public void setBinavailcalcu(Boolean binavailcalcu) {
        this.binavailcalcu = binavailcalcu;
    }

    public Boolean getBproxywh() {
        return bproxywh;
    }

    public void setBproxywh(Boolean bproxywh) {
        this.bproxywh = bproxywh;
    }

    public Short getIsaconmode() {
        return isaconmode;
    }

    public void setIsaconmode(Short isaconmode) {
        this.isaconmode = isaconmode;
    }

    public Short getIexconmode() {
        return iexconmode;
    }

    public void setIexconmode(Short iexconmode) {
        this.iexconmode = iexconmode;
    }

    public Short getIstconmode() {
        return istconmode;
    }

    public void setIstconmode(Short istconmode) {
        this.istconmode = istconmode;
    }

    public Boolean getBbondedwh() {
        return bbondedwh;
    }

    public void setBbondedwh(Boolean bbondedwh) {
        this.bbondedwh = bbondedwh;
    }

    public Boolean getBwhasset() {
        return bwhasset;
    }

    public void setBwhasset(Boolean bwhasset) {
        this.bwhasset = bwhasset;
    }

    public Double getFwhquota() {
        return fwhquota;
    }

    public void setFwhquota(Double fwhquota) {
        this.fwhquota = fwhquota;
    }

    public Date getDwhenddate() {
        return dwhenddate;
    }

    public void setDwhenddate(Date dwhenddate) {
        this.dwhenddate = dwhenddate;
    }

    public Boolean getBchecksubitemcost() {
        return bchecksubitemcost;
    }

    public void setBchecksubitemcost(Boolean bchecksubitemcost) {
        this.bchecksubitemcost = bchecksubitemcost;
    }

    public String getCpickpos() {
        return cpickpos;
    }

    public void setCpickpos(String cpickpos) {
        this.cpickpos = cpickpos == null ? null : cpickpos.trim();
    }

    public Boolean getBeb() {
        return beb;
    }

    public void setBeb(Boolean beb) {
        this.beb = beb;
    }

    public Date getDmodifydate() {
        return dmodifydate;
    }

    public void setDmodifydate(Date dmodifydate) {
        this.dmodifydate = dmodifydate;
    }

    public String getCwaregroupcode() {
        return cwaregroupcode;
    }

    public void setCwaregroupcode(String cwaregroupcode) {
        this.cwaregroupcode = cwaregroupcode == null ? null : cwaregroupcode.trim();
    }

    public String getCprovince() {
        return cprovince;
    }

    public void setCprovince(String cprovince) {
        this.cprovince = cprovince == null ? null : cprovince.trim();
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity == null ? null : ccity.trim();
    }

    public String getCcounty() {
        return ccounty;
    }

    public void setCcounty(String ccounty) {
        this.ccounty = ccounty == null ? null : ccounty.trim();
    }

    public String getCfactorycode() {
        return cfactorycode;
    }

    public void setCfactorycode(String cfactorycode) {
        this.cfactorycode = cfactorycode == null ? null : cfactorycode.trim();
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
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cwhname=").append(cwhname);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cwhaddress=").append(cwhaddress);
        sb.append(", cwhphone=").append(cwhphone);
        sb.append(", cwhperson=").append(cwhperson);
        sb.append(", cwhvaluestyle=").append(cwhvaluestyle);
        sb.append(", bwhpos=").append(bwhpos);
        sb.append(", iwhfundquota=").append(iwhfundquota);
        sb.append(", cmonth=").append(cmonth);
        sb.append(", cwhmemo=").append(cwhmemo);
        sb.append(", bfreeze=").append(bfreeze);
        sb.append(", cbarcode=").append(cbarcode);
        sb.append(", bmrp=").append(bmrp);
        sb.append(", brop=").append(brop);
        sb.append(", ifrequency=").append(ifrequency);
        sb.append(", cfrequency=").append(cfrequency);
        sb.append(", idays=").append(idays);
        sb.append(", dlastdate=").append(dlastdate);
        sb.append(", iwhproperty=").append(iwhproperty);
        sb.append(", bshop=").append(bshop);
        sb.append(", bcontrolserial=").append(bcontrolserial);
        sb.append(", bincost=").append(bincost);
        sb.append(", binavailcalcu=").append(binavailcalcu);
        sb.append(", bproxywh=").append(bproxywh);
        sb.append(", isaconmode=").append(isaconmode);
        sb.append(", iexconmode=").append(iexconmode);
        sb.append(", istconmode=").append(istconmode);
        sb.append(", bbondedwh=").append(bbondedwh);
        sb.append(", bwhasset=").append(bwhasset);
        sb.append(", fwhquota=").append(fwhquota);
        sb.append(", dwhenddate=").append(dwhenddate);
        sb.append(", bchecksubitemcost=").append(bchecksubitemcost);
        sb.append(", cpickpos=").append(cpickpos);
        sb.append(", beb=").append(beb);
        sb.append(", dmodifydate=").append(dmodifydate);
        sb.append(", cwaregroupcode=").append(cwaregroupcode);
        sb.append(", cprovince=").append(cprovince);
        sb.append(", ccity=").append(ccity);
        sb.append(", ccounty=").append(ccounty);
        sb.append(", cfactorycode=").append(cfactorycode);
        sb.append(", pubufts=").append(pubufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}