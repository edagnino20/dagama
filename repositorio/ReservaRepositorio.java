package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReservaRepositorio extends CrudRepository<Reserva, Long> {
    @Query("SELECT a FROM Reserva a WHERE a.idreserva=:idreserva")
    public Reserva buscarReserva(@Param("idreserva") Long idreserva);

    @Query("SELECT new com.dagama.cine.entidades.Reserva (a.idreserva, a.idempresa, a.fecha, a.idformapago, a.titular_tarjeta, a.numero_tarjeta, a.vencimiento_tarjeta, a.precio_promocion, a.precio_combo, a.precio_total, a.estado ) FROM Reserva a")
    public Iterable<Reserva> obtenerReporteReserva();
}
