package br.com.union.interfaces;

import br.com.union.dtos.ReuniaoRequestDto;
import br.com.union.dtos.ReuniaoResponseDto;

public interface ReuniaoInterface {
	
	
	public ReuniaoResponseDto criar(ReuniaoRequestDto request) throws Exception;
	 
	 public ReuniaoResponseDto obterPorId(Integer id) throws Exception;

}
