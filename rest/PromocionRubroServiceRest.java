package com.dagama.cine.rest;

import com.dagama.cine.entidades.PromocionRubro;
import com.dagama.cine.negocio.PromocionRubroNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class PromocionRubroServiceRest {
    @Autowired
    private PromocionRubroNegocioService promocionRubroNegocioService;

    @GetMapping("/promocionRubroes/{idpromocion}")
    public List<PromocionRubro> obtenerPromocionRubro(@PathVariable(value = "idpromocion") Long idpromocion) {
        return promocionRubroNegocioService.obtenerPromocionRubro(idpromocion);
    }

    @PostMapping("/promocionRubro")
    public  PromocionRubro IngresaPromocionRubro (@RequestBody PromocionRubro promocionRubro){
        return promocionRubroNegocioService.registrar(promocionRubro);
    }
}
