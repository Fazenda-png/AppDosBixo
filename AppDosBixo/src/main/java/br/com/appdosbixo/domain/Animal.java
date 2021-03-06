package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.appdosbixo.domain.enums.TipoAnimal;

@Document(collection = "animal")
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Id;
	private Integer Numero;
	private Double pesoInicial;
	private Integer numeroMae;
	private String nomePai;
	private String racaPai;
	private String racaMae;
	private String sexo;

	private TipoAnimal tipo_animal;

	private List<Vacina> vacinas = new ArrayList<>();
	private List<Doenca> doencas = new ArrayList<>();

	public Animal() {

	}

	public Animal(String id, Integer numero, Double pesoInicial, Integer numeroMae, String nomePai, String racaPai,
			String racaMae, String sexo, TipoAnimal tipo_animal) {
		super();
		Id = id;
		Numero = numero;
		this.pesoInicial = pesoInicial;
		this.numeroMae = numeroMae;
		this.nomePai = nomePai;
		this.racaPai = racaPai;
		this.racaMae = racaMae;
		this.sexo = sexo;
		this.tipo_animal = tipo_animal;
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

	public TipoAnimal getTipo_animal() {
		return tipo_animal;
	}

	public void setTipo_animal(TipoAnimal tipo_animal) {
		this.tipo_animal = tipo_animal;
	}

	public List<Vacina> getVacinas() {
		return vacinas;
	}

	public List<Doenca> getDoencas() {
		return doencas;
	}

}
