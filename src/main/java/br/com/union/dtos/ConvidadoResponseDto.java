package br.com.union.dtos;

import java.util.Date;

import br.com.union.entities.Membro;
import lombok.Data;

@Data
public class ConvidadoResponseDto {

	private Integer id;
	private String nome;
	private Date dataHora;
	private String telefone;
	private String especialidade;
	private Membro membro;

}
