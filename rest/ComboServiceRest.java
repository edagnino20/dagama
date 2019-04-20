package com.dagama.cine.rest;

import com.dagama.cine.entidades.Combo;
import com.dagama.cine.negocio.ComboNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class ComboServiceRest {
    @Autowired
    private ComboNegocioService comboNegocioService;

    @GetMapping("/combos")
    public List<Combo> obtenerCombo() {
        return comboNegocioService.obtenerCombo();
    }
}
