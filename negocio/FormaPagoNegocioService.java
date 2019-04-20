package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Forma_Pago;
import com.dagama.cine.repositorio.FormaPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoNegocioService {
    @Autowired
    private FormaPagoRepositorio formaPagoRepositorio;

    public Forma_Pago registrar(Forma_Pago formaPago){ return formaPagoRepositorio.save(formaPago);}

    public List<Forma_Pago> obtenerFormaPago(){
        List<Forma_Pago> listado = (List<Forma_Pago>)formaPagoRepositorio.obtenerReporteFormaPago();
        Forma_Pago formaPago = new Forma_Pago();
        for(Forma_Pago rep:listado){
            formaPago.setIdformapago(rep.getIdformapago());
            formaPago.setNombre_forma_pago(rep.getNombre_forma_pago());
            formaPago.setEstado(rep.getEstado());
        }
        return listado;
    }
}
