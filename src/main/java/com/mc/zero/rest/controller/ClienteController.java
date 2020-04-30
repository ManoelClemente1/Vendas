package com.mc.zero.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mc.zero.entity.Cliente;
import com.mc.zero.repository.Clientes;

@Controller
@RequestMapping("api/clientes")
public class ClienteController {

	
	@Autowired
	private Clientes clientes;
	
	@GetMapping("/{id}")
	public ResponseEntity getClienteById(@PathVariable(value="id") Integer id) {
		Optional<Cliente> cliente = this.clientes.findById(id);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity save(@RequestBody Cliente cliente) {
		Cliente clienteSave = clientes.save(cliente);
		return ResponseEntity.ok(clienteSave);
	}
}
