package iftm.edu.br.entregas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.edu.br.entregas.service.PacoteService;
import iftm.edu.br.entregas.domain.Pacote;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pacotes")
public class PacoteController {
    
    @Autowired
    private PacoteService service;

    @GetMapping
    public List<Pacote> pacotes(){
        return service.busca();
    }

    @PostMapping
    public Pacote novo(@RequestBody Pacote pacote){
        return service.salva(pacote);
    }

    @GetMapping("/{id}")
    public Pacote busca(@PathVariable Long id){
        return service.busca(id);
    }
    
    @PutMapping("/{id}")
    public Pacote atualiza(@PathVariable Long id, @RequestBody Pacote pacote){
        return service.atualiza(id, pacote);
    }

    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Long id){
        service.delete(id);
    }


}
