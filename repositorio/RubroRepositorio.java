package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Rubro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RubroRepositorio extends CrudRepository<Rubro, Long> {
    @Query("SELECT a FROM Rubro a WHERE a.idrubro=:idrubro")
    public Rubro buscarRubro(@Param("idrubro") Long idrubro);

    @Query("SELECT new com.dagama.cine.entidades.Rubro (a.idrubro, a.nombre_rubro, a.estado ) FROM Rubro a")
    public Iterable<Rubro> obtenerReporteRubro();
}
