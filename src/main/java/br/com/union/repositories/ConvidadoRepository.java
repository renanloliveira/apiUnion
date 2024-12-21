package br.com.union.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.union.entities.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Integer> {

}
