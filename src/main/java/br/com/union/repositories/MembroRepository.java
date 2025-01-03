package br.com.union.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.union.entities.Membro;
@Repository
public interface MembroRepository  extends JpaRepository<Membro, Integer> {

}
