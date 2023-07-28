package com.ericzCorp.revenda.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ericzCorp.revenda.entities.Loja;
import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.repositories.LojaRepository;
import com.ericzCorp.revenda.repositories.VendedorRepository;

@Configuration
//spring so vai rodar essa classe quando o perfil estiver setado no teste//
@Profile("test")
public class TestConfig implements CommandLineRunner{

    //injecao de dependecias

    @Autowired
    private VendedorRepository vendedorRepository;
    @Autowired
    private LojaRepository lojaRepository;

    @Override
    public void run(String... args) throws Exception {

        Loja l1 = new Loja(null, "Revenda do Alemao Sul", "Sul");
        Loja l2 = new Loja(null, "Revenda do Alemao Oeste", "Oeste");
        Loja l3 = new Loja(null, "Revenda do Alemao Leste", "Leste");
        Loja l4 = new Loja(null, "Revenda do Alemao Norte", "Norte");

        lojaRepository.saveAll(Arrays.asList(l1, l2, l3, l4));
        
        Vendedor v1 = new Vendedor(null, "Eric Biao", "1234567891", l3);
        Vendedor v2 = new Vendedor(null, "Henrique Padilha", "1234567890", l1);

        vendedorRepository.saveAll(Arrays.asList(v1, v2));
        

        
    }
    
}
