package com.dagama.cine.negocio;

import com.dagama.cine.entidades.PromocionCombo;
import com.dagama.cine.repositorio.PromocionComboRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionComboNegocioService {
    @Autowired
    private PromocionComboRepositorio promocionComboRepositorio;

    public PromocionCombo registrar(PromocionCombo promocionCombo) { return promocionComboRepositorio.save(promocionCombo); }

    public List<PromocionCombo> obtenerPromocionCombo(Long idpromocion){
        List<PromocionCombo> listado = (List<PromocionCombo>)promocionComboRepositorio.obtenerReportePromocionCombo(idpromocion);
        PromocionCombo promocionCombo = new PromocionCombo();
        for(PromocionCombo rep:listado){
            promocionCombo.setIdpromocioncombo(rep.getIdpromocioncombo());
            promocionCombo.setIdpromocion(rep.getIdpromocion());
            promocionCombo.setIdcombo(rep.getIdcombo());
            promocionCombo.setFecha_registro(rep.getFecha_registro());
            promocionCombo.setPrecio_combo(rep.getPrecio_combo());
            promocionCombo.setEstado(rep.getEstado());
        }
        return listado;
    }
}
