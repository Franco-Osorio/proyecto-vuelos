package com.example.ProyectoVuelosOsorio.controllers;

import com.example.ProyectoVuelosOsorio.entities.Consulta;
import com.example.ProyectoVuelosOsorio.services.ConsultaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/consulta")
public class ConsultaController extends BaseControllerImpl<Consulta, ConsultaServiceImpl> {
}
