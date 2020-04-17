package com.mc.zero.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer>{
	
	List<Cliente> findByNomeLike(String nome);
	
	List<Cliente> findByNomeOrId(String nome, Integer id);
	
	boolean existsByNome(String nome);
	
}
