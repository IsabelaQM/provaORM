package iftm.edu.br.entregas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.entregas.domain.Endereco;
import iftm.edu.br.entregas.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repo;
    
    public List<Endereco> busca() {
        List<Endereco> lista = new ArrayList<Endereco>();
		repo.findAll().forEach(p -> lista.add(p));
		return lista;
    }

    public Endereco salva(Endereco endereco) {
        return repo.save(endereco);
    }
    
}
