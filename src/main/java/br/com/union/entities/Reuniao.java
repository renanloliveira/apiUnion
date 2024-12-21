package br.com.union.entities;

import java.util.Date;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "tbl_reuniao")
public class Reuniao {

	@Column
	private Membro membro;

	@Column
	private Date dataHora;

	@Column
	private String local;

	@Column
	private String motivo;

}
