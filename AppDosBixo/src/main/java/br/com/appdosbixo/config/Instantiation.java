package br.com.appdosbixo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.appdosbixo.domain.Animal;
import br.com.appdosbixo.domain.Historico;
import br.com.appdosbixo.dto.CrescimentoDTO;
import br.com.appdosbixo.dto.DoencaDTO;
import br.com.appdosbixo.dto.VacinaDTO;
import br.com.appdosbixo.repository.AnimalRepository;
import br.com.appdosbixo.repository.HistoricoRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private AnimalRepository animalRepository;
	@Autowired
	private HistoricoRepository historicoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		animalRepository.deleteAll();
		
		Animal a1 = new Animal(null, 58.39, "24", 488, "Marcos", "Holandesa", "Holandes", "Femea", sdf.parse("12/08/2021"));
		Animal a2 = new Animal(null, 58.39, "29", 488, "Marcos", "Holandesa", "Holandes", "Femea", sdf.parse("12/08/2021"));
		
		
		Historico h1 = new Historico();
		Historico h2 = new Historico();
		
		DoencaDTO d1 =  new DoencaDTO("teste1", sdf.parse("20/08/2021"), "febre, diarreia");
		VacinaDTO v1 =  new VacinaDTO("vacina 1", "30ml", sdf.parse("21/08/2021"));
		DoencaDTO d2 =  new DoencaDTO("teste2", sdf.parse("28/08/2021"), "febre, diarreia");
		VacinaDTO v2 =  new VacinaDTO("vacina 2", "30ml", sdf.parse("21/08/2021"));
		DoencaDTO d3 =  new DoencaDTO("teste3", sdf.parse("05/09/2021"), "febre, diarreia");
		VacinaDTO v3 =  new VacinaDTO("vacina 3", "30ml", sdf.parse("21/08/2021"));
		
		CrescimentoDTO c1 = new CrescimentoDTO(sdf.parse("05/09/2021"), 100.300, a1);
		
		h1.getDoencas().add(d1);
		h1.getVacinas().add(v1);
		h2.getDoencas().addAll(Arrays.asList(d2, d3));
		h2.getVacinas().addAll(Arrays.asList(v2, v3));
		
		a1.setCrescimentoDTO(c1);
		
		a1.setHistorico(h1);
		a2.setHistorico(h2);
		
		historicoRepository.save(h1);
		historicoRepository.save(h2);
		animalRepository.saveAll(Arrays.asList(a1, a2));

	}

}
