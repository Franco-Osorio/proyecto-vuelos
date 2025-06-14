package com.example.ProyectoVuelosOsorio.controllers;

import com.example.ProyectoVuelosOsorio.entities.Piloto;
import com.example.ProyectoVuelosOsorio.services.PilotoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/piloto")
public class PilotoController extends BaseControllerImpl<Piloto, PilotoServiceImpl> {
}
