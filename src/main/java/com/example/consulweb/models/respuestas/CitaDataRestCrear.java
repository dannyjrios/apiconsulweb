package com.example.consulweb.models.respuestas;

import java.util.Date;

public class CitaDataRestCrear {
    private String idCita;
    private Date fecha;
    private String observacion;
    private Date creado;
    private boolean realizada;
    private UsuarioDataResCrear usuarioEntity;
    private MedicoDataRest medicoEntity;


    public String getIdCita() {
        return this.idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public boolean isRealizada() {
        return this.realizada;
    }

    public boolean getRealizada() {
        return this.realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public UsuarioDataResCrear getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioDataResCrear usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public MedicoDataRest getMedicoEntity() {
        return this.medicoEntity;
    }

    public void setMedicoEntity(MedicoDataRest medicoEntity) {
        this.medicoEntity = medicoEntity;
    }

}
