package br.ifpe.ativ02;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Table;
@Table(name = "PROFESSOR")
public class Professor extends Pessoa {

	@Column(name = "DATA_ADMISSAO")
	private LocalDate dataAdmissao;
	
	@Column(name = "AREA_CONHECIMENTO")
	private AreaConhecimento areaConhecimento;

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public AreaConhecimento getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	
	
}
