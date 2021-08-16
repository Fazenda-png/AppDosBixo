package br.com.appdosbixo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import br.com.appdosbixo.dto.DoencaDTO;
import br.com.appdosbixo.dto.VacinaDTO;

public class Historico implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	private List<VacinaDTO> vacinas = new ArrayList<>();
	private List<DoencaDTO> doencas = new ArrayList<>();

	public Historico() {

	}

	public Historico(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<VacinaDTO> getVacinas() {
		return vacinas;
	}

	public void setVacinas(List<VacinaDTO> vacinas) {
		this.vacinas = vacinas;
	}

	public List<DoencaDTO> getDoencas() {
		return doencas;
	}

	public void setDoencas(List<DoencaDTO> doencas) {
		this.doencas = doencas;
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
		Historico other = (Historico) obj;
		return Objects.equals(id, other.id);
	}

}
