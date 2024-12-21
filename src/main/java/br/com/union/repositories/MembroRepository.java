package br.com.union.repositories;




import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.union.entities.Membro;

@Repo
public interface MembroRepository extends Jpa<Membro, UUID>{

}
