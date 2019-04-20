package com.dagama.cine.rest;

import com.dagama.cine.entidades.Categoria;
import com.dagama.cine.negocio.CategoriaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaServiceRest {
    @Autowired
    private CategoriaNegocioService categoriaNegocioService;

    @GetMapping("/categorias")
    public List<Categoria> obtenerCategoria() {
        return categoriaNegocioService.obtenerCategoria();
    }
}