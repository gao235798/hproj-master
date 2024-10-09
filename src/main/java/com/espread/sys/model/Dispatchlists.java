package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * @TableName DispatchLists
 */
@Data
public class Dispatchlists implements Serializable {
    /**
     *
     */
    private Integer autoid;

    /**
     *
     */
    private Integer dlid;

    /**
     *
     */
    private Integer icorid;

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
    private BigDecimal iquantity;

    /**
     *
     */
    private BigDecimal inum;

    /**
     *
     */
    private BigDecimal iquotedprice;

    /**
     *
     */
    private BigDecimal iunitprice;

    /**
     *
     */
    private BigDecimal itaxunitprice;

    /**
     *
     */
    private Object imoney;

    /**
     *
     */
    private Object itax;

    /**
     *
     */
    private Object isum;

    /**
     *
     */
    private Object idiscount;

    /**
     *
     */
    private BigDecimal inatunitprice;

    /**
     *
     */
    private Object inatmoney;

    /**
     *
     */
    private Object inattax;

    /**
     *
     */
    private Object inatsum;

    /**
     *
     */
    private Object inatdiscount;

    /**
     *
     */
    private BigDecimal isettlenum;

    /**
     *
     */
    private BigDecimal isettlequantity;

    /**
     *
     */
    private Integer ibatch;

    /**
     *
     */
    private String cbatch;

    /**
     *
     */
    private Boolean bsettleall;

    /**
     *
     */
    private String cmemo;

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
    private Integer itb;

    /**
     *
     */
    private Date dvdate;

    /**
     *
     */
    private BigDecimal tbquantity;

    /**
     *
     */
    private BigDecimal tbnum;

    /**
     *
     */
    private Integer isosid;

    /**
     *
     */
    private Integer idlsid;

    /**
     *
     */
    private BigDecimal kl;

    /**
     *
     */
    private BigDecimal kl2;

    /**
     *
     */
    private String cinvname;

    /**
     *
     */
    private BigDecimal itaxrate;

    /**
     *
     */
    private String cdefine22;

    /**
     *
     */
    private String cdefine23;

    /**
     *
     */
    private String cdefine24;

    /**
     *
     */
    private String cdefine25;

    /**
     *
     */
    private Double cdefine26;

    /**
     *
     */
    private Double cdefine27;

    /**
     *
     */
    private BigDecimal foutquantity;

    /**
     *
     */
    private BigDecimal foutnum;

    /**
     *
     */
    private String citemcode;

    /**
     *
     */
    private String citemClass;

    /**
     *
     */
    private BigDecimal fsalecost;

    /**
     *
     */
    private BigDecimal fsaleprice;

    /**
     *
     */
    private String cvenabbname;

    /**
     *
     */
    private String citemname;

    /**
     *
     */
    private String citemCname;

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
    private Boolean bisstqc;

    /**
     *
     */
    private Integer iinvexchrate;

    /**
     *
     */
    private String cunitid;

    /**
     *
     */
    private String ccode;

    /**
     *
     */
    private Integer iretquantity;

    /**
     *
     */
    private Integer fensettlequan;

    /**
     *
     */
    private Object fensettlesum;

    /**
     *
     */
    private BigDecimal isettleprice;

    /**
     *
     */
    private String cdefine28;

    /**
     *
     */
    private String cdefine29;

    /**
     *
     */
    private String cdefine30;

    /**
     *
     */
    private String cdefine31;

    /**
     *
     */
    private String cdefine32;

    /**
     *
     */
    private String cdefine33;

    /**
     *
     */
    private Integer cdefine34;

    /**
     *
     */
    private Integer cdefine35;

    /**
     *
     */
    private Date cdefine36;

    /**
     *
     */
    private Date cdefine37;

    /**
     *
     */
    private Date dmdate;

    /**
     *
     */
    private Boolean bgsp;

    /**
     *
     */
    private String cgspstate;

    /**
     *
     */
    private String csocode;

    /**
     *
     */
    private String ccorcode;

    /**
     *
     */
    private Integer ippartseqid;

    /**
     *
     */
    private Integer ippartid;

    /**
     *
     */
    private Integer ippartqty;

    /**
     *
     */
    private String ccontractid;

    /**
     *
     */
    private String ccontracttagcode;

    /**
     *
     */
    private Object ccontractrowguid;

    /**
     *
     */
    private Integer imassdate;

    /**
     *
     */
    private Integer cmassunit;

    /**
     *
     */
    private Boolean bqaneedcheck;

    /**
     *
     */
    private Boolean bqaurgency;

    /**
     *
     */
    private Boolean bqachecking;

    /**
     *
     */
    private Boolean bqachecked;

    /**
     *
     */
    private BigDecimal iqaquantity;

    /**
     *
     */
    private BigDecimal iqanum;

    /**
     *
     */
    private String ccusinvcode;

    /**
     *
     */
    private String ccusinvname;

    /**
     *
     */
    private BigDecimal fsumsignquantity;

    /**
     *
     */
    private BigDecimal fsumsignnum;

    /**
     *
     */
    private String cbaccounter;

    /**
     *
     */
    private Boolean bcosting;

    /**
     *
     */
    private String cordercode;

    /**
     *
     */
    private Long iorderrowno;

    /**
     *
     */
    private BigDecimal fcusminprice;

    /**
     *
     */
    private BigDecimal icostquantity;

    /**
     *
     */
    private Object icostsum;

    /**
     *
     */
    private Integer ispecialtype;

    /**
     *
     */
    private String cvmivencode;

    /**
     *
     */
    private Object iexchsum;

    /**
     *
     */
    private Object imoneysum;

    /**
     *
     */
    private Long irowno;

    /**
     *
     */
    private BigDecimal frettbquantity;

    /**
     *
     */
    private BigDecimal fretsum;

    /**
     *
     */
    private Integer iexpiratdatecalcu;

    /**
     *
     */
    private Date dexpirationdate;

    /**
     *
     */
    private String cexpirationdate;

    /**
     *
     */
    private BigDecimal cbatchproperty1;

    /**
     *
     */
    private BigDecimal cbatchproperty2;

    /**
     *
     */
    private BigDecimal cbatchproperty3;

    /**
     *
     */
    private BigDecimal cbatchproperty4;

    /**
     *
     */
    private BigDecimal cbatchproperty5;

    /**
     *
     */
    private String cbatchproperty6;

    /**
     *
     */
    private String cbatchproperty7;

    /**
     *
     */
    private String cbatchproperty8;

    /**
     *
     */
    private String cbatchproperty9;

    /**
     *
     */
    private Date cbatchproperty10;

    /**
     *
     */
    private BigDecimal dblpreexchmomey;

    /**
     *
     */
    private BigDecimal dblpremomey;

    /**
     *
     */
    private Integer idemandtype;

    /**
     *
     */
    private String cdemandcode;

    /**
     *
     */
    private String cdemandmemo;

    /**
     *
     */
    private String cdemandid;

    /**
     *
     */
    private Long idemandseq;

    /**
     *
     */
    private String cvencode;

    /**
     *
     */
    private String creasoncode;

    /**
     *
     */
    private String cinvsn;

    /**
     *
     */
    private Integer iinvsncount;

    /**
     *
     */
    private Boolean bneedsign;

    /**
     *
     */
    private Boolean bsignover;

    /**
     *
     */
    private Boolean bneedloss;

    /**
     *
     */
    private BigDecimal flossrate;

    /**
     *
     */
    private BigDecimal frlossqty;

    /**
     *
     */
    private BigDecimal fulossqty;

    /**
     *
     */
    private Integer isettletype;

    /**
     *
     */
    private String crelacuscode;

    /**
     *
     */
    private String clossmaker;

    /**
     *
     */
    private Date dlossdate;

    /**
     *
     */
    private Date dlosstime;

    /**
     *
     */
    private Long icoridlsid;

    /**
     *
     */
    private BigDecimal fretoutqty;

    /**
     *
     */
    private Object bodyOutid;

    /**
     *
     */
    private BigDecimal fveribillqty;

    /**
     *
     */
    private Object fveribillsum;

    /**
     *
     */
    private BigDecimal fveriretqty;

    /**
     *
     */
    private Object fveriretsum;

    /**
     *
     */
    private BigDecimal flastsettleqty;

