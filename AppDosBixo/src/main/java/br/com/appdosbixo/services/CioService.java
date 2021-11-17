package br.com.appdosbixo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appdosbixo.DTO.CioDTO;
import br.com.appdosbixo.domain.Cio;
import br.com.appdosbixo.repository.CioRepository;
import br.com.appdosbixo.services.exception.ObjectNotFoundException;

@Service
public class CioService {

	@Autowired
	private CioRepository cioRepository;
	
	public List<Cio> findAll() {
		return cioRepository.findAll();
	}

	public Cio findById(String id) {
		Optional<Cio> obj = cioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Cio insert(Cio obj) {
		return cioRepository.insert(obj);
	}

	public Cio FromDTO(CioDTO objdto) {
		return new Cio(objdto.getId(), objdto.getNomeTouro(), objdto.getDiaInseminacao(), objdto.getPrevisaoParto());
	}

	public void delete(String id) {
		findById(id);
		cioRepository.deleteById(id);
	}
	
}
