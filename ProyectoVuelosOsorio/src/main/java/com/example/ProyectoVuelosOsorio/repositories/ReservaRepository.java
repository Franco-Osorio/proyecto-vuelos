package com.example.ProyectoVuelosOsorio.repositories;

import com.example.ProyectoVuelosOsorio.entities.Asiento;
import com.example.ProyectoVuelosOsorio.entities.Reserva;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservaRepository extends BaseRepository<Reserva, Long> {

    Optional<Reserva> findByAsientoReservado(Asiento asientoReservado);

}
