package com.espread.sys.model;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name ="CurrentStock")
public class CurrentStock implements Serializable {
    private Integer autoid;

    private String cwhcode;

    private String cinvcode;

    private Integer itemid;

    private String cbatch;

    private String cvmivencode;

    private Integer isotype;

    private String isodid;

    private BigDecimal iquantity;

    private BigDecimal inum;

    private String cfree1;

    private String cfree2;

    private BigDecimal foutquantity;

    private BigDecimal foutnum;

    private BigDecimal finquantity;

    private BigDecimal finnum;

    private String cfree3;

    private String cfree4;

    private String cfree5;

    private String cfree6;

    private String cfree7;

    private String cfree8;

    private String cfree9;

    private String cfree10;

    private Date dvdate;

    private Boolean bstopflag;

    private BigDecimal ftransinquantity;

    private Date dmdate;

    private BigDecimal ftransinnum;

    private BigDecimal ftransoutquantity;

    private BigDecimal ftransoutnum;

    private BigDecimal fplanquantity;

    private BigDecimal fplannum;

    private BigDecimal fdisablequantity;

    private BigDecimal fdisablenum;

    private BigDecimal favaquantity;

    private BigDecimal favanum;

    private Integer imassdate;

    private Boolean bgspstop;

    private Short cmassunit;

    private BigDecimal fstopquantity;

    private BigDecimal fstopnum;

    private Date dlastcheckdate;

    private String ccheckstate;

    private Date dlastyearcheckdate;

    private Short iexpiratdatecalcu;

    private String cexpirationdate;

    private Date dexpirationdate;

    private BigDecimal ipeqty;

    private BigDecimal ipenum;

    private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getCwhcode() {
        return cwhcode;
    }

