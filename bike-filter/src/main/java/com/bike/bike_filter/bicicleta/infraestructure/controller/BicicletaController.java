package com.bike.bike_filter.bicicleta.infraestructure.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bike.bike_filter.bicicleta.domain.entity.BicicleteDTO;
import com.bike.bike_filter.bicicleta.domain.entity.Bicicleta;
import com.bike.bike_filter.bicicleta.domain.service.IBicicleta;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BicicletaController {
    @Autowired 
    IBicicleta iBicicleta;

    @PostMapping("/bicicleta")
    public Bicicleta crearBicicleta(@RequestBody BicicleteDTO bicicleteDTO) {
        
        return iBicicleta.crearBicicleta(bicicleteDTO);
    }

    @GetMapping("/bicicleta")
    public List<Bicicleta> listarBicicleta() {
        return iBicicleta.listarBicicleta();
    }  

    @GetMapping("/bicicleta/{id}")
    public Optional<Bicicleta> listarBicicleta(@RequestParam Long id) {
        return iBicicleta.buscarBicicletaPorId(id);
    }  

    @DeleteMapping("/bicicleta/re/{id}")
    @ResponseBody
    public void borrarBicicleta(@PathVariable Long id) {   
        iBicicleta.eliminarBicicleta(id);
    }

}
