package com.dagama.cine.negocio;

import com.dagama.cine.entidades.Banco;
import com.dagama.cine.repositorio.BancoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoNegocioService {
    @Autowired
    private BancoRepositorio bancoRepositorio;

    public Banco registrar(Banco banco){ return bancoRepositorio.save(banco);}

    public List<Banco> obtenerBanco(){
        List<Banco> listado = (List<Banco>)bancoRepositorio.obtenerReporteBanco();
        Banco banco = new Banco();
        for(Banco rep:listado){
            banco.setIdbanco(rep.getIdbanco());
            banco.setNombre_banco(rep.getNombre_banco());
            banco.setEstado(rep.getEstado());
        }
        return listado;
    }
}
