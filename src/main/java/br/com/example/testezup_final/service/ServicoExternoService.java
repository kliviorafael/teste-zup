package br.com.example.testezup_final.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.example.testezup_final.controller.dto.InfoCarroDto;

@Service
public class ServicoExternoService {
	
	private static final String URI = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marca}/modelos/{modelo}/anos/{ano}";
	
	public InfoCarroDto chamarApiExterna(InfocarroForm form) {
		RestTemplate rest = new RestTemplate(); 
		InfoCarroDto retorno = rest.getForEntity(URI, InfoCarroDto.class);
		return retorno; 
	}

}
