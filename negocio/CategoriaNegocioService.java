package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Categoria;
import com.dagama.cine.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaNegocioService {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public Categoria registrar(Categoria categoria){ return categoriaRepositorio.save(categoria);}

    public List<Categoria> obtenerCategoria(){
        List<Categoria> listado = (List<Categoria>)categoriaRepositorio.obtenerReporteCategoria();
        Categoria categoria = new Categoria();
        for(Categoria rep:listado){
            categoria.setIdcategoria(rep.getIdcategoria());
            categoria.setNombre_categoria(rep.getNombre_categoria());
        }
        return listado;
    }
}
