package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@DiscriminatorValue("piloto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Piloto extends Persona{

    @Column(name = "numero_piloto")
    private int numPiloto;
}
