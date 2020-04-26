package com.mc.zero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.entity.Cliente;
import com.mc.zero.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
	
	List<Pedido> findByCliente(Cliente cliente);
}
