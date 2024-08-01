package iftm.edu.br.entregas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iftm.edu.br.entregas.domain.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Long> {
}