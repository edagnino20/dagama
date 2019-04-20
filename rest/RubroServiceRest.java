package com.dagama.cine.rest;

import com.dagama.cine.entidades.Rubro;
import com.dagama.cine.negocio.RubroNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class RubroServiceRest {
    @Autowired
    private RubroNegocioService rubroNegocioService;

    @GetMapping("/rubros")
    public List<Rubro> obtenerRubro() {
        return rubroNegocioService.obtenerRubro();
    }

    @PostMapping("/rubro")
    public  Rubro IngresaRubro (@RequestBody Rubro rubro){
        return rubroNegocioService.registrar(rubro);
    }
}
