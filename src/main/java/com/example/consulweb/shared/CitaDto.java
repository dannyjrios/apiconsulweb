package com.example.consulweb.shared;

import java.io.Serializable;
import java.util.Date;

public class CitaDto implements Serializable{

    private static final long serialVersionUID=11;

    private long id;
    private String idCita;
    private String username;
    private Date fecha;
    private long nombreMedico;
    private String observacion;
    private Date creado;
    private UsuarioDto usuarioEntity;
    private MedicoDto medicoEntity;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdCita() {
        return this.idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getNombreMedico() {
        return this.nombreMedico;
    }

    public void setNombreMedico(long nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getCreado() {
        return this.creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public UsuarioDto getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDto usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public MedicoDto getMedicoEntity() {
        return this.medicoEntity;
    }

    public void setMedicoEntity(MedicoDto medicoEntity) {
        this.medicoEntity = medicoEntity;
    }


}
