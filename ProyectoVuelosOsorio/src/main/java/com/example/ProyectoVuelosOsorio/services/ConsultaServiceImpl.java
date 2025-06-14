package com.example.ProyectoVuelosOsorio.services;

import com.example.ProyectoVuelosOsorio.entities.Consulta;
import com.example.ProyectoVuelosOsorio.repositories.BaseRepository;
import com.example.ProyectoVuelosOsorio.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl extends BaseServiceImpl<Consulta, Long> implements ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public ConsultaServiceImpl(BaseRepository<Consulta, Long> baseRepository) {
        super(baseRepository);
    }
}
