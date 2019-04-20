package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.PromocionPersona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionPersonaRepositorio extends CrudRepository<PromocionPersona, Long> {
    @Query("SELECT a FROM PromocionPersona a WHERE a.idpromocionpersona=:idpromocionpersona")
    public PromocionPersona buscarPromocionPersona(@Param("idpromocionpersona") Long idpromocionpersona);

    @Query("SELECT new com.dagama.cine.entidades.PromocionPersona (a.idpromocionpersona, a.idpromocion, a.rango_inicial, " +
            "a.rango_final,  a.porcentaje_descuento, a.estado ) FROM PromocionPersona a WHERE a.idpromocion=:idpromocion")
    public Iterable<PromocionPersona> obtenerReportePromocionPersona(@Param("idpromocion") Long idpromocion);
}
