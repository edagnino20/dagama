package com.dagama.cine.rest;

import com.dagama.cine.entidades.Cine;
import com.dagama.cine.negocio.CineNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class CineServiceRest {
    @Autowired
    private CineNegocioService cineNegocioService;

    @GetMapping("/cine/{idcine}")
    public Cine obtenerCine(@PathVariable(value = "idcine") String idcine){
        return cineNegocioService.obtenerCinexId(idcine);
    }

    @GetMapping("/cines")
    public List<Cine> obtenerCine() {
        return cineNegocioService.obtenerCine();
    }

    @PostMapping("/cine")
    public Cine IngresarCine(@RequestBody Cine cine) {
        return cineNegocioService.registrar(cine);
    }
}
