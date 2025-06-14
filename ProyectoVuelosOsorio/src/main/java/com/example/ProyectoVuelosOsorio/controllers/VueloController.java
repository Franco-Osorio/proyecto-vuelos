package com.example.ProyectoVuelosOsorio.controllers;

import com.example.ProyectoVuelosOsorio.entities.Vuelo;
import com.example.ProyectoVuelosOsorio.services.VueloServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/vuelo")
public class VueloController extends BaseControllerImpl<Vuelo, VueloServiceImpl> {

    @GetMapping("/buscar")
    public ResponseEntity<?> getOneByNumero(@RequestParam int numero){
        try {
            Vuelo vuelo = servicio.buscarPorNumero(numero);
            if (vuelo == null) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            return ResponseEntity.ok(vuelo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

}
