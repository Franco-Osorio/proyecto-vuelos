package com.example.ProyectoVuelosOsorio.services;

import com.example.ProyectoVuelosOsorio.entities.Piloto;
import com.example.ProyectoVuelosOsorio.repositories.BaseRepository;
import com.example.ProyectoVuelosOsorio.repositories.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoServiceImpl extends BaseServiceImpl<Piloto, Long> implements PilotoService {

    @Autowired
    private PilotoRepository pilotoRepository;

    public PilotoServiceImpl(BaseRepository<Piloto, Long> baseRepository, PilotoRepository pilotoRepository) {
        super(baseRepository);
        this.pilotoRepository = pilotoRepository;
    }

}
