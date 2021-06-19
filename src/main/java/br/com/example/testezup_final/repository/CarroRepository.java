package br.com.example.testezup_final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.testezup_final.modelo.Carro;

public interface CarroRepository extends JpaRepository<Carro, String> {

	List<Carro> findByModelo(String marca);

	Carro findByMarca(String marcaCarro);

}
