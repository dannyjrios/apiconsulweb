package com.example.consulweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consulweb.models.peticiones.UsuarioCrearRequestModel;
import com.example.consulweb.models.respuestas.UsuarioDataRestModel;
import com.example.consulweb.services.IUsuarioService;
import com.example.consulweb.shared.UsuarioDto;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


        @Autowired
        ModelMapper modelMapper;

        @Autowired
        IUsuarioService iUsuarioService;
       
        @GetMapping
        public UsuarioDataRestModel leerUsuario(){

            String username="dannyr";
 
            UsuarioDto usuarioDto=iUsuarioService.leerUsuario(username);

            UsuarioDataRestModel usuarioDataRestModel=modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

            return usuarioDataRestModel;
        }
    
        @PostMapping
        public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){
            
            //mapeando informacion
            UsuarioDto usuarioCreaDto=modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);
            
            UsuarioDto usuarioDto=iUsuarioService.crearUsuario(usuarioCreaDto);

            UsuarioDataRestModel usuarioDataRestModel=modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

            return usuarioDataRestModel;
        }
    
    
    }

