package com.dagama.cine.rest;

import com.dagama.cine.entidades.ConsultaReserva;
import com.dagama.cine.entidades.ConsultaResumen;
import com.dagama.cine.entidades.ReservaEntrada;
import com.dagama.cine.negocio.ConsultaReservaNegocioService;
import com.dagama.cine.negocio.ConsultaResumenNegocioService;
import com.dagama.cine.negocio.ReservaEntradaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class ReservaEntradaServiceRest {
    @Autowired
    private ReservaEntradaNegocioService reservaEntradaNegocioService;
    @Autowired
    private ConsultaReservaNegocioService consultaReservaNegocioService;
    @Autowired
    private ConsultaResumenNegocioService consultaResumenNegocioService;

    @GetMapping("/reservaEntradaes")
    public List<ReservaEntrada> obtenerReservaEntrada() {
        return reservaEntradaNegocioService.obtenerReservaEntrada();
    }

    @PostMapping("/reservaEntrada")
    public  ReservaEntrada IngresaReservaEntrada (@RequestBody ReservaEntrada reservaEntrada){
        return reservaEntradaNegocioService.registrar(reservaEntrada);
    }

    @GetMapping("/consultareserva/{idcine}")
    public List<ConsultaReserva> ConsultaReserva(
            @PathVariable(value = "idcine") int idcine){
        return consultaReservaNegocioService.ConsultaReserva(idcine);
    }

    @GetMapping("/consultaresumen/{idcine}")
    public List<ConsultaResumen> ConsultaResumen(
            @PathVariable(value = "idcine") int idcine){
        return consultaResumenNegocioService.ConsultaResumen(idcine);
    }
}
