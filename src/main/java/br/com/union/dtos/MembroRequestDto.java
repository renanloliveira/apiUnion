package br.com.union.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembroRequestDto {
	private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String empresa;
    private String curriculo;
    private String siteDaEmpresa;
}