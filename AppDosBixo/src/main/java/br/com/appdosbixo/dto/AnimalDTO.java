package br.com.appdosbixo.DTO;

import java.io.Serializable;

import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.domain.enums.TipoAnimal;

public class AnimalDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private Integer Numero;
	private Double pesoInicial;
	private Integer numeroMae;
	private String nomePai;
	private String racaPai;
	private String racaMae;
	private String sexo;
	private TipoAnimal tipoAnimal;

	public AnimalDTO() {

	}

	public AnimalDTO(Animal obj) {

	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public Double getPesoInicial() {
		return pesoInicial;
	}

	public void setPesoInicial(Double pesoInicial) {
		this.pesoInicial = pesoInicial;
	}

	public Integer getNumeroMae() {
		return numeroMae;
	}

	public void setNumeroMae(Integer numeroMae) {
		this.numeroMae = numeroMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getRacaPai() {
		return racaPai;
	}

	public void setRacaPai(String racaPai) {
		this.racaPai = racaPai;
	}

	public String getRacaMae() {
		return racaMae;
	}

	public void setRacaMae(String racaMae) {
		this.racaMae = racaMae;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}


}
