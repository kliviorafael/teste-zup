package br.com.example.testezup_final.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.example.testezup_final.modelo.Infocarro;

public class InfoCarroDto {
	
	private String valor;
	private String marca;
	private String modelo;
	private String ano_modelo;
	private String combustivel;
	private String codigofipe;
	private String mes_referencia;
	private String tipo_veiculo;
	private String sigla_combustivel;
	
	public InfoCarroDto (Infocarro infocarro) {
		this.valor = infocarro.getValor(); 
		this.marca = infocarro.getMarca();
		this.modelo = infocarro.getModelo();
		this.ano_modelo = infocarro.getAno_modelo();
		this.combustivel = infocarro.getCombustivel();
		this.codigofipe = infocarro.getCodigofipe();
		this.mes_referencia = infocarro.getMes_referencia();
		this.tipo_veiculo = infocarro.getTipo_veiculo();
		this.sigla_combustivel = infocarro.getSigla_combustivel();
		
	}

	public String getValor() {
		return valor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno_modelo() {
		return ano_modelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public String getCodigofipe() {
		return codigofipe;
	}

	public String getMes_referencia() {
		return mes_referencia;
	}

	public String getTipo_veiculo() {
		return tipo_veiculo;
	}

	public String getSigla_combustivel() {
		return sigla_combustivel;
	}
	
	public static List<InfoCarroDto> converter(List<Infocarro> infocarro){
		return infocarro.stream().map(InfoCarroDto::new).collect(Collectors.toList());
	}
	

}
