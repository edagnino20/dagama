package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.ConsultaResumen;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConsultaResumenRepositorio extends CrudRepository<ConsultaResumen, Long> {
    @Query(value="call ConsultaPromocionCantidad(:idcine)", nativeQuery = true)
    public Iterable<ConsultaResumen> ConsultaResumen(
            @Param("idcine") int idcine);
}
