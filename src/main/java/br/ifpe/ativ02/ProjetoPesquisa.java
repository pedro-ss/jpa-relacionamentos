package br.ifpe.ativ02;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "PROJETO_PESQUISA")
public class ProjetoPesquisa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	@NotBlank
	@Size(max = 200, message = "O título deve ter no máximo 100 caracteres")
	@Column(name = "TITULO")
	private String titulo;

	@NotBlank
	@Size(max = 1000, message = "O resumo deve conter no máximo 1000 caracteres.")
	@Column(name = "RESUMO")
	private String resumo;

	@Column(name = "ARQUIVO_PDF")
	private byte[] arquivoPDF;

	@Column(name = "RESPONSAVEL")
	private Professor responsavel;

	@Valid
	@OneToMany(mappedBy = "ALUNO_CODIGO")
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
	public void setColaboradores(@Valid List<Aluno> colaboradores) {
		this.colaboradores = colaboradores;
	} 
	
	
}
