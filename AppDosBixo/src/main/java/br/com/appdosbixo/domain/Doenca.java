package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doenca")
public class Doenca implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String simtomas;
	private String remedioAplicado;
	private Date dataInicio;

	public Doenca() {

	}

	public Doenca(String id, String simtomas, String remedioAplicado, Date dataInicio) {
		super();
		Id = id;
		this.simtomas = simtomas;
		this.remedioAplicado = remedioAplicado;
		this.dataInicio = dataInicio;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getSimtomas() {
		return simtomas;
	}

	public void setSimtomas(String simtomas) {
		this.simtomas = simtomas;
	}

	public String getRemedioAplicado() {
		return remedioAplicado;
	}

	public void setRemedioAplicado(String remedioAplicado) {
		this.remedioAplicado = remedioAplicado;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	
}
