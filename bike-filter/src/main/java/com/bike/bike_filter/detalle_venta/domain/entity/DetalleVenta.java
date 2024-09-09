package com.bike.bike_filter.detalle_venta.domain.entity;


import com.bike.bike_filter.bicicleta.domain.entity.Bicicleta;
import com.bike.bike_filter.venta.domain.entity.Venta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalles_ventas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;
    private float precio_unitario;

        @ManyToOne
    @JoinColumn(name = "venta_id", nullable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id", nullable = false)
    private Bicicleta bicicleta;

    
    
}
