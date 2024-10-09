package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName IA_Summary
 */
@Data
public class IaSummary implements Serializable {
    /**
     * 
     */
    private Integer autoid;

    /**
     * 
     */
    private String cwhcode;

    /**
     * 
     */
    private String cinvcode;

    /**
     * 
     */
    private String cdepcode;

    /**
     * 
     */
    private Integer imonth;

    /**
     * 
     */
    private BigDecimal iinum;

    /**
     * 
     */
    private BigDecimal ionum;

    /**
     * 
     */
    private BigDecimal inum;

    /**
     * 
     */
    private Object iimoney;

    /**
     * 
     */
    private Object iomoney;

    /**
     * 
     */
    private Object imoney;

    /**
     * 
     */
    private BigDecimal iunitprice;

    /**
     * 
     */
    private BigDecimal idifrate;

    /**
     * 
     */
    private Object iidif;

    /**
     * 
     */
    private Object iodif;

    /**
     * 
     */
    private Object idif;

    /**
     * 
     */
    private BigDecimal fminincost;

    /**
     * 
     */
    private BigDecimal fmaxincost;

    /**
     * 
     */
    private Integer idirect;

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
    private Integer bmanual;

    /**
     * 
     */
    private Integer iperiod;

    /**
     * 
     */
    private Integer itrans;

    /**
     * 
     */
    private Object flaborstdcoste;

    /**
     * 
     */
    private Object fmanufixstdcoste;

    /**
     * 
     */
    private Object fmanuvarstdcoste;

    /**
     * 
     */
    private Object fomcoste;

    /**
     * 
     */
    private Integer iyear;

    /**
     * 
     */
    private Date dcreatedate;

    /**
     * 
     */
    private String cbatchia;

    /**
     * 
     */
    private BigDecimal iabsnum;

    /**
     * 
     */
    private Object iabsmoney;

    /**
     * 
     */
    private BigDecimal iabsinum;

    /**
     * 
     */
    private Object iabsimoney;

    /**
     * 
     */
    private BigDecimal iabsonum;

