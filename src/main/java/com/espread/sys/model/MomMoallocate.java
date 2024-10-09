package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MomMoallocate implements Serializable {
    private Integer allocateid;

    private Integer modid;

    private Integer sortseq;

    private String opseq;

    private Integer componentid;

    private Byte fvflag;

    private BigDecimal baseqtyn;

    private BigDecimal baseqtyd;

    private BigDecimal parentscrap;

    private BigDecimal compscrap;

    private BigDecimal qty;

    private BigDecimal issqty;

    private BigDecimal declaredqty;

    private Date startdemdate;

    private Date enddemdate;

    private String whcode;

    private String lotno;

    private Byte wiptype;

    private Boolean byproductflag;

    private Boolean qcflag;

    private Short offset;

    private String invcode;

    private String free1;

    private String free2;

    private String free3;

    private String free4;

    private String free5;

    private String free6;

    private String free7;

    private String free8;

    private String free9;

    private String free10;

    private Integer opcomponentid;

    private String define22;

    private String define23;

    private String define24;

    private String define25;

    private Double define26;

    private Double define27;

    private String define28;

    private String define29;

    private String define30;

    private String define31;

    private String define32;

    private String define33;

    private Integer define34;

    private Integer define35;

    private Date define36;

    private Date define37;

    private String auxunitcode;

    private BigDecimal changerate;

    private BigDecimal auxbaseqtyn;

    private BigDecimal auxqty;

    private BigDecimal replenishqty;

    private String remark;

    private BigDecimal transqty;

    private Byte producttype;

    private Byte sotype;

    private String sodid;

    private String socode;

    private Integer soseq;

    private String demandcode;

    private Boolean qmflag;

    private BigDecimal orgqty;

    private BigDecimal orgauxqty;

    private String costitemcode;

    private String costitemname;

    private Boolean requisitionflag;

    private BigDecimal requisitionqty;

    private BigDecimal requisitionissqty;

    private Boolean costwiprel;

    private String moallocatesubid;

    private String csubsysbarcode;

    private BigDecimal pickingqty;

    private BigDecimal pickingauxqty;

    private BigDecimal uppermoqty;

    private Boolean invalloeflag;

    private String factorycode;
    
    private String ccomunitname;

    public String getCcomunitname() {
		return ccomunitname;
	}

	public void setCcomunitname(String ccomunitname) {
		this.ccomunitname = ccomunitname;
	}

	private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getAllocateid() {
        return allocateid;
    }

    public void setAllocateid(Integer allocateid) {
        this.allocateid = allocateid;
    }

    public Integer getModid() {
        return modid;
    }

    public void setModid(Integer modid) {
        this.modid = modid;
    }

    public Integer getSortseq() {
        return sortseq;
    }

    public void setSortseq(Integer sortseq) {
        this.sortseq = sortseq;
    }

    public String getOpseq() {
        return opseq;
    }

    public void setOpseq(String opseq) {
        this.opseq = opseq == null ? null : opseq.trim();
    }

    public Integer getComponentid() {
        return componentid;
    }

    public void setComponentid(Integer componentid) {
        this.componentid = componentid;
    }

    public Byte getFvflag() {
        return fvflag;
    }

    public void setFvflag(Byte fvflag) {
        this.fvflag = fvflag;
    }

    public BigDecimal getBaseqtyn() {
        return baseqtyn;
    }

    public void setBaseqtyn(BigDecimal baseqtyn) {
        this.baseqtyn = baseqtyn;
    }

    public BigDecimal getBaseqtyd() {
        return baseqtyd;
    }

    public void setBaseqtyd(BigDecimal baseqtyd) {
        this.baseqtyd = baseqtyd;
    }

    public BigDecimal getParentscrap() {
        return parentscrap;
    }

    public void setParentscrap(BigDecimal parentscrap) {
        this.parentscrap = parentscrap;
    }

    public BigDecimal getCompscrap() {
        return compscrap;
    }

    public void setCompscrap(BigDecimal compscrap) {
        this.compscrap = compscrap;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getIssqty() {
        return issqty;
    }

    public void setIssqty(BigDecimal issqty) {
        this.issqty = issqty;
    }

    public BigDecimal getDeclaredqty() {
        return declaredqty;
    }

    public void setDeclaredqty(BigDecimal declaredqty) {
        this.declaredqty = declaredqty;
    }

    public Date getStartdemdate() {
        return startdemdate;
    }

    public void setStartdemdate(Date startdemdate) {
        this.startdemdate = startdemdate;
    }

    public Date getEnddemdate() {
        return enddemdate;
    }

    public void setEnddemdate(Date enddemdate) {
        this.enddemdate = enddemdate;
    }

    public String getWhcode() {
        return whcode;
    }

    public void setWhcode(String whcode) {
        this.whcode = whcode == null ? null : whcode.trim();
    }

    public String getLotno() {
        return lotno;
    }

    public void setLotno(String lotno) {
        this.lotno = lotno == null ? null : lotno.trim();
    }

    public Byte getWiptype() {
        return wiptype;
    }

    public void setWiptype(Byte wiptype) {
        this.wiptype = wiptype;
    }

    public Boolean getByproductflag() {
        return byproductflag;
    }

    public void setByproductflag(Boolean byproductflag) {
        this.byproductflag = byproductflag;
    }

    public Boolean getQcflag() {
        return qcflag;
    }

    public void setQcflag(Boolean qcflag) {
        this.qcflag = qcflag;
    }

    public Short getOffset() {
        return offset;
    }

    public void setOffset(Short offset) {
        this.offset = offset;
    }

    public String getInvcode() {
        return invcode;
    }

    public void setInvcode(String invcode) {
        this.invcode = invcode == null ? null : invcode.trim();
    }

    public String getFree1() {
        return free1;
    }

    public void setFree1(String free1) {
        this.free1 = free1 == null ? null : free1.trim();
    }

    public String getFree2() {
        return free2;
    }

    public void setFree2(String free2) {
        this.free2 = free2 == null ? null : free2.trim();
    }

    public String getFree3() {
        return free3;
    }

    public void setFree3(String free3) {
        this.free3 = free3 == null ? null : free3.trim();
    }

    public String getFree4() {
        return free4;
    }

    public void setFree4(String free4) {
        this.free4 = free4 == null ? null : free4.trim();
    }

    public String getFree5() {
        return free5;
    }

    public void setFree5(String free5) {
        this.free5 = free5 == null ? null : free5.trim();
    }

    public String getFree6() {
        return free6;
    }

    public void setFree6(String free6) {
        this.free6 = free6 == null ? null : free6.trim();
    }

    public String getFree7() {
        return free7;
    }

    public void setFree7(String free7) {
        this.free7 = free7 == null ? null : free7.trim();
    }

    public String getFree8() {
        return free8;
    }

    public void setFree8(String free8) {
        this.free8 = free8 == null ? null : free8.trim();
    }

    public String getFree9() {
        return free9;
    }

    public void setFree9(String free9) {
        this.free9 = free9 == null ? null : free9.trim();
    }

    public String getFree10() {
        return free10;
    }

    public void setFree10(String free10) {
        this.free10 = free10 == null ? null : free10.trim();
    }

    public Integer getOpcomponentid() {
        return opcomponentid;
    }

    public void setOpcomponentid(Integer opcomponentid) {
        this.opcomponentid = opcomponentid;
    }

    public String getDefine22() {
        return define22;
    }

    public void setDefine22(String define22) {
        this.define22 = define22 == null ? null : define22.trim();
    }

    public String getDefine23() {
        return define23;
    }

    public void setDefine23(String define23) {
        this.define23 = define23 == null ? null : define23.trim();
    }

    public String getDefine24() {
        return define24;
    }

    public void setDefine24(String define24) {
        this.define24 = define24 == null ? null : define24.trim();
    }

    public String getDefine25() {
        return define25;
    }

    public void setDefine25(String define25) {
        this.define25 = define25 == null ? null : define25.trim();
    }

    public Double getDefine26() {
        return define26;
    }

    public void setDefine26(Double define26) {
        this.define26 = define26;
    }

    public Double getDefine27() {
        return define27;
    }

    public void setDefine27(Double define27) {
        this.define27 = define27;
    }

    public String getDefine28() {
        return define28;
    }

    public void setDefine28(String define28) {
        this.define28 = define28 == null ? null : define28.trim();
    }

    public String getDefine29() {
        return define29;
    }

    public void setDefine29(String define29) {
        this.define29 = define29 == null ? null : define29.trim();
    }

    public String getDefine30() {
        return define30;
    }

    public void setDefine30(String define30) {
        this.define30 = define30 == null ? null : define30.trim();
    }

    public String getDefine31() {
        return define31;
    }

    public void setDefine31(String define31) {
        this.define31 = define31 == null ? null : define31.trim();
    }

    public String getDefine32() {
        return define32;
    }

    public void setDefine32(String define32) {
        this.define32 = define32 == null ? null : define32.trim();
    }

    public String getDefine33() {
        return define33;
    }

    public void setDefine33(String define33) {
        this.define33 = define33 == null ? null : define33.trim();
    }

    public Integer getDefine34() {
        return define34;
    }

    public void setDefine34(Integer define34) {
        this.define34 = define34;
    }

    public Integer getDefine35() {
        return define35;
    }

    public void setDefine35(Integer define35) {
        this.define35 = define35;
    }

    public Date getDefine36() {
        return define36;
    }

    public void setDefine36(Date define36) {
        this.define36 = define36;
    }

    public Date getDefine37() {
        return define37;
    }

    public void setDefine37(Date define37) {
        this.define37 = define37;
    }

    public String getAuxunitcode() {
        return auxunitcode;
    }

    public void setAuxunitcode(String auxunitcode) {
        this.auxunitcode = auxunitcode == null ? null : auxunitcode.trim();
    }

    public BigDecimal getChangerate() {
        return changerate;
    }

    public void setChangerate(BigDecimal changerate) {
        this.changerate = changerate;
    }

    public BigDecimal getAuxbaseqtyn() {
        return auxbaseqtyn;
    }

    public void setAuxbaseqtyn(BigDecimal auxbaseqtyn) {
        this.auxbaseqtyn = auxbaseqtyn;
    }

    public BigDecimal getAuxqty() {
        return auxqty;
    }

    public void setAuxqty(BigDecimal auxqty) {
        this.auxqty = auxqty;
    }

    public BigDecimal getReplenishqty() {
        return replenishqty;
    }

    public void setReplenishqty(BigDecimal replenishqty) {
        this.replenishqty = replenishqty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTransqty() {
        return transqty;
    }

    public void setTransqty(BigDecimal transqty) {
        this.transqty = transqty;
    }

    public Byte getProducttype() {
        return producttype;
    }

    public void setProducttype(Byte producttype) {
        this.producttype = producttype;
    }

    public Byte getSotype() {
        return sotype;
    }

    public void setSotype(Byte sotype) {
        this.sotype = sotype;
    }

    public String getSodid() {
        return sodid;
    }

    public void setSodid(String sodid) {
        this.sodid = sodid == null ? null : sodid.trim();
    }

    public String getSocode() {
        return socode;
    }

    public void setSocode(String socode) {
        this.socode = socode == null ? null : socode.trim();
    }

    public Integer getSoseq() {
        return soseq;
    }

    public void setSoseq(Integer soseq) {
        this.soseq = soseq;
    }

    public String getDemandcode() {
        return demandcode;
    }

    public void setDemandcode(String demandcode) {
        this.demandcode = demandcode == null ? null : demandcode.trim();
    }

    public Boolean getQmflag() {
        return qmflag;
    }

    public void setQmflag(Boolean qmflag) {
        this.qmflag = qmflag;
    }

    public BigDecimal getOrgqty() {
        return orgqty;
    }

    public void setOrgqty(BigDecimal orgqty) {
        this.orgqty = orgqty;
    }

    public BigDecimal getOrgauxqty() {
        return orgauxqty;
    }

    public void setOrgauxqty(BigDecimal orgauxqty) {
        this.orgauxqty = orgauxqty;
    }

    public String getCostitemcode() {
        return costitemcode;
    }

    public void setCostitemcode(String costitemcode) {
        this.costitemcode = costitemcode == null ? null : costitemcode.trim();
    }

    public String getCostitemname() {
        return costitemname;
    }

    public void setCostitemname(String costitemname) {
        this.costitemname = costitemname == null ? null : costitemname.trim();
    }

    public Boolean getRequisitionflag() {
        return requisitionflag;
    }

    public void setRequisitionflag(Boolean requisitionflag) {
        this.requisitionflag = requisitionflag;
    }

    public BigDecimal getRequisitionqty() {
        return requisitionqty;
    }

    public void setRequisitionqty(BigDecimal requisitionqty) {
        this.requisitionqty = requisitionqty;
    }

    public BigDecimal getRequisitionissqty() {
        return requisitionissqty;
    }

    public void setRequisitionissqty(BigDecimal requisitionissqty) {
        this.requisitionissqty = requisitionissqty;
    }

    public Boolean getCostwiprel() {
        return costwiprel;
    }

    public void setCostwiprel(Boolean costwiprel) {
        this.costwiprel = costwiprel;
    }

    public String getMoallocatesubid() {
        return moallocatesubid;
    }

    public void setMoallocatesubid(String moallocatesubid) {
        this.moallocatesubid = moallocatesubid == null ? null : moallocatesubid.trim();
    }

    public String getCsubsysbarcode() {
        return csubsysbarcode;
    }

    public void setCsubsysbarcode(String csubsysbarcode) {
        this.csubsysbarcode = csubsysbarcode == null ? null : csubsysbarcode.trim();
    }

    public BigDecimal getPickingqty() {
        return pickingqty;
    }

    public void setPickingqty(BigDecimal pickingqty) {
        this.pickingqty = pickingqty;
    }

    public BigDecimal getPickingauxqty() {
        return pickingauxqty;
    }

    public void setPickingauxqty(BigDecimal pickingauxqty) {
        this.pickingauxqty = pickingauxqty;
    }

    public BigDecimal getUppermoqty() {
        return uppermoqty;
    }

    public void setUppermoqty(BigDecimal uppermoqty) {
        this.uppermoqty = uppermoqty;
    }

    public Boolean getInvalloeflag() {
        return invalloeflag;
    }

    public void setInvalloeflag(Boolean invalloeflag) {
        this.invalloeflag = invalloeflag;
    }

    public String getFactorycode() {
        return factorycode;
    }

    public void setFactorycode(String factorycode) {
        this.factorycode = factorycode == null ? null : factorycode.trim();
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
        sb.append(", allocateid=").append(allocateid);
        sb.append(", modid=").append(modid);
        sb.append(", sortseq=").append(sortseq);
        sb.append(", opseq=").append(opseq);
        sb.append(", componentid=").append(componentid);
        sb.append(", fvflag=").append(fvflag);
        sb.append(", baseqtyn=").append(baseqtyn);
        sb.append(", baseqtyd=").append(baseqtyd);
        sb.append(", parentscrap=").append(parentscrap);
        sb.append(", compscrap=").append(compscrap);
        sb.append(", qty=").append(qty);
        sb.append(", issqty=").append(issqty);
        sb.append(", declaredqty=").append(declaredqty);
        sb.append(", startdemdate=").append(startdemdate);
        sb.append(", enddemdate=").append(enddemdate);
        sb.append(", whcode=").append(whcode);
        sb.append(", lotno=").append(lotno);
        sb.append(", wiptype=").append(wiptype);
        sb.append(", byproductflag=").append(byproductflag);
        sb.append(", qcflag=").append(qcflag);
        sb.append(", offset=").append(offset);
        sb.append(", invcode=").append(invcode);
        sb.append(", free1=").append(free1);
        sb.append(", free2=").append(free2);
        sb.append(", free3=").append(free3);
        sb.append(", free4=").append(free4);
        sb.append(", free5=").append(free5);
        sb.append(", free6=").append(free6);
        sb.append(", free7=").append(free7);
        sb.append(", free8=").append(free8);
        sb.append(", free9=").append(free9);
        sb.append(", free10=").append(free10);
        sb.append(", opcomponentid=").append(opcomponentid);
        sb.append(", define22=").append(define22);
        sb.append(", define23=").append(define23);
        sb.append(", define24=").append(define24);
        sb.append(", define25=").append(define25);
        sb.append(", define26=").append(define26);
        sb.append(", define27=").append(define27);
        sb.append(", define28=").append(define28);
        sb.append(", define29=").append(define29);
        sb.append(", define30=").append(define30);
        sb.append(", define31=").append(define31);
        sb.append(", define32=").append(define32);
        sb.append(", define33=").append(define33);
        sb.append(", define34=").append(define34);
        sb.append(", define35=").append(define35);
        sb.append(", define36=").append(define36);
        sb.append(", define37=").append(define37);
        sb.append(", auxunitcode=").append(auxunitcode);
        sb.append(", changerate=").append(changerate);
        sb.append(", auxbaseqtyn=").append(auxbaseqtyn);
        sb.append(", auxqty=").append(auxqty);
        sb.append(", replenishqty=").append(replenishqty);
        sb.append(", remark=").append(remark);
        sb.append(", transqty=").append(transqty);
        sb.append(", producttype=").append(producttype);
        sb.append(", sotype=").append(sotype);
        sb.append(", sodid=").append(sodid);
        sb.append(", socode=").append(socode);
        sb.append(", soseq=").append(soseq);
        sb.append(", demandcode=").append(demandcode);
        sb.append(", qmflag=").append(qmflag);
        sb.append(", orgqty=").append(orgqty);
        sb.append(", orgauxqty=").append(orgauxqty);
        sb.append(", costitemcode=").append(costitemcode);
        sb.append(", costitemname=").append(costitemname);
        sb.append(", requisitionflag=").append(requisitionflag);
        sb.append(", requisitionqty=").append(requisitionqty);
        sb.append(", requisitionissqty=").append(requisitionissqty);
        sb.append(", costwiprel=").append(costwiprel);
        sb.append(", moallocatesubid=").append(moallocatesubid);
        sb.append(", csubsysbarcode=").append(csubsysbarcode);
        sb.append(", pickingqty=").append(pickingqty);
        sb.append(", pickingauxqty=").append(pickingauxqty);
        sb.append(", uppermoqty=").append(uppermoqty);
        sb.append(", invalloeflag=").append(invalloeflag);
        sb.append(", factorycode=").append(factorycode);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}