package com.dagama.cine.rest;

import com.dagama.cine.entidades.Promocion;
import com.dagama.cine.entidades.PromocionBusqueda;
import com.dagama.cine.negocio.PromocionBusquedaNegocioService;
import com.dagama.cine.negocio.PromocionNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class PromocionServiceRest {
    @Autowired
    private PromocionNegocioService promocionNegocioService;
    @Autowired
    private PromocionBusquedaNegocioService promocionBusquedaNegocioService;

    @GetMapping("/promocion/{idpromocion}")
    public Promocion obtenerPromocion(@PathVariable(value = "idpromocion") String idpromocion){
        return promocionNegocioService.obtenerPromocionxId(idpromocion);
    }

    @GetMapping("/promocioncine/{idcine}")
    public List<Promocion> obtenerPromocionxCine(@PathVariable(value = "idcine") Long idcine){
        return promocionNegocioService.obtenerPromocionxCine(idcine);
    }

    @GetMapping("/promociones")
    public List<Promocion> obtenerPromocion() {
        return promocionNegocioService.obtenerPromocion();
    }

    @PostMapping("/promocion")
    public  Promocion IngresaPromocion (@RequestBody Promocion promocion){
        return promocionNegocioService.registrar(promocion);
    }

    @GetMapping("/buscarpromocion/{idempresa}/{idbanco}/{numpersonas}")
    public List<PromocionBusqueda> BuscarPromocion(
            @PathVariable(value = "idempresa") int idempresa,
            @PathVariable(value = "idbanco") int idbanco,
            @PathVariable(value = "numpersonas") int numpersonas){
        return promocionBusquedaNegocioService.BuscarPromocion(idempresa, idbanco, numpersonas);
    }
}