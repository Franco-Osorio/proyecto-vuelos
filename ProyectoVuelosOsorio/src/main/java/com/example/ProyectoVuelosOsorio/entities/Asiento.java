package com.example.ProyectoVuelosOsorio.entities;

import com.example.ProyectoVuelosOsorio.enums.Clase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@DiscriminatorValue("asiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Asiento extends Base{

    @Column(name = "fila_asiento")
    private int filaAsiento;

    @Column(name = "letra_asiento")
    private char letraAsiento;

    @Enumerated(EnumType.STRING)
    private Clase claseAsiento;

    //Falta Relacion con Vuelo

}
