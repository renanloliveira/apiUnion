package br.com.union.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.union.entities.Reuniao;

@Repository
public interface ReuniaoRepository  extends JpaRepository<Reuniao, Integer> {

}
