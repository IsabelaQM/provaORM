package iftm.edu.br.entregas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.edu.br.entregas.domain.Endereco;
import iftm.edu.br.entregas.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    
    @Autowired
    private EnderecoService service;
    
    @GetMapping 
    public List<Endereco> enderecos(){
        return service.busca();
    }

    @PostMapping  
    public Endereco novo(@RequestBody Endereco endereco){
        return service.salva(endereco);
    }
}
