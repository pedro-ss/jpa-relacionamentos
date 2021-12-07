package br.ifpe.ativ02;

import java.util.List;

public class ProjetoPesquisa {

	private Integer codigo;
	private String titulo;
	private String resumo;
	private byte[] arquivoPDF;
	private Professor responsavel;
	private List<Aluno> colaboradores;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public byte[] getArquivoPDF() {
		return arquivoPDF;
	}
	public void setArquivoPDF(byte[] arquivoPDF) {
		this.arquivoPDF = arquivoPDF;
	}
	public Professor getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
	public List<Aluno> getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(List<Aluno> colaboradores) {
		this.colaboradores = colaboradores;
	} 
	
	
}
