package br.com.example.testezup_final.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.testezup_final.modelo.Infocarro;

public interface InfoCarroRepository extends JpaRepository<Infocarro, String>{

	Infocarro findByModelo(String modeloInfo);
	

}
