package br.com.union.interfaces;

import br.com.union.dtos.ConvidadoRequestDto;
import br.com.union.dtos.ConvidadoResponseDto;

public interface ConvidadoInterface {
	
 public ConvidadoResponseDto criar(ConvidadoRequestDto request) throws Exception;
	 
 public ConvidadoResponseDto obterPorId(Integer id) throws Exception;

}
