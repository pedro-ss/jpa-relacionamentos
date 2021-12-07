package br.ifpe.ativ02;

public class Curso {

	private Integer codigo;
	private String nome;
	private Professor coordenador;
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