    /**
     * 
     */
    private Object iabsomoney;

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
        IaSummary other = (IaSummary) that;
        return (this.getAutoid() == null ? other.getAutoid() == null : this.getAutoid().equals(other.getAutoid()))
            && (this.getCwhcode() == null ? other.getCwhcode() == null : this.getCwhcode().equals(other.getCwhcode()))
            && (this.getCinvcode() == null ? other.getCinvcode() == null : this.getCinvcode().equals(other.getCinvcode()))
            && (this.getCdepcode() == null ? other.getCdepcode() == null : this.getCdepcode().equals(other.getCdepcode()))
            && (this.getImonth() == null ? other.getImonth() == null : this.getImonth().equals(other.getImonth()))
            && (this.getIinum() == null ? other.getIinum() == null : this.getIinum().equals(other.getIinum()))
            && (this.getIonum() == null ? other.getIonum() == null : this.getIonum().equals(other.getIonum()))
            && (this.getInum() == null ? other.getInum() == null : this.getInum().equals(other.getInum()))
            && (this.getIimoney() == null ? other.getIimoney() == null : this.getIimoney().equals(other.getIimoney()))
            && (this.getIomoney() == null ? other.getIomoney() == null : this.getIomoney().equals(other.getIomoney()))
            && (this.getImoney() == null ? other.getImoney() == null : this.getImoney().equals(other.getImoney()))
            && (this.getIunitprice() == null ? other.getIunitprice() == null : this.getIunitprice().equals(other.getIunitprice()))
            && (this.getIdifrate() == null ? other.getIdifrate() == null : this.getIdifrate().equals(other.getIdifrate()))
            && (this.getIidif() == null ? other.getIidif() == null : this.getIidif().equals(other.getIidif()))
            && (this.getIodif() == null ? other.getIodif() == null : this.getIodif().equals(other.getIodif()))
            && (this.getIdif() == null ? other.getIdif() == null : this.getIdif().equals(other.getIdif()))
            && (this.getFminincost() == null ? other.getFminincost() == null : this.getFminincost().equals(other.getFminincost()))
            && (this.getFmaxincost() == null ? other.getFmaxincost() == null : this.getFmaxincost().equals(other.getFmaxincost()))
            && (this.getIdirect() == null ? other.getIdirect() == null : this.getIdirect().equals(other.getIdirect()))
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
            && (this.getBmanual() == null ? other.getBmanual() == null : this.getBmanual().equals(other.getBmanual()))
            && (this.getIperiod() == null ? other.getIperiod() == null : this.getIperiod().equals(other.getIperiod()))
            && (this.getItrans() == null ? other.getItrans() == null : this.getItrans().equals(other.getItrans()))
            && (this.getFlaborstdcoste() == null ? other.getFlaborstdcoste() == null : this.getFlaborstdcoste().equals(other.getFlaborstdcoste()))
            && (this.getFmanufixstdcoste() == null ? other.getFmanufixstdcoste() == null : this.getFmanufixstdcoste().equals(other.getFmanufixstdcoste()))
            && (this.getFmanuvarstdcoste() == null ? other.getFmanuvarstdcoste() == null : this.getFmanuvarstdcoste().equals(other.getFmanuvarstdcoste()))
            && (this.getFomcoste() == null ? other.getFomcoste() == null : this.getFomcoste().equals(other.getFomcoste()))
            && (this.getIyear() == null ? other.getIyear() == null : this.getIyear().equals(other.getIyear()))
            && (this.getDcreatedate() == null ? other.getDcreatedate() == null : this.getDcreatedate().equals(other.getDcreatedate()))
            && (this.getCbatchia() == null ? other.getCbatchia() == null : this.getCbatchia().equals(other.getCbatchia()))
            && (this.getIabsnum() == null ? other.getIabsnum() == null : this.getIabsnum().equals(other.getIabsnum()))
            && (this.getIabsmoney() == null ? other.getIabsmoney() == null : this.getIabsmoney().equals(other.getIabsmoney()))
            && (this.getIabsinum() == null ? other.getIabsinum() == null : this.getIabsinum().equals(other.getIabsinum()))
            && (this.getIabsimoney() == null ? other.getIabsimoney() == null : this.getIabsimoney().equals(other.getIabsimoney()))
            && (this.getIabsonum() == null ? other.getIabsonum() == null : this.getIabsonum().equals(other.getIabsonum()))
            && (this.getIabsomoney() == null ? other.getIabsomoney() == null : this.getIabsomoney().equals(other.getIabsomoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutoid() == null) ? 0 : getAutoid().hashCode());
        result = prime * result + ((getCwhcode() == null) ? 0 : getCwhcode().hashCode());
        result = prime * result + ((getCinvcode() == null) ? 0 : getCinvcode().hashCode());
        result = prime * result + ((getCdepcode() == null) ? 0 : getCdepcode().hashCode());
        result = prime * result + ((getImonth() == null) ? 0 : getImonth().hashCode());
        result = prime * result + ((getIinum() == null) ? 0 : getIinum().hashCode());
        result = prime * result + ((getIonum() == null) ? 0 : getIonum().hashCode());
        result = prime * result + ((getInum() == null) ? 0 : getInum().hashCode());
        result = prime * result + ((getIimoney() == null) ? 0 : getIimoney().hashCode());
        result = prime * result + ((getIomoney() == null) ? 0 : getIomoney().hashCode());
        result = prime * result + ((getImoney() == null) ? 0 : getImoney().hashCode());
        result = prime * result + ((getIunitprice() == null) ? 0 : getIunitprice().hashCode());
        result = prime * result + ((getIdifrate() == null) ? 0 : getIdifrate().hashCode());
        result = prime * result + ((getIidif() == null) ? 0 : getIidif().hashCode());
        result = prime * result + ((getIodif() == null) ? 0 : getIodif().hashCode());
        result = prime * result + ((getIdif() == null) ? 0 : getIdif().hashCode());
        result = prime * result + ((getFminincost() == null) ? 0 : getFminincost().hashCode());
        result = prime * result + ((getFmaxincost() == null) ? 0 : getFmaxincost().hashCode());
        result = prime * result + ((getIdirect() == null) ? 0 : getIdirect().hashCode());
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
        result = prime * result + ((getBmanual() == null) ? 0 : getBmanual().hashCode());
        result = prime * result + ((getIperiod() == null) ? 0 : getIperiod().hashCode());
        result = prime * result + ((getItrans() == null) ? 0 : getItrans().hashCode());
        result = prime * result + ((getFlaborstdcoste() == null) ? 0 : getFlaborstdcoste().hashCode());
        result = prime * result + ((getFmanufixstdcoste() == null) ? 0 : getFmanufixstdcoste().hashCode());
        result = prime * result + ((getFmanuvarstdcoste() == null) ? 0 : getFmanuvarstdcoste().hashCode());
        result = prime * result + ((getFomcoste() == null) ? 0 : getFomcoste().hashCode());
        result = prime * result + ((getIyear() == null) ? 0 : getIyear().hashCode());
        result = prime * result + ((getDcreatedate() == null) ? 0 : getDcreatedate().hashCode());
        result = prime * result + ((getCbatchia() == null) ? 0 : getCbatchia().hashCode());
        result = prime * result + ((getIabsnum() == null) ? 0 : getIabsnum().hashCode());
        result = prime * result + ((getIabsmoney() == null) ? 0 : getIabsmoney().hashCode());
        result = prime * result + ((getIabsinum() == null) ? 0 : getIabsinum().hashCode());
        result = prime * result + ((getIabsimoney() == null) ? 0 : getIabsimoney().hashCode());
        result = prime * result + ((getIabsonum() == null) ? 0 : getIabsonum().hashCode());
        result = prime * result + ((getIabsomoney() == null) ? 0 : getIabsomoney().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", imonth=").append(imonth);
        sb.append(", iinum=").append(iinum);
        sb.append(", ionum=").append(ionum);
        sb.append(", inum=").append(inum);
        sb.append(", iimoney=").append(iimoney);
        sb.append(", iomoney=").append(iomoney);
        sb.append(", imoney=").append(imoney);
        sb.append(", iunitprice=").append(iunitprice);
        sb.append(", idifrate=").append(idifrate);
        sb.append(", iidif=").append(iidif);
        sb.append(", iodif=").append(iodif);
        sb.append(", idif=").append(idif);
        sb.append(", fminincost=").append(fminincost);
        sb.append(", fmaxincost=").append(fmaxincost);
        sb.append(", idirect=").append(idirect);
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
        sb.append(", bmanual=").append(bmanual);
        sb.append(", iperiod=").append(iperiod);
        sb.append(", itrans=").append(itrans);
        sb.append(", flaborstdcoste=").append(flaborstdcoste);
        sb.append(", fmanufixstdcoste=").append(fmanufixstdcoste);
        sb.append(", fmanuvarstdcoste=").append(fmanuvarstdcoste);
        sb.append(", fomcoste=").append(fomcoste);
        sb.append(", iyear=").append(iyear);
        sb.append(", dcreatedate=").append(dcreatedate);
        sb.append(", cbatchia=").append(cbatchia);
        sb.append(", iabsnum=").append(iabsnum);
        sb.append(", iabsmoney=").append(iabsmoney);
        sb.append(", iabsinum=").append(iabsinum);
        sb.append(", iabsimoney=").append(iabsimoney);
        sb.append(", iabsonum=").append(iabsonum);
        sb.append(", iabsomoney=").append(iabsomoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}