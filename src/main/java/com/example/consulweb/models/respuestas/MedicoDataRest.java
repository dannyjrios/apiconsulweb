package com.example.consulweb.models.respuestas;

public class MedicoDataRest {
    private long id;
    private String nombreMedico;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreMedico() {
        return this.nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

}
