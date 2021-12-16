package br.ifpe.ativ02;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CURSO")
public class Curso {

	@Id
	@Column(name = "CODIGO")
	private Integer codigo;
	
	@Column(name = "NOME")
	private String nome;

	@NotNull
	@Column(name = "COORDENADOR")
	private Professor coordenador;
	
	@Column(name = "ATIVO")
	private boolean ativo;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
