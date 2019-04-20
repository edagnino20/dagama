package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Banco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BancoRepositorio extends CrudRepository<Banco, Long> {
    @Query("SELECT a FROM Banco a WHERE a.idbanco=:idbanco")
    public Banco buscarBanco(@Param("idbanco") Long idbanco);

    @Query("SELECT new com.dagama.cine.entidades.Banco(a.idbanco, a.nombre_banco, a.estado ) FROM Banco a")
    public Iterable<Banco> obtenerReporteBanco();
}
