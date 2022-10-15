package com.example.consulweb.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDto implements Serializable{
    //usuario intermediario entre la vista, el proceso y bd mapeado antes de enviar a la bd

    private static final long serialVersionUID=1L;

    private long id;
    private String idUsuario;
    private String nombre;
    private String email;
    private String username;
    private String password;
    private String passwordEncriptada;
    private List<CitaDto> citaDtoMedicoList = new ArrayList<>();


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordEncriptada() {
        return this.passwordEncriptada;
    }

    public void setPasswordEncriptada(String passwordEncriptada) {
        this.passwordEncriptada = passwordEncriptada;
    }

    public List<CitaDto> getCitaDtoMedicoList() {
        return this.citaDtoMedicoList;
    }

    public void setCitaDtoMedicoList(List<CitaDto> citaDtoMedicoList) {
        this.citaDtoMedicoList = citaDtoMedicoList;
    }


}
