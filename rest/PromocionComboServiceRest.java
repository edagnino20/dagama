package com.dagama.cine.rest;

import com.dagama.cine.entidades.PromocionCombo;
import com.dagama.cine.negocio.PromocionComboNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class PromocionComboServiceRest {
    @Autowired
    private PromocionComboNegocioService promocionComboNegocioService;

    @GetMapping("/promocionCombos/{idpromocion}")
    public List<PromocionCombo> obtenerPromocionCombo(@PathVariable(value = "idpromocion") Long idpromocion) {
        return promocionComboNegocioService.obtenerPromocionCombo(idpromocion);
    }

    @PostMapping("/promocionCombo")
    public  PromocionCombo IngresaPromocionCombo (@RequestBody PromocionCombo promocionCombo){
        return promocionComboNegocioService.registrar(promocionCombo);
    }
}
