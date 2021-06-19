package br.com.example.testezup_final.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.testezup_final.controller.dto.CarroDto;
import br.com.example.testezup_final.modelo.Carro;
import br.com.example.testezup_final.repository.CarroRepository;


@RestController
@RequestMapping("/")
public class CarroController {
	
	@Autowired 
	private CarroRepository carroRepository; 

	
	@GetMapping("/carro")
	public List<CarroDto> lista2(String marca) {
		if (marca == null) {
		List<Carro> carros = carroRepository.findAll(); 
		return CarroDto.converter(carros);
		} else {
			List<Carro> carros = carroRepository.findByModelo(marca); 
			return CarroDto.converter(carros);	
		}
	}
	
	@PostMapping("/carro")
	public Carro salvaCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	
	}
	
}	

