package br.com.anbima.reservasalas.backendapi.model;

import lombok.Data;

import java.util.List;

@Data
public class SalaReuniao {
    private String nome;
    private Integer capacidade;
    private List<String> equipamentos;
}
