package br.com.appdosbixo.DTO;

import java.io.Serializable;
import java.util.Date;

import br.com.appdosbixo.domain.Cio;

public class CioDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String nomeTouro;
	private Date diaInseminacao;
	private String previsaoParto;

	public CioDTO() {

	}

	public CioDTO(Cio obj) {
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
