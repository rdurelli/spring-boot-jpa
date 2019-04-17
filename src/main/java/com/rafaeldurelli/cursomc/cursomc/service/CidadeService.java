package com.rafaeldurelli.cursomc.cursomc.service;



import com.rafaeldurelli.cursomc.cursomc.domain.Cidade;
import com.rafaeldurelli.cursomc.cursomc.repositories.CategoriaRepository;
import com.rafaeldurelli.cursomc.cursomc.repositories.CidadeRepository;
import com.rafaeldurelli.cursomc.cursomc.service.service.expections.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> obterCidades () {
        return cidadeRepository.findAll();

    }

}
