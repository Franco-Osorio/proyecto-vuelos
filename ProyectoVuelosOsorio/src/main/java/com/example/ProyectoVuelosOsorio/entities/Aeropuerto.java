package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "aeropuerto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Aeropuerto extends Base{

    @Column(name = "nombre_aeropuerto")
    private String nombreAeropuerto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ciudad")
    private Ciudad ciudad;
}
