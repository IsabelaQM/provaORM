package iftm.edu.br.entregas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iftm.edu.br.entregas.domain.Rastreamento;
import iftm.edu.br.entregas.service.RastreamentoService;

@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {

    @Autowired 
    private RastreamentoService service;

   @GetMapping("/{id}")
    public Rastreamento busca(@PathVariable Long id){
        return service.busca(id);
    }
    
}
