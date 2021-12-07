package br.ifpe.ativ02;

import java.time.LocalDate;

public class Professor extends Pessoa {

	private LocalDate dataAdmissao;
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
