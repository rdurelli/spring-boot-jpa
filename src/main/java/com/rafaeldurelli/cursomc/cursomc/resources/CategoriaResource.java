package com.rafaeldurelli.cursomc.cursomc.resources;


import com.rafaeldurelli.cursomc.cursomc.domain.Categoria;
import com.rafaeldurelli.cursomc.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {


        Categoria categoriaIdentifica = categoriaService.buscar(id);

        return ResponseEntity.ok().body(categoriaIdentifica);
    }

}
