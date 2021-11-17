package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vacina")
public class Vacina implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String nome;
	private String lote;
	private Date validade;
	private String quantidade;
	private String descricao;
	private Date dataAplicacao;

	public Vacina() {

	}

	public Vacina(String id, String nome, String lote, Date validade, String quantidade, String descricao,
			Date dataAplicacao) {
		super();
		Id = id;
		this.nome = nome;
		this.lote = lote;
		this.validade = validade;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.dataAplicacao = dataAplicacao;
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
