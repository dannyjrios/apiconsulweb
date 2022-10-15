package com.example.consulweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consulweb.models.peticiones.CitaCrear;
import com.example.consulweb.models.respuestas.CitaDataRestCrear;
import com.example.consulweb.services.ICitaService;
import com.example.consulweb.shared.CitaDto;

@RestController
@RequestMapping("/cita")
public class CitasController {
    
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ICitaService iCitaService;


    @PostMapping
    public CitaDataRestCrear crearCita(@RequestBody CitaCrear citaCrear){

        String username="DanielS";

        CitaDto citacrearDto= modelMapper.map(citaCrear, CitaDto.class);
        citacrearDto.setUsername(username);

        CitaDto citaDto= iCitaService.crearCita(citacrearDto);

        CitaDataRestCrear citaDataRestCrear = modelMapper.map(citaDto, CitaDataRestCrear.class);

        return citaDataRestCrear;



    }



}
