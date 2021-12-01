package com.teste.pagination.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class EstoquePK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codfilial;
	private long codprod;
	
	public EstoquePK() {
	}

	public String getCodfilial() {
		return codfilial;
	}

	public void setCodfilial(String codfilial) {
		this.codfilial = codfilial;
	}

	public long getCodprod() {
		return codprod;
	}

	public void setCodprod(long codprod) {
		this.codprod = codprod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codfilial, codprod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstoquePK other = (EstoquePK) obj;
		return Objects.equals(codfilial, other.codfilial) && codprod == other.codprod;
	}
	
}
