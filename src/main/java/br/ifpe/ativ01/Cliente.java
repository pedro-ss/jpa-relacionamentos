package br.ifpe.ativ01;

import java.time.LocalDate;

public class Cliente {

	private Integer codigo;
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private boolean adimplente;
	private Mes mesRenovacao;
	
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
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isAdimplente() {
		return adimplente;
	}
	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
	public Mes getMesRenovacao() {
		return mesRenovacao;
	}
	public void setMesRenovacao(Mes mesRenovacao) {
		this.mesRenovacao = mesRenovacao;
	}

	
}
