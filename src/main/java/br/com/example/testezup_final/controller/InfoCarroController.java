package br.com.example.testezup_final.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.testezup_final.controller.dto.InfoCarroDto;
import br.com.example.testezup_final.modelo.Infocarro;
import br.com.example.testezup_final.repository.InfoCarroRepository;
import br.com.example.testezup_final.service.ServicoExternoService;

@RestController
@RequestMapping("/")
public class InfoCarroController {
	
	@Autowired
	private InfoCarroRepository infocarroRepository;
	private ServicoExternoService service;
	
	@GetMapping("/infousuario")
	
	
	
	

}
