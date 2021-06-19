package br.com.example.testezup_final.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class Usuario {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome; 
	private String cpf; 
	private String email;
	private String data_nasc; 
	@ManyToOne (targetEntity = Carro.class)
	private Carro carro;
	
	
	public Usuario() {
	}
	
	public Usuario(String nome, String cpf, String email, String data_nasc, Carro carro) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.data_nasc = data_nasc;
		this.carro = carro;
	}



	public String getData_nasc() {
		return data_nasc;
	}
	
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	

}
