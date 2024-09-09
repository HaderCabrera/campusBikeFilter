package com.bike.bike_filter.bicicleta.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BicicleteDTO {
    private float precio;
    private Integer stock;
    private Long id;
    private Long marca;
    private Long modelo;

}
