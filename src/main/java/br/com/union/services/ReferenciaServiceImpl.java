package br.com.union.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.union.dtos.ReferenciaRequestDto;
import br.com.union.dtos.ReferenciaResponseDto;
import br.com.union.entities.Referencia;
import br.com.union.interfaces.ReferenciaInterface;
import br.com.union.repositories.MembroRepository;
import br.com.union.repositories.ReferenciaRepository;

@Service
public class ReferenciaServiceImpl implements ReferenciaInterface {
	@Autowired
	ReferenciaRepository referenciaRepository;
	@Autowired
	MembroRepository membroRepository;

	@Override
	public ReferenciaResponseDto criar(ReferenciaRequestDto request) throws Exception {
		
		var membro = membroRepository.findById(request.getMembroId())
				.orElseThrow(() -> new IllegalArgumentException("Membro não encontrada. Verifique o ID informado."));

		var referencia = new Referencia();

		referencia.setObservacoes(request.getObservacoes());
		referencia.setAvaliacao(request.getAvaliacao());
		referencia.setTipoReferencia(request.getTipoReferencia());
		referencia.setMembro(membro);

		referenciaRepository.save(referencia);

		var response = new ReferenciaResponseDto();
		response.setId(referencia.getId());
		response.setObservacoes(referencia.getObservacoes());
		response.setAvaliacao(referencia.getAvaliacao());
		response.setTipoReferencia(referencia.getTipoReferencia());
		response.setMembro(referencia.getMembro());

		return response;
	}

	@Override
	public ReferenciaResponseDto obterPorId(Integer id) throws Exception {
		
		var referencia = referenciaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Referencia não encontrado. Verifique o ID."));

		var response = new ReferenciaResponseDto();
		response.setId(referencia.getId());
		response.setObservacoes(referencia.getObservacoes());
		response.setAvaliacao(referencia.getAvaliacao());
		response.setTipoReferencia(referencia.getTipoReferencia());
		response.setMembro(referencia.getMembro());

		return response;
	}

}
