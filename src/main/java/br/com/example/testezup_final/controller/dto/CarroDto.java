package br.com.example.testezup_final.controller.dto;

import java.util.List;
import java.util.stream.Collectors;


import br.com.example.testezup_final.modelo.Carro;


public class CarroDto {
	
	private String marca;
	private String modelo;
	private String ano;

	
	
	public CarroDto(Carro carro) {
		this.marca = carro.getMarca(); 
		this.modelo = carro.getModelo(); 
		this.ano = carro.getAno();
		
		
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}
	
	public static List<CarroDto> converter(List<Carro> carros){
		return carros.stream().map(CarroDto::new).collect(Collectors.toList());
		
	}

}
