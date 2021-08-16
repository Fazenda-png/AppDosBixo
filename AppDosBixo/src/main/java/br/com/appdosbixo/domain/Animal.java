package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.appdosbixo.dto.CrescimentoDTO;

@Document(collection = "animais")
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String numero;
	private Double peso_inicial;
	private Integer numero_mae;
	private String nome_do_pai;
	private String raca_mae;
	private String raca_pai;
	private String sexo;
	private Date data_nascimento;

	private CrescimentoDTO crescimentoDTO;
	private Historico historico;

	public Animal() {

	}

	public Animal(String id, Double peso_inicial, String numero, Integer numero_mae, String nome_do_pai,
			String raca_mae, String raca_pai, String sexo, Date data_nascimento) {
		super();
		this.id = id;
		this.numero = numero;
		this.peso_inicial = peso_inicial;
		this.numero_mae = numero_mae;
		this.nome_do_pai = nome_do_pai;
		this.raca_mae = raca_mae;
		this.raca_pai = raca_pai;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso_inicial;
	}

	public void setPeso(Double peso_inicial) {
		this.peso_inicial = peso_inicial;
	}

	public Integer getNumero_mae() {
		return numero_mae;
	}

	public void setNumero_mae(Integer numero_mae) {
		this.numero_mae = numero_mae;
	}

	public String getNome_do_pai() {
		return nome_do_pai;
	}

	public void setNome_do_pai(String nome_do_pai) {
		this.nome_do_pai = nome_do_pai;
	}

	public String getRaca_mae() {
		return raca_mae;
	}

	public void setRaca_mae(String raca_mae) {
		this.raca_mae = raca_mae;
	}

	public String getRaca_pai() {
		return raca_pai;
	}

	public void setRaca_pai(String raca_pai) {
		this.raca_pai = raca_pai;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}

	public CrescimentoDTO getCrescimentoDTO() {
		return crescimentoDTO;
	}

	public void setCrescimentoDTO(CrescimentoDTO crescimentoDTO) {
		this.crescimentoDTO = crescimentoDTO;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(id, other.id);
	}

}
