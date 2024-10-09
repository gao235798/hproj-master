package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @TableName ST_SNState
 */
@Data
@Getter
@Setter
public class StSnstate implements Serializable {
    /**
     * 
     */
    private Integer autoid;

    /**
     * 
     */
    private String cinvcode;

    /**
     * 
     */
    private String cwhcode;

    /**
     * 
     */
    private String cposition;

    /**
     * 
     */
    private String cfree1;

    /**
     * 
     */
    private String cfree2;

    /**
     * 
     */
    private String cfree3;

    /**
     * 
     */
    private String cfree4;

    /**
     * 
     */
    private String cfree5;

    /**
     * 
     */
    private String cfree6;

    /**
     * 
     */
    private String cfree7;

    /**
     * 
     */
    private String cfree8;

    /**
     * 
     */
    private String cfree9;

    /**
     * 
     */
    private String cfree10;

    /**
     * 
     */
    private String csndefine1;

    /**
     * 
     */
    private String csndefine2;

    /**
     * 
     */
    private String csndefine3;

    /**
     * 
     */
    private String csndefine4;

    /**
     * 
     */
    private String csndefine5;

    /**
     * 
     */
    private String csndefine6;

    /**
     * 
     */
    private String csndefine7;

    /**
     * 
     */
    private String csndefine8;

    /**
     * 
     */
    private String csndefine9;

    /**
     * 
     */
    private String csndefine10;

    /**
     * 
     */
    private Integer isnstate;

    /**
     * 
     */
    private Integer isnprestate;

    /**
     * 
     */
    private Integer isnoperatecount;

    /**
     * 
     */
    private String cincode;

    /**
     * 
     */
    private Integer itrackid;

    /**
     * 
     */
    private String cbatch;

    /**
     * 
     */
    private String cvencode;

    /**
     * 
     */
    private String cinvsn;

    /**
     * 
     */
    private Date dmdate;

    /**
     * 
     */
    private Date dvdate;

    /**
     * 
     */
    private Integer imassunit;

    /**
     * 
     */
    private Integer imassdate;

