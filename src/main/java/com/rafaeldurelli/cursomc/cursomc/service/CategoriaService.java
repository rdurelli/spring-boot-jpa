package com.rafaeldurelli.cursomc.cursomc.service;


import com.rafaeldurelli.cursomc.cursomc.domain.Categoria;
import com.rafaeldurelli.cursomc.cursomc.repositories.CategoriaRepository;
import com.rafaeldurelli.cursomc.cursomc.service.service.expections.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar (Integer id) {
        Optional<Categoria> cat = categoriaRepository.findById(id);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + " Tipo: "+Categoria.class.getName()));
    }

}
