package br.com.union.dtos;

import java.util.Date;

import br.com.union.entities.Membro;
import lombok.Data;

@Data
public class ReuniaoResponseDto {

	private Integer id;
	private Membro membro;
	private Date dataHora;
	private String local;
	private String motivo;

}
