package com.teste.pagination.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PCEST")
public class Estoque {
	
	@EmbeddedId
	private EstoquePK id;
	private String dtultent;

	public Estoque() {
	}

	public EstoquePK getId() {
		return id;
	}

	public void setId(EstoquePK id) {
		this.id = id;
	}

	public String getDtultent() {
		return dtultent;
	}
	public void setDtultent(String dtultent) {
		this.dtultent = dtultent;
	}

}
