package com.dagama.cine.rest;

import com.dagama.cine.entidades.Reserva;
import com.dagama.cine.negocio.ReservaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaServiceRest {
    @Autowired
    private ReservaNegocioService reservaNegocioService;

    @GetMapping("/reservaes")
    public List<Reserva> obtenerReserva() {
        return reservaNegocioService.obtenerReserva();
    }

    @PostMapping("/reserva")
    public  Reserva IngresaReserva (@RequestBody Reserva reserva){
        return reservaNegocioService.registrar(reserva);
    }
}
