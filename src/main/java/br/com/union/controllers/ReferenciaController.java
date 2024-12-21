package br.com.union.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.union.dtos.ReferenciaRequestDto;
import br.com.union.dtos.ReferenciaResponseDto;
import br.com.union.interfaces.ReferenciaInterface;

@RestController
@RequestMapping("/api/referencia/")
public class ReferenciaController {
	@Autowired
	ReferenciaInterface referenciaInterface;

	@PostMapping
	ReferenciaResponseDto post(@RequestBody ReferenciaRequestDto request) throws Exception {
		return referenciaInterface.criar(request);
	}

	@GetMapping("{id}")
	ReferenciaResponseDto get(@PathVariable Integer id) throws Exception {
		return referenciaInterface.obterPorId(id);
	}
}
