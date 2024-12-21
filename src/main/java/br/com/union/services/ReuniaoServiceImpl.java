package br.com.union.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.union.dtos.ReuniaoRequestDto;
import br.com.union.dtos.ReuniaoResponseDto;
import br.com.union.entities.Reuniao;
import br.com.union.interfaces.ReuniaoInterface;
import br.com.union.repositories.MembroRepository;
import br.com.union.repositories.ReuniaoRepository;

@Service
public class ReuniaoServiceImpl implements ReuniaoInterface {

	@Autowired
	ReuniaoRepository reuniaoRepository;
	@Autowired
	MembroRepository membroRepository;

	@Override
	public ReuniaoResponseDto criar(ReuniaoRequestDto request) throws Exception {

		var membro = membroRepository.findById(request.getMembroId())
				.orElseThrow(() -> new IllegalArgumentException("Membro não encontrada. Verifique o ID informado."));

		var membro2 = membroRepository.findById(request.getMembroId2())
				.orElseThrow(() -> new IllegalArgumentException("Membro não encontrada. Verifique o ID informado."));

		var reuniao = new Reuniao();

		reuniao.setLocal(request.getLocal());
		reuniao.setMotivo(request.getMotivo());
		reuniao.setDataHora(new Date());
		reuniao.setMembro(membro);
		reuniao.setMembro2(membro2);

		reuniaoRepository.save(reuniao);
		//TODO: a fazer
		//var 

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReuniaoResponseDto obterPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
