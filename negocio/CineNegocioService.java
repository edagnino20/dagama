package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Cine;
import com.dagama.cine.repositorio.CineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CineNegocioService {
    @Autowired
    private CineRepositorio cineRepositorio;

    public Cine registrar(Cine cine) { return cineRepositorio.save(cine); }

    public List<Cine> obtenerCine(){
        List<Cine> listado = (List<Cine>)cineRepositorio.obtenerReporteCine();
        Cine cine = new Cine();
        for(Cine rep:listado){
            cine.setIdcine(rep.getIdcine());
            cine.setNombre_cine(rep.getNombre_cine());
            cine.setDireccion(rep.getDireccion());
            cine.setRuc(rep.getRuc());
            cine.setEmail(rep.getEmail());
            cine.setTelefono(rep.getTelefono());
            cine.setEstado(rep.getEstado());
        }
        return listado;
    }

    public Cine obtenerCinexId(String idcine){
        Cine cine;
        cine = cineRepositorio.buscarCine(Long.parseLong(idcine));
        return cine;
    }
}
