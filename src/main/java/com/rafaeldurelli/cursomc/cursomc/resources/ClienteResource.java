package com.rafaeldurelli.cursomc.cursomc.resources;



import com.rafaeldurelli.cursomc.cursomc.domain.Cliente;
import com.rafaeldurelli.cursomc.cursomc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {


        Cliente cliente = clienteService.obterCliente(id);

        return ResponseEntity.ok().body(cliente);
    }


}
