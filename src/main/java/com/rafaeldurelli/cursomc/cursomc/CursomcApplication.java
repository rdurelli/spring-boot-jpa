package com.rafaeldurelli.cursomc.cursomc;

import com.rafaeldurelli.cursomc.cursomc.domain.*;
import com.rafaeldurelli.cursomc.cursomc.domain.enuns.EstadoPagamento;
import com.rafaeldurelli.cursomc.cursomc.domain.enuns.TipoCliente;
import com.rafaeldurelli.cursomc.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {


    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        //faz a instancias das categorias
        Categoria cat1 = new Categoria(null, "Escritorio");
        Categoria cat2 = new Categoria(null, "Informatica");
        Categoria cat3 = new Categoria(null, "Cozinha");

        //faz a instancias dos produtos
        Produto p1 = new Produto(null, "Computador", 2000.00);
        Produto p2 = new Produto(null, "Impressora", 800.00);
        Produto p3 = new Produto(null, "Mouse", 80.00);

        //faz a associacao dos categorias e produtos

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");

        Cidade c0 = new Cidade(null, "Lavras", est1);
        Cidade c1 = new Cidade(null, "Uberlândia", est1);
        Cidade c2 = new Cidade(null, "São Paulo", est2);
        Cidade c3 = new Cidade(null, "Campinas", est2);

        est1.getCidades().addAll(Arrays.asList(c0, c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));

        cidadeRepository.saveAll(Arrays.asList(c0, c1, c2, c3));

        Cliente cli1 = new Cliente(null, "Maria Silva", "mari@gmail.com", "359.269.123.00", TipoCliente.PESSOAFISICA);
        cli1.getTelefones().addAll(Arrays.asList("34336569", "34557878"));

        Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apt 30", "Jardim", "386455848", cli1, c1);

        Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 80", "Centro", "313135848", cli1, c2);

        cli1.getEnderecos().addAll(Arrays.asList(e1, e2));

        clienteRepository.saveAll(Arrays.asList(cli1));

        enderecoRepository.saveAll(Arrays.asList(e1, e2));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Pedido ped1 = new Pedido(null, simpleDateFormat.parse("30/09/2019 10:32"), e1, cli1);

        Pedido ped2 = new Pedido(null, simpleDateFormat.parse("10/10/2019 12:25"), e2, cli1);

        Pagamento pagamento1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
        ped1.setPagamento(pagamento1);

        Pagamento pagamento2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, simpleDateFormat.parse("20/10/2017 00:00"), null);
        ped2.setPagamento(pagamento2);

        cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));

        pedidoRepository.saveAll(Arrays.asList(ped1, ped2));

        pagamentoRepository.saveAll(Arrays.asList(pagamento1, pagamento2));


    }
}
