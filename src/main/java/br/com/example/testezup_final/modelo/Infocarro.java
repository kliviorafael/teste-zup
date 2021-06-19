package br.com.example.testezup_final.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Infocarro")
public class Infocarro {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String valor;
	private String marca;
	private String modelo;
	private String ano_modelo;
	private String combustivel;
	private String codigofipe;
	private String mes_referencia;
	private String tipo_veiculo;
	private String sigla_combustivel;
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno_modelo() {
		return ano_modelo;
	}
	public void setAno_modelo(String ano_modelo) {
		this.ano_modelo = ano_modelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getCodigofipe() {
		return codigofipe;
	}
	public void setCodigofipe(String codigofipe) {
		this.codigofipe = codigofipe;
	}
	public String getMes_referencia() {
		return mes_referencia;
	}
	public void setMes_referencia(String mes_referencia) {
		this.mes_referencia = mes_referencia;
	}
	public String getTipo_veiculo() {
		return tipo_veiculo;
	}
	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}
	public String getSigla_combustivel() {
		return sigla_combustivel;
	}
	public void setSigla_combustivel(String sigla_combustivel) {
		this.sigla_combustivel = sigla_combustivel;
	}

	
}
