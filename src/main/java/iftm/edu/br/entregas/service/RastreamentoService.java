package iftm.edu.br.entregas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.entregas.domain.Rastreamento;
import iftm.edu.br.entregas.repository.RastreamentoRepository;

@Service
public class RastreamentoService {

    @Autowired
    private RastreamentoRepository repo;

    public Rastreamento busca(Long id) {
        return repo.findById(id).get();
    }
    
}