    public void setCwhcode(String cwhcode) {
        this.cwhcode = cwhcode == null ? null : cwhcode.trim();
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getCbatch() {
        return cbatch;
    }

    public void setCbatch(String cbatch) {
        this.cbatch = cbatch == null ? null : cbatch.trim();
    }

    public String getCvmivencode() {
        return cvmivencode;
    }

    public void setCvmivencode(String cvmivencode) {
        this.cvmivencode = cvmivencode == null ? null : cvmivencode.trim();
    }

    public Integer getIsotype() {
        return isotype;
    }

    public void setIsotype(Integer isotype) {
        this.isotype = isotype;
    }

    public String getIsodid() {
        return isodid;
    }

    public void setIsodid(String isodid) {
        this.isodid = isodid == null ? null : isodid.trim();
    }

    public BigDecimal getIquantity() {
        return iquantity;
    }

    public void setIquantity(BigDecimal iquantity) {
        this.iquantity = iquantity;
    }

    public BigDecimal getInum() {
        return inum;
    }

    public void setInum(BigDecimal inum) {
        this.inum = inum;
    }

    public String getCfree1() {
        return cfree1;
    }

    public void setCfree1(String cfree1) {
        this.cfree1 = cfree1 == null ? null : cfree1.trim();
    }

    public String getCfree2() {
        return cfree2;
    }

    public void setCfree2(String cfree2) {
        this.cfree2 = cfree2 == null ? null : cfree2.trim();
    }

    public BigDecimal getFoutquantity() {
        return foutquantity;
    }

    public void setFoutquantity(BigDecimal foutquantity) {
        this.foutquantity = foutquantity;
    }

    public BigDecimal getFoutnum() {
        return foutnum;
    }

    public void setFoutnum(BigDecimal foutnum) {
        this.foutnum = foutnum;
    }

    public BigDecimal getFinquantity() {
        return finquantity;
    }

    public void setFinquantity(BigDecimal finquantity) {
        this.finquantity = finquantity;
    }

    public BigDecimal getFinnum() {
        return finnum;
    }

    public void setFinnum(BigDecimal finnum) {
        this.finnum = finnum;
    }

    public String getCfree3() {
        return cfree3;
    }

    public void setCfree3(String cfree3) {
        this.cfree3 = cfree3 == null ? null : cfree3.trim();
    }

    public String getCfree4() {
        return cfree4;
    }

    public void setCfree4(String cfree4) {
        this.cfree4 = cfree4 == null ? null : cfree4.trim();
    }

    public String getCfree5() {
        return cfree5;
    }

    public void setCfree5(String cfree5) {
        this.cfree5 = cfree5 == null ? null : cfree5.trim();
    }

    public String getCfree6() {
        return cfree6;
    }

    public void setCfree6(String cfree6) {
        this.cfree6 = cfree6 == null ? null : cfree6.trim();
    }

    public String getCfree7() {
        return cfree7;
    }

    public void setCfree7(String cfree7) {
        this.cfree7 = cfree7 == null ? null : cfree7.trim();
    }

    public String getCfree8() {
        return cfree8;
    }

    public void setCfree8(String cfree8) {
        this.cfree8 = cfree8 == null ? null : cfree8.trim();
    }

    public String getCfree9() {
        return cfree9;
    }

    public void setCfree9(String cfree9) {
        this.cfree9 = cfree9 == null ? null : cfree9.trim();
    }

    public String getCfree10() {
        return cfree10;
    }

    public void setCfree10(String cfree10) {
        this.cfree10 = cfree10 == null ? null : cfree10.trim();
    }

    public Date getDvdate() {
        return dvdate;
    }

    public void setDvdate(Date dvdate) {
        this.dvdate = dvdate;
    }

    public Boolean getBstopflag() {
        return bstopflag;
    }

    public void setBstopflag(Boolean bstopflag) {
        this.bstopflag = bstopflag;
    }

    public BigDecimal getFtransinquantity() {
        return ftransinquantity;
    }

    public void setFtransinquantity(BigDecimal ftransinquantity) {
        this.ftransinquantity = ftransinquantity;
    }

    public Date getDmdate() {
        return dmdate;
    }

    public void setDmdate(Date dmdate) {
        this.dmdate = dmdate;
    }

    public BigDecimal getFtransinnum() {
        return ftransinnum;
    }

    public void setFtransinnum(BigDecimal ftransinnum) {
        this.ftransinnum = ftransinnum;
    }

    public BigDecimal getFtransoutquantity() {
        return ftransoutquantity;
    }

    public void setFtransoutquantity(BigDecimal ftransoutquantity) {
        this.ftransoutquantity = ftransoutquantity;
    }

    public BigDecimal getFtransoutnum() {
        return ftransoutnum;
    }

    public void setFtransoutnum(BigDecimal ftransoutnum) {
        this.ftransoutnum = ftransoutnum;
    }

    public BigDecimal getFplanquantity() {
        return fplanquantity;
    }

    public void setFplanquantity(BigDecimal fplanquantity) {
        this.fplanquantity = fplanquantity;
    }

    public BigDecimal getFplannum() {
        return fplannum;
    }

    public void setFplannum(BigDecimal fplannum) {
        this.fplannum = fplannum;
    }

    public BigDecimal getFdisablequantity() {
        return fdisablequantity;
    }

    public void setFdisablequantity(BigDecimal fdisablequantity) {
        this.fdisablequantity = fdisablequantity;
    }

    public BigDecimal getFdisablenum() {
        return fdisablenum;
    }

    public void setFdisablenum(BigDecimal fdisablenum) {
        this.fdisablenum = fdisablenum;
    }

    public BigDecimal getFavaquantity() {
        return favaquantity;
    }

    public void setFavaquantity(BigDecimal favaquantity) {
        this.favaquantity = favaquantity;
    }

    public BigDecimal getFavanum() {
        return favanum;
    }

    public void setFavanum(BigDecimal favanum) {
        this.favanum = favanum;
    }

    public Integer getImassdate() {
        return imassdate;
    }

    public void setImassdate(Integer imassdate) {
        this.imassdate = imassdate;
    }

    public Boolean getBgspstop() {
        return bgspstop;
    }

    public void setBgspstop(Boolean bgspstop) {
        this.bgspstop = bgspstop;
    }

    public Short getCmassunit() {
        return cmassunit;
    }

    public void setCmassunit(Short cmassunit) {
        this.cmassunit = cmassunit;
    }

    public BigDecimal getFstopquantity() {
        return fstopquantity;
    }

    public void setFstopquantity(BigDecimal fstopquantity) {
        this.fstopquantity = fstopquantity;
    }

    public BigDecimal getFstopnum() {
        return fstopnum;
    }

    public void setFstopnum(BigDecimal fstopnum) {
        this.fstopnum = fstopnum;
    }

    public Date getDlastcheckdate() {
        return dlastcheckdate;
    }

    public void setDlastcheckdate(Date dlastcheckdate) {
        this.dlastcheckdate = dlastcheckdate;
    }

    public String getCcheckstate() {
        return ccheckstate;
    }

    public void setCcheckstate(String ccheckstate) {
        this.ccheckstate = ccheckstate == null ? null : ccheckstate.trim();
    }

    public Date getDlastyearcheckdate() {
        return dlastyearcheckdate;
    }

    public void setDlastyearcheckdate(Date dlastyearcheckdate) {
        this.dlastyearcheckdate = dlastyearcheckdate;
    }

    public Short getIexpiratdatecalcu() {
        return iexpiratdatecalcu;
    }

    public void setIexpiratdatecalcu(Short iexpiratdatecalcu) {
        this.iexpiratdatecalcu = iexpiratdatecalcu;
    }

    public String getCexpirationdate() {
        return cexpirationdate;
    }

    public void setCexpirationdate(String cexpirationdate) {
        this.cexpirationdate = cexpirationdate == null ? null : cexpirationdate.trim();
    }

    public Date getDexpirationdate() {
        return dexpirationdate;
    }

    public void setDexpirationdate(Date dexpirationdate) {
        this.dexpirationdate = dexpirationdate;
    }

    public BigDecimal getIpeqty() {
        return ipeqty;
    }

    public void setIpeqty(BigDecimal ipeqty) {
        this.ipeqty = ipeqty;
    }

    public BigDecimal getIpenum() {
        return ipenum;
    }

    public void setIpenum(BigDecimal ipenum) {
        this.ipenum = ipenum;
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
        sb.append(", autoid=").append(autoid);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", itemid=").append(itemid);
        sb.append(", cbatch=").append(cbatch);
        sb.append(", cvmivencode=").append(cvmivencode);
        sb.append(", isotype=").append(isotype);
        sb.append(", isodid=").append(isodid);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", inum=").append(inum);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", foutquantity=").append(foutquantity);
        sb.append(", foutnum=").append(foutnum);
        sb.append(", finquantity=").append(finquantity);
        sb.append(", finnum=").append(finnum);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", dvdate=").append(dvdate);
        sb.append(", bstopflag=").append(bstopflag);
        sb.append(", ftransinquantity=").append(ftransinquantity);
        sb.append(", dmdate=").append(dmdate);
        sb.append(", ftransinnum=").append(ftransinnum);
        sb.append(", ftransoutquantity=").append(ftransoutquantity);
        sb.append(", ftransoutnum=").append(ftransoutnum);
        sb.append(", fplanquantity=").append(fplanquantity);
        sb.append(", fplannum=").append(fplannum);
        sb.append(", fdisablequantity=").append(fdisablequantity);
        sb.append(", fdisablenum=").append(fdisablenum);
        sb.append(", favaquantity=").append(favaquantity);
        sb.append(", favanum=").append(favanum);
        sb.append(", imassdate=").append(imassdate);
        sb.append(", bgspstop=").append(bgspstop);
        sb.append(", cmassunit=").append(cmassunit);
        sb.append(", fstopquantity=").append(fstopquantity);
        sb.append(", fstopnum=").append(fstopnum);
        sb.append(", dlastcheckdate=").append(dlastcheckdate);
        sb.append(", ccheckstate=").append(ccheckstate);
        sb.append(", dlastyearcheckdate=").append(dlastyearcheckdate);
        sb.append(", iexpiratdatecalcu=").append(iexpiratdatecalcu);
        sb.append(", cexpirationdate=").append(cexpirationdate);
        sb.append(", dexpirationdate=").append(dexpirationdate);
        sb.append(", ipeqty=").append(ipeqty);
        sb.append(", ipenum=").append(ipenum);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}