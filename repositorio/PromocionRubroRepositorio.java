package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.PromocionRubro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionRubroRepositorio extends CrudRepository<PromocionRubro, Long> {
    @Query("SELECT a FROM PromocionRubro a WHERE a.idpromociorubro=:idpromociorubro")
    public PromocionRubro buscarPromocionRubro(@Param("idpromociorubro") Long idpromociorubro);

    @Query("SELECT new com.dagama.cine.entidades.PromocionRubro (a.idpromociorubro, a.idpromocion, a.idrubro, " +
            "a.porcentaje_descuento, a.estado ) FROM PromocionRubro a where a.idpromocion=:idpromocion")
    public Iterable<PromocionRubro> obtenerReportePromocionRubro(@Param("idpromocion") Long idpromocion);
}
