package com.mc.zero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mc.zero.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer>{
	
	@Query(value="select c from Cliente c where c.nome like :nome")
	List<Cliente> findByName(@Param("nome") String nome);
	
	List<Cliente> findByNomeLike(String nome);
	
	List<Cliente> findByNomeOrId(String nome, Integer id);
	
	boolean existsByNome(String nome);
	
	@Query(" select c from Cliente c left join fetch c.pedidos where c.id =:id ")
	Cliente findClienteFetchPedidos(@Param("id") Integer id);
	
	
	
}
