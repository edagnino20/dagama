package com.dagama.cine.rest;

import com.dagama.cine.entidades.Banco;
import com.dagama.cine.negocio.BancoNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class BancoServiceRest {
    @Autowired
    private BancoNegocioService bancoNegocioService;

    @GetMapping("/bancos")
    public List<Banco> obtenerCine() {
        return bancoNegocioService.obtenerBanco();
    }
}
