package com.teste.pagination.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PCFORNEC")
public class Fornecedor {
	
	@Id
	private long codfornec;
	private String fornecedor;
	
	public Fornecedor() {
	}
	
	public long getCodfornec() {
		return codfornec;
	}
	public void setCodfornec(long codfornec) {
		this.codfornec = codfornec;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

}
