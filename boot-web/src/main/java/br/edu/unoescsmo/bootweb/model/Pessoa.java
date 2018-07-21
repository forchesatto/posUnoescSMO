package br.edu.unoescsmo.bootweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(length=150, nullable=false)
	@NotEmpty(message="nome deve ser preenchido")
	private String nome;
	
	@Size(max=11, message="tamanho não pode ultrapassar 11")
	@Column(length=11)
	private String cpf;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@Fetch(FetchMode.JOIN)
	private Cidade naturalidade;
	
	public Pessoa(){
		
	}
	
	public Pessoa(Long codigo){
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + "]";
	}

	public Cidade getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Cidade naturalidade) {
		this.naturalidade = naturalidade;
	}
	
}
