package com.example.consulweb.data.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "medico")
public class MedicoEntity implements Serializable {

    public static final long serialVersionUID=11;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false , length = 20)
    private String nombreMedico;


    @OneToMany (cascade = CascadeType.ALL, mappedBy = "MedicoEntity")
    private List<CitaEntity> citaEntityMedicoList = new ArrayList<>();
    

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

    public List<CitaEntity> getCitaEntityMedicoList() {
        return this.citaEntityMedicoList;
    }

    public void setCitaEntityMedicoList(List<CitaEntity> citaEntityMedicoList) {
        this.citaEntityMedicoList = citaEntityMedicoList;
    }

}
