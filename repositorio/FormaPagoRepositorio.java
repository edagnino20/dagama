package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Forma_Pago;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FormaPagoRepositorio extends CrudRepository<Forma_Pago, Long> {
    @Query("SELECT a FROM Forma_Pago a WHERE a.idformapago=:idformapago")
    public Forma_Pago buscarFormaPago(@Param("idformapago") Long idformapago);

    @Query("SELECT new com.dagama.cine.entidades.Forma_Pago(a.idformapago, a.nombre_forma_pago, a.estado ) FROM Forma_Pago a")
    public Iterable<Forma_Pago> obtenerReporteFormaPago();
}
