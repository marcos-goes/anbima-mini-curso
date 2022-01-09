package br.com.anbima.reservasalas.backendapi.controller;

import br.com.anbima.reservasalas.backendapi.model.SalaReuniao;
import br.com.anbima.reservasalas.backendapi.service.SalaReuniaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("salas")
public class SalaReuniaoResource {

    @Autowired
    private SalaReuniaoService service;

    @GetMapping
    public ResponseEntity<List<SalaReuniao>> read(){
        log.info("Invocado ::read:: para listar todas as salas de reunião");
        final var salasReuniao = service.listaTodasSalasReuniao();
        return ResponseEntity.ok(salasReuniao);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody SalaReuniao novaSala){
        log.info("Invocado ::create:: para criar uma nova sala de reunião \n {}", novaSala);
        // Algum codigo para validar o que esta sendo enviado
        service.incluirNovaSalaReuniao(novaSala);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
