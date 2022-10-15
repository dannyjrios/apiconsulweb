package com.example.consulweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consulweb.models.peticiones.UsuarioCrear;
import com.example.consulweb.models.respuestas.UsuarioDataResCrear;
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
        public UsuarioDataResCrear leerUsuario(){

            String username="dannyr";
 
            UsuarioDto usuarioDto=iUsuarioService.leerUsuario(username);

            UsuarioDataResCrear usuarioDataResCrear= modelMapper.map(usuarioDto, UsuarioDataResCrear.class);


            return usuarioDataResCrear;

            //UsuarioDataRestModel usuarioDataRestModel=modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

            //return usuarioDataRestModel;
        }
    
        @PostMapping
        public UsuarioDataResCrear crearUsuario(@RequestBody UsuarioCrear usuarioCrear) {
    
            UsuarioDto usuarioCrearDto= modelMapper.map(usuarioCrear, UsuarioDto.class);
    
            UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);
    
            UsuarioDataResCrear usuarioDataResCrear= modelMapper.map(usuarioDto, UsuarioDataResCrear.class);
    
            return usuarioDataResCrear;
        }

       //@PostMapping
        //public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel){
            
            //mapeando informacion
        //    UsuarioDto usuarioCreaDto=modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);
            
         //   UsuarioDto usuarioDto=iUsuarioService.crearUsuario(usuarioCreaDto);

         //   UsuarioDataRestModel usuarioDataRestModel=modelMapper.map(usuarioDto, UsuarioDataRestModel.class);

         //   return usuarioDataRestModel;
        //}
    
    
    }

