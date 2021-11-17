package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cio")
public class Cio implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String nomeTouro;
	private Date diaInseminacao;
	private String previsaoParto;

	public Cio() {

	}

	public Cio(String id, String nomeTouro, Date diaInseminacao, String previsaoParto) {
		super();
		Id = id;
		this.nomeTouro = nomeTouro;
		this.diaInseminacao = diaInseminacao;
		this.previsaoParto = previsaoParto;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNomeTouro() {
		return nomeTouro;
	}

	public void setNomeTouro(String nomeTouro) {
		this.nomeTouro = nomeTouro;
	}

	public Date getDiaInseminacao() {
		return diaInseminacao;
	}

	public void setDiaInseminacao(Date diaInseminacao) {
		this.diaInseminacao = diaInseminacao;
	}

	public String getPrevisaoParto() {
		return previsaoParto;
	}

	public void setPrevisaoParto(String previsaoParto) {
		this.previsaoParto = previsaoParto;
	}

}
