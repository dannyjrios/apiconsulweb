package com.example.consulweb.models.peticiones;

import java.util.Date;

public class CitaCrear {
    
    private Date fecha;
    private String nombreMedico;

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreMedico() {
        return this.nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

}
