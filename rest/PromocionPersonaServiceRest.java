package com.dagama.cine.rest;

import com.dagama.cine.entidades.PromocionPersona;
import com.dagama.cine.negocio.PromocionPersonaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class PromocionPersonaServiceRest {
    @Autowired
    private PromocionPersonaNegocioService promocionPersonaNegocioService;

    @GetMapping("/promocionPersonas/{idpromocion}")
    public List<PromocionPersona> obtenerPromocionPersona(@PathVariable(value = "idpromocion") Long idpromocion){
        return promocionPersonaNegocioService.obtenerPromocionPersona(idpromocion);
    }

    @PostMapping("/promocionPersona")
    public  PromocionPersona IngresaPromocionPersona (@RequestBody PromocionPersona promocionPersona){
        return promocionPersonaNegocioService.registrar(promocionPersona);
    }
}
