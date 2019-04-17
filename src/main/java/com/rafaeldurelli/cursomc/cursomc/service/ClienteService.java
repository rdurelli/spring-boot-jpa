package com.rafaeldurelli.cursomc.cursomc.service;



import com.rafaeldurelli.cursomc.cursomc.domain.Categoria;
import com.rafaeldurelli.cursomc.cursomc.domain.Cidade;
import com.rafaeldurelli.cursomc.cursomc.domain.Cliente;
import com.rafaeldurelli.cursomc.cursomc.repositories.ClienteRepository;
import com.rafaeldurelli.cursomc.cursomc.service.service.expections.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente obterCliente (Integer id) {
        Optional<Cliente> clienteIdentified = clienteRepository.findById(id);

        return clienteIdentified.orElseThrow(() -> new ObjectNotFoundException("Cliente não identificado! ID " + id + " Tipo: "+ Cliente.class.getName()));

    }

}
