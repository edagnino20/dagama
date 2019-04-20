package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.PromocionBanco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionBancoRepositorio extends CrudRepository<PromocionBanco, Long> {
    @Query("SELECT a FROM PromocionBanco a WHERE a.idpromocionbanco=:idpromocionbanco")
    public PromocionBanco buscarPromocionBanco(@Param("idpromocionbanco") Long idpromocionbanco);

    @Query("SELECT new com.dagama.cine.entidades.PromocionBanco (a.idpromocionbanco, a.idpromocion, a.idbanco, " +
            "a.porcentaje_descuento, a.estado ) FROM PromocionBanco a where a.idpromocion=:idpromocion")
    public Iterable<PromocionBanco> obtenerReportePromocionBanco(@Param("idpromocion") Long idpromocion);
}
