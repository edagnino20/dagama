package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Reserva;
import com.dagama.cine.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaNegocioService {
    @Autowired
    private ReservaRepositorio reservaRepositorio;

    public Reserva registrar(Reserva reserva) { return reservaRepositorio.save(reserva); }

    public List<Reserva> obtenerReserva(){
        List<Reserva> listado = (List<Reserva>)reservaRepositorio.obtenerReporteReserva();
        Reserva reserva = new Reserva();
        for(Reserva rep:listado){
            reserva.setIdreserva(rep.getIdreserva());
            reserva.setIdempresa(rep.getIdempresa());
            reserva.setFecha(rep.getFecha());
            reserva.setIdformapago(rep.getIdformapago());
            reserva.setTitular_tarjeta(rep.getTitular_tarjeta());
            reserva.setNumero_tarjeta(rep.getNumero_tarjeta());
            reserva.setVencimiento_tarjeta(rep.getVencimiento_tarjeta());
            reserva.setPrecio_promocion(rep.getPrecio_promocion());
            reserva.setPrecio_combo(rep.getPrecio_combo());
            reserva.setPrecio_total(rep.getPrecio_total());
            reserva.setEstado(rep.getEstado());
        }
        return listado;
    }
}
