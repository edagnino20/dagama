package com.dagama.cine.negocio;

import com.dagama.cine.entidades.ReservaCombo;
import com.dagama.cine.repositorio.ReservaComboRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaComboNegocioService {
    @Autowired
    private ReservaComboRepositorio reservaComboRepositorio;

    public ReservaCombo registrar(ReservaCombo reservaCombo) { return reservaComboRepositorio.save(reservaCombo); }

    public List<ReservaCombo> obtenerReservaCombo(){
        List<ReservaCombo> listado = (List<ReservaCombo>)reservaComboRepositorio.obtenerReporteReservaCombo();
        ReservaCombo reservaCombo = new ReservaCombo();
        for(ReservaCombo rep:listado){
            reservaCombo.setIdpromocioncombo(rep.getIdpromocioncombo());
            reservaCombo.setIdreserva(rep.getIdreserva());
            reservaCombo.setIdreservacombo(rep.getIdreservacombo());
        }
        return listado;
    }
}
