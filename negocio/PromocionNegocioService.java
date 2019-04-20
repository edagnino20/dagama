package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Promocion;
import com.dagama.cine.repositorio.PromocionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionNegocioService {
    @Autowired
    private PromocionRepositorio promocionRepositorio;

    public Promocion registrar(Promocion promocion) { return promocionRepositorio.save(promocion); }

    public List<Promocion> obtenerPromocion(){
        List<Promocion> listado = (List<Promocion>)promocionRepositorio.obtenerReportePromocion();
        Promocion promocion = new Promocion();
        for(Promocion rep:listado){
            promocion.setIdpromocion(rep.getIdpromocion());
            promocion.setIdcine(rep.getIdcine());
            promocion.setNombre_promocion(rep.getNombre_promocion());
            promocion.setFecharegistro(rep.getFecharegistro());
            promocion.setFecha_inicio(rep.getFecha_inicio());
            promocion.setFecha_final(rep.getFecha_final());
            promocion.setPrecio(rep.getPrecio());
            promocion.setEstado(rep.getEstado());
        }
        return listado;
    }

    public Promocion obtenerPromocionxId(String idpromocion){
        Promocion promocion;
        promocion = promocionRepositorio.buscarPromocion(Long.parseLong(idpromocion));
        return promocion;
    }

    public List<Promocion> obtenerPromocionxCine(Long idcine){
        List<Promocion> listado = (List<Promocion>)promocionRepositorio.obtenerReportePromocionxCine(idcine);
        Promocion promocion = new Promocion();
        for(Promocion rep:listado){
            promocion.setIdpromocion(rep.getIdpromocion());
            promocion.setNombre_promocion(rep.getNombre_promocion());
        }
        return listado;
    }
}
