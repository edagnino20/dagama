package com.dagama.cine.negocio;

import com.dagama.cine.entidades.ReservaEntrada;
import com.dagama.cine.repositorio.ReservaEntradaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaEntradaNegocioService {
    @Autowired
    private ReservaEntradaRepositorio reservaEntradaRepositorio;

    public ReservaEntrada registrar(ReservaEntrada reservaEntrada) { return reservaEntradaRepositorio.save(reservaEntrada); }

    public List<ReservaEntrada> obtenerReservaEntrada(){
        List<ReservaEntrada> listado = (List<ReservaEntrada>)reservaEntradaRepositorio.obtenerReporteReservaEntrada();
        ReservaEntrada reservaEntrada = new ReservaEntrada();
        for(ReservaEntrada rep:listado){
            reservaEntrada.setIdreservaentrada(rep.getIdreservaentrada());
            reservaEntrada.setIdreserva(rep.getIdreserva());
            reservaEntrada.setIdpromocion(rep.getIdpromocion());
            reservaEntrada.setCantidadEntrada(rep.getCantidadEntrada());
        }
        return listado;
    }
}
