package com.example.ProyectoVuelosOsorio.controllers;

import com.example.ProyectoVuelosOsorio.entities.Reserva;
import com.example.ProyectoVuelosOsorio.services.ReservaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/reserva")
public class ReservaController extends BaseControllerImpl<Reserva, ReservaServiceImpl> {

    @PostMapping("/save")
    public ResponseEntity<?> saveReserva(@RequestBody Reserva reserva) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.saveReserva(reserva));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }
}
