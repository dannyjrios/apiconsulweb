package com.example.consulweb.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consulweb.data.entidades.CitaEntity;
import com.example.consulweb.data.entidades.MedicoEntity;
import com.example.consulweb.data.entidades.UsuarioEntity;
import com.example.consulweb.data.repositorios.ICitaRepository;
import com.example.consulweb.data.repositorios.IMedicoRepository;
import com.example.consulweb.data.repositorios.IUsuarioReposity;
import com.example.consulweb.shared.CitaDto;

@Service
public class CitaService implements ICitaService {

    @Autowired
    ModelMapper modelMapper;


    @Autowired
    IUsuarioReposity iUsuarioReposity;

    @Autowired
    IMedicoRepository iMedicoRepository;

    @Autowired
    ICitaRepository iCitaRepository;


    @Override
    public CitaDto crearCita(CitaDto citaCrearDto) {

        UsuarioEntity usuarioEntity= iUsuarioReposity.findByUsername(citaCrearDto.getUsername());
        MedicoEntity medicoEntity= iMedicoRepository.findById(citaCrearDto.getNombreMedico());

        CitaEntity citaEntity = new CitaEntity();
        citaEntity.setIdCita(UUID.randomUUID().toString());
        citaEntity.setFecha(citaCrearDto.getFecha());
        citaEntity.setObservacion("Sin observacion");
        citaEntity.setUsuarioEntity(usuarioEntity);
        citaEntity.setMedicoEntity(medicoEntity);

        CitaEntity citaEntityCreado = iCitaRepository.save(citaEntity);

        CitaDto citaDto = modelMapper.map(citaEntityCreado, CitaDto.class);
        
        return citaDto;
    }
    
}
