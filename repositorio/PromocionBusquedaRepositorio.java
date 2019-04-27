package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.PromocionBusqueda;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionBusquedaRepositorio extends CrudRepository<PromocionBusqueda, Long> {
    @Query(value="call BuscarPromocion(:idempresa, :idbanco, :numpersonas)", nativeQuery = true)
    public Iterable<PromocionBusqueda> BuscarPromocion(
            @Param("idempresa") int idempresa,
            @Param("idbanco") int idbanco,
            @Param("numpersonas") int numpersonas);
}
