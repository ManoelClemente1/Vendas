package com.mc.zero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
