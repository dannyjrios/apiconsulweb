package com.example.consulweb.services;

import com.example.consulweb.shared.UsuarioDto;

public interface IUsuarioService {
    

    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto);
    public UsuarioDto leerUsuario(String username);
    

}
