package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.ReservaEntrada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.NotBlank;

public interface ReservaEntradaRepositorio extends CrudRepository<ReservaEntrada, Long> {
    @Query("SELECT a FROM ReservaEntrada a WHERE a.idreservaentrada=:idreservaentrada")
    public ReservaEntrada buscarReservaEntrada(@Param("idreservaentrada") Long idreservaentrada);

    @Query("SELECT new com.dagama.cine.entidades.ReservaEntrada (a.idreservaentrada, a.idreserva, a.idpromocion, a.cantidadEntrada ) FROM ReservaEntrada a")
    public Iterable<ReservaEntrada> obtenerReporteReservaEntrada();
}