    /**
     * 
     */
    private String cinvouchtype;



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
        StSnstate other = (StSnstate) that;
        return (this.getAutoid() == null ? other.getAutoid() == null : this.getAutoid().equals(other.getAutoid()))
            && (this.getCinvcode() == null ? other.getCinvcode() == null : this.getCinvcode().equals(other.getCinvcode()))
            && (this.getCwhcode() == null ? other.getCwhcode() == null : this.getCwhcode().equals(other.getCwhcode()))
            && (this.getCposition() == null ? other.getCposition() == null : this.getCposition().equals(other.getCposition()))
            && (this.getCfree1() == null ? other.getCfree1() == null : this.getCfree1().equals(other.getCfree1()))
            && (this.getCfree2() == null ? other.getCfree2() == null : this.getCfree2().equals(other.getCfree2()))
            && (this.getCfree3() == null ? other.getCfree3() == null : this.getCfree3().equals(other.getCfree3()))
            && (this.getCfree4() == null ? other.getCfree4() == null : this.getCfree4().equals(other.getCfree4()))
            && (this.getCfree5() == null ? other.getCfree5() == null : this.getCfree5().equals(other.getCfree5()))
            && (this.getCfree6() == null ? other.getCfree6() == null : this.getCfree6().equals(other.getCfree6()))
            && (this.getCfree7() == null ? other.getCfree7() == null : this.getCfree7().equals(other.getCfree7()))
            && (this.getCfree8() == null ? other.getCfree8() == null : this.getCfree8().equals(other.getCfree8()))
            && (this.getCfree9() == null ? other.getCfree9() == null : this.getCfree9().equals(other.getCfree9()))
            && (this.getCfree10() == null ? other.getCfree10() == null : this.getCfree10().equals(other.getCfree10()))
            && (this.getCsndefine1() == null ? other.getCsndefine1() == null : this.getCsndefine1().equals(other.getCsndefine1()))
            && (this.getCsndefine2() == null ? other.getCsndefine2() == null : this.getCsndefine2().equals(other.getCsndefine2()))
            && (this.getCsndefine3() == null ? other.getCsndefine3() == null : this.getCsndefine3().equals(other.getCsndefine3()))
            && (this.getCsndefine4() == null ? other.getCsndefine4() == null : this.getCsndefine4().equals(other.getCsndefine4()))
            && (this.getCsndefine5() == null ? other.getCsndefine5() == null : this.getCsndefine5().equals(other.getCsndefine5()))
            && (this.getCsndefine6() == null ? other.getCsndefine6() == null : this.getCsndefine6().equals(other.getCsndefine6()))
            && (this.getCsndefine7() == null ? other.getCsndefine7() == null : this.getCsndefine7().equals(other.getCsndefine7()))
            && (this.getCsndefine8() == null ? other.getCsndefine8() == null : this.getCsndefine8().equals(other.getCsndefine8()))
            && (this.getCsndefine9() == null ? other.getCsndefine9() == null : this.getCsndefine9().equals(other.getCsndefine9()))
            && (this.getCsndefine10() == null ? other.getCsndefine10() == null : this.getCsndefine10().equals(other.getCsndefine10()))
            && (this.getIsnstate() == null ? other.getIsnstate() == null : this.getIsnstate().equals(other.getIsnstate()))
            && (this.getIsnprestate() == null ? other.getIsnprestate() == null : this.getIsnprestate().equals(other.getIsnprestate()))
            && (this.getIsnoperatecount() == null ? other.getIsnoperatecount() == null : this.getIsnoperatecount().equals(other.getIsnoperatecount()))
            && (this.getCincode() == null ? other.getCincode() == null : this.getCincode().equals(other.getCincode()))
            && (this.getItrackid() == null ? other.getItrackid() == null : this.getItrackid().equals(other.getItrackid()))
            && (this.getCbatch() == null ? other.getCbatch() == null : this.getCbatch().equals(other.getCbatch()))
            && (this.getCvencode() == null ? other.getCvencode() == null : this.getCvencode().equals(other.getCvencode()))
            && (this.getCinvsn() == null ? other.getCinvsn() == null : this.getCinvsn().equals(other.getCinvsn()))
            && (this.getDmdate() == null ? other.getDmdate() == null : this.getDmdate().equals(other.getDmdate()))
            && (this.getDvdate() == null ? other.getDvdate() == null : this.getDvdate().equals(other.getDvdate()))
            && (this.getImassunit() == null ? other.getImassunit() == null : this.getImassunit().equals(other.getImassunit()))
            && (this.getImassdate() == null ? other.getImassdate() == null : this.getImassdate().equals(other.getImassdate()))
            && (this.getCinvouchtype() == null ? other.getCinvouchtype() == null : this.getCinvouchtype().equals(other.getCinvouchtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutoid() == null) ? 0 : getAutoid().hashCode());
        result = prime * result + ((getCinvcode() == null) ? 0 : getCinvcode().hashCode());
        result = prime * result + ((getCwhcode() == null) ? 0 : getCwhcode().hashCode());
        result = prime * result + ((getCposition() == null) ? 0 : getCposition().hashCode());
        result = prime * result + ((getCfree1() == null) ? 0 : getCfree1().hashCode());
        result = prime * result + ((getCfree2() == null) ? 0 : getCfree2().hashCode());
        result = prime * result + ((getCfree3() == null) ? 0 : getCfree3().hashCode());
        result = prime * result + ((getCfree4() == null) ? 0 : getCfree4().hashCode());
        result = prime * result + ((getCfree5() == null) ? 0 : getCfree5().hashCode());
        result = prime * result + ((getCfree6() == null) ? 0 : getCfree6().hashCode());
        result = prime * result + ((getCfree7() == null) ? 0 : getCfree7().hashCode());
        result = prime * result + ((getCfree8() == null) ? 0 : getCfree8().hashCode());
        result = prime * result + ((getCfree9() == null) ? 0 : getCfree9().hashCode());
        result = prime * result + ((getCfree10() == null) ? 0 : getCfree10().hashCode());
        result = prime * result + ((getCsndefine1() == null) ? 0 : getCsndefine1().hashCode());
        result = prime * result + ((getCsndefine2() == null) ? 0 : getCsndefine2().hashCode());
        result = prime * result + ((getCsndefine3() == null) ? 0 : getCsndefine3().hashCode());
        result = prime * result + ((getCsndefine4() == null) ? 0 : getCsndefine4().hashCode());
        result = prime * result + ((getCsndefine5() == null) ? 0 : getCsndefine5().hashCode());
        result = prime * result + ((getCsndefine6() == null) ? 0 : getCsndefine6().hashCode());
        result = prime * result + ((getCsndefine7() == null) ? 0 : getCsndefine7().hashCode());
        result = prime * result + ((getCsndefine8() == null) ? 0 : getCsndefine8().hashCode());
        result = prime * result + ((getCsndefine9() == null) ? 0 : getCsndefine9().hashCode());
        result = prime * result + ((getCsndefine10() == null) ? 0 : getCsndefine10().hashCode());
        result = prime * result + ((getIsnstate() == null) ? 0 : getIsnstate().hashCode());
        result = prime * result + ((getIsnprestate() == null) ? 0 : getIsnprestate().hashCode());
        result = prime * result + ((getIsnoperatecount() == null) ? 0 : getIsnoperatecount().hashCode());
        result = prime * result + ((getCincode() == null) ? 0 : getCincode().hashCode());
        result = prime * result + ((getItrackid() == null) ? 0 : getItrackid().hashCode());
        result = prime * result + ((getCbatch() == null) ? 0 : getCbatch().hashCode());
        result = prime * result + ((getCvencode() == null) ? 0 : getCvencode().hashCode());
        result = prime * result + ((getCinvsn() == null) ? 0 : getCinvsn().hashCode());
        result = prime * result + ((getDmdate() == null) ? 0 : getDmdate().hashCode());
        result = prime * result + ((getDvdate() == null) ? 0 : getDvdate().hashCode());
        result = prime * result + ((getImassunit() == null) ? 0 : getImassunit().hashCode());
        result = prime * result + ((getImassdate() == null) ? 0 : getImassdate().hashCode());
        result = prime * result + ((getCinvouchtype() == null) ? 0 : getCinvouchtype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cposition=").append(cposition);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", csndefine1=").append(csndefine1);
        sb.append(", csndefine2=").append(csndefine2);
        sb.append(", csndefine3=").append(csndefine3);
        sb.append(", csndefine4=").append(csndefine4);
        sb.append(", csndefine5=").append(csndefine5);
        sb.append(", csndefine6=").append(csndefine6);
        sb.append(", csndefine7=").append(csndefine7);
        sb.append(", csndefine8=").append(csndefine8);
        sb.append(", csndefine9=").append(csndefine9);
        sb.append(", csndefine10=").append(csndefine10);
        sb.append(", isnstate=").append(isnstate);
        sb.append(", isnprestate=").append(isnprestate);
        sb.append(", isnoperatecount=").append(isnoperatecount);
        sb.append(", cincode=").append(cincode);
        sb.append(", itrackid=").append(itrackid);
        sb.append(", cbatch=").append(cbatch);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", cinvsn=").append(cinvsn);
        sb.append(", dmdate=").append(dmdate);
        sb.append(", dvdate=").append(dvdate);
        sb.append(", imassunit=").append(imassunit);
        sb.append(", imassdate=").append(imassdate);
        sb.append(", cinvouchtype=").append(cinvouchtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}