    /**
     *
     */
    private Object flastsettlesum;

    /**
     *
     */
    private String cbookwhcode;

    /**
     *
     */
    private String cinvouchtype;

    /**
     *
     */
    private String cposition;

    /**
     *
     */
    private BigDecimal fretqtywkp;

    /**
     *
     */
    private BigDecimal fretqtyykp;

    /**
     *
     */
    private BigDecimal frettbqtyykp;

    /**
     *
     */
    private BigDecimal fretsumykp;

    /**
     *
     */
    private Date dkeepdate;

    /**
     *
     */
    private String cscloser;

    /**
     *
     */
    private Long isaleoutid;

    /**
     *
     */
    private Boolean bsaleprice;

    /**
     *
     */
    private Boolean bgift;

    /**
     *
     */
    private Boolean bmpforderclosed;

    /**
     *
     */
    private String cbsysbarcode;

    /**
     *
     */
    private Double fxjquantity;

    /**
     *
     */
    private Double fxjnum;

    /**
     *
     */
    private Boolean biacreatebill;

    /**
     *
     */
    private String cparentcode;

    /**
     *
     */
    private String cchildcode;

    /**
     *
     */
    private BigDecimal fchildqty;

    /**
     *
     */
    private BigDecimal fchildrate;

    /**
     *
     */
    private Integer icalctype;

    /**
     *
     */
    private BigDecimal fappretwkpqty;

    /**
     *
     */
    private BigDecimal fappretwkpsum;

    /**
     *
     */
    private BigDecimal fappretykpqty;

    /**
     *
     */
    private BigDecimal fappretykpsum;

    /**
     *
     */
    private BigDecimal fappretwkptbqty;

    /**
     *
     */
    private BigDecimal fappretykptbqty;

    /**
     *
     */
    private Long irtnappid;

    /**
     *
     */
    private String crtnappcode;

    /**
     *
     */
    private BigDecimal fretailrealamount;

    /**
     *
     */
    private BigDecimal fretailsettleamount;

    /**
     *
     */
    private String cfactorycode;

    /**
     *
     */
    private Integer gcsourceid;

