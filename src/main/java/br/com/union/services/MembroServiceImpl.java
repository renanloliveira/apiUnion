package br.com.union.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.union.dtos.MembroRequestDto;
import br.com.union.dtos.MembroResponseDto;
import br.com.union.entities.Membro;
import br.com.union.interfaces.MembroInterface;
import br.com.union.repositories.MembroRepository;
@Service
public class MembroServiceImpl implements MembroInterface {
	
	@Autowired MembroRepository membroRepository;

	@Override
	public MembroResponseDto criar(MembroRequestDto request) throws Exception {
	
		
		Membro membro = new Membro();

		    membro.setNome(request.getNome());
		    membro.setEmail(request.getEmail());
		    membro.setTelefone(request.getTelefone());
		    membro.setEmpresa(request.getEmpresa());
		    membro.setCurriculo(request.getCurriculo());
		    membro.setSiteDaEmpresa(request.getSiteDaEmpresa());

		    Membro membroSalvo = membroRepository.save(membro);

		    return toResponse(membroSalvo);
		
	}

	@Override
	public List<MembroResponseDto> obterTodos() throws Exception {
	    List<Membro> membros = membroRepository.findAll(); 
	    
	    List<MembroResponseDto> Lista = membros.stream().map(membro -> {
	        var response = new MembroResponseDto();
	        response.setId(membro.getId());
	        response.setNome(membro.getNome());
	        response.setEmail(membro.getEmail());
	        response.setTelefone(membro.getTelefone());
	        response.setEmpresa(membro.getEmpresa());
	        response.setCurriculo(membro.getCurriculo());
	        response.setSiteDaEmpresa(membro.getSiteDaEmpresa());
	        return response;
	        
	    }).toList();

	    return Lista;
	}

	

	@Override
	public MembroResponseDto obterPorId(Integer id) throws Exception {
		
		var membro = membroRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Membro não encontrado. Verifique o ID."));
		
		return toResponse(membro);
		
		
	}

	private MembroResponseDto toResponse(Membro membro) {
		var response = new MembroResponseDto();

		response.setId(membro.getId());
		response.setNome(membro.getNome());
		response.setEmail(membro.getEmail());
		response.setTelefone(membro.getTelefone());
		response.setEmpresa(membro.getEmpresa());
		response.setCurriculo(membro.getCurriculo());
		response.setSiteDaEmpresa(membro.getSiteDaEmpresa());

		return response;
	}
}
