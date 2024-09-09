package com.bike.bike_filter.marca.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bike.bike_filter.marca.domain.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

}
