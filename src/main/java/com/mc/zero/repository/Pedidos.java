package com.mc.zero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

}