    /**
     *
     */
    private Integer gcsourceids;

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
        Dispatchlists other = (Dispatchlists) that;
        return (this.getAutoid() == null ? other.getAutoid() == null : this.getAutoid().equals(other.getAutoid()))
                && (this.getDlid() == null ? other.getDlid() == null : this.getDlid().equals(other.getDlid()))
                && (this.getIcorid() == null ? other.getIcorid() == null : this.getIcorid().equals(other.getIcorid()))
                && (this.getCwhcode() == null ? other.getCwhcode() == null : this.getCwhcode().equals(other.getCwhcode()))
                && (this.getCinvcode() == null ? other.getCinvcode() == null : this.getCinvcode().equals(other.getCinvcode()))
                && (this.getIquantity() == null ? other.getIquantity() == null : this.getIquantity().equals(other.getIquantity()))
                && (this.getInum() == null ? other.getInum() == null : this.getInum().equals(other.getInum()))
                && (this.getIquotedprice() == null ? other.getIquotedprice() == null : this.getIquotedprice().equals(other.getIquotedprice()))
                && (this.getIunitprice() == null ? other.getIunitprice() == null : this.getIunitprice().equals(other.getIunitprice()))
                && (this.getItaxunitprice() == null ? other.getItaxunitprice() == null : this.getItaxunitprice().equals(other.getItaxunitprice()))
                && (this.getImoney() == null ? other.getImoney() == null : this.getImoney().equals(other.getImoney()))
                && (this.getItax() == null ? other.getItax() == null : this.getItax().equals(other.getItax()))
                && (this.getIsum() == null ? other.getIsum() == null : this.getIsum().equals(other.getIsum()))
                && (this.getIdiscount() == null ? other.getIdiscount() == null : this.getIdiscount().equals(other.getIdiscount()))
                && (this.getInatunitprice() == null ? other.getInatunitprice() == null : this.getInatunitprice().equals(other.getInatunitprice()))
                && (this.getInatmoney() == null ? other.getInatmoney() == null : this.getInatmoney().equals(other.getInatmoney()))
                && (this.getInattax() == null ? other.getInattax() == null : this.getInattax().equals(other.getInattax()))
                && (this.getInatsum() == null ? other.getInatsum() == null : this.getInatsum().equals(other.getInatsum()))
                && (this.getInatdiscount() == null ? other.getInatdiscount() == null : this.getInatdiscount().equals(other.getInatdiscount()))
                && (this.getIsettlenum() == null ? other.getIsettlenum() == null : this.getIsettlenum().equals(other.getIsettlenum()))
                && (this.getIsettlequantity() == null ? other.getIsettlequantity() == null : this.getIsettlequantity().equals(other.getIsettlequantity()))
                && (this.getIbatch() == null ? other.getIbatch() == null : this.getIbatch().equals(other.getIbatch()))
                && (this.getCbatch() == null ? other.getCbatch() == null : this.getCbatch().equals(other.getCbatch()))
                && (this.getBsettleall() == null ? other.getBsettleall() == null : this.getBsettleall().equals(other.getBsettleall()))
                && (this.getCmemo() == null ? other.getCmemo() == null : this.getCmemo().equals(other.getCmemo()))
                && (this.getCfree1() == null ? other.getCfree1() == null : this.getCfree1().equals(other.getCfree1()))
                && (this.getCfree2() == null ? other.getCfree2() == null : this.getCfree2().equals(other.getCfree2()))
                && (this.getItb() == null ? other.getItb() == null : this.getItb().equals(other.getItb()))
                && (this.getDvdate() == null ? other.getDvdate() == null : this.getDvdate().equals(other.getDvdate()))
                && (this.getTbquantity() == null ? other.getTbquantity() == null : this.getTbquantity().equals(other.getTbquantity()))
                && (this.getTbnum() == null ? other.getTbnum() == null : this.getTbnum().equals(other.getTbnum()))
                && (this.getIsosid() == null ? other.getIsosid() == null : this.getIsosid().equals(other.getIsosid()))
                && (this.getIdlsid() == null ? other.getIdlsid() == null : this.getIdlsid().equals(other.getIdlsid()))
                && (this.getKl() == null ? other.getKl() == null : this.getKl().equals(other.getKl()))
                && (this.getKl2() == null ? other.getKl2() == null : this.getKl2().equals(other.getKl2()))
                && (this.getCinvname() == null ? other.getCinvname() == null : this.getCinvname().equals(other.getCinvname()))
                && (this.getItaxrate() == null ? other.getItaxrate() == null : this.getItaxrate().equals(other.getItaxrate()))
                && (this.getCdefine22() == null ? other.getCdefine22() == null : this.getCdefine22().equals(other.getCdefine22()))
                && (this.getCdefine23() == null ? other.getCdefine23() == null : this.getCdefine23().equals(other.getCdefine23()))
                && (this.getCdefine24() == null ? other.getCdefine24() == null : this.getCdefine24().equals(other.getCdefine24()))
                && (this.getCdefine25() == null ? other.getCdefine25() == null : this.getCdefine25().equals(other.getCdefine25()))
                && (this.getCdefine26() == null ? other.getCdefine26() == null : this.getCdefine26().equals(other.getCdefine26()))
                && (this.getCdefine27() == null ? other.getCdefine27() == null : this.getCdefine27().equals(other.getCdefine27()))
                && (this.getFoutquantity() == null ? other.getFoutquantity() == null : this.getFoutquantity().equals(other.getFoutquantity()))
                && (this.getFoutnum() == null ? other.getFoutnum() == null : this.getFoutnum().equals(other.getFoutnum()))
                && (this.getCitemcode() == null ? other.getCitemcode() == null : this.getCitemcode().equals(other.getCitemcode()))
                && (this.getCitemClass() == null ? other.getCitemClass() == null : this.getCitemClass().equals(other.getCitemClass()))
                && (this.getFsalecost() == null ? other.getFsalecost() == null : this.getFsalecost().equals(other.getFsalecost()))
                && (this.getFsaleprice() == null ? other.getFsaleprice() == null : this.getFsaleprice().equals(other.getFsaleprice()))
                && (this.getCvenabbname() == null ? other.getCvenabbname() == null : this.getCvenabbname().equals(other.getCvenabbname()))
                && (this.getCitemname() == null ? other.getCitemname() == null : this.getCitemname().equals(other.getCitemname()))
                && (this.getCitemCname() == null ? other.getCitemCname() == null : this.getCitemCname().equals(other.getCitemCname()))
                && (this.getCfree3() == null ? other.getCfree3() == null : this.getCfree3().equals(other.getCfree3()))
                && (this.getCfree4() == null ? other.getCfree4() == null : this.getCfree4().equals(other.getCfree4()))
                && (this.getCfree5() == null ? other.getCfree5() == null : this.getCfree5().equals(other.getCfree5()))
                && (this.getCfree6() == null ? other.getCfree6() == null : this.getCfree6().equals(other.getCfree6()))
                && (this.getCfree7() == null ? other.getCfree7() == null : this.getCfree7().equals(other.getCfree7()))
                && (this.getCfree8() == null ? other.getCfree8() == null : this.getCfree8().equals(other.getCfree8()))
                && (this.getCfree9() == null ? other.getCfree9() == null : this.getCfree9().equals(other.getCfree9()))
                && (this.getCfree10() == null ? other.getCfree10() == null : this.getCfree10().equals(other.getCfree10()))
                && (this.getBisstqc() == null ? other.getBisstqc() == null : this.getBisstqc().equals(other.getBisstqc()))
                && (this.getIinvexchrate() == null ? other.getIinvexchrate() == null : this.getIinvexchrate().equals(other.getIinvexchrate()))
                && (this.getCunitid() == null ? other.getCunitid() == null : this.getCunitid().equals(other.getCunitid()))
                && (this.getCcode() == null ? other.getCcode() == null : this.getCcode().equals(other.getCcode()))
                && (this.getIretquantity() == null ? other.getIretquantity() == null : this.getIretquantity().equals(other.getIretquantity()))
                && (this.getFensettlequan() == null ? other.getFensettlequan() == null : this.getFensettlequan().equals(other.getFensettlequan()))
                && (this.getFensettlesum() == null ? other.getFensettlesum() == null : this.getFensettlesum().equals(other.getFensettlesum()))
                && (this.getIsettleprice() == null ? other.getIsettleprice() == null : this.getIsettleprice().equals(other.getIsettleprice()))
                && (this.getCdefine28() == null ? other.getCdefine28() == null : this.getCdefine28().equals(other.getCdefine28()))
                && (this.getCdefine29() == null ? other.getCdefine29() == null : this.getCdefine29().equals(other.getCdefine29()))
                && (this.getCdefine30() == null ? other.getCdefine30() == null : this.getCdefine30().equals(other.getCdefine30()))
                && (this.getCdefine31() == null ? other.getCdefine31() == null : this.getCdefine31().equals(other.getCdefine31()))
                && (this.getCdefine32() == null ? other.getCdefine32() == null : this.getCdefine32().equals(other.getCdefine32()))
                && (this.getCdefine33() == null ? other.getCdefine33() == null : this.getCdefine33().equals(other.getCdefine33()))
                && (this.getCdefine34() == null ? other.getCdefine34() == null : this.getCdefine34().equals(other.getCdefine34()))
                && (this.getCdefine35() == null ? other.getCdefine35() == null : this.getCdefine35().equals(other.getCdefine35()))
                && (this.getCdefine36() == null ? other.getCdefine36() == null : this.getCdefine36().equals(other.getCdefine36()))
                && (this.getCdefine37() == null ? other.getCdefine37() == null : this.getCdefine37().equals(other.getCdefine37()))
                && (this.getDmdate() == null ? other.getDmdate() == null : this.getDmdate().equals(other.getDmdate()))
                && (this.getBgsp() == null ? other.getBgsp() == null : this.getBgsp().equals(other.getBgsp()))
                && (this.getCgspstate() == null ? other.getCgspstate() == null : this.getCgspstate().equals(other.getCgspstate()))
                && (this.getCsocode() == null ? other.getCsocode() == null : this.getCsocode().equals(other.getCsocode()))
                && (this.getCcorcode() == null ? other.getCcorcode() == null : this.getCcorcode().equals(other.getCcorcode()))
                && (this.getIppartseqid() == null ? other.getIppartseqid() == null : this.getIppartseqid().equals(other.getIppartseqid()))
                && (this.getIppartid() == null ? other.getIppartid() == null : this.getIppartid().equals(other.getIppartid()))
                && (this.getIppartqty() == null ? other.getIppartqty() == null : this.getIppartqty().equals(other.getIppartqty()))
                && (this.getCcontractid() == null ? other.getCcontractid() == null : this.getCcontractid().equals(other.getCcontractid()))
                && (this.getCcontracttagcode() == null ? other.getCcontracttagcode() == null : this.getCcontracttagcode().equals(other.getCcontracttagcode()))
                && (this.getCcontractrowguid() == null ? other.getCcontractrowguid() == null : this.getCcontractrowguid().equals(other.getCcontractrowguid()))
                && (this.getImassdate() == null ? other.getImassdate() == null : this.getImassdate().equals(other.getImassdate()))
                && (this.getCmassunit() == null ? other.getCmassunit() == null : this.getCmassunit().equals(other.getCmassunit()))
                && (this.getBqaneedcheck() == null ? other.getBqaneedcheck() == null : this.getBqaneedcheck().equals(other.getBqaneedcheck()))
                && (this.getBqaurgency() == null ? other.getBqaurgency() == null : this.getBqaurgency().equals(other.getBqaurgency()))
                && (this.getBqachecking() == null ? other.getBqachecking() == null : this.getBqachecking().equals(other.getBqachecking()))
                && (this.getBqachecked() == null ? other.getBqachecked() == null : this.getBqachecked().equals(other.getBqachecked()))
                && (this.getIqaquantity() == null ? other.getIqaquantity() == null : this.getIqaquantity().equals(other.getIqaquantity()))
                && (this.getIqanum() == null ? other.getIqanum() == null : this.getIqanum().equals(other.getIqanum()))
                && (this.getCcusinvcode() == null ? other.getCcusinvcode() == null : this.getCcusinvcode().equals(other.getCcusinvcode()))
                && (this.getCcusinvname() == null ? other.getCcusinvname() == null : this.getCcusinvname().equals(other.getCcusinvname()))
                && (this.getFsumsignquantity() == null ? other.getFsumsignquantity() == null : this.getFsumsignquantity().equals(other.getFsumsignquantity()))
                && (this.getFsumsignnum() == null ? other.getFsumsignnum() == null : this.getFsumsignnum().equals(other.getFsumsignnum()))
                && (this.getCbaccounter() == null ? other.getCbaccounter() == null : this.getCbaccounter().equals(other.getCbaccounter()))
                && (this.getBcosting() == null ? other.getBcosting() == null : this.getBcosting().equals(other.getBcosting()))
                && (this.getCordercode() == null ? other.getCordercode() == null : this.getCordercode().equals(other.getCordercode()))
                && (this.getIorderrowno() == null ? other.getIorderrowno() == null : this.getIorderrowno().equals(other.getIorderrowno()))
                && (this.getFcusminprice() == null ? other.getFcusminprice() == null : this.getFcusminprice().equals(other.getFcusminprice()))
                && (this.getIcostquantity() == null ? other.getIcostquantity() == null : this.getIcostquantity().equals(other.getIcostquantity()))
                && (this.getIcostsum() == null ? other.getIcostsum() == null : this.getIcostsum().equals(other.getIcostsum()))
                && (this.getIspecialtype() == null ? other.getIspecialtype() == null : this.getIspecialtype().equals(other.getIspecialtype()))
                && (this.getCvmivencode() == null ? other.getCvmivencode() == null : this.getCvmivencode().equals(other.getCvmivencode()))
                && (this.getIexchsum() == null ? other.getIexchsum() == null : this.getIexchsum().equals(other.getIexchsum()))
                && (this.getImoneysum() == null ? other.getImoneysum() == null : this.getImoneysum().equals(other.getImoneysum()))
                && (this.getIrowno() == null ? other.getIrowno() == null : this.getIrowno().equals(other.getIrowno()))
                && (this.getFrettbquantity() == null ? other.getFrettbquantity() == null : this.getFrettbquantity().equals(other.getFrettbquantity()))
                && (this.getFretsum() == null ? other.getFretsum() == null : this.getFretsum().equals(other.getFretsum()))
                && (this.getIexpiratdatecalcu() == null ? other.getIexpiratdatecalcu() == null : this.getIexpiratdatecalcu().equals(other.getIexpiratdatecalcu()))
                && (this.getDexpirationdate() == null ? other.getDexpirationdate() == null : this.getDexpirationdate().equals(other.getDexpirationdate()))
                && (this.getCexpirationdate() == null ? other.getCexpirationdate() == null : this.getCexpirationdate().equals(other.getCexpirationdate()))
                && (this.getCbatchproperty1() == null ? other.getCbatchproperty1() == null : this.getCbatchproperty1().equals(other.getCbatchproperty1()))
                && (this.getCbatchproperty2() == null ? other.getCbatchproperty2() == null : this.getCbatchproperty2().equals(other.getCbatchproperty2()))
                && (this.getCbatchproperty3() == null ? other.getCbatchproperty3() == null : this.getCbatchproperty3().equals(other.getCbatchproperty3()))
                && (this.getCbatchproperty4() == null ? other.getCbatchproperty4() == null : this.getCbatchproperty4().equals(other.getCbatchproperty4()))
                && (this.getCbatchproperty5() == null ? other.getCbatchproperty5() == null : this.getCbatchproperty5().equals(other.getCbatchproperty5()))
                && (this.getCbatchproperty6() == null ? other.getCbatchproperty6() == null : this.getCbatchproperty6().equals(other.getCbatchproperty6()))
                && (this.getCbatchproperty7() == null ? other.getCbatchproperty7() == null : this.getCbatchproperty7().equals(other.getCbatchproperty7()))
                && (this.getCbatchproperty8() == null ? other.getCbatchproperty8() == null : this.getCbatchproperty8().equals(other.getCbatchproperty8()))
                && (this.getCbatchproperty9() == null ? other.getCbatchproperty9() == null : this.getCbatchproperty9().equals(other.getCbatchproperty9()))
                && (this.getCbatchproperty10() == null ? other.getCbatchproperty10() == null : this.getCbatchproperty10().equals(other.getCbatchproperty10()))
                && (this.getDblpreexchmomey() == null ? other.getDblpreexchmomey() == null : this.getDblpreexchmomey().equals(other.getDblpreexchmomey()))
                && (this.getDblpremomey() == null ? other.getDblpremomey() == null : this.getDblpremomey().equals(other.getDblpremomey()))
                && (this.getIdemandtype() == null ? other.getIdemandtype() == null : this.getIdemandtype().equals(other.getIdemandtype()))
                && (this.getCdemandcode() == null ? other.getCdemandcode() == null : this.getCdemandcode().equals(other.getCdemandcode()))
                && (this.getCdemandmemo() == null ? other.getCdemandmemo() == null : this.getCdemandmemo().equals(other.getCdemandmemo()))
                && (this.getCdemandid() == null ? other.getCdemandid() == null : this.getCdemandid().equals(other.getCdemandid()))
                && (this.getIdemandseq() == null ? other.getIdemandseq() == null : this.getIdemandseq().equals(other.getIdemandseq()))
                && (this.getCvencode() == null ? other.getCvencode() == null : this.getCvencode().equals(other.getCvencode()))
                && (this.getCreasoncode() == null ? other.getCreasoncode() == null : this.getCreasoncode().equals(other.getCreasoncode()))
                && (this.getCinvsn() == null ? other.getCinvsn() == null : this.getCinvsn().equals(other.getCinvsn()))
                && (this.getIinvsncount() == null ? other.getIinvsncount() == null : this.getIinvsncount().equals(other.getIinvsncount()))
                && (this.getBneedsign() == null ? other.getBneedsign() == null : this.getBneedsign().equals(other.getBneedsign()))
                && (this.getBsignover() == null ? other.getBsignover() == null : this.getBsignover().equals(other.getBsignover()))
                && (this.getBneedloss() == null ? other.getBneedloss() == null : this.getBneedloss().equals(other.getBneedloss()))
                && (this.getFlossrate() == null ? other.getFlossrate() == null : this.getFlossrate().equals(other.getFlossrate()))
                && (this.getFrlossqty() == null ? other.getFrlossqty() == null : this.getFrlossqty().equals(other.getFrlossqty()))
                && (this.getFulossqty() == null ? other.getFulossqty() == null : this.getFulossqty().equals(other.getFulossqty()))
                && (this.getIsettletype() == null ? other.getIsettletype() == null : this.getIsettletype().equals(other.getIsettletype()))
                && (this.getCrelacuscode() == null ? other.getCrelacuscode() == null : this.getCrelacuscode().equals(other.getCrelacuscode()))
                && (this.getClossmaker() == null ? other.getClossmaker() == null : this.getClossmaker().equals(other.getClossmaker()))
                && (this.getDlossdate() == null ? other.getDlossdate() == null : this.getDlossdate().equals(other.getDlossdate()))
                && (this.getDlosstime() == null ? other.getDlosstime() == null : this.getDlosstime().equals(other.getDlosstime()))
                && (this.getIcoridlsid() == null ? other.getIcoridlsid() == null : this.getIcoridlsid().equals(other.getIcoridlsid()))
                && (this.getFretoutqty() == null ? other.getFretoutqty() == null : this.getFretoutqty().equals(other.getFretoutqty()))
                && (this.getBodyOutid() == null ? other.getBodyOutid() == null : this.getBodyOutid().equals(other.getBodyOutid()))
                && (this.getFveribillqty() == null ? other.getFveribillqty() == null : this.getFveribillqty().equals(other.getFveribillqty()))
                && (this.getFveribillsum() == null ? other.getFveribillsum() == null : this.getFveribillsum().equals(other.getFveribillsum()))
                && (this.getFveriretqty() == null ? other.getFveriretqty() == null : this.getFveriretqty().equals(other.getFveriretqty()))
                && (this.getFveriretsum() == null ? other.getFveriretsum() == null : this.getFveriretsum().equals(other.getFveriretsum()))
                && (this.getFlastsettleqty() == null ? other.getFlastsettleqty() == null : this.getFlastsettleqty().equals(other.getFlastsettleqty()))
                && (this.getFlastsettlesum() == null ? other.getFlastsettlesum() == null : this.getFlastsettlesum().equals(other.getFlastsettlesum()))
                && (this.getCbookwhcode() == null ? other.getCbookwhcode() == null : this.getCbookwhcode().equals(other.getCbookwhcode()))
                && (this.getCinvouchtype() == null ? other.getCinvouchtype() == null : this.getCinvouchtype().equals(other.getCinvouchtype()))
                && (this.getCposition() == null ? other.getCposition() == null : this.getCposition().equals(other.getCposition()))
                && (this.getFretqtywkp() == null ? other.getFretqtywkp() == null : this.getFretqtywkp().equals(other.getFretqtywkp()))
                && (this.getFretqtyykp() == null ? other.getFretqtyykp() == null : this.getFretqtyykp().equals(other.getFretqtyykp()))
                && (this.getFrettbqtyykp() == null ? other.getFrettbqtyykp() == null : this.getFrettbqtyykp().equals(other.getFrettbqtyykp()))
                && (this.getFretsumykp() == null ? other.getFretsumykp() == null : this.getFretsumykp().equals(other.getFretsumykp()))
                && (this.getDkeepdate() == null ? other.getDkeepdate() == null : this.getDkeepdate().equals(other.getDkeepdate()))
                && (this.getCscloser() == null ? other.getCscloser() == null : this.getCscloser().equals(other.getCscloser()))
                && (this.getIsaleoutid() == null ? other.getIsaleoutid() == null : this.getIsaleoutid().equals(other.getIsaleoutid()))
                && (this.getBsaleprice() == null ? other.getBsaleprice() == null : this.getBsaleprice().equals(other.getBsaleprice()))
                && (this.getBgift() == null ? other.getBgift() == null : this.getBgift().equals(other.getBgift()))
                && (this.getBmpforderclosed() == null ? other.getBmpforderclosed() == null : this.getBmpforderclosed().equals(other.getBmpforderclosed()))
                && (this.getCbsysbarcode() == null ? other.getCbsysbarcode() == null : this.getCbsysbarcode().equals(other.getCbsysbarcode()))
                && (this.getFxjquantity() == null ? other.getFxjquantity() == null : this.getFxjquantity().equals(other.getFxjquantity()))
                && (this.getFxjnum() == null ? other.getFxjnum() == null : this.getFxjnum().equals(other.getFxjnum()))
                && (this.getBiacreatebill() == null ? other.getBiacreatebill() == null : this.getBiacreatebill().equals(other.getBiacreatebill()))
                && (this.getCparentcode() == null ? other.getCparentcode() == null : this.getCparentcode().equals(other.getCparentcode()))
                && (this.getCchildcode() == null ? other.getCchildcode() == null : this.getCchildcode().equals(other.getCchildcode()))
                && (this.getFchildqty() == null ? other.getFchildqty() == null : this.getFchildqty().equals(other.getFchildqty()))
                && (this.getFchildrate() == null ? other.getFchildrate() == null : this.getFchildrate().equals(other.getFchildrate()))
                && (this.getIcalctype() == null ? other.getIcalctype() == null : this.getIcalctype().equals(other.getIcalctype()))
                && (this.getFappretwkpqty() == null ? other.getFappretwkpqty() == null : this.getFappretwkpqty().equals(other.getFappretwkpqty()))
                && (this.getFappretwkpsum() == null ? other.getFappretwkpsum() == null : this.getFappretwkpsum().equals(other.getFappretwkpsum()))
                && (this.getFappretykpqty() == null ? other.getFappretykpqty() == null : this.getFappretykpqty().equals(other.getFappretykpqty()))
                && (this.getFappretykpsum() == null ? other.getFappretykpsum() == null : this.getFappretykpsum().equals(other.getFappretykpsum()))
                && (this.getFappretwkptbqty() == null ? other.getFappretwkptbqty() == null : this.getFappretwkptbqty().equals(other.getFappretwkptbqty()))
                && (this.getFappretykptbqty() == null ? other.getFappretykptbqty() == null : this.getFappretykptbqty().equals(other.getFappretykptbqty()))
                && (this.getIrtnappid() == null ? other.getIrtnappid() == null : this.getIrtnappid().equals(other.getIrtnappid()))
                && (this.getCrtnappcode() == null ? other.getCrtnappcode() == null : this.getCrtnappcode().equals(other.getCrtnappcode()))
                && (this.getFretailrealamount() == null ? other.getFretailrealamount() == null : this.getFretailrealamount().equals(other.getFretailrealamount()))
                && (this.getFretailsettleamount() == null ? other.getFretailsettleamount() == null : this.getFretailsettleamount().equals(other.getFretailsettleamount()))
                && (this.getCfactorycode() == null ? other.getCfactorycode() == null : this.getCfactorycode().equals(other.getCfactorycode()))
                && (this.getGcsourceid() == null ? other.getGcsourceid() == null : this.getGcsourceid().equals(other.getGcsourceid()))
                && (this.getGcsourceids() == null ? other.getGcsourceids() == null : this.getGcsourceids().equals(other.getGcsourceids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutoid() == null) ? 0 : getAutoid().hashCode());
        result = prime * result + ((getDlid() == null) ? 0 : getDlid().hashCode());
        result = prime * result + ((getIcorid() == null) ? 0 : getIcorid().hashCode());
        result = prime * result + ((getCwhcode() == null) ? 0 : getCwhcode().hashCode());
        result = prime * result + ((getCinvcode() == null) ? 0 : getCinvcode().hashCode());
        result = prime * result + ((getIquantity() == null) ? 0 : getIquantity().hashCode());
        result = prime * result + ((getInum() == null) ? 0 : getInum().hashCode());
        result = prime * result + ((getIquotedprice() == null) ? 0 : getIquotedprice().hashCode());
        result = prime * result + ((getIunitprice() == null) ? 0 : getIunitprice().hashCode());
        result = prime * result + ((getItaxunitprice() == null) ? 0 : getItaxunitprice().hashCode());
        result = prime * result + ((getImoney() == null) ? 0 : getImoney().hashCode());
        result = prime * result + ((getItax() == null) ? 0 : getItax().hashCode());
        result = prime * result + ((getIsum() == null) ? 0 : getIsum().hashCode());
        result = prime * result + ((getIdiscount() == null) ? 0 : getIdiscount().hashCode());
        result = prime * result + ((getInatunitprice() == null) ? 0 : getInatunitprice().hashCode());
        result = prime * result + ((getInatmoney() == null) ? 0 : getInatmoney().hashCode());
        result = prime * result + ((getInattax() == null) ? 0 : getInattax().hashCode());
        result = prime * result + ((getInatsum() == null) ? 0 : getInatsum().hashCode());
        result = prime * result + ((getInatdiscount() == null) ? 0 : getInatdiscount().hashCode());
        result = prime * result + ((getIsettlenum() == null) ? 0 : getIsettlenum().hashCode());
        result = prime * result + ((getIsettlequantity() == null) ? 0 : getIsettlequantity().hashCode());
        result = prime * result + ((getIbatch() == null) ? 0 : getIbatch().hashCode());
        result = prime * result + ((getCbatch() == null) ? 0 : getCbatch().hashCode());
        result = prime * result + ((getBsettleall() == null) ? 0 : getBsettleall().hashCode());
        result = prime * result + ((getCmemo() == null) ? 0 : getCmemo().hashCode());
        result = prime * result + ((getCfree1() == null) ? 0 : getCfree1().hashCode());
        result = prime * result + ((getCfree2() == null) ? 0 : getCfree2().hashCode());
        result = prime * result + ((getItb() == null) ? 0 : getItb().hashCode());
        result = prime * result + ((getDvdate() == null) ? 0 : getDvdate().hashCode());
        result = prime * result + ((getTbquantity() == null) ? 0 : getTbquantity().hashCode());
        result = prime * result + ((getTbnum() == null) ? 0 : getTbnum().hashCode());
        result = prime * result + ((getIsosid() == null) ? 0 : getIsosid().hashCode());
        result = prime * result + ((getIdlsid() == null) ? 0 : getIdlsid().hashCode());
        result = prime * result + ((getKl() == null) ? 0 : getKl().hashCode());
        result = prime * result + ((getKl2() == null) ? 0 : getKl2().hashCode());
        result = prime * result + ((getCinvname() == null) ? 0 : getCinvname().hashCode());
        result = prime * result + ((getItaxrate() == null) ? 0 : getItaxrate().hashCode());
        result = prime * result + ((getCdefine22() == null) ? 0 : getCdefine22().hashCode());
        result = prime * result + ((getCdefine23() == null) ? 0 : getCdefine23().hashCode());
        result = prime * result + ((getCdefine24() == null) ? 0 : getCdefine24().hashCode());
        result = prime * result + ((getCdefine25() == null) ? 0 : getCdefine25().hashCode());
        result = prime * result + ((getCdefine26() == null) ? 0 : getCdefine26().hashCode());
        result = prime * result + ((getCdefine27() == null) ? 0 : getCdefine27().hashCode());
        result = prime * result + ((getFoutquantity() == null) ? 0 : getFoutquantity().hashCode());
        result = prime * result + ((getFoutnum() == null) ? 0 : getFoutnum().hashCode());
        result = prime * result + ((getCitemcode() == null) ? 0 : getCitemcode().hashCode());
        result = prime * result + ((getCitemClass() == null) ? 0 : getCitemClass().hashCode());
        result = prime * result + ((getFsalecost() == null) ? 0 : getFsalecost().hashCode());
        result = prime * result + ((getFsaleprice() == null) ? 0 : getFsaleprice().hashCode());
        result = prime * result + ((getCvenabbname() == null) ? 0 : getCvenabbname().hashCode());
        result = prime * result + ((getCitemname() == null) ? 0 : getCitemname().hashCode());
        result = prime * result + ((getCitemCname() == null) ? 0 : getCitemCname().hashCode());
        result = prime * result + ((getCfree3() == null) ? 0 : getCfree3().hashCode());
        result = prime * result + ((getCfree4() == null) ? 0 : getCfree4().hashCode());
        result = prime * result + ((getCfree5() == null) ? 0 : getCfree5().hashCode());
        result = prime * result + ((getCfree6() == null) ? 0 : getCfree6().hashCode());
        result = prime * result + ((getCfree7() == null) ? 0 : getCfree7().hashCode());
        result = prime * result + ((getCfree8() == null) ? 0 : getCfree8().hashCode());
        result = prime * result + ((getCfree9() == null) ? 0 : getCfree9().hashCode());
        result = prime * result + ((getCfree10() == null) ? 0 : getCfree10().hashCode());
        result = prime * result + ((getBisstqc() == null) ? 0 : getBisstqc().hashCode());
        result = prime * result + ((getIinvexchrate() == null) ? 0 : getIinvexchrate().hashCode());
        result = prime * result + ((getCunitid() == null) ? 0 : getCunitid().hashCode());
        result = prime * result + ((getCcode() == null) ? 0 : getCcode().hashCode());
        result = prime * result + ((getIretquantity() == null) ? 0 : getIretquantity().hashCode());
        result = prime * result + ((getFensettlequan() == null) ? 0 : getFensettlequan().hashCode());
        result = prime * result + ((getFensettlesum() == null) ? 0 : getFensettlesum().hashCode());
        result = prime * result + ((getIsettleprice() == null) ? 0 : getIsettleprice().hashCode());
        result = prime * result + ((getCdefine28() == null) ? 0 : getCdefine28().hashCode());
        result = prime * result + ((getCdefine29() == null) ? 0 : getCdefine29().hashCode());
        result = prime * result + ((getCdefine30() == null) ? 0 : getCdefine30().hashCode());
        result = prime * result + ((getCdefine31() == null) ? 0 : getCdefine31().hashCode());
        result = prime * result + ((getCdefine32() == null) ? 0 : getCdefine32().hashCode());
        result = prime * result + ((getCdefine33() == null) ? 0 : getCdefine33().hashCode());
        result = prime * result + ((getCdefine34() == null) ? 0 : getCdefine34().hashCode());
        result = prime * result + ((getCdefine35() == null) ? 0 : getCdefine35().hashCode());
        result = prime * result + ((getCdefine36() == null) ? 0 : getCdefine36().hashCode());
        result = prime * result + ((getCdefine37() == null) ? 0 : getCdefine37().hashCode());
        result = prime * result + ((getDmdate() == null) ? 0 : getDmdate().hashCode());
        result = prime * result + ((getBgsp() == null) ? 0 : getBgsp().hashCode());
        result = prime * result + ((getCgspstate() == null) ? 0 : getCgspstate().hashCode());
        result = prime * result + ((getCsocode() == null) ? 0 : getCsocode().hashCode());
        result = prime * result + ((getCcorcode() == null) ? 0 : getCcorcode().hashCode());
        result = prime * result + ((getIppartseqid() == null) ? 0 : getIppartseqid().hashCode());
        result = prime * result + ((getIppartid() == null) ? 0 : getIppartid().hashCode());
        result = prime * result + ((getIppartqty() == null) ? 0 : getIppartqty().hashCode());
        result = prime * result + ((getCcontractid() == null) ? 0 : getCcontractid().hashCode());
        result = prime * result + ((getCcontracttagcode() == null) ? 0 : getCcontracttagcode().hashCode());
        result = prime * result + ((getCcontractrowguid() == null) ? 0 : getCcontractrowguid().hashCode());
        result = prime * result + ((getImassdate() == null) ? 0 : getImassdate().hashCode());
        result = prime * result + ((getCmassunit() == null) ? 0 : getCmassunit().hashCode());
        result = prime * result + ((getBqaneedcheck() == null) ? 0 : getBqaneedcheck().hashCode());
        result = prime * result + ((getBqaurgency() == null) ? 0 : getBqaurgency().hashCode());
        result = prime * result + ((getBqachecking() == null) ? 0 : getBqachecking().hashCode());
        result = prime * result + ((getBqachecked() == null) ? 0 : getBqachecked().hashCode());
        result = prime * result + ((getIqaquantity() == null) ? 0 : getIqaquantity().hashCode());
        result = prime * result + ((getIqanum() == null) ? 0 : getIqanum().hashCode());
        result = prime * result + ((getCcusinvcode() == null) ? 0 : getCcusinvcode().hashCode());
        result = prime * result + ((getCcusinvname() == null) ? 0 : getCcusinvname().hashCode());
        result = prime * result + ((getFsumsignquantity() == null) ? 0 : getFsumsignquantity().hashCode());
        result = prime * result + ((getFsumsignnum() == null) ? 0 : getFsumsignnum().hashCode());
        result = prime * result + ((getCbaccounter() == null) ? 0 : getCbaccounter().hashCode());
        result = prime * result + ((getBcosting() == null) ? 0 : getBcosting().hashCode());
        result = prime * result + ((getCordercode() == null) ? 0 : getCordercode().hashCode());
        result = prime * result + ((getIorderrowno() == null) ? 0 : getIorderrowno().hashCode());
        result = prime * result + ((getFcusminprice() == null) ? 0 : getFcusminprice().hashCode());
        result = prime * result + ((getIcostquantity() == null) ? 0 : getIcostquantity().hashCode());
        result = prime * result + ((getIcostsum() == null) ? 0 : getIcostsum().hashCode());
        result = prime * result + ((getIspecialtype() == null) ? 0 : getIspecialtype().hashCode());
        result = prime * result + ((getCvmivencode() == null) ? 0 : getCvmivencode().hashCode());
        result = prime * result + ((getIexchsum() == null) ? 0 : getIexchsum().hashCode());
        result = prime * result + ((getImoneysum() == null) ? 0 : getImoneysum().hashCode());
        result = prime * result + ((getIrowno() == null) ? 0 : getIrowno().hashCode());
        result = prime * result + ((getFrettbquantity() == null) ? 0 : getFrettbquantity().hashCode());
        result = prime * result + ((getFretsum() == null) ? 0 : getFretsum().hashCode());
        result = prime * result + ((getIexpiratdatecalcu() == null) ? 0 : getIexpiratdatecalcu().hashCode());
        result = prime * result + ((getDexpirationdate() == null) ? 0 : getDexpirationdate().hashCode());
        result = prime * result + ((getCexpirationdate() == null) ? 0 : getCexpirationdate().hashCode());
        result = prime * result + ((getCbatchproperty1() == null) ? 0 : getCbatchproperty1().hashCode());
        result = prime * result + ((getCbatchproperty2() == null) ? 0 : getCbatchproperty2().hashCode());
        result = prime * result + ((getCbatchproperty3() == null) ? 0 : getCbatchproperty3().hashCode());
        result = prime * result + ((getCbatchproperty4() == null) ? 0 : getCbatchproperty4().hashCode());
        result = prime * result + ((getCbatchproperty5() == null) ? 0 : getCbatchproperty5().hashCode());
        result = prime * result + ((getCbatchproperty6() == null) ? 0 : getCbatchproperty6().hashCode());
        result = prime * result + ((getCbatchproperty7() == null) ? 0 : getCbatchproperty7().hashCode());
        result = prime * result + ((getCbatchproperty8() == null) ? 0 : getCbatchproperty8().hashCode());
        result = prime * result + ((getCbatchproperty9() == null) ? 0 : getCbatchproperty9().hashCode());
        result = prime * result + ((getCbatchproperty10() == null) ? 0 : getCbatchproperty10().hashCode());
        result = prime * result + ((getDblpreexchmomey() == null) ? 0 : getDblpreexchmomey().hashCode());
        result = prime * result + ((getDblpremomey() == null) ? 0 : getDblpremomey().hashCode());
        result = prime * result + ((getIdemandtype() == null) ? 0 : getIdemandtype().hashCode());
        result = prime * result + ((getCdemandcode() == null) ? 0 : getCdemandcode().hashCode());
        result = prime * result + ((getCdemandmemo() == null) ? 0 : getCdemandmemo().hashCode());
        result = prime * result + ((getCdemandid() == null) ? 0 : getCdemandid().hashCode());
        result = prime * result + ((getIdemandseq() == null) ? 0 : getIdemandseq().hashCode());
        result = prime * result + ((getCvencode() == null) ? 0 : getCvencode().hashCode());
        result = prime * result + ((getCreasoncode() == null) ? 0 : getCreasoncode().hashCode());
        result = prime * result + ((getCinvsn() == null) ? 0 : getCinvsn().hashCode());
        result = prime * result + ((getIinvsncount() == null) ? 0 : getIinvsncount().hashCode());
        result = prime * result + ((getBneedsign() == null) ? 0 : getBneedsign().hashCode());
        result = prime * result + ((getBsignover() == null) ? 0 : getBsignover().hashCode());
        result = prime * result + ((getBneedloss() == null) ? 0 : getBneedloss().hashCode());
        result = prime * result + ((getFlossrate() == null) ? 0 : getFlossrate().hashCode());
        result = prime * result + ((getFrlossqty() == null) ? 0 : getFrlossqty().hashCode());
        result = prime * result + ((getFulossqty() == null) ? 0 : getFulossqty().hashCode());
        result = prime * result + ((getIsettletype() == null) ? 0 : getIsettletype().hashCode());
        result = prime * result + ((getCrelacuscode() == null) ? 0 : getCrelacuscode().hashCode());
        result = prime * result + ((getClossmaker() == null) ? 0 : getClossmaker().hashCode());
        result = prime * result + ((getDlossdate() == null) ? 0 : getDlossdate().hashCode());
        result = prime * result + ((getDlosstime() == null) ? 0 : getDlosstime().hashCode());
        result = prime * result + ((getIcoridlsid() == null) ? 0 : getIcoridlsid().hashCode());
        result = prime * result + ((getFretoutqty() == null) ? 0 : getFretoutqty().hashCode());
        result = prime * result + ((getBodyOutid() == null) ? 0 : getBodyOutid().hashCode());
        result = prime * result + ((getFveribillqty() == null) ? 0 : getFveribillqty().hashCode());
        result = prime * result + ((getFveribillsum() == null) ? 0 : getFveribillsum().hashCode());
        result = prime * result + ((getFveriretqty() == null) ? 0 : getFveriretqty().hashCode());
        result = prime * result + ((getFveriretsum() == null) ? 0 : getFveriretsum().hashCode());
        result = prime * result + ((getFlastsettleqty() == null) ? 0 : getFlastsettleqty().hashCode());
        result = prime * result + ((getFlastsettlesum() == null) ? 0 : getFlastsettlesum().hashCode());
        result = prime * result + ((getCbookwhcode() == null) ? 0 : getCbookwhcode().hashCode());
        result = prime * result + ((getCinvouchtype() == null) ? 0 : getCinvouchtype().hashCode());
        result = prime * result + ((getCposition() == null) ? 0 : getCposition().hashCode());
        result = prime * result + ((getFretqtywkp() == null) ? 0 : getFretqtywkp().hashCode());
        result = prime * result + ((getFretqtyykp() == null) ? 0 : getFretqtyykp().hashCode());
        result = prime * result + ((getFrettbqtyykp() == null) ? 0 : getFrettbqtyykp().hashCode());
        result = prime * result + ((getFretsumykp() == null) ? 0 : getFretsumykp().hashCode());
        result = prime * result + ((getDkeepdate() == null) ? 0 : getDkeepdate().hashCode());
        result = prime * result + ((getCscloser() == null) ? 0 : getCscloser().hashCode());
        result = prime * result + ((getIsaleoutid() == null) ? 0 : getIsaleoutid().hashCode());
        result = prime * result + ((getBsaleprice() == null) ? 0 : getBsaleprice().hashCode());
        result = prime * result + ((getBgift() == null) ? 0 : getBgift().hashCode());
        result = prime * result + ((getBmpforderclosed() == null) ? 0 : getBmpforderclosed().hashCode());
        result = prime * result + ((getCbsysbarcode() == null) ? 0 : getCbsysbarcode().hashCode());
        result = prime * result + ((getFxjquantity() == null) ? 0 : getFxjquantity().hashCode());
        result = prime * result + ((getFxjnum() == null) ? 0 : getFxjnum().hashCode());
        result = prime * result + ((getBiacreatebill() == null) ? 0 : getBiacreatebill().hashCode());
        result = prime * result + ((getCparentcode() == null) ? 0 : getCparentcode().hashCode());
        result = prime * result + ((getCchildcode() == null) ? 0 : getCchildcode().hashCode());
        result = prime * result + ((getFchildqty() == null) ? 0 : getFchildqty().hashCode());
        result = prime * result + ((getFchildrate() == null) ? 0 : getFchildrate().hashCode());
        result = prime * result + ((getIcalctype() == null) ? 0 : getIcalctype().hashCode());
        result = prime * result + ((getFappretwkpqty() == null) ? 0 : getFappretwkpqty().hashCode());
        result = prime * result + ((getFappretwkpsum() == null) ? 0 : getFappretwkpsum().hashCode());
        result = prime * result + ((getFappretykpqty() == null) ? 0 : getFappretykpqty().hashCode());
        result = prime * result + ((getFappretykpsum() == null) ? 0 : getFappretykpsum().hashCode());
        result = prime * result + ((getFappretwkptbqty() == null) ? 0 : getFappretwkptbqty().hashCode());
        result = prime * result + ((getFappretykptbqty() == null) ? 0 : getFappretykptbqty().hashCode());
        result = prime * result + ((getIrtnappid() == null) ? 0 : getIrtnappid().hashCode());
        result = prime * result + ((getCrtnappcode() == null) ? 0 : getCrtnappcode().hashCode());
        result = prime * result + ((getFretailrealamount() == null) ? 0 : getFretailrealamount().hashCode());
        result = prime * result + ((getFretailsettleamount() == null) ? 0 : getFretailsettleamount().hashCode());
        result = prime * result + ((getCfactorycode() == null) ? 0 : getCfactorycode().hashCode());
        result = prime * result + ((getGcsourceid() == null) ? 0 : getGcsourceid().hashCode());
        result = prime * result + ((getGcsourceids() == null) ? 0 : getGcsourceids().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", dlid=").append(dlid);
        sb.append(", icorid=").append(icorid);
        sb.append(", cwhcode=").append(cwhcode);
        sb.append(", cinvcode=").append(cinvcode);
        sb.append(", iquantity=").append(iquantity);
        sb.append(", inum=").append(inum);
        sb.append(", iquotedprice=").append(iquotedprice);
        sb.append(", iunitprice=").append(iunitprice);
        sb.append(", itaxunitprice=").append(itaxunitprice);
        sb.append(", imoney=").append(imoney);
        sb.append(", itax=").append(itax);
        sb.append(", isum=").append(isum);
        sb.append(", idiscount=").append(idiscount);
        sb.append(", inatunitprice=").append(inatunitprice);
        sb.append(", inatmoney=").append(inatmoney);
        sb.append(", inattax=").append(inattax);
        sb.append(", inatsum=").append(inatsum);
        sb.append(", inatdiscount=").append(inatdiscount);
        sb.append(", isettlenum=").append(isettlenum);
        sb.append(", isettlequantity=").append(isettlequantity);
        sb.append(", ibatch=").append(ibatch);
        sb.append(", cbatch=").append(cbatch);
        sb.append(", bsettleall=").append(bsettleall);
        sb.append(", cmemo=").append(cmemo);
        sb.append(", cfree1=").append(cfree1);
        sb.append(", cfree2=").append(cfree2);
        sb.append(", itb=").append(itb);
        sb.append(", dvdate=").append(dvdate);
        sb.append(", tbquantity=").append(tbquantity);
        sb.append(", tbnum=").append(tbnum);
        sb.append(", isosid=").append(isosid);
        sb.append(", idlsid=").append(idlsid);
        sb.append(", kl=").append(kl);
        sb.append(", kl2=").append(kl2);
        sb.append(", cinvname=").append(cinvname);
        sb.append(", itaxrate=").append(itaxrate);
        sb.append(", cdefine22=").append(cdefine22);
        sb.append(", cdefine23=").append(cdefine23);
        sb.append(", cdefine24=").append(cdefine24);
        sb.append(", cdefine25=").append(cdefine25);
        sb.append(", cdefine26=").append(cdefine26);
        sb.append(", cdefine27=").append(cdefine27);
        sb.append(", foutquantity=").append(foutquantity);
        sb.append(", foutnum=").append(foutnum);
        sb.append(", citemcode=").append(citemcode);
        sb.append(", citemClass=").append(citemClass);
        sb.append(", fsalecost=").append(fsalecost);
        sb.append(", fsaleprice=").append(fsaleprice);
        sb.append(", cvenabbname=").append(cvenabbname);
        sb.append(", citemname=").append(citemname);
        sb.append(", citemCname=").append(citemCname);
        sb.append(", cfree3=").append(cfree3);
        sb.append(", cfree4=").append(cfree4);
        sb.append(", cfree5=").append(cfree5);
        sb.append(", cfree6=").append(cfree6);
        sb.append(", cfree7=").append(cfree7);
        sb.append(", cfree8=").append(cfree8);
        sb.append(", cfree9=").append(cfree9);
        sb.append(", cfree10=").append(cfree10);
        sb.append(", bisstqc=").append(bisstqc);
        sb.append(", iinvexchrate=").append(iinvexchrate);
        sb.append(", cunitid=").append(cunitid);
        sb.append(", ccode=").append(ccode);
        sb.append(", iretquantity=").append(iretquantity);
        sb.append(", fensettlequan=").append(fensettlequan);
        sb.append(", fensettlesum=").append(fensettlesum);
        sb.append(", isettleprice=").append(isettleprice);
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
        sb.append(", dmdate=").append(dmdate);
        sb.append(", bgsp=").append(bgsp);
        sb.append(", cgspstate=").append(cgspstate);
        sb.append(", csocode=").append(csocode);
        sb.append(", ccorcode=").append(ccorcode);
        sb.append(", ippartseqid=").append(ippartseqid);
        sb.append(", ippartid=").append(ippartid);
        sb.append(", ippartqty=").append(ippartqty);
        sb.append(", ccontractid=").append(ccontractid);
        sb.append(", ccontracttagcode=").append(ccontracttagcode);
        sb.append(", ccontractrowguid=").append(ccontractrowguid);
        sb.append(", imassdate=").append(imassdate);
        sb.append(", cmassunit=").append(cmassunit);
        sb.append(", bqaneedcheck=").append(bqaneedcheck);
        sb.append(", bqaurgency=").append(bqaurgency);
        sb.append(", bqachecking=").append(bqachecking);
        sb.append(", bqachecked=").append(bqachecked);
        sb.append(", iqaquantity=").append(iqaquantity);
        sb.append(", iqanum=").append(iqanum);
        sb.append(", ccusinvcode=").append(ccusinvcode);
        sb.append(", ccusinvname=").append(ccusinvname);
        sb.append(", fsumsignquantity=").append(fsumsignquantity);
        sb.append(", fsumsignnum=").append(fsumsignnum);
        sb.append(", cbaccounter=").append(cbaccounter);
        sb.append(", bcosting=").append(bcosting);
        sb.append(", cordercode=").append(cordercode);
        sb.append(", iorderrowno=").append(iorderrowno);
        sb.append(", fcusminprice=").append(fcusminprice);
        sb.append(", icostquantity=").append(icostquantity);
        sb.append(", icostsum=").append(icostsum);
        sb.append(", ispecialtype=").append(ispecialtype);
        sb.append(", cvmivencode=").append(cvmivencode);
        sb.append(", iexchsum=").append(iexchsum);
        sb.append(", imoneysum=").append(imoneysum);
        sb.append(", irowno=").append(irowno);
        sb.append(", frettbquantity=").append(frettbquantity);
        sb.append(", fretsum=").append(fretsum);
        sb.append(", iexpiratdatecalcu=").append(iexpiratdatecalcu);
        sb.append(", dexpirationdate=").append(dexpirationdate);
        sb.append(", cexpirationdate=").append(cexpirationdate);
        sb.append(", cbatchproperty1=").append(cbatchproperty1);
        sb.append(", cbatchproperty2=").append(cbatchproperty2);
        sb.append(", cbatchproperty3=").append(cbatchproperty3);
        sb.append(", cbatchproperty4=").append(cbatchproperty4);
        sb.append(", cbatchproperty5=").append(cbatchproperty5);
        sb.append(", cbatchproperty6=").append(cbatchproperty6);
        sb.append(", cbatchproperty7=").append(cbatchproperty7);
        sb.append(", cbatchproperty8=").append(cbatchproperty8);
        sb.append(", cbatchproperty9=").append(cbatchproperty9);
        sb.append(", cbatchproperty10=").append(cbatchproperty10);
        sb.append(", dblpreexchmomey=").append(dblpreexchmomey);
        sb.append(", dblpremomey=").append(dblpremomey);
        sb.append(", idemandtype=").append(idemandtype);
        sb.append(", cdemandcode=").append(cdemandcode);
        sb.append(", cdemandmemo=").append(cdemandmemo);
        sb.append(", cdemandid=").append(cdemandid);
        sb.append(", idemandseq=").append(idemandseq);
        sb.append(", cvencode=").append(cvencode);
        sb.append(", creasoncode=").append(creasoncode);
        sb.append(", cinvsn=").append(cinvsn);
        sb.append(", iinvsncount=").append(iinvsncount);
        sb.append(", bneedsign=").append(bneedsign);
        sb.append(", bsignover=").append(bsignover);
        sb.append(", bneedloss=").append(bneedloss);
        sb.append(", flossrate=").append(flossrate);
        sb.append(", frlossqty=").append(frlossqty);
        sb.append(", fulossqty=").append(fulossqty);
        sb.append(", isettletype=").append(isettletype);
        sb.append(", crelacuscode=").append(crelacuscode);
        sb.append(", clossmaker=").append(clossmaker);
        sb.append(", dlossdate=").append(dlossdate);
        sb.append(", dlosstime=").append(dlosstime);
        sb.append(", icoridlsid=").append(icoridlsid);
        sb.append(", fretoutqty=").append(fretoutqty);
        sb.append(", bodyOutid=").append(bodyOutid);
        sb.append(", fveribillqty=").append(fveribillqty);
        sb.append(", fveribillsum=").append(fveribillsum);
        sb.append(", fveriretqty=").append(fveriretqty);
        sb.append(", fveriretsum=").append(fveriretsum);
        sb.append(", flastsettleqty=").append(flastsettleqty);
        sb.append(", flastsettlesum=").append(flastsettlesum);
        sb.append(", cbookwhcode=").append(cbookwhcode);
        sb.append(", cinvouchtype=").append(cinvouchtype);
        sb.append(", cposition=").append(cposition);
        sb.append(", fretqtywkp=").append(fretqtywkp);
        sb.append(", fretqtyykp=").append(fretqtyykp);
        sb.append(", frettbqtyykp=").append(frettbqtyykp);
        sb.append(", fretsumykp=").append(fretsumykp);
        sb.append(", dkeepdate=").append(dkeepdate);
        sb.append(", cscloser=").append(cscloser);
        sb.append(", isaleoutid=").append(isaleoutid);
        sb.append(", bsaleprice=").append(bsaleprice);
        sb.append(", bgift=").append(bgift);
        sb.append(", bmpforderclosed=").append(bmpforderclosed);
        sb.append(", cbsysbarcode=").append(cbsysbarcode);
        sb.append(", fxjquantity=").append(fxjquantity);
        sb.append(", fxjnum=").append(fxjnum);
        sb.append(", biacreatebill=").append(biacreatebill);
        sb.append(", cparentcode=").append(cparentcode);
        sb.append(", cchildcode=").append(cchildcode);
        sb.append(", fchildqty=").append(fchildqty);
        sb.append(", fchildrate=").append(fchildrate);
        sb.append(", icalctype=").append(icalctype);
        sb.append(", fappretwkpqty=").append(fappretwkpqty);
        sb.append(", fappretwkpsum=").append(fappretwkpsum);
        sb.append(", fappretykpqty=").append(fappretykpqty);
        sb.append(", fappretykpsum=").append(fappretykpsum);
        sb.append(", fappretwkptbqty=").append(fappretwkptbqty);
        sb.append(", fappretykptbqty=").append(fappretykptbqty);
        sb.append(", irtnappid=").append(irtnappid);
        sb.append(", crtnappcode=").append(crtnappcode);
        sb.append(", fretailrealamount=").append(fretailrealamount);
        sb.append(", fretailsettleamount=").append(fretailsettleamount);
        sb.append(", cfactorycode=").append(cfactorycode);
        sb.append(", gcsourceid=").append(gcsourceid);
        sb.append(", gcsourceids=").append(gcsourceids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}