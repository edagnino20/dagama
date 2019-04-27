package com.dagama.cine.negocio;

import com.dagama.cine.entidades.ConsultaReserva;
import com.dagama.cine.repositorio.ConsultaReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaReservaNegocioService {
    @Autowired
    private ConsultaReservaRepositorio consultaReservaRepositorio;

    public List<ConsultaReserva> ConsultaReserva(int idcine){
        List<ConsultaReserva> listado = (List<ConsultaReserva>)consultaReservaRepositorio.ConsultaReserva(idcine);
        ConsultaReserva consultareserva = new ConsultaReserva();
        for(ConsultaReserva rep:listado){
            consultareserva.setIdreserva(rep.getIdreserva());
            consultareserva.setRuc(rep.getRuc());
            consultareserva.setNombre_empresa(rep.getNombre_empresa());
            consultareserva.setTitular_tarjeta(rep.getTitular_tarjeta());
            consultareserva.setFechapago(rep.getFechapago());
            consultareserva.setPrecio_total(rep.getPrecio_total());
        }
        return listado;
    }
}
