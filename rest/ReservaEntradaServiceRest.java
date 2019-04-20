package com.dagama.cine.rest;

import com.dagama.cine.entidades.ReservaEntrada;
import com.dagama.cine.negocio.ReservaEntradaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaEntradaServiceRest {
    @Autowired
    private ReservaEntradaNegocioService reservaEntradaNegocioService;

    @GetMapping("/reservaEntradaes")
    public List<ReservaEntrada> obtenerReservaEntrada() {
        return reservaEntradaNegocioService.obtenerReservaEntrada();
    }

    @PostMapping("/reservaEntrada")
    public  ReservaEntrada IngresaReservaEntrada (@RequestBody ReservaEntrada reservaEntrada){
        return reservaEntradaNegocioService.registrar(reservaEntrada);
    }
}
