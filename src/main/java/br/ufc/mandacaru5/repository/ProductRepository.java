package br.ufc.mandacaru5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.mandacaru5.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findFirstByName(String name);
	
	List<Product> findAllByName(String name);
}
