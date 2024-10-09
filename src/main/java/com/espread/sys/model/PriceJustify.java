package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PriceJustify implements Serializable {
    private Integer id;

    private Date ddate;

    private String cinvcode;

    private Double ioprice;

    private Double iprice;

    private String cmemo;

    private String cmaker;

    private Double ioinvcost1;

    private Double ininvcost1;

    private Double ioinvcost2;

    private Double ininvcost2;

    private Double ioinvcost3;

    private Double ininvcost3;

    private Double ioinvsalecost;

    private Double ininvsalecost;

    private String ccusccode;

    private String ccuscode;

    private String cfree1;

    private String cfree2;

    private Double iosaleprice1;

    private Double insaleprice1;

    private Double iosaleprice2;

    private Double insaleprice2;

    private Double iosaleprice3;

    private Double insaleprice3;

    private Double ioinvcost4;

    private Double ininvcost4;

    private Double iosaleprice4;

    private Double insaleprice4;

    private Double ioinvcost5;

    private Double ininvcost5;

    private Double iosaleprice5;

    private Double insaleprice5;

    private Double ioinvcost6;

    private Double ininvcost6;

    private Double iosaleprice6;

    private Double insaleprice6;

    private Double ioinvcost7;

    private Double ininvcost7;

    private Double iosaleprice7;

    private Double insaleprice7;

    private Double ioinvcost8;

    private Double ininvcost8;

    private Double iosaleprice8;

    private Double insaleprice8;

    private Double ioinvcost9;

    private Double ininvcost9;

    private Double iosaleprice9;

    private Double insaleprice9;

    private Double ioinvcost10;

    private Double ininvcost10;

    private Double iosaleprice10;

    private Double insaleprice10;

    private Long iinvjustautoid;

    private Long icusjustautoid;

    private Long iinvpriceautoid;

    private Long icuspriceautoid;

    private Boolean binvalid;

    private Long ioinvjustautoid;

    private Long iocusjustautoid;

    private BigDecimal fminquantity;

    private BigDecimal fcusminprice;

    private Boolean bsales;

    private String cexchName;

    private String cdepcode;

    private String cpersoncode;

    private Date dstartdate;

    private Date denddate;

    private String cdefine22;

    private String cdefine23;

    private String cdefine24;

    private String cdefine25;

    private Double cdefine26;

    private Double cdefine27;

    private String cdefine28;

    private String cdefine29;

    private String cdefine30;

    private String cdefine31;

    private String cdefine32;

    private String cdefine33;

    private Integer cdefine34;

    private Integer cdefine35;

    private Date cdefine36;

    private Date cdefine37;

    private String ccusinvcode;

    private String ccusinvname;

    private String cfree3;

    private String cfree4;

    private String cfree5;

    private String cfree6;

    private String cfree7;

    private String cfree8;

    private String cfree9;

    private String cfree10;

    private String ccusproperty1;

    private Integer iperjustautoid;

    private Integer iperpriceautoid;

    private Boolean bsaleprice;
    
    private String cInvCCode;

    public String getcInvCCode() {
		return cInvCCode;
	}

	public void setcInvCCode(String cInvCCode) {
		this.cInvCCode = cInvCCode;
	}

	private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getCinvcode() {
        return cinvcode;
    }

    public void setCinvcode(String cinvcode) {
        this.cinvcode = cinvcode == null ? null : cinvcode.trim();
    }

    public Double getIoprice() {
        return ioprice;
    }

    public void setIoprice(Double ioprice) {
        this.ioprice = ioprice;
    }

    public Double getIprice() {
        return iprice;
    }

    public void setIprice(Double iprice) {
        this.iprice = iprice;
    }

    public String getCmemo() {
        return cmemo;
    }

    public void setCmemo(String cmemo) {
        this.cmemo = cmemo == null ? null : cmemo.trim();
    }

    public String getCmaker() {
        return cmaker;
    }

    public void setCmaker(String cmaker) {
        this.cmaker = cmaker == null ? null : cmaker.trim();
    }

    public Double getIoinvcost1() {
        return ioinvcost1;
    }

    public void setIoinvcost1(Double ioinvcost1) {
        this.ioinvcost1 = ioinvcost1;
    }

    public Double getIninvcost1() {
        return ininvcost1;
    }

    public void setIninvcost1(Double ininvcost1) {
        this.ininvcost1 = ininvcost1;
    }

    public Double getIoinvcost2() {
        return ioinvcost2;
    }

    public void setIoinvcost2(Double ioinvcost2) {
        this.ioinvcost2 = ioinvcost2;
    }

    public Double getIninvcost2() {
        return ininvcost2;
    }

    public void setIninvcost2(Double ininvcost2) {
        this.ininvcost2 = ininvcost2;
    }

    public Double getIoinvcost3() {
        return ioinvcost3;
    }

    public void setIoinvcost3(Double ioinvcost3) {
        this.ioinvcost3 = ioinvcost3;
    }

    public Double getIninvcost3() {
        return ininvcost3;
    }

    public void setIninvcost3(Double ininvcost3) {
        this.ininvcost3 = ininvcost3;
    }

    public Double getIoinvsalecost() {
        return ioinvsalecost;
    }

    public void setIoinvsalecost(Double ioinvsalecost) {
        this.ioinvsalecost = ioinvsalecost;
    }

    public Double getIninvsalecost() {
        return ininvsalecost;
    }

    public void setIninvsalecost(Double ininvsalecost) {
        this.ininvsalecost = ininvsalecost;
    }

    public String getCcusccode() {
        return ccusccode;
    }

    public void setCcusccode(String ccusccode) {
        this.ccusccode = ccusccode == null ? null : ccusccode.trim();
    }

    public String getCcuscode() {
        return ccuscode;
    }

    public void setCcuscode(String ccuscode) {
        this.ccuscode = ccuscode == null ? null : ccuscode.trim();
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

    public Double getIosaleprice1() {
        return iosaleprice1;
    }

    public void setIosaleprice1(Double iosaleprice1) {
        this.iosaleprice1 = iosaleprice1;
    }

    public Double getInsaleprice1() {
        return insaleprice1;
    }

    public void setInsaleprice1(Double insaleprice1) {
        this.insaleprice1 = insaleprice1;
    }

    public Double getIosaleprice2() {
        return iosaleprice2;
    }

    public void setIosaleprice2(Double iosaleprice2) {
        this.iosaleprice2 = iosaleprice2;
    }

    public Double getInsaleprice2() {
        return insaleprice2;
    }

    public void setInsaleprice2(Double insaleprice2) {
        this.insaleprice2 = insaleprice2;
    }

    public Double getIosaleprice3() {
        return iosaleprice3;
    }

    public void setIosaleprice3(Double iosaleprice3) {
        this.iosaleprice3 = iosaleprice3;
    }

    public Double getInsaleprice3() {
        return insaleprice3;
    }

    public void setInsaleprice3(Double insaleprice3) {
        this.insaleprice3 = insaleprice3;
    }

    public Double getIoinvcost4() {
        return ioinvcost4;
    }

    public void setIoinvcost4(Double ioinvcost4) {
        this.ioinvcost4 = ioinvcost4;
    }

    public Double getIninvcost4() {
        return ininvcost4;
    }

    public void setIninvcost4(Double ininvcost4) {
        this.ininvcost4 = ininvcost4;
    }

    public Double getIosaleprice4() {
        return iosaleprice4;
    }

    public void setIosaleprice4(Double iosaleprice4) {
        this.iosaleprice4 = iosaleprice4;
    }

    public Double getInsaleprice4() {
        return insaleprice4;
    }

    public void setInsaleprice4(Double insaleprice4) {
        this.insaleprice4 = insaleprice4;
    }

    public Double getIoinvcost5() {
        return ioinvcost5;
    }

    public void setIoinvcost5(Double ioinvcost5) {
        this.ioinvcost5 = ioinvcost5;
    }

    public Double getIninvcost5() {
        return ininvcost5;
    }

    public void setIninvcost5(Double ininvcost5) {
        this.ininvcost5 = ininvcost5;
    }

    public Double getIosaleprice5() {
        return iosaleprice5;
    }

    public void setIosaleprice5(Double iosaleprice5) {
        this.iosaleprice5 = iosaleprice5;
    }

    public Double getInsaleprice5() {
        return insaleprice5;
    }

    public void setInsaleprice5(Double insaleprice5) {
        this.insaleprice5 = insaleprice5;
    }

    public Double getIoinvcost6() {
        return ioinvcost6;
    }

    public void setIoinvcost6(Double ioinvcost6) {
        this.ioinvcost6 = ioinvcost6;
    }

    public Double getIninvcost6() {
        return ininvcost6;
    }

    public void setIninvcost6(Double ininvcost6) {
        this.ininvcost6 = ininvcost6;
    }

    public Double getIosaleprice6() {
        return iosaleprice6;
    }

    public void setIosaleprice6(Double iosaleprice6) {
        this.iosaleprice6 = iosaleprice6;
    }

    public Double getInsaleprice6() {
        return insaleprice6;
    }

    public void setInsaleprice6(Double insaleprice6) {
        this.insaleprice6 = insaleprice6;
    }

    public Double getIoinvcost7() {
        return ioinvcost7;
    }

    public void setIoinvcost7(Double ioinvcost7) {
        this.ioinvcost7 = ioinvcost7;
    }

    public Double getIninvcost7() {
        return ininvcost7;
    }

    public void setIninvcost7(Double ininvcost7) {
        this.ininvcost7 = ininvcost7;
    }

    public Double getIosaleprice7() {
        return iosaleprice7;
    }

    public void setIosaleprice7(Double iosaleprice7) {
        this.iosaleprice7 = iosaleprice7;
    }

    public Double getInsaleprice7() {
        return insaleprice7;
    }

    public void setInsaleprice7(Double insaleprice7) {
        this.insaleprice7 = insaleprice7;
    }

    public Double getIoinvcost8() {
        return ioinvcost8;
    }

    public void setIoinvcost8(Double ioinvcost8) {
        this.ioinvcost8 = ioinvcost8;
    }

    public Double getIninvcost8() {
        return ininvcost8;
    }

    public void setIninvcost8(Double ininvcost8) {
        this.ininvcost8 = ininvcost8;
    }

    public Double getIosaleprice8() {
        return iosaleprice8;
    }

    public void setIosaleprice8(Double iosaleprice8) {
        this.iosaleprice8 = iosaleprice8;
    }

    public Double getInsaleprice8() {
        return insaleprice8;
    }

    public void setInsaleprice8(Double insaleprice8) {
        this.insaleprice8 = insaleprice8;
    }

    public Double getIoinvcost9() {
        return ioinvcost9;
    }

    public void setIoinvcost9(Double ioinvcost9) {
        this.ioinvcost9 = ioinvcost9;
    }

    public Double getIninvcost9() {
        return ininvcost9;
    }

    public void setIninvcost9(Double ininvcost9) {
        this.ininvcost9 = ininvcost9;
    }

    public Double getIosaleprice9() {
        return iosaleprice9;
    }

    public void setIosaleprice9(Double iosaleprice9) {
        this.iosaleprice9 = iosaleprice9;
    }

    public Double getInsaleprice9() {
        return insaleprice9;
    }

    public void setInsaleprice9(Double insaleprice9) {
        this.insaleprice9 = insaleprice9;
    }

    public Double getIoinvcost10() {
        return ioinvcost10;
    }

    public void setIoinvcost10(Double ioinvcost10) {
        this.ioinvcost10 = ioinvcost10;
    }

    public Double getIninvcost10() {
        return ininvcost10;
    }

    public void setIninvcost10(Double ininvcost10) {
        this.ininvcost10 = ininvcost10;
    }

    public Double getIosaleprice10() {
        return iosaleprice10;
    }

    public void setIosaleprice10(Double iosaleprice10) {
        this.iosaleprice10 = iosaleprice10;
    }

    public Double getInsaleprice10() {
        return insaleprice10;
    }

    public void setInsaleprice10(Double insaleprice10) {
        this.insaleprice10 = insaleprice10;
    }

    public Long getIinvjustautoid() {
        return iinvjustautoid;
    }

    public void setIinvjustautoid(Long iinvjustautoid) {
        this.iinvjustautoid = iinvjustautoid;
    }

    public Long getIcusjustautoid() {
        return icusjustautoid;
    }

    public void setIcusjustautoid(Long icusjustautoid) {
        this.icusjustautoid = icusjustautoid;
    }

    public Long getIinvpriceautoid() {
        return iinvpriceautoid;
    }

    public void setIinvpriceautoid(Long iinvpriceautoid) {
        this.iinvpriceautoid = iinvpriceautoid;
    }

    public Long getIcuspriceautoid() {
        return icuspriceautoid;
    }

    public void setIcuspriceautoid(Long icuspriceautoid) {
        this.icuspriceautoid = icuspriceautoid;
    }

    public Boolean getBinvalid() {
        return binvalid;
    }

    public void setBinvalid(Boolean binvalid) {
        this.binvalid = binvalid;
    }

    public Long getIoinvjustautoid() {
        return ioinvjustautoid;
    }

    public void setIoinvjustautoid(Long ioinvjustautoid) {
        this.ioinvjustautoid = ioinvjustautoid;
    }

    public Long getIocusjustautoid() {
        return iocusjustautoid;
    }

    public void setIocusjustautoid(Long iocusjustautoid) {
        this.iocusjustautoid = iocusjustautoid;
    }

    public BigDecimal getFminquantity() {
        return fminquantity;
    }

    public void setFminquantity(BigDecimal fminquantity) {
        this.fminquantity = fminquantity;
    }

    public BigDecimal getFcusminprice() {
        return fcusminprice;
    }

    public void setFcusminprice(BigDecimal fcusminprice) {
        this.fcusminprice = fcusminprice;
    }

    public Boolean getBsales() {
        return bsales;
    }

    public void setBsales(Boolean bsales) {
        this.bsales = bsales;
    }

    public String getCexchName() {
        return cexchName;
    }

    public void setCexchName(String cexchName) {
        this.cexchName = cexchName == null ? null : cexchName.trim();
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

    public Date getDstartdate() {
        return dstartdate;
    }

    public void setDstartdate(Date dstartdate) {
        this.dstartdate = dstartdate;
    }

    public Date getDenddate() {
        return denddate;
    }

    public void setDenddate(Date denddate) {
        this.denddate = denddate;
    }

    public String getCdefine22() {
        return cdefine22;
    }

    public void setCdefine22(String cdefine22) {
        this.cdefine22 = cdefine22 == null ? null : cdefine22.trim();
    }

    public String getCdefine23() {
        return cdefine23;
    }

    public void setCdefine23(String cdefine23) {
        this.cdefine23 = cdefine23 == null ? null : cdefine23.trim();
    }

    public String getCdefine24() {
        return cdefine24;
    }

    public void setCdefine24(String cdefine24) {
        this.cdefine24 = cdefine24 == null ? null : cdefine24.trim();
    }

    public String getCdefine25() {
        return cdefine25;
    }

    public void setCdefine25(String cdefine25) {
        this.cdefine25 = cdefine25 == null ? null : cdefine25.trim();
    }

    public Double getCdefine26() {
        return cdefine26;
    }

    public void setCdefine26(Double cdefine26) {
        this.cdefine26 = cdefine26;
    }

    public Double getCdefine27() {
        return cdefine27;
    }

    public void setCdefine27(Double cdefine27) {
        this.cdefine27 = cdefine27;
    }

    public String getCdefine28() {
        return cdefine28;
    }

    public void setCdefine28(String cdefine28) {
        this.cdefine28 = cdefine28 == null ? null : cdefine28.trim();
    }

    public String getCdefine29() {
        return cdefine29;
    }

    public void setCdefine29(String cdefine29) {
        this.cdefine29 = cdefine29 == null ? null : cdefine29.trim();
    }

    public String getCdefine30() {
        return cdefine30;
    }

    public void setCdefine30(String cdefine30) {
        this.cdefine30 = cdefine30 == null ? null : cdefine30.trim();
    }

    public String getCdefine31() {
        return cdefine31;
    }

    public void setCdefine31(String cdefine31) {
        this.cdefine31 = cdefine31 == null ? null : cdefine31.trim();
    }

    public String getCdefine32() {
        return cdefine32;
    }

    public void setCdefine32(String cdefine32) {
        this.cdefine32 = cdefine32 == null ? null : cdefine32.trim();
    }

    public String getCdefine33() {
        return cdefine33;
    }

    public void setCdefine33(String cdefine33) {
        this.cdefine33 = cdefine33 == null ? null : cdefine33.trim();
    }

    public Integer getCdefine34() {
        return cdefine34;
    }

    public void setCdefine34(Integer cdefine34) {
        this.cdefine34 = cdefine34;
    }

    public Integer getCdefine35() {
        return cdefine35;
    }

    public void setCdefine35(Integer cdefine35) {
        this.cdefine35 = cdefine35;
    }

    public Date getCdefine36() {
        return cdefine36;
    }

    public void setCdefine36(Date cdefine36) {
        this.cdefine36 = cdefine36;
    }

    public Date getCdefine37() {
        return cdefine37;
    }

    public void setCdefine37(Date cdefine37) {
        this.cdefine37 = cdefine37;
    }

    public String getCcusinvcode() {
        return ccusinvcode;
    }

    public void setCcusinvcode(String ccusinvcode) {
        this.ccusinvcode = ccusinvcode == null ? null : ccusinvcode.trim();
    }

    public String getCcusinvname() {
        return ccusinvname;
    }

    public void setCcusinvname(String ccusinvname) {
        this.ccusinvname = ccusinvname == null ? null : ccusinvname.trim();
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

    public String getCcusproperty1() {
        return ccusproperty1;
    }

    public void setCcusproperty1(String ccusproperty1) {
        this.ccusproperty1 = ccusproperty1 == null ? null : ccusproperty1.trim();
    }

    public Integer getIperjustautoid() {
        return iperjustautoid;
    }

    public void setIperjustautoid(Integer iperjustautoid) {
        this.iperjustautoid = iperjustautoid;
    }

    public Integer getIperpriceautoid() {
        return iperpriceautoid;
    }

    public void setIperpriceautoid(Integer iperpriceautoid) {
        this.iperpriceautoid = iperpriceautoid;
    }

    public Boolean getBsaleprice() {
        return bsaleprice;
    }

    public void setBsaleprice(Boolean bsaleprice) {
        this.bsaleprice = bsaleprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ddate=").append(ddate);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", ioprice=").append(ioprice);
        sb.append(", iprice=").append(iprice);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", ioinvcost1=").append(ioinvcost1);
        sb.append(", ininvcost1=").append(ininvcost1);
        sb.append(", ioinvcost2=").append(ioinvcost2);
        sb.append(", ininvcost2=").append(ininvcost2);
        sb.append(", ioinvcost3=").append(ioinvcost3);
        sb.append(", ininvcost3=").append(ininvcost3);
        sb.append(", ioinvsalecost=").append(ioinvsalecost);
        sb.append(", ininvsalecost=").append(ininvsalecost);
        sb.append(", ccusccode=").append(ccusccode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", iosaleprice1=").append(iosaleprice1);
        sb.append(", insaleprice1=").append(insaleprice1);
        sb.append(", iosaleprice2=").append(iosaleprice2);
        sb.append(", insaleprice2=").append(insaleprice2);
        sb.append(", iosaleprice3=").append(iosaleprice3);
        sb.append(", insaleprice3=").append(insaleprice3);
        sb.append(", ioinvcost4=").append(ioinvcost4);
        sb.append(", ininvcost4=").append(ininvcost4);
        sb.append(", iosaleprice4=").append(iosaleprice4);
        sb.append(", insaleprice4=").append(insaleprice4);
        sb.append(", ioinvcost5=").append(ioinvcost5);
        sb.append(", ininvcost5=").append(ininvcost5);
        sb.append(", iosaleprice5=").append(iosaleprice5);
        sb.append(", insaleprice5=").append(insaleprice5);
        sb.append(", ioinvcost6=").append(ioinvcost6);
        sb.append(", ininvcost6=").append(ininvcost6);
        sb.append(", iosaleprice6=").append(iosaleprice6);
        sb.append(", insaleprice6=").append(insaleprice6);
        sb.append(", ioinvcost7=").append(ioinvcost7);
        sb.append(", ininvcost7=").append(ininvcost7);
        sb.append(", iosaleprice7=").append(iosaleprice7);
        sb.append(", insaleprice7=").append(insaleprice7);
        sb.append(", ioinvcost8=").append(ioinvcost8);
        sb.append(", ininvcost8=").append(ininvcost8);
        sb.append(", iosaleprice8=").append(iosaleprice8);
        sb.append(", insaleprice8=").append(insaleprice8);
        sb.append(", ioinvcost9=").append(ioinvcost9);
        sb.append(", ininvcost9=").append(ininvcost9);
        sb.append(", iosaleprice9=").append(iosaleprice9);
        sb.append(", insaleprice9=").append(insaleprice9);
        sb.append(", ioinvcost10=").append(ioinvcost10);
        sb.append(", ininvcost10=").append(ininvcost10);
        sb.append(", iosaleprice10=").append(iosaleprice10);
        sb.append(", insaleprice10=").append(insaleprice10);
        sb.append(", iinvjustautoid=").append(iinvjustautoid);
        sb.append(", icusjustautoid=").append(icusjustautoid);
        sb.append(", iinvpriceautoid=").append(iinvpriceautoid);
        sb.append(", icuspriceautoid=").append(icuspriceautoid);
        sb.append(", binvalid=").append(binvalid);
        sb.append(", ioinvjustautoid=").append(ioinvjustautoid);
        sb.append(", iocusjustautoid=").append(iocusjustautoid);
        sb.append(", fminquantity=").append(fminquantity);
        sb.append(", fcusminprice=").append(fcusminprice);
        sb.append(", bsales=").append(bsales);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", dstartdate=").append(dstartdate);
        sb.append(", denddate=").append(denddate);
        sb.append(", cdefine22=").append(cdefine22);
        sb.append(", cdefine23=").append(cdefine23);
        sb.append(", cdefine24=").append(cdefine24);
        sb.append(", cdefine25=").append(cdefine25);
        sb.append(", cdefine26=").append(cdefine26);
        sb.append(", cdefine27=").append(cdefine27);
        sb.append(", cdefine28=").append(cdefine28);
        sb.append(", cdefine29=").append(cdefine29);
        sb.append(", cdefine30=").append(cdefine30);
        sb.append(", cdefine31=").append(cdefine31);
        sb.append(", cdefine32=").append(cdefine32);
        sb.append(", cdefine33=").append(cdefine33);
        sb.append(", cdefine34=").append(cdefine34);
        sb.append(", cdefine35=").append(cdefine35);
        sb.append(", cdefine36=").append(cdefine36);
        sb.append(", cdefine37=").append(cdefine37);
        sb.append(", ccusinvcode=").append(ccusinvcode);
        sb.append(", ccusinvname=").append(ccusinvname);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", ccusproperty1=").append(ccusproperty1);
        sb.append(", iperjustautoid=").append(iperjustautoid);
        sb.append(", iperpriceautoid=").append(iperpriceautoid);
        sb.append(", bsaleprice=").append(bsaleprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}