package br.com.union.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.union.entities.Referencia;
@Repository
public interface ReferenciaRepository  extends JpaRepository<Referencia, Integer> {

}
