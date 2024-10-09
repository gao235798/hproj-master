package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName ComputationUnit
 */
@Data
public class Computationunit implements Serializable {
    /**
     * 
     */
    private String ccomunitcode;

    /**
     * 
     */
    private String ccomunitname;

    /**
     * 
     */
    private String cgroupcode;

    /**
     * 
     */
    private String cbarcode;

    /**
     * 
     */
    private Boolean bmainunit;

    /**
     * 
     */
    private Integer ichangrate;

    /**
     * 
     */
    private Double iproportion;

    /**
     * 
     */
    private Integer inumber;

    /**
     * 
     */
    private Date pubufts;

    /**
     * 
     */
    private String censingular;

    /**
     * 
     */
    private String cenplural;

    /**
     * 
     */
    private String cunitrefinvcode;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Computationunit other = (Computationunit) that;
        return (this.getCcomunitcode() == null ? other.getCcomunitcode() == null : this.getCcomunitcode().equals(other.getCcomunitcode()))
            && (this.getCcomunitname() == null ? other.getCcomunitname() == null : this.getCcomunitname().equals(other.getCcomunitname()))
            && (this.getCgroupcode() == null ? other.getCgroupcode() == null : this.getCgroupcode().equals(other.getCgroupcode()))
            && (this.getCbarcode() == null ? other.getCbarcode() == null : this.getCbarcode().equals(other.getCbarcode()))
            && (this.getBmainunit() == null ? other.getBmainunit() == null : this.getBmainunit().equals(other.getBmainunit()))
            && (this.getIchangrate() == null ? other.getIchangrate() == null : this.getIchangrate().equals(other.getIchangrate()))
            && (this.getIproportion() == null ? other.getIproportion() == null : this.getIproportion().equals(other.getIproportion()))
            && (this.getInumber() == null ? other.getInumber() == null : this.getInumber().equals(other.getInumber()))
            && (this.getPubufts() == null ? other.getPubufts() == null : this.getPubufts().equals(other.getPubufts()))
            && (this.getCensingular() == null ? other.getCensingular() == null : this.getCensingular().equals(other.getCensingular()))
            && (this.getCenplural() == null ? other.getCenplural() == null : this.getCenplural().equals(other.getCenplural()))
            && (this.getCunitrefinvcode() == null ? other.getCunitrefinvcode() == null : this.getCunitrefinvcode().equals(other.getCunitrefinvcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCcomunitcode() == null) ? 0 : getCcomunitcode().hashCode());
        result = prime * result + ((getCcomunitname() == null) ? 0 : getCcomunitname().hashCode());
        result = prime * result + ((getCgroupcode() == null) ? 0 : getCgroupcode().hashCode());
        result = prime * result + ((getCbarcode() == null) ? 0 : getCbarcode().hashCode());
        result = prime * result + ((getBmainunit() == null) ? 0 : getBmainunit().hashCode());
        result = prime * result + ((getIchangrate() == null) ? 0 : getIchangrate().hashCode());
        result = prime * result + ((getIproportion() == null) ? 0 : getIproportion().hashCode());
        result = prime * result + ((getInumber() == null) ? 0 : getInumber().hashCode());
        result = prime * result + ((getPubufts() == null) ? 0 : getPubufts().hashCode());
        result = prime * result + ((getCensingular() == null) ? 0 : getCensingular().hashCode());
        result = prime * result + ((getCenplural() == null) ? 0 : getCenplural().hashCode());
        result = prime * result + ((getCunitrefinvcode() == null) ? 0 : getCunitrefinvcode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ccomunitcode=").append(ccomunitcode);
        sb.append(", ccomunitname=").append(ccomunitname);
        sb.append(", cgroupcode=").append(cgroupcode);
        sb.append(", cbarcode=").append(cbarcode);
        sb.append(", bmainunit=").append(bmainunit);
        sb.append(", ichangrate=").append(ichangrate);
        sb.append(", iproportion=").append(iproportion);
        sb.append(", inumber=").append(inumber);
        sb.append(", pubufts=").append(pubufts);
        sb.append(", censingular=").append(censingular);
        sb.append(", cenplural=").append(cenplural);
        sb.append(", cunitrefinvcode=").append(cunitrefinvcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}