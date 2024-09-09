package com.bike.bike_filter.bicicleta.domain.service;

import java.util.List;
import java.util.Optional;

import com.bike.bike_filter.bicicleta.domain.entity.BicicleteDTO;
import com.bike.bike_filter.bicicleta.domain.entity.Bicicleta;

public interface IBicicleta {
    Bicicleta crearBicicleta(BicicleteDTO bicicleteDTO);
    List<Bicicleta> listarBicicleta();
    Optional<Bicicleta> buscarBicicletaPorId(Long id);
    Bicicleta modificarBicicletaPorId(Bicicleta bicicleta);
    void eliminarBicicleta(Long id);
}
