package br.com.union.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.union.dtos.MembroRequestDto;
import br.com.union.dtos.MembroResponseDto;
import br.com.union.interfaces.MembroInterface;

@RestController
@RequestMapping("/api/membro/")
public class MembroController {
	@Autowired MembroInterface membroInterface;
	
	@PostMapping
	MembroResponseDto post( @RequestBody MembroRequestDto request)throws Exception {
		return membroInterface.criar(request);
	}

	@GetMapping("{id}")
	MembroResponseDto getPorId (@PathVariable Integer id)throws Exception {
		return membroInterface.obterPorId(id);
	}
	@GetMapping
	List<MembroResponseDto> getAll() throws Exception{
		return membroInterface.obterTodos();
	}
}
