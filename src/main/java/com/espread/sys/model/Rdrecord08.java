package com.espread.sys.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName RdRecord08
 */
@Data
public class Rdrecord08 implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Integer brdflag;

    /**
     * 
     */
    private String cvouchtype;

    /**
     * 
     */
    private String cbustype;

    /**
     * 
     */
    private String csource;

    /**
     * 
     */
    private String cbuscode;

    /**
     * 
     */
    private String cwhcode;

    /**
     * 
     */
    private Date ddate;

    /**
     * 
     */
    private String ccode;

    /**
     * 
     */
    private String crdcode;

    /**
     * 
     */
    private String cdepcode;

    /**
     * 
     */
    private String cpersoncode;

    /**
     * 
     */
    private String cptcode;

    /**
     * 
     */
    private String cstcode;

    /**
     * 
     */
    private String ccuscode;

    /**
     * 
     */
    private String cvencode;

    /**
     * 
     */
    private String cordercode;

    /**
     * 
     */
    private String carvcode;

    /**
     * 
     */
    private Long cbillcode;

    /**
     * 
     */
    private Long cdlcode;

    /**
     * 
     */
    private String cprobatch;

    /**
     * 
     */
    private String chandler;

    /**
     * 
     */
    private String cmemo;

    /**
     * 
     */
    private Boolean btransflag;

    /**
     * 
     */
    private String caccounter;

    /**
     * 
     */
    private String cmaker;

    /**
     * 
     */
    private String cdefine1;

    /**
     * 
     */
    private String cdefine2;

    /**
     * 
     */
    private String cdefine3;

    /**
     * 
     */
    private Date cdefine4;

    /**
     * 
     */
    private Integer cdefine5;

    /**
     * 
     */
    private Date cdefine6;

    /**
     * 
     */
    private Double cdefine7;

    /**
     * 
     */
    private String cdefine8;

    /**
     * 
     */
    private String cdefine9;

    /**
     * 
     */
    private String cdefine10;

    /**
     * 
     */
    private String dkeepdate;

    /**
     * 
     */
    private Date dveridate;

    /**
     * 
     */
    private Boolean bpufirst;

    /**
     * 
     */
    private Boolean biafirst;

    /**
     * 
     */
    private Double imquantity;

    /**
     * 
     */
    private Date darvdate;

    /**
     * 
     */
    private String cchkcode;

    /**
     * 
     */
    private Date dchkdate;

    /**
     * 
     */
    private String cchkperson;

    /**
     * 
     */
    private Integer vtId;

    /**
     * 
     */
    private Boolean bisstqc;

    /**
     * 
     */
    private String cdefine11;

    /**
     * 
     */
    private String cdefine12;

    /**
     * 
     */
    private String cdefine13;

    /**
     * 
     */
    private String cdefine14;

    /**
     * 
     */
    private Integer cdefine15;

    /**
     * 
     */
    private Double cdefine16;

    /**
     * 
     */
    private String gspcheck;

    /**
     * 
     */
    private Date ufts;

    /**
     * 
     */
    private Double iexchrate;

    /**
     * 
     */
    private String cexchName;

    /**
     * 
     */
    private Boolean bomfirst;

    /**
     * 
     */
    private Boolean bfrompreyear;

    /**
     * 
     */
    private Boolean bislsquery;

    /**
     * 
     */
    private Integer biscomplement;

    /**
     * 
     */
    private Integer idiscounttaxtype;

    /**
     * 
     */
    private Integer ireturncount;

    /**
     * 
     */
    private Integer iverifystate;

    /**
     * 
     */
    private Integer iswfcontrolled;

    /**
     * 
     */
    private String cmodifyperson;

    /**
     * 
     */
    private Date dmodifydate;

    /**
     * 
     */
    private Date dnmaketime;

    /**
     * 
     */
    private Date dnmodifytime;

    /**
     * 
     */
    private Date dnverifytime;

    /**
     * 
     */
    private Integer bredvouch;

    /**
     * 
     */
    private Integer iflowid;

    /**
     * 
     */
    private String cpzid;

    /**
     * 
     */
    private String csourcels;

    /**
     * 
     */
    private String csourcecodels;

    /**
     * 
     */
    private Integer iprintcount;

    /**
     * 
     */
    private String ctransflag;

    /**
     * 
     */
    private String csysbarcode;

    /**
     * 
     */
    private String ccurrentauditor;

    /**
     * 
     */
    private String cchecksignflag;

    /**
     * 
     */
    private String csyssource;

    /**
     * 
     */
    private String csyssourceid;

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
        Rdrecord08 other = (Rdrecord08) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrdflag() == null ? other.getBrdflag() == null : this.getBrdflag().equals(other.getBrdflag()))
            && (this.getCvouchtype() == null ? other.getCvouchtype() == null : this.getCvouchtype().equals(other.getCvouchtype()))
            && (this.getCbustype() == null ? other.getCbustype() == null : this.getCbustype().equals(other.getCbustype()))
            && (this.getCsource() == null ? other.getCsource() == null : this.getCsource().equals(other.getCsource()))
            && (this.getCbuscode() == null ? other.getCbuscode() == null : this.getCbuscode().equals(other.getCbuscode()))
            && (this.getCwhcode() == null ? other.getCwhcode() == null : this.getCwhcode().equals(other.getCwhcode()))
            && (this.getDdate() == null ? other.getDdate() == null : this.getDdate().equals(other.getDdate()))
            && (this.getCcode() == null ? other.getCcode() == null : this.getCcode().equals(other.getCcode()))
            && (this.getCrdcode() == null ? other.getCrdcode() == null : this.getCrdcode().equals(other.getCrdcode()))
            && (this.getCdepcode() == null ? other.getCdepcode() == null : this.getCdepcode().equals(other.getCdepcode()))
            && (this.getCpersoncode() == null ? other.getCpersoncode() == null : this.getCpersoncode().equals(other.getCpersoncode()))
            && (this.getCptcode() == null ? other.getCptcode() == null : this.getCptcode().equals(other.getCptcode()))
            && (this.getCstcode() == null ? other.getCstcode() == null : this.getCstcode().equals(other.getCstcode()))
            && (this.getCcuscode() == null ? other.getCcuscode() == null : this.getCcuscode().equals(other.getCcuscode()))
            && (this.getCvencode() == null ? other.getCvencode() == null : this.getCvencode().equals(other.getCvencode()))
            && (this.getCordercode() == null ? other.getCordercode() == null : this.getCordercode().equals(other.getCordercode()))
            && (this.getCarvcode() == null ? other.getCarvcode() == null : this.getCarvcode().equals(other.getCarvcode()))
            && (this.getCbillcode() == null ? other.getCbillcode() == null : this.getCbillcode().equals(other.getCbillcode()))
            && (this.getCdlcode() == null ? other.getCdlcode() == null : this.getCdlcode().equals(other.getCdlcode()))
            && (this.getCprobatch() == null ? other.getCprobatch() == null : this.getCprobatch().equals(other.getCprobatch()))
            && (this.getChandler() == null ? other.getChandler() == null : this.getChandler().equals(other.getChandler()))
            && (this.getCmemo() == null ? other.getCmemo() == null : this.getCmemo().equals(other.getCmemo()))
            && (this.getBtransflag() == null ? other.getBtransflag() == null : this.getBtransflag().equals(other.getBtransflag()))
            && (this.getCaccounter() == null ? other.getCaccounter() == null : this.getCaccounter().equals(other.getCaccounter()))
            && (this.getCmaker() == null ? other.getCmaker() == null : this.getCmaker().equals(other.getCmaker()))
            && (this.getCdefine1() == null ? other.getCdefine1() == null : this.getCdefine1().equals(other.getCdefine1()))
            && (this.getCdefine2() == null ? other.getCdefine2() == null : this.getCdefine2().equals(other.getCdefine2()))
            && (this.getCdefine3() == null ? other.getCdefine3() == null : this.getCdefine3().equals(other.getCdefine3()))
            && (this.getCdefine4() == null ? other.getCdefine4() == null : this.getCdefine4().equals(other.getCdefine4()))
            && (this.getCdefine5() == null ? other.getCdefine5() == null : this.getCdefine5().equals(other.getCdefine5()))
            && (this.getCdefine6() == null ? other.getCdefine6() == null : this.getCdefine6().equals(other.getCdefine6()))
            && (this.getCdefine7() == null ? other.getCdefine7() == null : this.getCdefine7().equals(other.getCdefine7()))
            && (this.getCdefine8() == null ? other.getCdefine8() == null : this.getCdefine8().equals(other.getCdefine8()))
            && (this.getCdefine9() == null ? other.getCdefine9() == null : this.getCdefine9().equals(other.getCdefine9()))
            && (this.getCdefine10() == null ? other.getCdefine10() == null : this.getCdefine10().equals(other.getCdefine10()))
            && (this.getDkeepdate() == null ? other.getDkeepdate() == null : this.getDkeepdate().equals(other.getDkeepdate()))
            && (this.getDveridate() == null ? other.getDveridate() == null : this.getDveridate().equals(other.getDveridate()))
            && (this.getBpufirst() == null ? other.getBpufirst() == null : this.getBpufirst().equals(other.getBpufirst()))
            && (this.getBiafirst() == null ? other.getBiafirst() == null : this.getBiafirst().equals(other.getBiafirst()))
            && (this.getImquantity() == null ? other.getImquantity() == null : this.getImquantity().equals(other.getImquantity()))
            && (this.getDarvdate() == null ? other.getDarvdate() == null : this.getDarvdate().equals(other.getDarvdate()))
            && (this.getCchkcode() == null ? other.getCchkcode() == null : this.getCchkcode().equals(other.getCchkcode()))
            && (this.getDchkdate() == null ? other.getDchkdate() == null : this.getDchkdate().equals(other.getDchkdate()))
            && (this.getCchkperson() == null ? other.getCchkperson() == null : this.getCchkperson().equals(other.getCchkperson()))
            && (this.getVtId() == null ? other.getVtId() == null : this.getVtId().equals(other.getVtId()))
            && (this.getBisstqc() == null ? other.getBisstqc() == null : this.getBisstqc().equals(other.getBisstqc()))
            && (this.getCdefine11() == null ? other.getCdefine11() == null : this.getCdefine11().equals(other.getCdefine11()))
            && (this.getCdefine12() == null ? other.getCdefine12() == null : this.getCdefine12().equals(other.getCdefine12()))
            && (this.getCdefine13() == null ? other.getCdefine13() == null : this.getCdefine13().equals(other.getCdefine13()))
            && (this.getCdefine14() == null ? other.getCdefine14() == null : this.getCdefine14().equals(other.getCdefine14()))
            && (this.getCdefine15() == null ? other.getCdefine15() == null : this.getCdefine15().equals(other.getCdefine15()))
            && (this.getCdefine16() == null ? other.getCdefine16() == null : this.getCdefine16().equals(other.getCdefine16()))
            && (this.getGspcheck() == null ? other.getGspcheck() == null : this.getGspcheck().equals(other.getGspcheck()))
            && (this.getUfts() == null ? other.getUfts() == null : this.getUfts().equals(other.getUfts()))
            && (this.getIexchrate() == null ? other.getIexchrate() == null : this.getIexchrate().equals(other.getIexchrate()))
            && (this.getCexchName() == null ? other.getCexchName() == null : this.getCexchName().equals(other.getCexchName()))
            && (this.getBomfirst() == null ? other.getBomfirst() == null : this.getBomfirst().equals(other.getBomfirst()))
            && (this.getBfrompreyear() == null ? other.getBfrompreyear() == null : this.getBfrompreyear().equals(other.getBfrompreyear()))
            && (this.getBislsquery() == null ? other.getBislsquery() == null : this.getBislsquery().equals(other.getBislsquery()))
            && (this.getBiscomplement() == null ? other.getBiscomplement() == null : this.getBiscomplement().equals(other.getBiscomplement()))
            && (this.getIdiscounttaxtype() == null ? other.getIdiscounttaxtype() == null : this.getIdiscounttaxtype().equals(other.getIdiscounttaxtype()))
            && (this.getIreturncount() == null ? other.getIreturncount() == null : this.getIreturncount().equals(other.getIreturncount()))
            && (this.getIverifystate() == null ? other.getIverifystate() == null : this.getIverifystate().equals(other.getIverifystate()))
            && (this.getIswfcontrolled() == null ? other.getIswfcontrolled() == null : this.getIswfcontrolled().equals(other.getIswfcontrolled()))
            && (this.getCmodifyperson() == null ? other.getCmodifyperson() == null : this.getCmodifyperson().equals(other.getCmodifyperson()))
            && (this.getDmodifydate() == null ? other.getDmodifydate() == null : this.getDmodifydate().equals(other.getDmodifydate()))
            && (this.getDnmaketime() == null ? other.getDnmaketime() == null : this.getDnmaketime().equals(other.getDnmaketime()))
            && (this.getDnmodifytime() == null ? other.getDnmodifytime() == null : this.getDnmodifytime().equals(other.getDnmodifytime()))
            && (this.getDnverifytime() == null ? other.getDnverifytime() == null : this.getDnverifytime().equals(other.getDnverifytime()))
            && (this.getBredvouch() == null ? other.getBredvouch() == null : this.getBredvouch().equals(other.getBredvouch()))
            && (this.getIflowid() == null ? other.getIflowid() == null : this.getIflowid().equals(other.getIflowid()))
            && (this.getCpzid() == null ? other.getCpzid() == null : this.getCpzid().equals(other.getCpzid()))
            && (this.getCsourcels() == null ? other.getCsourcels() == null : this.getCsourcels().equals(other.getCsourcels()))
            && (this.getCsourcecodels() == null ? other.getCsourcecodels() == null : this.getCsourcecodels().equals(other.getCsourcecodels()))
            && (this.getIprintcount() == null ? other.getIprintcount() == null : this.getIprintcount().equals(other.getIprintcount()))
            && (this.getCtransflag() == null ? other.getCtransflag() == null : this.getCtransflag().equals(other.getCtransflag()))
            && (this.getCsysbarcode() == null ? other.getCsysbarcode() == null : this.getCsysbarcode().equals(other.getCsysbarcode()))
            && (this.getCcurrentauditor() == null ? other.getCcurrentauditor() == null : this.getCcurrentauditor().equals(other.getCcurrentauditor()))
            && (this.getCchecksignflag() == null ? other.getCchecksignflag() == null : this.getCchecksignflag().equals(other.getCchecksignflag()))
            && (this.getCsyssource() == null ? other.getCsyssource() == null : this.getCsyssource().equals(other.getCsyssource()))
            && (this.getCsyssourceid() == null ? other.getCsyssourceid() == null : this.getCsyssourceid().equals(other.getCsyssourceid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrdflag() == null) ? 0 : getBrdflag().hashCode());
        result = prime * result + ((getCvouchtype() == null) ? 0 : getCvouchtype().hashCode());
        result = prime * result + ((getCbustype() == null) ? 0 : getCbustype().hashCode());
        result = prime * result + ((getCsource() == null) ? 0 : getCsource().hashCode());
        result = prime * result + ((getCbuscode() == null) ? 0 : getCbuscode().hashCode());
        result = prime * result + ((getCwhcode() == null) ? 0 : getCwhcode().hashCode());
        result = prime * result + ((getDdate() == null) ? 0 : getDdate().hashCode());
        result = prime * result + ((getCcode() == null) ? 0 : getCcode().hashCode());
        result = prime * result + ((getCrdcode() == null) ? 0 : getCrdcode().hashCode());
        result = prime * result + ((getCdepcode() == null) ? 0 : getCdepcode().hashCode());
        result = prime * result + ((getCpersoncode() == null) ? 0 : getCpersoncode().hashCode());
        result = prime * result + ((getCptcode() == null) ? 0 : getCptcode().hashCode());
        result = prime * result + ((getCstcode() == null) ? 0 : getCstcode().hashCode());
        result = prime * result + ((getCcuscode() == null) ? 0 : getCcuscode().hashCode());
        result = prime * result + ((getCvencode() == null) ? 0 : getCvencode().hashCode());
        result = prime * result + ((getCordercode() == null) ? 0 : getCordercode().hashCode());
        result = prime * result + ((getCarvcode() == null) ? 0 : getCarvcode().hashCode());
        result = prime * result + ((getCbillcode() == null) ? 0 : getCbillcode().hashCode());
        result = prime * result + ((getCdlcode() == null) ? 0 : getCdlcode().hashCode());
        result = prime * result + ((getCprobatch() == null) ? 0 : getCprobatch().hashCode());
        result = prime * result + ((getChandler() == null) ? 0 : getChandler().hashCode());
        result = prime * result + ((getCmemo() == null) ? 0 : getCmemo().hashCode());
        result = prime * result + ((getBtransflag() == null) ? 0 : getBtransflag().hashCode());
        result = prime * result + ((getCaccounter() == null) ? 0 : getCaccounter().hashCode());
        result = prime * result + ((getCmaker() == null) ? 0 : getCmaker().hashCode());
        result = prime * result + ((getCdefine1() == null) ? 0 : getCdefine1().hashCode());
        result = prime * result + ((getCdefine2() == null) ? 0 : getCdefine2().hashCode());
        result = prime * result + ((getCdefine3() == null) ? 0 : getCdefine3().hashCode());
        result = prime * result + ((getCdefine4() == null) ? 0 : getCdefine4().hashCode());
        result = prime * result + ((getCdefine5() == null) ? 0 : getCdefine5().hashCode());
        result = prime * result + ((getCdefine6() == null) ? 0 : getCdefine6().hashCode());
        result = prime * result + ((getCdefine7() == null) ? 0 : getCdefine7().hashCode());
        result = prime * result + ((getCdefine8() == null) ? 0 : getCdefine8().hashCode());
        result = prime * result + ((getCdefine9() == null) ? 0 : getCdefine9().hashCode());
        result = prime * result + ((getCdefine10() == null) ? 0 : getCdefine10().hashCode());
        result = prime * result + ((getDkeepdate() == null) ? 0 : getDkeepdate().hashCode());
        result = prime * result + ((getDveridate() == null) ? 0 : getDveridate().hashCode());
        result = prime * result + ((getBpufirst() == null) ? 0 : getBpufirst().hashCode());
        result = prime * result + ((getBiafirst() == null) ? 0 : getBiafirst().hashCode());
        result = prime * result + ((getImquantity() == null) ? 0 : getImquantity().hashCode());
        result = prime * result + ((getDarvdate() == null) ? 0 : getDarvdate().hashCode());
        result = prime * result + ((getCchkcode() == null) ? 0 : getCchkcode().hashCode());
        result = prime * result + ((getDchkdate() == null) ? 0 : getDchkdate().hashCode());
        result = prime * result + ((getCchkperson() == null) ? 0 : getCchkperson().hashCode());
        result = prime * result + ((getVtId() == null) ? 0 : getVtId().hashCode());
        result = prime * result + ((getBisstqc() == null) ? 0 : getBisstqc().hashCode());
        result = prime * result + ((getCdefine11() == null) ? 0 : getCdefine11().hashCode());
        result = prime * result + ((getCdefine12() == null) ? 0 : getCdefine12().hashCode());
        result = prime * result + ((getCdefine13() == null) ? 0 : getCdefine13().hashCode());
        result = prime * result + ((getCdefine14() == null) ? 0 : getCdefine14().hashCode());
        result = prime * result + ((getCdefine15() == null) ? 0 : getCdefine15().hashCode());
        result = prime * result + ((getCdefine16() == null) ? 0 : getCdefine16().hashCode());
        result = prime * result + ((getGspcheck() == null) ? 0 : getGspcheck().hashCode());
        result = prime * result + ((getUfts() == null) ? 0 : getUfts().hashCode());
        result = prime * result + ((getIexchrate() == null) ? 0 : getIexchrate().hashCode());
        result = prime * result + ((getCexchName() == null) ? 0 : getCexchName().hashCode());
        result = prime * result + ((getBomfirst() == null) ? 0 : getBomfirst().hashCode());
        result = prime * result + ((getBfrompreyear() == null) ? 0 : getBfrompreyear().hashCode());
        result = prime * result + ((getBislsquery() == null) ? 0 : getBislsquery().hashCode());
        result = prime * result + ((getBiscomplement() == null) ? 0 : getBiscomplement().hashCode());
        result = prime * result + ((getIdiscounttaxtype() == null) ? 0 : getIdiscounttaxtype().hashCode());
        result = prime * result + ((getIreturncount() == null) ? 0 : getIreturncount().hashCode());
        result = prime * result + ((getIverifystate() == null) ? 0 : getIverifystate().hashCode());
        result = prime * result + ((getIswfcontrolled() == null) ? 0 : getIswfcontrolled().hashCode());
        result = prime * result + ((getCmodifyperson() == null) ? 0 : getCmodifyperson().hashCode());
        result = prime * result + ((getDmodifydate() == null) ? 0 : getDmodifydate().hashCode());
        result = prime * result + ((getDnmaketime() == null) ? 0 : getDnmaketime().hashCode());
        result = prime * result + ((getDnmodifytime() == null) ? 0 : getDnmodifytime().hashCode());
        result = prime * result + ((getDnverifytime() == null) ? 0 : getDnverifytime().hashCode());
        result = prime * result + ((getBredvouch() == null) ? 0 : getBredvouch().hashCode());
        result = prime * result + ((getIflowid() == null) ? 0 : getIflowid().hashCode());
        result = prime * result + ((getCpzid() == null) ? 0 : getCpzid().hashCode());
        result = prime * result + ((getCsourcels() == null) ? 0 : getCsourcels().hashCode());
        result = prime * result + ((getCsourcecodels() == null) ? 0 : getCsourcecodels().hashCode());
        result = prime * result + ((getIprintcount() == null) ? 0 : getIprintcount().hashCode());
        result = prime * result + ((getCtransflag() == null) ? 0 : getCtransflag().hashCode());
        result = prime * result + ((getCsysbarcode() == null) ? 0 : getCsysbarcode().hashCode());
        result = prime * result + ((getCcurrentauditor() == null) ? 0 : getCcurrentauditor().hashCode());
        result = prime * result + ((getCchecksignflag() == null) ? 0 : getCchecksignflag().hashCode());
        result = prime * result + ((getCsyssource() == null) ? 0 : getCsyssource().hashCode());
        result = prime * result + ((getCsyssourceid() == null) ? 0 : getCsyssourceid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brdflag=").append(brdflag);
        sb.append(", cvouchtype=").append(cvouchtype);
        sb.append(", cbustype=").append(cbustype);
        sb.append(", csource=").append(csource);
        sb.append(", cbuscode=").append(cbuscode);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", ddate=").append(ddate);
        sb.append(", ccode=").append(ccode);
        sb.append(", crdcode=").append(crdcode);
        sb.append(", cdepcode=").append(cdepcode);
        sb.append(", cpersoncode=").append(cpersoncode);
        sb.append(", cptcode=").append(cptcode);
        sb.append(", cstcode=").append(cstcode);
        sb.append(", ccuscode=").append(ccuscode);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", cordercode=").append(cordercode);
        sb.append(", carvcode=").append(carvcode);
        sb.append(", cbillcode=").append(cbillcode);
        sb.append(", cdlcode=").append(cdlcode);
        sb.append(", cprobatch=").append(cprobatch);
        sb.append(", chandler=").append(chandler);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", btransflag=").append(btransflag);
        sb.append(", caccounter=").append(caccounter);
        sb.append(", cmaker=").append(cmaker);
        sb.append(", cdefine1=").append(cdefine1);
        sb.append(", cdefine2=").append(cdefine2);
        sb.append(", cdefine3=").append(cdefine3);
        sb.append(", cdefine4=").append(cdefine4);
        sb.append(", cdefine5=").append(cdefine5);
        sb.append(", cdefine6=").append(cdefine6);
        sb.append(", cdefine7=").append(cdefine7);
        sb.append(", cdefine8=").append(cdefine8);
        sb.append(", cdefine9=").append(cdefine9);
        sb.append(", cdefine10=").append(cdefine10);
        sb.append(", dkeepdate=").append(dkeepdate);
        sb.append(", dveridate=").append(dveridate);
        sb.append(", bpufirst=").append(bpufirst);
        sb.append(", biafirst=").append(biafirst);
        sb.append(", imquantity=").append(imquantity);
        sb.append(", darvdate=").append(darvdate);
        sb.append(", cchkcode=").append(cchkcode);
        sb.append(", dchkdate=").append(dchkdate);
        sb.append(", cchkperson=").append(cchkperson);
        sb.append(", vtId=").append(vtId);
        sb.append(", bisstqc=").append(bisstqc);
        sb.append(", cdefine11=").append(cdefine11);
        sb.append(", cdefine12=").append(cdefine12);
        sb.append(", cdefine13=").append(cdefine13);
        sb.append(", cdefine14=").append(cdefine14);
        sb.append(", cdefine15=").append(cdefine15);
        sb.append(", cdefine16=").append(cdefine16);
        sb.append(", gspcheck=").append(gspcheck);
        sb.append(", ufts=").append(ufts);
        sb.append(", iexchrate=").append(iexchrate);
        sb.append(", cexchName=").append(cexchName);
        sb.append(", bomfirst=").append(bomfirst);
        sb.append(", bfrompreyear=").append(bfrompreyear);
        sb.append(", bislsquery=").append(bislsquery);
        sb.append(", biscomplement=").append(biscomplement);
        sb.append(", idiscounttaxtype=").append(idiscounttaxtype);
        sb.append(", ireturncount=").append(ireturncount);
        sb.append(", iverifystate=").append(iverifystate);
        sb.append(", iswfcontrolled=").append(iswfcontrolled);
        sb.append(", cmodifyperson=").append(cmodifyperson);
        sb.append(", dmodifydate=").append(dmodifydate);
        sb.append(", dnmaketime=").append(dnmaketime);
        sb.append(", dnmodifytime=").append(dnmodifytime);
        sb.append(", dnverifytime=").append(dnverifytime);
        sb.append(", bredvouch=").append(bredvouch);
        sb.append(", iflowid=").append(iflowid);
        sb.append(", cpzid=").append(cpzid);
        sb.append(", csourcels=").append(csourcels);
        sb.append(", csourcecodels=").append(csourcecodels);
        sb.append(", iprintcount=").append(iprintcount);
        sb.append(", ctransflag=").append(ctransflag);
        sb.append(", csysbarcode=").append(csysbarcode);
        sb.append(", ccurrentauditor=").append(ccurrentauditor);
        sb.append(", cchecksignflag=").append(cchecksignflag);
        sb.append(", csyssource=").append(csyssource);
        sb.append(", csyssourceid=").append(csyssourceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}