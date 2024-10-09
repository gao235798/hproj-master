package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {
    private String cdepcode;

    private Boolean bdepend;

    private String cdepname;

    private Byte idepgrade;

    private String cdepperson;

    private String cdepprop;

    private String cdepphone;

    private String cdepaddress;

    private String cdepmemo;

    private Double icreline;

    private String ccregrade;

    private Integer icredate;

    private String coffergrade;

    private Double iofferrate;

    private Boolean bshop;

    private String cdepguid;

    private Date ddepbegindate;

    private Date ddependdate;

    private String vauthorizedoc;

    private String vauthorizeunit;

    private String cdepfax;

    private String cdeppostcode;

    private String cdepemail;

    private String cdeptype;

    private Integer binheritdutybasic;

    private Integer binheritworkcalendar;

    private String cdutycode;

    private String crestcode;

    private Boolean bim;

    private String cdepnameen;

    private Boolean bretail;

    private String cdepfullname;

    private Integer ideporder;

    private String cdepleader;

    private Date dmodifydate;

    private String cespacemembid;
    
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

    public String getCdepcode() {
        return cdepcode;
    }

    public void setCdepcode(String cdepcode) {
        this.cdepcode = cdepcode == null ? null : cdepcode.trim();
    }

    public Boolean getBdepend() {
        return bdepend;
    }

    public void setBdepend(Boolean bdepend) {
        this.bdepend = bdepend;
    }

    public String getCdepname() {
        return cdepname;
    }

    public void setCdepname(String cdepname) {
        this.cdepname = cdepname == null ? null : cdepname.trim();
    }

    public Byte getIdepgrade() {
        return idepgrade;
    }

    public void setIdepgrade(Byte idepgrade) {
        this.idepgrade = idepgrade;
    }

    public String getCdepperson() {
        return cdepperson;
    }

    public void setCdepperson(String cdepperson) {
        this.cdepperson = cdepperson == null ? null : cdepperson.trim();
    }

    public String getCdepprop() {
        return cdepprop;
    }

    public void setCdepprop(String cdepprop) {
        this.cdepprop = cdepprop == null ? null : cdepprop.trim();
    }

    public String getCdepphone() {
        return cdepphone;
    }

    public void setCdepphone(String cdepphone) {
        this.cdepphone = cdepphone == null ? null : cdepphone.trim();
    }

    public String getCdepaddress() {
        return cdepaddress;
    }

    public void setCdepaddress(String cdepaddress) {
        this.cdepaddress = cdepaddress == null ? null : cdepaddress.trim();
    }

    public String getCdepmemo() {
        return cdepmemo;
    }

    public void setCdepmemo(String cdepmemo) {
        this.cdepmemo = cdepmemo == null ? null : cdepmemo.trim();
    }

    public Double getIcreline() {
        return icreline;
    }

    public void setIcreline(Double icreline) {
        this.icreline = icreline;
    }

    public String getCcregrade() {
        return ccregrade;
    }

    public void setCcregrade(String ccregrade) {
        this.ccregrade = ccregrade == null ? null : ccregrade.trim();
    }

    public Integer getIcredate() {
        return icredate;
    }

    public void setIcredate(Integer icredate) {
        this.icredate = icredate;
    }

    public String getCoffergrade() {
        return coffergrade;
    }

    public void setCoffergrade(String coffergrade) {
        this.coffergrade = coffergrade == null ? null : coffergrade.trim();
    }

    public Double getIofferrate() {
        return iofferrate;
    }

    public void setIofferrate(Double iofferrate) {
        this.iofferrate = iofferrate;
    }

    public Boolean getBshop() {
        return bshop;
    }

    public void setBshop(Boolean bshop) {
        this.bshop = bshop;
    }

    public String getCdepguid() {
        return cdepguid;
    }

    public void setCdepguid(String cdepguid) {
        this.cdepguid = cdepguid == null ? null : cdepguid.trim();
    }

    public Date getDdepbegindate() {
        return ddepbegindate;
    }

    public void setDdepbegindate(Date ddepbegindate) {
        this.ddepbegindate = ddepbegindate;
    }

    public Date getDdependdate() {
        return ddependdate;
    }

    public void setDdependdate(Date ddependdate) {
        this.ddependdate = ddependdate;
    }

    public String getVauthorizedoc() {
        return vauthorizedoc;
    }

    public void setVauthorizedoc(String vauthorizedoc) {
        this.vauthorizedoc = vauthorizedoc == null ? null : vauthorizedoc.trim();
    }

    public String getVauthorizeunit() {
        return vauthorizeunit;
    }

    public void setVauthorizeunit(String vauthorizeunit) {
        this.vauthorizeunit = vauthorizeunit == null ? null : vauthorizeunit.trim();
    }

    public String getCdepfax() {
        return cdepfax;
    }

    public void setCdepfax(String cdepfax) {
        this.cdepfax = cdepfax == null ? null : cdepfax.trim();
    }

    public String getCdeppostcode() {
        return cdeppostcode;
    }

    public void setCdeppostcode(String cdeppostcode) {
        this.cdeppostcode = cdeppostcode == null ? null : cdeppostcode.trim();
    }

    public String getCdepemail() {
        return cdepemail;
    }

    public void setCdepemail(String cdepemail) {
        this.cdepemail = cdepemail == null ? null : cdepemail.trim();
    }

    public String getCdeptype() {
        return cdeptype;
    }

    public void setCdeptype(String cdeptype) {
        this.cdeptype = cdeptype == null ? null : cdeptype.trim();
    }

    public Integer getBinheritdutybasic() {
        return binheritdutybasic;
    }

    public void setBinheritdutybasic(Integer binheritdutybasic) {
        this.binheritdutybasic = binheritdutybasic;
    }

    public Integer getBinheritworkcalendar() {
        return binheritworkcalendar;
    }

    public void setBinheritworkcalendar(Integer binheritworkcalendar) {
        this.binheritworkcalendar = binheritworkcalendar;
    }

    public String getCdutycode() {
        return cdutycode;
    }

    public void setCdutycode(String cdutycode) {
        this.cdutycode = cdutycode == null ? null : cdutycode.trim();
    }

    public String getCrestcode() {
        return crestcode;
    }

    public void setCrestcode(String crestcode) {
        this.crestcode = crestcode == null ? null : crestcode.trim();
    }

    public Boolean getBim() {
        return bim;
    }

    public void setBim(Boolean bim) {
        this.bim = bim;
    }

    public String getCdepnameen() {
        return cdepnameen;
    }

    public void setCdepnameen(String cdepnameen) {
        this.cdepnameen = cdepnameen == null ? null : cdepnameen.trim();
    }

    public Boolean getBretail() {
        return bretail;
    }

    public void setBretail(Boolean bretail) {
        this.bretail = bretail;
    }

    public String getCdepfullname() {
        return cdepfullname;
    }

    public void setCdepfullname(String cdepfullname) {
        this.cdepfullname = cdepfullname == null ? null : cdepfullname.trim();
    }

    public Integer getIdeporder() {
        return ideporder;
    }

    public void setIdeporder(Integer ideporder) {
        this.ideporder = ideporder;
    }

    public String getCdepleader() {
        return cdepleader;
    }

    public void setCdepleader(String cdepleader) {
        this.cdepleader = cdepleader == null ? null : cdepleader.trim();
    }

    public Date getDmodifydate() {
        return dmodifydate;
    }

    public void setDmodifydate(Date dmodifydate) {
        this.dmodifydate = dmodifydate;
    }

    public String getCespacemembid() {
        return cespacemembid;
    }

    public void setCespacemembid(String cespacemembid) {
        this.cespacemembid = cespacemembid == null ? null : cespacemembid.trim();
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
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", bdepend=").append(bdepend);
        sb.append(", cdepname=").append(cdepname);
        sb.append(", idepgrade=").append(idepgrade);
        sb.append(", cdepperson=").append(cdepperson);
        sb.append(", cdepprop=").append(cdepprop);
        sb.append(", cdepphone=").append(cdepphone);
        sb.append(", cdepaddress=").append(cdepaddress);
        sb.append(", cdepmemo=").append(cdepmemo);
        sb.append(", icreline=").append(icreline);
        sb.append(", ccregrade=").append(ccregrade);
        sb.append(", icredate=").append(icredate);
        sb.append(", coffergrade=").append(coffergrade);
        sb.append(", iofferrate=").append(iofferrate);
        sb.append(", bshop=").append(bshop);
        sb.append(", cdepguid=").append(cdepguid);
        sb.append(", ddepbegindate=").append(ddepbegindate);
        sb.append(", ddependdate=").append(ddependdate);
        sb.append(", vauthorizedoc=").append(vauthorizedoc);
        sb.append(", vauthorizeunit=").append(vauthorizeunit);
        sb.append(", cdepfax=").append(cdepfax);
        sb.append(", cdeppostcode=").append(cdeppostcode);
        sb.append(", cdepemail=").append(cdepemail);
        sb.append(", cdeptype=").append(cdeptype);
        sb.append(", binheritdutybasic=").append(binheritdutybasic);
        sb.append(", binheritworkcalendar=").append(binheritworkcalendar);
        sb.append(", cdutycode=").append(cdutycode);
        sb.append(", crestcode=").append(crestcode);
        sb.append(", bim=").append(bim);
        sb.append(", cdepnameen=").append(cdepnameen);
        sb.append(", bretail=").append(bretail);
        sb.append(", cdepfullname=").append(cdepfullname);
        sb.append(", ideporder=").append(ideporder);
        sb.append(", cdepleader=").append(cdepleader);
        sb.append(", dmodifydate=").append(dmodifydate);
        sb.append(", cespacemembid=").append(cespacemembid);
        sb.append(", pubufts=").append(pubufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}