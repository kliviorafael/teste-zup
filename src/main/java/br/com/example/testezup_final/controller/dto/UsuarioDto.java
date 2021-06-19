package br.com.example.testezup_final.controller.dto;


import java.util.List;
import java.util.stream.Collectors;

import br.com.example.testezup_final.modelo.Usuario;



public class UsuarioDto {
	
	private String nome; 
	private String cpf; 
	private String email; 
	private String data_nasc; 

	
	public UsuarioDto(Usuario usuario) {
		this.nome = usuario.getNome(); 
		this.cpf = usuario.getCpf(); 
		this.email = usuario.getEmail();  
		this.data_nasc = usuario.getData_nasc(); 
		
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getData_nasc() {
		return data_nasc;
	}
	
	

	public static List<UsuarioDto> converter(List<Usuario> usuarios){
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
		
	}

}
