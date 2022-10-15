package com.example.consulweb.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.consulweb.data.entidades.UsuarioEntity;
import com.example.consulweb.data.repositorios.IUsuarioReposity;
import com.example.consulweb.shared.UsuarioDto;


@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioReposity iUsuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto) {
        
        if (iUsuarioRepository.findByEmail(usuarioCrearDto.getEmail()) != null){
            throw new RuntimeException("Este correo ya se encuentra registrado");

        }

        if (iUsuarioRepository.findByUsername(usuarioCrearDto.getUsername()) != null){
            throw new RuntimeException("Este nombre ya está en uso");

        }
        
        //mapear a una entidad

        UsuarioEntity usuarioEntityDto=modelMapper.map(usuarioCrearDto, UsuarioEntity.class);
        usuarioEntityDto.setIdUsuario(UUID.randomUUID().toString());
        usuarioEntityDto.setPasswordEncriptada(bCryptPasswordEncoder.encode(usuarioCrearDto.getPassword()));

        UsuarioEntity usuarioEntity =  iUsuarioRepository.save(usuarioEntityDto);
        UsuarioDto usuarioDto= modelMapper.map(usuarioEntity, UsuarioDto.class);

        return usuarioDto;
    }

    @Override
    public UsuarioDto leerUsuario(String username) {
        
        //obteniendo la info de la bd

        UsuarioEntity  usuarioEntity=iUsuarioRepository.findByUsername(username);
        
        if (usuarioEntity==null){
            throw new UsernameNotFoundException(username);
        }

        UsuarioDto usuarioDto=modelMapper.map(usuarioEntity, UsuarioDto.class);


        return usuarioDto;
    }
    
}
