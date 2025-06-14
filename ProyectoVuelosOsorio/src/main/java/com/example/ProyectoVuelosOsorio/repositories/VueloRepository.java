package com.example.ProyectoVuelosOsorio.repositories;

import com.example.ProyectoVuelosOsorio.entities.Vuelo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepository extends BaseRepository<Vuelo, Long> {

    Vuelo findByNumeroVuelo(int numero);

    List<Vuelo> findByAerolineaNombreAerolinea(String nombre);

    boolean existsByNumeroVuelo(int numero);

    @Query(
            value = "SELECT * FROM vuelo WHERE vuelo.numeroVuelo LIKE %:filtro%",
            nativeQuery = true
    )
    List<Vuelo> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM vuelo WHERE vuelo.numeroVuelo LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM vuelo",
            nativeQuery = true
    )
    Page<Vuelo> searchNativo(@Param("filtro") String filtro, Pageable pageable);

}
