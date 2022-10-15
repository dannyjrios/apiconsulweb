package com.example.consulweb.data.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "cita")
@EntityListeners(AuditingEntityListener.class)
@Table(indexes = {
    @Index(columnList = "idCita", name = "index_idCita", unique = true)
})
public class CitaEntity implements Serializable{
    
    private static final long serialVersionUID=11;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idCita;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private String observacion;

    @CreatedDate
    private Date creado;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuarioEntity;

    @ManyToOne
    @JoinColumn(name = "medico")
    private MedicoEntity MedicoEntity;


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

    public UsuarioEntity getUsuarioEntity() {
        return this.usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }

    public MedicoEntity getMedicoEntity() {
        return this.MedicoEntity;
    }

    public void setMedicoEntity(MedicoEntity MedicoEntity) {
        this.MedicoEntity = MedicoEntity;
    }

}
