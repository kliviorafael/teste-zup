package br.com.example.testezup_final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.testezup_final.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	List<Usuario> findByNome(String nome);

}
