package br.com.appdosbixo.dto;

import java.io.Serializable;
import java.util.Date;

public class VacinaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String quantidade;
	private Date data_aplicacao;

	public VacinaDTO() {

	}

	public VacinaDTO(String nome, String quantidade, Date data_aplicacao) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.data_aplicacao = data_aplicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData_aplicacao() {
		return data_aplicacao;
	}

	public void setData_aplicacao(Date data_aplicacao) {
		this.data_aplicacao = data_aplicacao;
	}

}
