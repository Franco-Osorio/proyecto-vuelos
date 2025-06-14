package com.example.ProyectoVuelosOsorio.config;

import com.example.ProyectoVuelosOsorio.entities.*;
import com.example.ProyectoVuelosOsorio.enums.Clase;
import com.example.ProyectoVuelosOsorio.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Esta clase se usa para ingresar datos a la base de datos al momento de la ejecución

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private VueloRepository vueloRepository;

    public DataLoader(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (!vueloRepository.existsByNumeroVuelo(101) ||
                !vueloRepository.existsByNumeroVuelo(102)) {
            //PRIMER INGRESO DE DATOS
            Ciudad ciu1 = new Ciudad("Buenos Aires");
            Ciudad ciu2 = new Ciudad("Madrid");

            Aeropuerto ap1 = new Aeropuerto("Aeropuerto de Buenos Aires", ciu1);
            Aeropuerto ap2 = new Aeropuerto("Aeropuerto de Madrid", ciu2);
            List<Aeropuerto> aeropuertos1 = new ArrayList<>();
            aeropuertos1.add(ap1);
            aeropuertos1.add(ap2);

            Aerolinea al1 = new Aerolinea("Qatar Airlines");

            Tarifa tar1 = new Tarifa(1, 10, 5000, Clase.ECONOMY);
            Tarifa tar2 = new Tarifa(2, 15, 7500, Clase.TURISTA);
            List<Tarifa> tarifas1 = new ArrayList<>();
            tarifas1.add(tar1);
            tarifas1.add(tar2);

            Asiento as1 = new Asiento(5, 'A', Clase.ECONOMY);
            Asiento as2 = new Asiento(10, 'D', Clase.BUSSINESS);
            Asiento as3 = new Asiento(21, 'C', Clase.TURISTA);
            List<Asiento> asientos1 = new ArrayList<>();
            asientos1.add(as1);
            asientos1.add(as2);
            asientos1.add(as3);

            Avion av1 = new Avion(1, asientos1);

            LocalDate localDate = LocalDate.parse("2025-07-10");
            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Fecha fecha1 = new Fecha(fecha);

            Piloto pi1 = new Piloto();
            pi1.setDniPersona(14556672);
            pi1.setNombre("Antonio");
            pi1.setApellido("Castro");
            pi1.setNumPiloto(1);

            Vuelo vu1 = new Vuelo(101, av1, aeropuertos1, al1, tarifas1, pi1, fecha1);

            //SEGUNDO INGRESO DE DATOS

            Ciudad ciu3 = new Ciudad("Mendoza");
            Ciudad ciu4 = new Ciudad("Santiago de Chile");

            Aeropuerto ap3 = new Aeropuerto("Aeropuerto de Mendoza", ciu3);
            Aeropuerto ap4 = new Aeropuerto("Aeropuerto de Santiago", ciu4);
            List<Aeropuerto> aeropuertos2 = new ArrayList<>();
            aeropuertos2.add(ap3);
            aeropuertos2.add(ap4);

            Aerolinea al2 = new Aerolinea("Aerolineas Argentinas");

            Tarifa tar3 = new Tarifa(3, 10, 5000, Clase.ECONOMY);
            Tarifa tar4 = new Tarifa(5, 15, 7500, Clase.TURISTA);
            List<Tarifa> tarifas2 = new ArrayList<>();
            tarifas2.add(tar3);
            tarifas2.add(tar4);

            Asiento as4 = new Asiento(7, 'A', Clase.ECONOMY);
            Asiento as5 = new Asiento(11, 'D', Clase.BUSSINESS);
            Asiento as6 = new Asiento(11, 'C', Clase.BUSSINESS);
            List<Asiento> asientos2 = new ArrayList<>();
            asientos2.add(as4);
            asientos2.add(as5);
            asientos2.add(as6);

            Avion av2 = new Avion(2, asientos2);

            LocalDate localDate1 = LocalDate.parse("2025-07-22");
            Date fecha2 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Fecha fecha3 = new Fecha(fecha2);

            Piloto pi2 = new Piloto();
            pi2.setDniPersona(2156622);
            pi2.setNombre("Fernando");
            pi2.setApellido("Molina");
            pi2.setNumPiloto(2);

            Vuelo vu2 = new Vuelo(102, av2, aeropuertos2, al2, tarifas2, pi2, fecha3);

            //TERCER INGRESO DE DATOS

            Ciudad ciu5 = new Ciudad("Brasilia");
            Ciudad ciu6 = new Ciudad("Tokio");

            Aeropuerto ap5 = new Aeropuerto("Aeropuerto de Brasilia", ciu5);
            Aeropuerto ap6 = new Aeropuerto("Aeropuerto de Tokio", ciu6);
            List<Aeropuerto> aeropuertos3 = new ArrayList<>();
            aeropuertos3.add(ap5);
            aeropuertos3.add(ap6);

            Aerolinea al3 = new Aerolinea("Alas Airlines");

            Tarifa tar5 = new Tarifa(5, 21, 10000, Clase.ECONOMY);
            Tarifa tar6 = new Tarifa(6, 17, 8500, Clase.TURISTA);
            List<Tarifa> tarifas3 = new ArrayList<>();
            tarifas3.add(tar5);
            tarifas3.add(tar6);

            Asiento as7 = new Asiento(29, 'B', Clase.ECONOMY);
            Asiento as8 = new Asiento(15, 'E', Clase.BUSSINESS);
            Asiento as9 = new Asiento(3, 'C', Clase.TURISTA);
            List<Asiento> asientos3 = new ArrayList<>();
            asientos3.add(as7);
            asientos3.add(as8);
            asientos3.add(as9);

            Avion av3 = new Avion(3, asientos3);

            LocalDate localDate2 = LocalDate.parse("2025-07-31");
            Date fecha4 = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            Fecha fecha5 = new Fecha(fecha4);

            Piloto pi3 = new Piloto();
            pi3.setDniPersona(20765833);
            pi3.setNombre("Andrea");
            pi3.setApellido("Morales");
            pi3.setNumPiloto(3);

            Vuelo vu3 = new Vuelo(103, av3, aeropuertos3, al3, tarifas3, pi3, fecha5);

            vueloRepository.save(vu1);
            vueloRepository.save(vu2);
            vueloRepository.save(vu3);
        }
    }
}
