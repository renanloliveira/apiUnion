package br.com.union.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class MembroResponseDto {
	
	private Integer id;
	private String nome;
    private String email;
    private String telefone;
    private String empresa;
    private String curriculo;
    private String siteDaEmpresa;
    private Date dataHora;
    
    

}
