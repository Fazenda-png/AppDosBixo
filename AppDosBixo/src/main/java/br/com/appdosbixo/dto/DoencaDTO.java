package br.com.appdosbixo.DTO;

import java.io.Serializable;
import java.util.Date;

import br.com.appdosbixo.domain.Doenca;

public class DoencaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private String simtomas;
	private String remedioAplicado;
	private Date dataInicio;

	public DoencaDTO() {

	}

	public DoencaDTO(Doenca obj) {

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
