package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.ConsultaReserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConsultaReservaRepositorio extends CrudRepository<ConsultaReserva, Long> {
    @Query(value="call ConsultaPromocionxcine(:idcine)", nativeQuery = true)
    public Iterable<ConsultaReserva> ConsultaReserva(
            @Param("idcine") int idcine);
}
