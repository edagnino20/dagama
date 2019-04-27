package com.dagama.cine.negocio;

import com.dagama.cine.entidades.PromocionBusqueda;
import com.dagama.cine.repositorio.PromocionBusquedaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromocionBusquedaNegocioService {
    @Autowired
    private PromocionBusquedaRepositorio promocionBusquedaRepositorio;

    public List<PromocionBusqueda> BuscarPromocion(int idempresa, int idbanco, int numpersonas){
        List<PromocionBusqueda> listado = (List<PromocionBusqueda>)promocionBusquedaRepositorio.BuscarPromocion(idempresa, idbanco, numpersonas);
        PromocionBusqueda promocion = new PromocionBusqueda();
        for(PromocionBusqueda rep:listado){
            promocion.setIdpromocion(rep.getIdpromocion());
            promocion.setDescripcion(rep.getDescripcion());
            promocion.setCosto_total(rep.getCosto_total());
            promocion.setIdcine(rep.getIdcine());
        }
        return listado;
    }
}
