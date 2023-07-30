package com.ericzCorp.revenda.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ericzCorp.revenda.entities.MonteSeuCarro;
import com.ericzCorp.revenda.entities.Cliente;
import com.ericzCorp.revenda.entities.Distribuidora;
import com.ericzCorp.revenda.entities.ListaCarrosRevenda;
import com.ericzCorp.revenda.entities.Loja;
import com.ericzCorp.revenda.entities.ModeloCarro;
import com.ericzCorp.revenda.entities.OpcoesCarro;
import com.ericzCorp.revenda.entities.Vendedor;
import com.ericzCorp.revenda.repositories.ClienteRepository;
import com.ericzCorp.revenda.repositories.DistribuidoraRepository;
import com.ericzCorp.revenda.repositories.ListaCarrosRepository;
import com.ericzCorp.revenda.repositories.LojaRepository;
import com.ericzCorp.revenda.repositories.ModeloCarroRepository;
import com.ericzCorp.revenda.repositories.MonteSeuCarroRepository;
import com.ericzCorp.revenda.repositories.OpcoesCarroRepository;
import com.ericzCorp.revenda.repositories.PedidoRepository;
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
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private OpcoesCarroRepository opcoesCarroRepository;
    @Autowired
    private ModeloCarroRepository modeloCarroRepository;
    @Autowired
    private DistribuidoraRepository distribuidoraRepository;
    @Autowired
    private MonteSeuCarroRepository monteSeuCarroRepository;
    @Autowired
    private ListaCarrosRepository listaCarrosRepository;

    @Override
    public void run(String... args) throws Exception {

        Loja l1 = new Loja(null, "Revenda do Alemao Sul", "Sul");
        Loja l2 = new Loja(null, "Revenda do Alemao Oeste", "Oeste");
        Loja l3 = new Loja(null, "Revenda do Alemao Leste", "Leste");
        Loja l4 = new Loja(null, "Revenda do Alemao Norte", "Norte");

        ListaCarrosRevenda lc1 = new ListaCarrosRevenda(null, "Corsa", "Chevrolet", "Hetch", 2012, "Plastico", 1.0,
                "Manual", "Branco", 12.000, l1);
        ListaCarrosRevenda lc2 = new ListaCarrosRevenda(null, "Fusca", "Volkwsvagen", "Hetch", 1998, "Ferro", 2.0,
                "Manual", "Amarelo", 15.000, l4);
        ListaCarrosRevenda lc3 = new ListaCarrosRevenda(null, "Celta", "Chevrolet", "Hetch", 2013, "Plastico", 1.0,
                "Manual", "Vermelho", 20.000, l2);
        ListaCarrosRevenda lc4 = new ListaCarrosRevenda(null, "Toro", "Fiat", "Camionete", 2019, "Carbono", 2.0,
                "Automatica", "Bordo", 80.000, l4);
        ListaCarrosRevenda lc5 = new ListaCarrosRevenda(null, "Siena", "Chevrolet", "Sedan", 2016, "Carbono", 1.5,
                "Manual", "Vermelho", 22.000, l3);
        lojaRepository.saveAll(Arrays.asList(l1, l2, l3, l4));
        listaCarrosRepository.saveAll(Arrays.asList(lc1, lc2, lc3, lc4, lc5));

        Vendedor v1 = new Vendedor(null, "Eric Biao", "1234567891", l3);
        Vendedor v2 = new Vendedor(null, "Henrique Padilha", "1234567890", l1);

        vendedorRepository.saveAll(Arrays.asList(v1, v2));

        Cliente c1 = new Cliente(null, "Robison Brabo Apenas", "Canoas", "Rua com certeza existe, 666", "51932893289",
                "M", l2);
        Cliente c2 = new Cliente(null, "Maria Do Bairro", "Porto Triste", "Rua salafena, 157", "51934893843", "F", l4);
        Cliente c3 = new Cliente(null, "Martha Coimbra", "Canoas", "Rua tobias barreto, 690", "5133434343", "F", l2);
        Cliente c4 = new Cliente(null, "Tamara Camarao", "Canoas", "Rua machado de assis, 1234", "5192839843", "F", l3);

        clienteRepository.saveAll(Arrays.asList(c1, c2, c3, c4));

        OpcoesCarro opc1 = new OpcoesCarro(null, "2.0", "manual", "cinza");
        OpcoesCarro opc2 = new OpcoesCarro(null, "1.8", "manual", "preto");

        ModeloCarro mdc1 = new ModeloCarro(null, "Hatch", 2015, "Fibra");
        ModeloCarro mdc2 = new ModeloCarro(null, "Camionete", 2019, "Metal");

        Distribuidora dist1 = new Distribuidora(null, "Chevrolet", "Onix", 50.000);
        Distribuidora dist2 = new Distribuidora(null, "Dodge", "Ram", 150.000);

        opcoesCarroRepository.saveAll(Arrays.asList(opc1, opc2));
        modeloCarroRepository.saveAll(Arrays.asList(mdc1, mdc2));
        distribuidoraRepository.saveAll(Arrays.asList(dist1, dist2));

        MonteSeuCarro carro1 = new MonteSeuCarro(opc1, mdc1, dist1);
        MonteSeuCarro carro2 = new MonteSeuCarro(opc2, mdc2, dist2);

        monteSeuCarroRepository.saveAll(Arrays.asList(carro1, carro2));
    }

}
