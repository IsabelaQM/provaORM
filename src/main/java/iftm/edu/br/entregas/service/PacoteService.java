package iftm.edu.br.entregas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.entregas.domain.Pacote;
import iftm.edu.br.entregas.repository.PacoteRepository;

@Service
public class PacoteService {

     @Autowired
    private PacoteRepository repo;

    public Pacote busca(Long id) {
        return repo.findById(id).get();
    }

    public List<Pacote> busca() {
        List<Pacote> lista = new ArrayList<Pacote>();
		repo.findAll().forEach(p -> lista.add(p));
		return lista;
    }

    public Pacote salva(Pacote pacote) {
       return repo.save(pacote);
    }

    public Pacote atualiza(Long id,Pacote pacote) {
        pacote.setId(id);
        return repo.save(pacote);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
