package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "avion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Avion extends Base{

    @Column(name = "numero_avion")
    private int numeroAvion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "avion_asiento",
            joinColumns = @JoinColumn(name = "avion_id"),
            inverseJoinColumns = @JoinColumn(name = "asiento_id")
    )
    private List<Asiento> asientos;
}
