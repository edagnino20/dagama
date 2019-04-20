package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Combo;
import com.dagama.cine.repositorio.ComboRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboNegocioService {
    @Autowired
    private ComboRepositorio comboRepositorio;

    public Combo registrar(Combo combo) { return comboRepositorio.save(combo); }

    public List<Combo> obtenerCombo(){
        List<Combo> listado = (List<Combo>)comboRepositorio.obtenerReporteCombo();
        Combo combo = new Combo();
        for(Combo rep:listado){
            combo.setIdcombo(rep.getIdcombo());
            combo.setNombre_combo(rep.getNombre_combo());
            combo.setEstado(rep.getEstado());
        }
        return listado;
    }
}
