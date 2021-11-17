package br.com.appdosbixo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appdosbixo.DTO.VacinaDTO;
import br.com.appdosbixo.domain.Vacina;
import br.com.appdosbixo.repository.VacinaRepository;
import br.com.appdosbixo.services.exception.ObjectNotFoundException;

@Service
public class VacinaService {

	@Autowired
	private VacinaRepository vacinaRepository;
	

	public List<Vacina> findAll() {
		return vacinaRepository.findAll();
	}

	public Vacina findById(String id) {
		Optional<Vacina> obj = vacinaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Vacina insert(Vacina obj) {
		return vacinaRepository.insert(obj);
	}

	public Vacina FromDTO(VacinaDTO objdto) {
		return new Vacina(objdto.getId(), objdto.getNome(), objdto.getLote(), objdto.getDataAplicacao(), objdto.getQuantidade(), objdto.getDescricao(), objdto.getDataAplicacao());
	}

	public void delete(String id) {
		findById(id);
		vacinaRepository.deleteById(id);
	}
	
}
