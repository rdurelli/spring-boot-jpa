package com.rafaeldurelli.cursomc.cursomc.resources;


import com.rafaeldurelli.cursomc.cursomc.domain.Cidade;
import com.rafaeldurelli.cursomc.cursomc.service.CategoriaService;
import com.rafaeldurelli.cursomc.cursomc.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {

    @Autowired
    private CidadeService cidadeService;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        List<Cidade> allCidades = cidadeService.obterCidades();

        return ResponseEntity.ok().body(allCidades);

    }

}
