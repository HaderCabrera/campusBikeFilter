package com.bike.bike_filter.modelo.infraestructure.repository;

import com.bike.bike_filter.modelo.domain.entity.Modelo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long>{
    
} 
