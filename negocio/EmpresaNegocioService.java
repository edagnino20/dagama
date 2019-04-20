package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Empresa;
import com.dagama.cine.repositorio.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaNegocioService {
    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    public Empresa registrar(Empresa empresa) { return empresaRepositorio.save(empresa); }

    public List<Empresa> obtenerEmpresa(){
        List<Empresa> listado = (List<Empresa>)empresaRepositorio.obtenerReporteEmpresa();
        Empresa empresa = new Empresa();
        for(Empresa rep:listado){
            empresa.setIdempresa(rep.getIdempresa());
            empresa.setNombre_empresa(rep.getNombre_empresa());
            empresa.setDireccion(rep.getDireccion());
            empresa.setRuc(rep.getRuc());
            empresa.setEmail(rep.getEmail());
            empresa.setTelefono(rep.getTelefono());
            empresa.setIdrubro(rep.getIdrubro());
            empresa.setEstado(rep.getEstado());
        }
        return listado;
    }

    public Empresa obtenerEmpresaxId(String idempresa){
        Empresa empresa;
        empresa = empresaRepositorio.buscarEmpresa(Long.parseLong(idempresa));
        return empresa;
    }
}