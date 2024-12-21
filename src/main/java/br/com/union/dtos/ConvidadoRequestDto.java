package br.com.union.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class ConvidadoRequestDto {

    private String nome;
    private Date dataHora;
    private String telefone;
    private String especialidade;
    private Integer membroId;
}