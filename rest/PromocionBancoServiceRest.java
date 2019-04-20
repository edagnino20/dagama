package com.dagama.cine.rest;

import com.dagama.cine.entidades.PromocionBanco;
import com.dagama.cine.negocio.PromocionBancoNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class PromocionBancoServiceRest {
    @Autowired
    private PromocionBancoNegocioService promocionBancoNegocioService;

    @GetMapping("/promocionBancos/{idpromocion}")
    public List<PromocionBanco> obtenerPromocionBanco(@PathVariable(value = "idpromocion") Long idpromocion) {
        return promocionBancoNegocioService.obtenerPromocionBanco(idpromocion);
    }

    @PostMapping("/promocionBanco")
    public  PromocionBanco IngresaPromocionBanco (@RequestBody PromocionBanco promocionBanco){
        return promocionBancoNegocioService.registrar(promocionBanco);
    }
}
