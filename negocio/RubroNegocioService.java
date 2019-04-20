package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Rubro;
import com.dagama.cine.repositorio.RubroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroNegocioService {
    @Autowired
    private RubroRepositorio rubroRepositorio;

    public Rubro registrar(Rubro rubro) { return rubroRepositorio.save(rubro); }

    public List<Rubro> obtenerRubro(){
        List<Rubro> listado = (List<Rubro>)rubroRepositorio.obtenerReporteRubro();
        Rubro rubro = new Rubro();
        for(Rubro rep:listado){
            rubro.setIdrubro(rep.getIdrubro());
            rubro.setNombre_rubro(rep.getNombre_rubro());
            rubro.setEstado(rep.getEstado());
        }
        return listado;
    }
}
