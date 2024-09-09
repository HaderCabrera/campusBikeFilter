package com.bike.bike_filter.bicicleta.domain.entity;


import com.bike.bike_filter.marca.domain.entity.Marca;
import com.bike.bike_filter.modelo.domain.entity.Modelo;


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
@Table(name = "bicicletas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo", nullable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca", nullable = false)
    private Marca marca;

    private float precio;
    private Integer stock;
}
