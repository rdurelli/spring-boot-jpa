package com.rafaeldurelli.cursomc.cursomc.resources;



import com.rafaeldurelli.cursomc.cursomc.domain.Cliente;
import com.rafaeldurelli.cursomc.cursomc.domain.teste.xml.Member;
import com.rafaeldurelli.cursomc.cursomc.domain.teste.xml.Ns3ECReports;
import com.rafaeldurelli.cursomc.cursomc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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




    @RequestMapping(method = RequestMethod.POST, value = "/save", consumes = MediaType.APPLICATION_XML_VALUE)
    public String testeXML (@RequestBody Ns3ECReports s) {

        System.out.println("O xml is " + s.getNs2_gtiReportId());

        System.out.println("O xml is " + s.getNs2_gtiTenantId());


        return "ola " + s;
    }
}
