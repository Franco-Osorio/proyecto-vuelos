package com.example.ProyectoVuelosOsorio.services;

import com.example.ProyectoVuelosOsorio.entities.Vuelo;
import com.example.ProyectoVuelosOsorio.repositories.BaseRepository;
import com.example.ProyectoVuelosOsorio.repositories.VueloRepository;
import org.hibernate.envers.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImpl extends BaseServiceImpl<Vuelo, Long> implements VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public VueloServiceImpl(BaseRepository<Vuelo, Long> baseRepository) {
        super(baseRepository);
    }

    public Vuelo buscarPorNumero(int numero) throws Exception{
        try {
            Vuelo vuelo = vueloRepository.findByNumeroVuelo(numero);
            return vuelo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
