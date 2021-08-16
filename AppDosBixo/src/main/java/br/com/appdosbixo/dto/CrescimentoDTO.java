package br.com.appdosbixo.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.appdosbixo.domain.Animal;

public class CrescimentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date data_nascimento;
	private Date data_pesagem;
	private Double peso;
	private Double peso_atual;

	public CrescimentoDTO() {

	}

	public CrescimentoDTO(Date data_pesagem, Double peso_atual, Animal obj) {
		super();
		this.data_nascimento = obj.getData_nascimento();
		this.data_pesagem = data_pesagem;
		this.peso = obj.getPeso();
		this.peso_atual = peso_atual;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Date getData_pesagem() {
		return data_pesagem;
	}

	public void setData_pesagem(Date data_pesagem) {
		this.data_pesagem = data_pesagem;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPeso_atual() {
		return peso_atual;
	}

	public void setPeso_atual(Double peso_atual) {
		this.peso_atual = peso_atual;
	}

}
