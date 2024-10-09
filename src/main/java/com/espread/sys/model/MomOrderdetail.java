package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MomOrderdetail implements Serializable {
    private Integer modid;

    private Integer moid;

    private Integer sortseq;

    private Byte moclass;

    private Integer motypeid;

    private BigDecimal qty;

    private BigDecimal mrpqty;

    private String auxunitcode;

    private BigDecimal auxqty;

    private BigDecimal changerate;

    private String molotcode;

    private String whcode;

    private String mdeptcode;

    private Byte sotype;

    private String sodid;

    private String socode;

    private Integer soseq;

    private BigDecimal declaredqty;

    private BigDecimal qualifiedinqty;

    private Byte status;

    private Byte orgstatus;

    private Integer bomid;

    private Integer routingid;

    private Integer custbomid;

    private Integer demandid;

    private String plancode;

    private Integer partid;

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

    private Boolean sfcflag;

    private Boolean crpflag;

    private Boolean qcflag;

    private Date relsdate;

    private String relsuser;

    private Date closedate;

    private Date orgclsdate;

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

    private Integer leadtime;

    private Byte opscheduletype;

    private Boolean ordflag;

    private Byte wiptype;

    private String supplywhcode;

    private String reasoncode;

    private Byte iswfcontrolled;

    private Integer iverifystate;

    private Integer ireturncount;

    private String remark;

    private String sourcemocode;

    private Integer sourcemoseq;

    private Integer sourcemoid;

    private Integer sourcemodid;

    private String sourceqccode;

    private Integer sourceqcid;

    private Integer sourceqcdid;

    private String costitemcode;

    private String costitemname;

    private Date relstime;

    private String closeuser;

    private Date closetime;

    private Date orgclstime;

    private Byte auditstatus;

    private Integer pallocateid;

    private String demandcode;

    private Byte collectiveflag;

    private Byte ordertype;

    private Integer orderdid;

    private String ordercode;

    private Integer orderseq;

    private String manualcode;

    private Boolean reformflag;

    private Byte sourceqcvouchtype;

    private BigDecimal orgqty;

    private Boolean fmflag;

    private String minsn;

    private String maxsn;

    private String sourcesvccode;

    private String sourcesvcid;

    private String sourcesvcdid;

    private Byte bomtype;

    private Byte routingtype;

    private Integer busflowid;

    private Boolean runcardflag;

    private Boolean requisitionflag;

    private Integer allovtid;

    private Integer relsallovtid;

    private Integer iprintcount;

    private String cbsysbarcode;

    private String ccurrentauditor;

    private String custcode;

    private String lplancode;

    private Byte sourcesvcvouchtype;

    private String factorycode;
    
    private Date startdate;

    private Date duedate;

    private String mocode;
    private String cinvcode;
    

    public String getCinvcode() {
		return cinvcode;
	}

	public void setCinvcode(String cinvcode) {
		this.cinvcode = cinvcode;
	}

	private String ccomunitname;
    public String getCcomunitname() {
		return ccomunitname;
	}

	public void setCcomunitname(String ccomunitname) {
		this.ccomunitname = ccomunitname;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getMocode() {
		return mocode;
	}

	public void setMocode(String mocode) {
		this.mocode = mocode;
	}

	private byte[] ufts;

    private static final long serialVersionUID = 1L;

    public Integer getModid() {
        return modid;
    }

    public void setModid(Integer modid) {
        this.modid = modid;
    }

    public Integer getMoid() {
        return moid;
    }

    public void setMoid(Integer moid) {
        this.moid = moid;
    }

    public Integer getSortseq() {
        return sortseq;
    }

    public void setSortseq(Integer sortseq) {
        this.sortseq = sortseq;
    }

    public Byte getMoclass() {
        return moclass;
    }

    public void setMoclass(Byte moclass) {
        this.moclass = moclass;
    }

    public Integer getMotypeid() {
        return motypeid;
    }

    public void setMotypeid(Integer motypeid) {
        this.motypeid = motypeid;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getMrpqty() {
        return mrpqty;
    }

    public void setMrpqty(BigDecimal mrpqty) {
        this.mrpqty = mrpqty;
    }

    public String getAuxunitcode() {
        return auxunitcode;
    }

    public void setAuxunitcode(String auxunitcode) {
        this.auxunitcode = auxunitcode == null ? null : auxunitcode.trim();
    }

    public BigDecimal getAuxqty() {
        return auxqty;
    }

    public void setAuxqty(BigDecimal auxqty) {
        this.auxqty = auxqty;
    }

    public BigDecimal getChangerate() {
        return changerate;
    }

    public void setChangerate(BigDecimal changerate) {
        this.changerate = changerate;
    }

    public String getMolotcode() {
        return molotcode;
    }

    public void setMolotcode(String molotcode) {
        this.molotcode = molotcode == null ? null : molotcode.trim();
    }

    public String getWhcode() {
        return whcode;
    }

    public void setWhcode(String whcode) {
        this.whcode = whcode == null ? null : whcode.trim();
    }

    public String getMdeptcode() {
        return mdeptcode;
    }

    public void setMdeptcode(String mdeptcode) {
        this.mdeptcode = mdeptcode == null ? null : mdeptcode.trim();
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

    public BigDecimal getDeclaredqty() {
        return declaredqty;
    }

    public void setDeclaredqty(BigDecimal declaredqty) {
        this.declaredqty = declaredqty;
    }

    public BigDecimal getQualifiedinqty() {
        return qualifiedinqty;
    }

    public void setQualifiedinqty(BigDecimal qualifiedinqty) {
        this.qualifiedinqty = qualifiedinqty;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getOrgstatus() {
        return orgstatus;
    }

    public void setOrgstatus(Byte orgstatus) {
        this.orgstatus = orgstatus;
    }

    public Integer getBomid() {
        return bomid;
    }

    public void setBomid(Integer bomid) {
        this.bomid = bomid;
    }

    public Integer getRoutingid() {
        return routingid;
    }

    public void setRoutingid(Integer routingid) {
        this.routingid = routingid;
    }

    public Integer getCustbomid() {
        return custbomid;
    }

    public void setCustbomid(Integer custbomid) {
        this.custbomid = custbomid;
    }

    public Integer getDemandid() {
        return demandid;
    }

    public void setDemandid(Integer demandid) {
        this.demandid = demandid;
    }

    public String getPlancode() {
        return plancode;
    }

    public void setPlancode(String plancode) {
        this.plancode = plancode == null ? null : plancode.trim();
    }

    public Integer getPartid() {
        return partid;
    }

    public void setPartid(Integer partid) {
        this.partid = partid;
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

    public Boolean getSfcflag() {
        return sfcflag;
    }

    public void setSfcflag(Boolean sfcflag) {
        this.sfcflag = sfcflag;
    }

    public Boolean getCrpflag() {
        return crpflag;
    }

    public void setCrpflag(Boolean crpflag) {
        this.crpflag = crpflag;
    }

    public Boolean getQcflag() {
        return qcflag;
    }

    public void setQcflag(Boolean qcflag) {
        this.qcflag = qcflag;
    }

    public Date getRelsdate() {
        return relsdate;
    }

    public void setRelsdate(Date relsdate) {
        this.relsdate = relsdate;
    }

    public String getRelsuser() {
        return relsuser;
    }

    public void setRelsuser(String relsuser) {
        this.relsuser = relsuser == null ? null : relsuser.trim();
    }

    public Date getClosedate() {
        return closedate;
    }

    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    public Date getOrgclsdate() {
        return orgclsdate;
    }

    public void setOrgclsdate(Date orgclsdate) {
        this.orgclsdate = orgclsdate;
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

    public Integer getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(Integer leadtime) {
        this.leadtime = leadtime;
    }

    public Byte getOpscheduletype() {
        return opscheduletype;
    }

    public void setOpscheduletype(Byte opscheduletype) {
        this.opscheduletype = opscheduletype;
    }

    public Boolean getOrdflag() {
        return ordflag;
    }

    public void setOrdflag(Boolean ordflag) {
        this.ordflag = ordflag;
    }

    public Byte getWiptype() {
        return wiptype;
    }

    public void setWiptype(Byte wiptype) {
        this.wiptype = wiptype;
    }

    public String getSupplywhcode() {
        return supplywhcode;
    }

    public void setSupplywhcode(String supplywhcode) {
        this.supplywhcode = supplywhcode == null ? null : supplywhcode.trim();
    }

    public String getReasoncode() {
        return reasoncode;
    }

    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode == null ? null : reasoncode.trim();
    }

    public Byte getIswfcontrolled() {
        return iswfcontrolled;
    }

    public void setIswfcontrolled(Byte iswfcontrolled) {
        this.iswfcontrolled = iswfcontrolled;
    }

    public Integer getIverifystate() {
        return iverifystate;
    }

    public void setIverifystate(Integer iverifystate) {
        this.iverifystate = iverifystate;
    }

    public Integer getIreturncount() {
        return ireturncount;
    }

    public void setIreturncount(Integer ireturncount) {
        this.ireturncount = ireturncount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSourcemocode() {
        return sourcemocode;
    }

    public void setSourcemocode(String sourcemocode) {
        this.sourcemocode = sourcemocode == null ? null : sourcemocode.trim();
    }

    public Integer getSourcemoseq() {
        return sourcemoseq;
    }

    public void setSourcemoseq(Integer sourcemoseq) {
        this.sourcemoseq = sourcemoseq;
    }

    public Integer getSourcemoid() {
        return sourcemoid;
    }

    public void setSourcemoid(Integer sourcemoid) {
        this.sourcemoid = sourcemoid;
    }

    public Integer getSourcemodid() {
        return sourcemodid;
    }

    public void setSourcemodid(Integer sourcemodid) {
        this.sourcemodid = sourcemodid;
    }

    public String getSourceqccode() {
        return sourceqccode;
    }

    public void setSourceqccode(String sourceqccode) {
        this.sourceqccode = sourceqccode == null ? null : sourceqccode.trim();
    }

    public Integer getSourceqcid() {
        return sourceqcid;
    }

    public void setSourceqcid(Integer sourceqcid) {
        this.sourceqcid = sourceqcid;
    }

    public Integer getSourceqcdid() {
        return sourceqcdid;
    }

    public void setSourceqcdid(Integer sourceqcdid) {
        this.sourceqcdid = sourceqcdid;
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

    public Date getRelstime() {
        return relstime;
    }

    public void setRelstime(Date relstime) {
        this.relstime = relstime;
    }

    public String getCloseuser() {
        return closeuser;
    }

    public void setCloseuser(String closeuser) {
        this.closeuser = closeuser == null ? null : closeuser.trim();
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public Date getOrgclstime() {
        return orgclstime;
    }

    public void setOrgclstime(Date orgclstime) {
        this.orgclstime = orgclstime;
    }

    public Byte getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Byte auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Integer getPallocateid() {
        return pallocateid;
    }

    public void setPallocateid(Integer pallocateid) {
        this.pallocateid = pallocateid;
    }

    public String getDemandcode() {
        return demandcode;
    }

    public void setDemandcode(String demandcode) {
        this.demandcode = demandcode == null ? null : demandcode.trim();
    }

    public Byte getCollectiveflag() {
        return collectiveflag;
    }

    public void setCollectiveflag(Byte collectiveflag) {
        this.collectiveflag = collectiveflag;
    }

    public Byte getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Byte ordertype) {
        this.ordertype = ordertype;
    }

    public Integer getOrderdid() {
        return orderdid;
    }

    public void setOrderdid(Integer orderdid) {
        this.orderdid = orderdid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public Integer getOrderseq() {
        return orderseq;
    }

    public void setOrderseq(Integer orderseq) {
        this.orderseq = orderseq;
    }

    public String getManualcode() {
        return manualcode;
    }

    public void setManualcode(String manualcode) {
        this.manualcode = manualcode == null ? null : manualcode.trim();
    }

    public Boolean getReformflag() {
        return reformflag;
    }

    public void setReformflag(Boolean reformflag) {
        this.reformflag = reformflag;
    }

    public Byte getSourceqcvouchtype() {
        return sourceqcvouchtype;
    }

    public void setSourceqcvouchtype(Byte sourceqcvouchtype) {
        this.sourceqcvouchtype = sourceqcvouchtype;
    }

    public BigDecimal getOrgqty() {
        return orgqty;
    }

    public void setOrgqty(BigDecimal orgqty) {
        this.orgqty = orgqty;
    }

    public Boolean getFmflag() {
        return fmflag;
    }

    public void setFmflag(Boolean fmflag) {
        this.fmflag = fmflag;
    }

    public String getMinsn() {
        return minsn;
    }

    public void setMinsn(String minsn) {
        this.minsn = minsn == null ? null : minsn.trim();
    }

    public String getMaxsn() {
        return maxsn;
    }

    public void setMaxsn(String maxsn) {
        this.maxsn = maxsn == null ? null : maxsn.trim();
    }

    public String getSourcesvccode() {
        return sourcesvccode;
    }

    public void setSourcesvccode(String sourcesvccode) {
        this.sourcesvccode = sourcesvccode == null ? null : sourcesvccode.trim();
    }

    public String getSourcesvcid() {
        return sourcesvcid;
    }

    public void setSourcesvcid(String sourcesvcid) {
        this.sourcesvcid = sourcesvcid == null ? null : sourcesvcid.trim();
    }

    public String getSourcesvcdid() {
        return sourcesvcdid;
    }

    public void setSourcesvcdid(String sourcesvcdid) {
        this.sourcesvcdid = sourcesvcdid == null ? null : sourcesvcdid.trim();
    }

    public Byte getBomtype() {
        return bomtype;
    }

    public void setBomtype(Byte bomtype) {
        this.bomtype = bomtype;
    }

    public Byte getRoutingtype() {
        return routingtype;
    }

    public void setRoutingtype(Byte routingtype) {
        this.routingtype = routingtype;
    }

    public Integer getBusflowid() {
        return busflowid;
    }

    public void setBusflowid(Integer busflowid) {
        this.busflowid = busflowid;
    }

    public Boolean getRuncardflag() {
        return runcardflag;
    }

    public void setRuncardflag(Boolean runcardflag) {
        this.runcardflag = runcardflag;
    }

    public Boolean getRequisitionflag() {
        return requisitionflag;
    }

    public void setRequisitionflag(Boolean requisitionflag) {
        this.requisitionflag = requisitionflag;
    }

    public Integer getAllovtid() {
        return allovtid;
    }

    public void setAllovtid(Integer allovtid) {
        this.allovtid = allovtid;
    }

    public Integer getRelsallovtid() {
        return relsallovtid;
    }

    public void setRelsallovtid(Integer relsallovtid) {
        this.relsallovtid = relsallovtid;
    }

    public Integer getIprintcount() {
        return iprintcount;
    }

    public void setIprintcount(Integer iprintcount) {
        this.iprintcount = iprintcount;
    }

    public String getCbsysbarcode() {
        return cbsysbarcode;
    }

    public void setCbsysbarcode(String cbsysbarcode) {
        this.cbsysbarcode = cbsysbarcode == null ? null : cbsysbarcode.trim();
    }

    public String getCcurrentauditor() {
        return ccurrentauditor;
    }

    public void setCcurrentauditor(String ccurrentauditor) {
        this.ccurrentauditor = ccurrentauditor == null ? null : ccurrentauditor.trim();
    }

    public String getCustcode() {
        return custcode;
    }

    public void setCustcode(String custcode) {
        this.custcode = custcode == null ? null : custcode.trim();
    }

    public String getLplancode() {
        return lplancode;
    }

    public void setLplancode(String lplancode) {
        this.lplancode = lplancode == null ? null : lplancode.trim();
    }

    public Byte getSourcesvcvouchtype() {
        return sourcesvcvouchtype;
    }

    public void setSourcesvcvouchtype(Byte sourcesvcvouchtype) {
        this.sourcesvcvouchtype = sourcesvcvouchtype;
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
        sb.append(", modid=").append(modid);
        sb.append(", moid=").append(moid);
        sb.append(", sortseq=").append(sortseq);
        sb.append(", moclass=").append(moclass);
        sb.append(", motypeid=").append(motypeid);
        sb.append(", qty=").append(qty);
        sb.append(", mrpqty=").append(mrpqty);
        sb.append(", auxunitcode=").append(auxunitcode);
        sb.append(", auxqty=").append(auxqty);
        sb.append(", changerate=").append(changerate);
        sb.append(", molotcode=").append(molotcode);
        sb.append(", whcode=").append(whcode);
        sb.append(", mdeptcode=").append(mdeptcode);
        sb.append(", sotype=").append(sotype);
        sb.append(", sodid=").append(sodid);
        sb.append(", socode=").append(socode);
        sb.append(", soseq=").append(soseq);
        sb.append(", declaredqty=").append(declaredqty);
        sb.append(", qualifiedinqty=").append(qualifiedinqty);
        sb.append(", status=").append(status);
        sb.append(", orgstatus=").append(orgstatus);
        sb.append(", bomid=").append(bomid);
        sb.append(", routingid=").append(routingid);
        sb.append(", custbomid=").append(custbomid);
        sb.append(", demandid=").append(demandid);
        sb.append(", plancode=").append(plancode);
        sb.append(", partid=").append(partid);
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
        sb.append(", sfcflag=").append(sfcflag);
        sb.append(", crpflag=").append(crpflag);
        sb.append(", qcflag=").append(qcflag);
        sb.append(", relsdate=").append(relsdate);
        sb.append(", relsuser=").append(relsuser);
        sb.append(", closedate=").append(closedate);
        sb.append(", orgclsdate=").append(orgclsdate);
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
        sb.append(", leadtime=").append(leadtime);
        sb.append(", opscheduletype=").append(opscheduletype);
        sb.append(", ordflag=").append(ordflag);
        sb.append(", wiptype=").append(wiptype);
        sb.append(", supplywhcode=").append(supplywhcode);
        sb.append(", reasoncode=").append(reasoncode);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", iverifystate=").append(iverifystate);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", remark=").append(remark);
        sb.append(", sourcemocode=").append(sourcemocode);
        sb.append(", sourcemoseq=").append(sourcemoseq);
        sb.append(", sourcemoid=").append(sourcemoid);
        sb.append(", sourcemodid=").append(sourcemodid);
        sb.append(", sourceqccode=").append(sourceqccode);
        sb.append(", sourceqcid=").append(sourceqcid);
        sb.append(", sourceqcdid=").append(sourceqcdid);
        sb.append(", costitemcode=").append(costitemcode);
        sb.append(", costitemname=").append(costitemname);
        sb.append(", relstime=").append(relstime);
        sb.append(", closeuser=").append(closeuser);
        sb.append(", closetime=").append(closetime);
        sb.append(", orgclstime=").append(orgclstime);
        sb.append(", auditstatus=").append(auditstatus);
        sb.append(", pallocateid=").append(pallocateid);
        sb.append(", demandcode=").append(demandcode);
        sb.append(", collectiveflag=").append(collectiveflag);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", orderdid=").append(orderdid);
        sb.append(", ordercode=").append(ordercode);
        sb.append(", orderseq=").append(orderseq);
        sb.append(", manualcode=").append(manualcode);
        sb.append(", reformflag=").append(reformflag);
        sb.append(", sourceqcvouchtype=").append(sourceqcvouchtype);
        sb.append(", orgqty=").append(orgqty);
        sb.append(", fmflag=").append(fmflag);
        sb.append(", minsn=").append(minsn);
        sb.append(", maxsn=").append(maxsn);
        sb.append(", sourcesvccode=").append(sourcesvccode);
        sb.append(", sourcesvcid=").append(sourcesvcid);
        sb.append(", sourcesvcdid=").append(sourcesvcdid);
        sb.append(", bomtype=").append(bomtype);
        sb.append(", routingtype=").append(routingtype);
        sb.append(", busflowid=").append(busflowid);
        sb.append(", runcardflag=").append(runcardflag);
        sb.append(", requisitionflag=").append(requisitionflag);
        sb.append(", allovtid=").append(allovtid);
        sb.append(", relsallovtid=").append(relsallovtid);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", custcode=").append(custcode);
        sb.append(", lplancode=").append(lplancode);
        sb.append(", sourcesvcvouchtype=").append(sourcesvcvouchtype);
        sb.append(", factorycode=").append(factorycode);
        sb.append(", ufts=").append(ufts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}