package com.ericzCorp.revenda.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ericzCorp.revenda.entities.Cliente;
import com.ericzCorp.revenda.entities.Loja;
import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.repositories.ClienteRepository;
import com.ericzCorp.revenda.repositories.LojaRepository;
import com.ericzCorp.revenda.repositories.VendedorRepository;

@Configuration
// spring so vai rodar essa classe quando o perfil estiver setado no teste//
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // injecao de dependecias

    @Autowired
    private VendedorRepository vendedorRepository;
    @Autowired
    private LojaRepository lojaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

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

        Cliente c1 = new Cliente(null, "Robison Brabo Apenas", "Canoas", "Rua com certeza existe, 666", "51932893289", "M", l2);
        Cliente c2 = new Cliente(null, "Maria Do Bairro", "Porto Triste", "Rua salafena, 157", "51934893843", "F", l4);
        Cliente c3 = new Cliente(null, "Martha Coimbra", "Canoas", "Rua tobias barreto, 690", "5133434343", "F", l2);
        Cliente c4 = new Cliente(null, "Tamara Camarao", "Canoas", "Rua machado de assis, 1234", "5192839843", "F", l3);

        clienteRepository.saveAll(Arrays.asList(c1, c2, c3, c4));

    }

}
