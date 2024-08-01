package iftm.edu.br.entregas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iftm.edu.br.entregas.domain.Rastreamento;

@Repository
public interface RastreamentoRepository extends CrudRepository<Rastreamento, Long> {
}