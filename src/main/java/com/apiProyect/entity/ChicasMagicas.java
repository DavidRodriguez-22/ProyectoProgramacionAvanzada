package com.apiProyect.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "chicas_magicas")
public class ChicasMagicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer edad;
    
    @Column(length = 50)
    private String ciudadOrigen;
    
    @Column(unique = true, length = 20)
    private String identificadorMagico;
    
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EstadoChica estadoActual; // Enum para manejar estados

    private Date fechaContrato;

    // Constructor vacío
    public ChicasMagicas() {}

    // Constructor con parámetros
    public ChicasMagicas(String nombre, Integer edad, String ciudadOrigen, String identificadorMagico, EstadoChica estadoActual, Date fechaContrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
        this.identificadorMagico = identificadorMagico;
        this.estadoActual = estadoActual;
        this.fechaContrato = fechaContrato;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getIdentificadorMagico() {
        return identificadorMagico;
    }

    public void setIdentificadorMagico(String identificadorMagico) {
        this.identificadorMagico = identificadorMagico;
    }

    public EstadoChica getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoChica estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}