package com.mc.zero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mc.zero.entity.Cliente;
import com.mc.zero.repository.Clientes;

@SpringBootApplication
public class NetoApplication  {
	
	@Bean
	public CommandLineRunner commandLineRunner(@Autowired Clientes clientes) {
		return args ->{
			Cliente c = new Cliente(null, "Manoel");
			clientes.save(c);
		};
		
	}

    public static void main(String[] args) {
        SpringApplication.run(NetoApplication.class, args);
    }
}
