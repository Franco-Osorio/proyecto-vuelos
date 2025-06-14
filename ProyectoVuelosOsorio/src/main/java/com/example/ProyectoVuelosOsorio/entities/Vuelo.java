package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vuelo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Vuelo extends Base{

    @Column(name = "numero_vuelo")
    private int numeroVuelo;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_avion")
    private Avion avion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "vuelo_aeropuerto",
            joinColumns = @JoinColumn(name = "vuelo_id"),
            inverseJoinColumns = @JoinColumn(name = "aeropuerto_id")
    )
    private List<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_aerolinea")
    private Aerolinea aerolinea;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "vuelo_tarifa",
            joinColumns = @JoinColumn(name = "vuelo_id"),
            inverseJoinColumns = @JoinColumn(name = "tarifa_id")
    )
    private List<Tarifa> tarifas = new ArrayList<Tarifa>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_piloto")
    private Piloto piloto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_fecha")
    private Fecha fechaSalida;

}
