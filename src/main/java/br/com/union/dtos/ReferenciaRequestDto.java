package br.com.union.dtos;

import lombok.Data;
@Data
public class ReferenciaRequestDto {
	
    private String observacoes;
    private Boolean tipoReferencia;
    private Integer avaliacao;
    private Integer membroId;

}
