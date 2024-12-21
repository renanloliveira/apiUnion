package br.com.union.interfaces;

import br.com.union.dtos.ReferenciaRequestDto;
import br.com.union.dtos.ReferenciaResponseDto;

public interface ReferenciaInterface {
	
	public ReferenciaResponseDto criar(ReferenciaRequestDto request) throws Exception;
	 
	 public ReferenciaResponseDto obterPorId(Integer id) throws Exception;

}
