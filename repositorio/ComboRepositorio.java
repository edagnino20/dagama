package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Combo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ComboRepositorio extends CrudRepository<Combo, Long> {
    @Query("SELECT a FROM Combo a WHERE a.idcombo=:idcombo")
    public Combo buscarCombo(@Param("idcombo") Long idcombo);

    @Query("SELECT new com.dagama.cine.entidades.Combo(a.idcombo, a.nombre_combo, a.estado ) FROM Combo a")
    public Iterable<Combo> obtenerReporteCombo();
}
