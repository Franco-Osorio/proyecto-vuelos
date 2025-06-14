package com.example.ProyectoVuelosOsorio.entities;

import com.example.ProyectoVuelosOsorio.enums.TipoTarjeta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "tarjeta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Tarjeta extends Base{

    @Column(name = "numero_tarjeta")
    private int numTarjeta;

    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;

    //Relacion con Usuario
}
