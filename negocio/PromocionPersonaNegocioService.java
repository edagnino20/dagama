package com.dagama.cine.negocio;

import com.dagama.cine.entidades.PromocionPersona;
import com.dagama.cine.repositorio.PromocionPersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionPersonaNegocioService {
    @Autowired
    private PromocionPersonaRepositorio promocionPersonaRepositorio;

    public PromocionPersona registrar(PromocionPersona promocionPersona) { return promocionPersonaRepositorio.save(promocionPersona); }

    public List<PromocionPersona> obtenerPromocionPersona(Long idpromocion){
        List<PromocionPersona> listado = (List<PromocionPersona>)promocionPersonaRepositorio.obtenerReportePromocionPersona(idpromocion);
        PromocionPersona promocionPersona = new PromocionPersona();
        for(PromocionPersona rep:listado){
            promocionPersona.setIdpromocion(rep.getIdpromocion());
            promocionPersona.setRango_inicial(rep.getRango_inicial());
            promocionPersona.setRango_final(rep.getRango_final());
            promocionPersona.setPorcentaje_descuento(rep.getPorcentaje_descuento());
        }
        return listado;
    }
}
