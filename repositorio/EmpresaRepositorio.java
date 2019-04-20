package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmpresaRepositorio extends CrudRepository<Empresa, Long> {
    @Query("SELECT a FROM Empresa a WHERE a.idempresa=:idempresa")
    public Empresa buscarEmpresa(@Param("idempresa") Long idempresa);

    @Query("SELECT new com.dagama.cine.entidades.Empresa(a.idempresa, a.nombre_empresa, a.direccion, a.ruc, a.email, a.telefono, a.idrubro, a.estado ) FROM Empresa a")
    public Iterable<Empresa> obtenerReporteEmpresa();
}
