package com.espread.sys.model;

import java.io.Serializable;

public class fitemss02 implements Serializable {
    private Integer iId;

    private String citemcode;

    private String citemname;

    private Boolean bclose;

    private String citemccode;

    private Integer iotherused;
    
    public String getCitemcname() {
		return citemcname;
	}

	public void setCitemcname(String citemcname) {
		this.citemcname = citemcname;
	}

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

	private String citemcname;
    
    private String ttype;

    private String tstatus;

    private static final long serialVersionUID = 1L;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getCitemcode() {
        return citemcode;
    }

    public void setCitemcode(String citemcode) {
        this.citemcode = citemcode == null ? null : citemcode.trim();
    }

    public String getCitemname() {
        return citemname;
    }

    public void setCitemname(String citemname) {
        this.citemname = citemname == null ? null : citemname.trim();
    }

    public Boolean getBclose() {
        return bclose;
    }

    public void setBclose(Boolean bclose) {
        this.bclose = bclose;
    }

    public String getCitemccode() {
        return citemccode;
    }

    public void setCitemccode(String citemccode) {
        this.citemccode = citemccode == null ? null : citemccode.trim();
    }

    public Integer getIotherused() {
        return iotherused;
    }

    public void setIotherused(Integer iotherused) {
        this.iotherused = iotherused;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iId=").append(iId);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", citemname=").append(citemname);
        sb.append(", bclose=").append(bclose);
        sb.append(", citemccode=").append(citemccode);
        sb.append(", iotherused=").append(iotherused);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}