package com.dagama.cine.negocio;

import com.dagama.cine.entidades.ConsultaResumen;
import com.dagama.cine.repositorio.ConsultaResumenRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaResumenNegocioService {
    @Autowired
    private ConsultaResumenRepositorio consultaResumenRepositorio;

    public List<ConsultaResumen> ConsultaResumen(int idcine){
        List<ConsultaResumen> listado = (List<ConsultaResumen>)consultaResumenRepositorio.ConsultaResumen(idcine);
        ConsultaResumen consultaresumen = new ConsultaResumen();
        for(ConsultaResumen rep:listado){
            consultaresumen.setRuc(rep.getRuc());
            consultaresumen.setNombre_empresa(rep.getNombre_empresa());
            consultaresumen.setCantidad(rep.getCantidad());
            consultaresumen.setTotal(rep.getTotal());
        }
        return listado;
    }
}
