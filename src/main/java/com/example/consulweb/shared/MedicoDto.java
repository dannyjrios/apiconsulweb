package com.example.consulweb.shared;

import java.util.ArrayList;
import java.util.List;


public class MedicoDto {
    
    private long id;
    private String nombreMedico;
    private List<CitaDto> citaDtoMedicoList = new ArrayList<>();


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

    public List<CitaDto> getCitaDtoMedicoList() {
        return this.citaDtoMedicoList;
    }

    public void setCitaDtoMedicoList(List<CitaDto> citaDtoMedicoList) {
        this.citaDtoMedicoList = citaDtoMedicoList;
    }

}
