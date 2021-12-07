package br.ifpe.ativ02;

public class Aluno extends Pessoa {

	private Curso curso;
	private Integer anoIngresso;
	private double coeficienteRendimento;
	private SituacaoMatricula situacaoMatricula;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Integer getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}
	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}
	public SituacaoMatricula getSituacaoMatricula() {
		return situacaoMatricula;
	}
	public void setSituacaoMatricula(SituacaoMatricula situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}
	
}
