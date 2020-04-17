package com.mc.zero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mc.zero.entity.Cliente;
import com.mc.zero.repositorio.Clientes;

@SpringBootApplication
public class NetoApplication  {


    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Fulano"));
            clientes.save(new Cliente("Outro Cliente"));

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(NetoApplication.class, args);
    }
}
