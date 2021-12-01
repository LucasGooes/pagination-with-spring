package com.teste.pagination.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PCPRODUT")
public class Produto {
	
	@Id
	private long codprod;
	private String descricao;
	private Integer codfornec;
	private Integer codcategoria;
	private Integer codepto;
	private Integer codsec;
	private Integer codmarca;
	private String dadostecnicos;
	private String dtcadastro;
	private String dtexclusao;
	private String informacoestecnicas;
	private String nomeecommerce;
	private String enviaecommerce;
	private String status;
	
	public Produto() {
	}

	public long getCodprod() {
		return codprod;
	}

	public void setCodprod(long codprod) {
		this.codprod = codprod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodfornec() {
		return codfornec;
	}

	public void setCodfornec(Integer codfornec) {
		this.codfornec = codfornec;
	}

	public Integer getCodcategoria() {
		return codcategoria;
	}
	
	public void setCodcategoria(Integer codcategoria) {
		this.codcategoria = codcategoria;
	}

	public String getDtexclusao() {
		return dtexclusao;
	}

	public void setDtexclusao(String dtexclusao) {
		this.dtexclusao = dtexclusao;
	}

	public Integer getCodepto() {
		return codepto;
	}

	public void setCodepto(Integer codepto) {
		this.codepto = codepto;
	}

	public Integer getCodsec() {
		return codsec;
	}

	public void setCodsec(Integer codsec) {
		this.codsec = codsec;
	}

	public Integer getCodmarca() {
		return codmarca;
	}

	public void setCodmarca(Integer codmarca) {
		this.codmarca = codmarca;
	}

	public String getDadostecnicos() {
		return dadostecnicos;
	}

	public void setDadostecnicos(String dadostecnicos) {
		this.dadostecnicos = dadostecnicos;
	}

	public String getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(String dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public String getInformacoestecnicas() {
		return informacoestecnicas;
	}

	public void setInformacoestecnicas(String informacoestecnicas) {
		this.informacoestecnicas = informacoestecnicas;
	}

	public String getNomeecommerce() {
		return nomeecommerce;
	}

	public void setNomeecommerce(String nomeecommerce) {
		this.nomeecommerce = nomeecommerce;
	}

	public String getEnviaecommerce() {
		return enviaecommerce;
	}

	public void setEnviaecommerce(String enviaecommerce) {
		this.enviaecommerce = enviaecommerce;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
