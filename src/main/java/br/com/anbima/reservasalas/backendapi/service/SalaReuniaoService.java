package br.com.anbima.reservasalas.backendapi.service;

import br.com.anbima.reservasalas.backendapi.model.SalaReuniao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SalaReuniaoService {

    private List<SalaReuniao> salas;

    public SalaReuniaoService(){
        SalaReuniao sala1 = new SalaReuniao();
        sala1.setNome("Sala 1");
        sala1.setCapacidade(10);
        sala1.setEquipamentos(Arrays.asList("Projetor", "Laptop"));

        SalaReuniao sala2 = new SalaReuniao();
        sala2.setNome("Sala 2");
        sala2.setCapacidade(5);
        sala2.setEquipamentos(Arrays.asList("Lousa"));

        this.salas = new ArrayList<>();
        this.salas.add(sala1);
        this.salas.add(sala2);
    }

    public List<SalaReuniao> listaTodasSalasReuniao(){
        return this.salas;
    }

}
