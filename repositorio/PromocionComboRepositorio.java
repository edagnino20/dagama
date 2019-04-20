package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.PromocionCombo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionComboRepositorio extends CrudRepository<PromocionCombo, Long> {
    @Query("SELECT a FROM PromocionCombo a WHERE a.idpromocioncombo=:idpromocioncombo")
    public PromocionCombo buscarPromocionCombo(@Param("idpromocioncombo") Long idpromocioncombo);

    @Query("SELECT new com.dagama.cine.entidades.PromocionCombo (a.idpromocioncombo, a.idpromocion, a.idcombo, " +
            "a.fecha_registro, a.precio_combo,  a.estado ) FROM PromocionCombo a where a.idpromocion=:idpromocion")
    public Iterable<PromocionCombo> obtenerReportePromocionCombo(@Param("idpromocion") Long idpromocion);
}
