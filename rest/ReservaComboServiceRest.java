package com.dagama.cine.rest;

import com.dagama.cine.entidades.ReservaCombo;
import com.dagama.cine.negocio.ReservaComboNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaComboServiceRest {
    @Autowired
    private ReservaComboNegocioService reservaComboNegocioService;

    @GetMapping("/reservaComboes")
    public List<ReservaCombo> obtenerReservaCombo() {
        return reservaComboNegocioService.obtenerReservaCombo();
    }

    @PostMapping("/reservaCombo")
    public  ReservaCombo IngresaReservaCombo (@RequestBody ReservaCombo reservaCombo){
        return reservaComboNegocioService.registrar(reservaCombo);
    }
}
