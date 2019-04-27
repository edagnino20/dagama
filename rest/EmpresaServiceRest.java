package com.dagama.cine.rest;

import com.dagama.cine.entidades.Empresa;
import com.dagama.cine.negocio.EmpresaNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class EmpresaServiceRest {
    @Autowired
    private EmpresaNegocioService empresaNegocioService;

    @GetMapping("/empresa/{idempresa}")
    public Empresa obtenerEmpresa(@PathVariable(value = "idempresa") String idempresa){
        return empresaNegocioService.obtenerEmpresaxId(idempresa);
    }

    @GetMapping("/empresas")
    public List<Empresa> obtenerEmpresa() {
        return empresaNegocioService.obtenerEmpresa();
    }

    @PostMapping("/empresa")
    public Empresa IngresarEmpresa(@RequestBody Empresa empresa) {
        return empresaNegocioService.registrar(empresa);
    }

/*empresa*/
}