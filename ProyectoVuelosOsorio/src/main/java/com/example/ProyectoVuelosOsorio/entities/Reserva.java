package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Reserva extends Base{
    //numeroReserva comentado porque es como un id
//    @Column(name = "numero_reserva")
//    private int numeroReserva;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pago")
    private Pago pago;

    @ManyToOne
    @JoinColumn(name = "fk_vuelo")
    private Vuelo vuelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_asiento")
    private Asiento asientoReservado;

}
