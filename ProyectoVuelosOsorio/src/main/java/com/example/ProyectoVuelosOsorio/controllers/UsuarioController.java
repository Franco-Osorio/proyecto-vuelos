package com.example.ProyectoVuelosOsorio.controllers;

import com.example.ProyectoVuelosOsorio.entities.Usuario;
import com.example.ProyectoVuelosOsorio.services.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

}
