package com.beneficiario.documento.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class DocumentoVO {
    @Id
    @GeneratedValue
    private Long id;
    
	private String tipoDocto;
	private String descricao;
	private Date   dtInclusao;
	private Date   dtAlteracao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoDocto() {
		return tipoDocto;
	}
	public void setTipoDocto(String tipoDocto) {
		this.tipoDocto = tipoDocto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public Date getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
}
