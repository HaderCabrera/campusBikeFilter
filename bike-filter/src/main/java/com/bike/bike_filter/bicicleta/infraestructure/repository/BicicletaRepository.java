package com.bike.bike_filter.bicicleta.infraestructure.repository;

import com.bike.bike_filter.bicicleta.domain.entity.Bicicleta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Long>{
    
}

