package br.com.union.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "tbl_membro")
public class Membro {

	@Id
	@Column
	private UUID id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String telefone;
	
	@Column
	private String empresa;
	
	@Column
	private String curriculo;
	
	@Column
	private String siteEmpresa;

}
