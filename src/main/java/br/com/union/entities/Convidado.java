package br.com.union.entities;

import java.util.Date;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "tbl_convidado")
public class Convidado {

	@Column
	private String nome;

	@Column
	private Date dataHora;

	@Column
	private String telefone;

	@Column
	private String especilidade;
}
