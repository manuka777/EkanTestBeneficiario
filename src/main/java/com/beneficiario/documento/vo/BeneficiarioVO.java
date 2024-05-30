package com.beneficiario.documento.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BeneficiarioVO {
    @Id
    @GeneratedValue
    private Long id;
    
	private String nome;
	private String telefone;
	private Date dtNascimento;
	private Date dtInclusao;
	private Date dtAtualizacao;
	
	//@ManyToOne(cascade=CascadeType.PERSIST)
	//private DocumentoVO documentos;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<DocumentoVO> documentos = new ArrayList<DocumentoVO>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Date getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public Date getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	public List<DocumentoVO> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoVO> documentos) {
		this.documentos = documentos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	

}

