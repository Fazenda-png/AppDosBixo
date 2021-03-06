package br.com.appdosbixo.DTO;

import java.io.Serializable;
import java.util.Date;

import br.com.appdosbixo.domain.Vacina;

public class VacinaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String nome;
	private String lote;
	private Date validade;
	private String quantidade;
	private String descricao;
	private Date dataAplicacao;

	public VacinaDTO() {

	}

	public VacinaDTO(Vacina obj) {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

}
