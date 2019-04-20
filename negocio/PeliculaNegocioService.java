package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Pelicula;
import com.dagama.cine.entidades.ReporteGeneralPelicula;
import com.dagama.cine.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaNegocioService {
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    public Pelicula registrar(Pelicula pelicula) { return peliculaRepositorio.save(pelicula); }

    public List<ReporteGeneralPelicula> obtenerResultadosGenerales(){
        List<ReporteGeneralPelicula> listado = (List<ReporteGeneralPelicula>)peliculaRepositorio.obtenerReporteGeneral();
        ReporteGeneralPelicula pelicula = new ReporteGeneralPelicula();
        for(ReporteGeneralPelicula rep:listado){
            pelicula.setIdcategoria(rep.getIdcategoria());
            pelicula.setNombre_pelicula(rep.getNombre_pelicula());
            pelicula.setFechaestreno(rep.getFechaestreno());
            pelicula.setSinapsis(rep.getSinapsis());
            pelicula.setImage(rep.getImage());
            pelicula.setEstado(rep.getEstado());
        }
        return listado;
    }
}
