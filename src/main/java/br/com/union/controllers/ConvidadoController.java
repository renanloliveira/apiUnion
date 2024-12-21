package br.com.union.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.union.dtos.ConvidadoRequestDto;
import br.com.union.dtos.ConvidadoResponseDto;
import br.com.union.interfaces.ConvidadoInterface;

@RestController
@RequestMapping("/api/convidados/")
public class ConvidadoController {
	
	@Autowired ConvidadoInterface convidadoInterface;
	
	@PostMapping
	ConvidadoResponseDto post(@RequestBody ConvidadoRequestDto request) throws Exception {
		return convidadoInterface.criar(request);
	}
	
	@GetMapping("{id}")
	ConvidadoResponseDto getByid (@PathVariable Integer id) throws Exception{
		return convidadoInterface.obterPorId(id);
	}
	

}
