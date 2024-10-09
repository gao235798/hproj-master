package com.espread.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SomainCurrent implements Serializable {

	private Integer id;

	private Integer autoid;

	private String cdefine8;

	private String cinvcode;
	
	private String csoCode;
	
	private BigDecimal iquantity;
	
	private BigDecimal ifhquantity;

	private String cdefine25;

	private BigDecimal currentIquantity;

	public SomainCurrent() {
		super();
	}

	public SomainCurrent(Integer id, Integer autoid, String cdefine8, String cinvcode, String csoCode,
			BigDecimal iquantity, BigDecimal ifhquantity, String cdefine25, BigDecimal currentIquantity) {
		super();
		this.id = id;
		this.autoid = autoid;
		this.cdefine8 = cdefine8;
		this.cinvcode = cinvcode;
		this.csoCode = csoCode;
		this.iquantity = iquantity;
		this.ifhquantity = ifhquantity;
		this.cdefine25 = cdefine25;
		this.currentIquantity = currentIquantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAutoid() {
		return autoid;
	}

	public void setAutoid(Integer autoid) {
		this.autoid = autoid;
	}

	public String getCdefine8() {
		return cdefine8;
	}

	public void setCdefine8(String cdefine8) {
		this.cdefine8 = cdefine8;
	}

	public String getCinvcode() {
		return cinvcode;
	}

	public void setCinvcode(String cinvcode) {
		this.cinvcode = cinvcode;
	}

	public String getCsoCode() {
		return csoCode;
	}

	public void setCsoCode(String csoCode) {
		this.csoCode = csoCode;
	}

	public BigDecimal getIquantity() {
		return iquantity;
	}

	public void setIquantity(BigDecimal iquantity) {
		this.iquantity = iquantity;
	}

	public BigDecimal getIfhquantity() {
		return ifhquantity;
	}

	public void setIfhquantity(BigDecimal ifhquantity) {
		this.ifhquantity = ifhquantity;
	}

	public String getCdefine25() {
		return cdefine25;
	}

	public void setCdefine25(String cdefine25) {
		this.cdefine25 = cdefine25;
	}

	public BigDecimal getCurrentIquantity() {
		return currentIquantity;
	}

	public void setCurrentIquantity(BigDecimal currentIquantity) {
		this.currentIquantity = currentIquantity;
	}

	@Override
	public String toString() {
		return "SomainCurrent [id=" + id + ", autoid=" + autoid + ", cdefine8=" + cdefine8 + ", cinvcode=" + cinvcode
				+ ", csoCode=" + csoCode + ", iquantity=" + iquantity + ", ifhquantity=" + ifhquantity + ", cdefine25="
				+ cdefine25 + ", currentIquantity=" + currentIquantity + "]";
	}

}
