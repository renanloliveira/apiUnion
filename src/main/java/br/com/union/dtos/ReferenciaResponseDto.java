package br.com.union.dtos;

import br.com.union.entities.Membro;
import lombok.Data;
@Data
public class ReferenciaResponseDto {
	
	private Integer id;
    private Membro membro;
    private String observacoes;
    private Boolean tipoReferencia;
    private Integer avaliacao;

}
