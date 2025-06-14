package com.example.ProyectoVuelosOsorio.services;

import com.example.ProyectoVuelosOsorio.entities.Asiento;
import com.example.ProyectoVuelosOsorio.entities.Reserva;
import com.example.ProyectoVuelosOsorio.entities.Vuelo;
import com.example.ProyectoVuelosOsorio.repositories.AsientoRepository;
import com.example.ProyectoVuelosOsorio.repositories.BaseRepository;
import com.example.ProyectoVuelosOsorio.repositories.ReservaRepository;
import com.example.ProyectoVuelosOsorio.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl extends BaseServiceImpl<Reserva, Long> implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private AsientoRepository asientoRepository;

    public ReservaServiceImpl(BaseRepository<Reserva, Long> baseRepository) {
        super(baseRepository);
    }

    public Reserva saveReserva(Reserva reserva) {
        if (reserva.getVuelo() != null && reserva.getVuelo().getId() != null) {
            Vuelo vuelo = vueloRepository.findById(reserva.getVuelo().getId())
                    .orElseThrow(() -> new RuntimeException("Vuelo no encontrado"));
            reserva.setVuelo(vuelo);
        }
        if (reserva.getAsientoReservado() != null && reserva.getAsientoReservado().getId() != null) {
            Asiento asiento = asientoRepository.findById(reserva.getAsientoReservado().getId())
                    .orElseThrow(() -> new RuntimeException("Asiento no encontrado"));

            // Verificar si ya está reservado
            if (reservaRepository.findByAsientoReservado(asiento).isPresent()) {
                throw new RuntimeException("El asiento ya ha sido reservado.");
            }

            reserva.setAsientoReservado(asiento);
        }
        return reservaRepository.save(reserva);
    }
}
