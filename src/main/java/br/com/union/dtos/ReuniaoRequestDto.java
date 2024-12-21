package br.com.union.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class ReuniaoRequestDto {

	
	private Date dataHora;
	private String local;
	private String motivo;
	private Integer membroId;
	private Integer membroId2;

}
