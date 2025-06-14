package com.example.ProyectoVuelosOsorio.entities;

import com.example.ProyectoVuelosOsorio.enums.Clase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarifa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Tarifa extends Base{

    @Column(name = "numero_tarifa")
    private int numeroTarifa;

    @Column(name = "impuesto_tarifa")
    private int impuestoTarifa;

    @Column(name = "precio_tarifa")
    private int precioTarifa;

    @Enumerated(EnumType.STRING)
    private Clase claseTarifa;
}
