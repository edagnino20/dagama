package com.dagama.cine.negocio;

import com.dagama.cine.entidades.PromocionBanco;
import com.dagama.cine.repositorio.PromocionBancoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionBancoNegocioService {
    @Autowired
    private PromocionBancoRepositorio promocionBancoRepositorio;

    public PromocionBanco registrar(PromocionBanco promocionBanco) { return promocionBancoRepositorio.save(promocionBanco); }

    public List<PromocionBanco> obtenerPromocionBanco(Long idbanco){
        List<PromocionBanco> listado = (List<PromocionBanco>)promocionBancoRepositorio.obtenerReportePromocionBanco(idbanco);
        PromocionBanco promocionBanco = new PromocionBanco();
        for(PromocionBanco rep:listado){
            promocionBanco.setIdpromociobanco(rep.getIdpromociobanco());
            promocionBanco.setIdpromocion(rep.getIdpromocion());
            promocionBanco.setIdbanco(rep.getIdbanco());
            promocionBanco.setPorcentaje_descuento(rep.getPorcentaje_descuento());
            promocionBanco.setEstado(rep.getEstado());
        }
        return listado;
    }
}
