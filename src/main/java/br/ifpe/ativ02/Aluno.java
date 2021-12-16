package br.ifpe.ativ02;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "ALUNO")
public class Aluno extends Pessoa {

	@Valid
	@NotNull
	@Column(name = "CURSO")
	private Curso curso;

	@Column(name = "ANO_INGRESSO")
	@Min(value = 2000, message = "O ano mínimo de egresso é 2000")
	@Max(value = 2020, message = "O ano máximo de egresso é 2020")
	private Integer anoIngresso;

	@Column(name = "COEFICIENTE_RENDIMENTO")
	private double coeficienteRendimento;

	@Column(name = "SITUACAO_MATRICULA")
	@Enumerated(EnumType.STRING)
	private SituacaoMatricula situacaoMatricula;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(@Valid Curso curso) {
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
