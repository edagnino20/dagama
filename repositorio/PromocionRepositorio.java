package com.dagama.cine.repositorio;

import com.dagama.cine.entidades.Promocion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PromocionRepositorio extends CrudRepository<Promocion, Long> {
    @Query("SELECT a FROM Promocion a WHERE a.idpromocion=:idpromocion")
    public Promocion buscarPromocion(@Param("idpromocion") Long idpromocion);

    @Query("SELECT new com.dagama.cine.entidades.Promocion (a.idpromocion, a.nombre_promocion, a.idcine) FROM Promocion a WHERE a.idcine=:idcine")
    public Iterable<Promocion> obtenerReportePromocionxCine(@Param("idcine") Long idcine);

    @Query("SELECT new com.dagama.cine.entidades.Promocion (a.idpromocion, a.idcine, a.nombre_promocion, a.fecharegistro, a.fecha_inicio, a.fecha_final, a.precio, a.estado ) FROM Promocion a")
    public Iterable<Promocion> obtenerReportePromocion();
}
