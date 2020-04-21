package com.mc.zero.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mc.zero.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer>{
	
	@Query(value="select c from Cliente c were c.nome like :nome")
	List<Cliente> findByName(@Param("nome") String nome);
	
	List<Cliente> findByNomeLike(String nome);
	
	List<Cliente> findByNomeOrId(String nome, Integer id);
	
	boolean existsByNome(String nome);
	
}
