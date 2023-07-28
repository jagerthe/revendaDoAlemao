package com.ericzCorp.revenda.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.repositories.VendedorRepository;

@Configuration
//spring so vai rodar essa classe quando o perfil estiver setado no teste//
@Profile("test")
public class TestConfig implements CommandLineRunner{

    //injecao de dependecias

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Vendedor v1 = new Vendedor(null, "Eric Biao", "1234567891");
        Vendedor v2 = new Vendedor(null, "Henrique Padilha", "1234567890");

        vendedorRepository.saveAll(Arrays.asList(v1, v2));
    }
    
}
