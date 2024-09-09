package com.bike.bike_filter.bicicleta.application;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bike.bike_filter.bicicleta.domain.entity.Bicicleta;
import com.bike.bike_filter.bicicleta.domain.entity.BicicleteDTO;
import com.bike.bike_filter.bicicleta.domain.service.IBicicleta;
import com.bike.bike_filter.bicicleta.infraestructure.repository.BicicletaRepository;
import com.bike.bike_filter.marca.infraestructure.repository.MarcaRepository;
import com.bike.bike_filter.modelo.infraestructure.repository.ModeloRepository;
import com.bike.bike_filter.modelo.domain.entity.Modelo;
import com.bike.bike_filter.marca.domain.entity.Marca;

import org.springframework.stereotype.Service;

@Service
public class BicicletaServiceImpl implements IBicicleta{   

    @Autowired 
    BicicletaRepository bicicletaRepository;
  
    @Autowired 
    ModeloRepository modeloRepository;

    @Autowired 
    MarcaRepository marcaRepository;

    public List<Bicicleta> listarBicicleta(){
        return bicicletaRepository.findAll();
    }
    
    public Optional<Bicicleta> buscarBicicletaPorId(Long id){
        return bicicletaRepository.findById(id);
    }
    public Bicicleta modificarBicicletaPorId(Bicicleta bicicleta){
        return bicicletaRepository.save(bicicleta);
    }

    public void eliminarBicicleta(Long id){
        bicicletaRepository.deleteById(id);
    }

    @Override
    public Bicicleta crearBicicleta(BicicleteDTO bicicleteDTO) {
        Optional<Modelo> modelo = modeloRepository.findById(bicicleteDTO.getModelo());
        Optional<Marca> marca = marcaRepository.findById(bicicleteDTO.getMarca());
        
        Bicicleta bicicleta = new Bicicleta(bicicleteDTO.getId(),modelo.get(), marca.get(), bicicleteDTO.getPrecio(), bicicleteDTO.getStock());
        return bicicleta;
    }

}
