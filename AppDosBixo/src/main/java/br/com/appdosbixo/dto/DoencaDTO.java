package br.com.appdosbixo.dto;

import java.io.Serializable;
import java.util.Date;

public class DoencaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private Date data_ocorrido;
	private String sintomas;

	public DoencaDTO() {

	}

	public DoencaDTO(String nome, Date data_ocorrido, String sintomas) {
		super();
		this.nome = nome;
		this.data_ocorrido = data_ocorrido;
		this.sintomas = sintomas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_ocorrido() {
		return data_ocorrido;
	}

	public void setData_ocorrido(Date data_ocorrido) {
		this.data_ocorrido = data_ocorrido;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

}
