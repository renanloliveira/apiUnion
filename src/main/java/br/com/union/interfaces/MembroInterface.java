package br.com.union.interfaces;

import java.util.List;

import br.com.union.dtos.MembroRequestDto;
import br.com.union.dtos.MembroResponseDto;

public interface MembroInterface {

	 public MembroResponseDto criar(MembroRequestDto request) throws Exception;
	 
	 public List<MembroResponseDto> obterTodos() throws Exception;
	
	 public MembroResponseDto obterPorId(Integer id) throws Exception;
}
