package br.com.union.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.union.dtos.ReuniaoRequestDto;
import br.com.union.dtos.ReuniaoResponseDto;

@RestController
@RequestMapping("/api/reuniao/")
public class ReuniaoController {
	@PostMapping
	ReuniaoResponseDto post(ReuniaoRequestDto  request) {
		return null;
	}
	@GetMapping
	ReuniaoResponseDto get(ReuniaoRequestDto  request) {
		return null;

}
}