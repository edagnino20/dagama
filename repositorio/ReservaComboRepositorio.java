package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.ReservaCombo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.NotBlank;

public interface ReservaComboRepositorio extends CrudRepository<ReservaCombo, Long> {
    @Query("SELECT a FROM ReservaCombo a WHERE a.idreservacombo=:idreservacombo")
    public ReservaCombo buscarReservaCombo(@Param("idreservacombo") Long idreservacombo);

    @Query("SELECT new com.dagama.cine.entidades.ReservaCombo (a.idreservacombo, a.idreserva, a.idpromocioncombo ) FROM ReservaCombo a")
    public Iterable<ReservaCombo> obtenerReporteReservaCombo();
}
