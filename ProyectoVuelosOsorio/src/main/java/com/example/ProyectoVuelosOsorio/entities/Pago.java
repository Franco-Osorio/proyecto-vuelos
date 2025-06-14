package com.example.ProyectoVuelosOsorio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "pago")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Pago extends Base{
    //numeroPago comentado porque es como id
//    @Column(name = "numero_pago")
//    private int numeroPago;

    @Column(name = "cantidad_pago")
    private int cantidadPago;
}
