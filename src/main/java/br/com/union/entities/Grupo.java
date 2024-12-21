package br.com.union.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "tbl_grupo")
public class Grupo {
	
	@Id 
	@Column
	private UUID id;
	
	@Column
	private String nome;

}
