package br.com.example.testezup_final.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.testezup_final.controller.dto.UsuarioDto;
import br.com.example.testezup_final.repository.UsuarioRepository;
import br.com.example.testezup_final.modelo.Usuario;

@RestController
@RequestMapping("/")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository; 
	
	
	@GetMapping("/usuario")
	public List<UsuarioDto> lista(String nome) {
		if (nome == null) {
		List<Usuario> usuarios = usuarioRepository.findAll(); 
		return UsuarioDto.converter(usuarios);
		} else {
			List<Usuario> usuarios = usuarioRepository.findByNome(nome); 
			return UsuarioDto.converter(usuarios);
		}		
	}
	
	@PostMapping("/usuario")
	public Usuario salvaUsuario (@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
		
	}
	
	
}
