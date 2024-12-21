package br.com.union.entities;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "tbl_referencia")
public class Referencia {
	
	@Column
	private Membro membro;
	
	@Column
	private String observacoes;
	
	@Column
	private Boolean tipoReferencia;
	
	@Column
	private TipoAvaliacao avaliacao;

}
