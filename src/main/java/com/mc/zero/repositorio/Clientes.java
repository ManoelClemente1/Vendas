package com.mc.zero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer>{

}
