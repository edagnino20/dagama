package com.dagama.cine.rest;

import com.dagama.cine.entidades.Forma_Pago;
import com.dagama.cine.negocio.FormaPagoNegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormaPagoServiceRest {
    @Autowired
    private FormaPagoNegocioService formaPagoNegocioService;

    @GetMapping("/formapagos")
    public List<Forma_Pago> obtenerCategoria() {
        return formaPagoNegocioService.obtenerFormaPago();
    }
}
