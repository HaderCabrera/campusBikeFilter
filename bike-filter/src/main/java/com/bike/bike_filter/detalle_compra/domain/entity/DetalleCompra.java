package com.bike.bike_filter.detalle_compra.domain.entity;

import com.bike.bike_filter.compra.domain.entity.Compra;
import com.bike.bike_filter.repuesto.domain.entity.Repuesto;

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
@Table(name = "detalles_compras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "compra_id", nullable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "repuesto_id", nullable = false)
    private Repuesto repuesto;

    Integer cantidad;
    float precio_unitario;
}
