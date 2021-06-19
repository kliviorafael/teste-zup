package br.com.example.testezup_final.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "Carro")
public class Carro {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String marca;
	private String modelo;
	private String ano;
	@ManyToOne (targetEntity = Infocarro.class)
	private Infocarro infocarro; 
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, String ano, Infocarro infocarro) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.infocarro = infocarro;
	}

	public Infocarro getInfocarro() {
		return infocarro;
	}
	public void setInfocarro(Infocarro infocarro) {
		this.infocarro = infocarro;
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
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
		

}
