package br.com.union.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.union.dtos.ConvidadoRequestDto;
import br.com.union.dtos.ConvidadoResponseDto;
import br.com.union.entities.Convidado;
import br.com.union.interfaces.ConvidadoInterface;
import br.com.union.repositories.ConvidadoRepository;
import br.com.union.repositories.MembroRepository;
@Service
public class ConvidadoServiceImpl implements ConvidadoInterface {

	@Autowired
	ConvidadoRepository convidadoRepository;
	
	@Autowired MembroRepository membroRepository;

	@Override
	public ConvidadoResponseDto criar(ConvidadoRequestDto request) throws Exception {
		
		var membro = membroRepository.findById(request.getMembroId())
				.orElseThrow(() -> new IllegalArgumentException("Membro não encontrada. Verifique o ID informado."));
		
		var convidado = new Convidado();

		convidado.setNome(request.getNome());
		convidado.setDataHora(new Date());
		convidado.setTelefone(request.getTelefone());
		convidado.setEspecialidade(request.getEspecialidade());
		convidado.setMembro(membro);

		convidadoRepository.save(convidado);

		return toResponse(convidado);
	}

	@Override
	public ConvidadoResponseDto obterPorId(Integer id) throws Exception {
		var convidado = convidadoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Convidado não encontrado. Verifique o ID."));

		return toResponse(convidado);
	}

	private ConvidadoResponseDto toResponse(Convidado convidado) {
		var response = new ConvidadoResponseDto();

		response.setId(convidado.getId());
		response.setNome(convidado.getNome());
		response.setDataHora(new Date());
		response.setTelefone(convidado.getTelefone());
		response.setEspecialidade(convidado.getEspecialidade());
		response.setMembro(convidado.getMembro());

		return response;
	}
}