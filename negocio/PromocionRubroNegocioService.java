package com.dagama.cine.negocio;

import com.dagama.cine.entidades.PromocionRubro;
import com.dagama.cine.repositorio.PromocionRubroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionRubroNegocioService {
    @Autowired
    private PromocionRubroRepositorio promocionRubroRepositorio;

    public PromocionRubro registrar(PromocionRubro promocionRubro) { return promocionRubroRepositorio.save(promocionRubro); }

    public List<PromocionRubro> obtenerPromocionRubro(Long idpromocion){
        List<PromocionRubro> listado = (List<PromocionRubro>)promocionRubroRepositorio.obtenerReportePromocionRubro(idpromocion);
        PromocionRubro promocionRubro = new PromocionRubro();
        for(PromocionRubro rep:listado){
            promocionRubro.setIdpromociorubro(rep.getIdpromociorubro());
            promocionRubro.setIdpromocion(rep.getIdpromocion());
            promocionRubro.setIdrubro(rep.getIdrubro());
            promocionRubro.setPorcentaje_descuento(rep.getPorcentaje_descuento());
            promocionRubro.setEstado(rep.getEstado());
        }
        return listado;
    }
}
