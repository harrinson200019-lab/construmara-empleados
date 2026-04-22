package com.construmara.empleados.model;

import jakarta.persistence.*;
// Clase que representa la entidad Empleados en la base de datos
@Entity
@Table(name = "empleados")
public class Empleados {
    // ID único del empleado (clave primaria)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Nombre del empleado
    private String nombre;
    
    // Número de identificación
    private String identificacion;
    
    // Tipo de identificación (CC, TI, etc.)
    private String tipoIdentificacion;
    
    // Correo electrónico del empleado
    private String correoElectronico;
    
    // Dirección del empleado
    private String direccion;
    
    // Área o dependencia
    private String dependencia;

    public Empleados() {}

    public Long getId() {
        return id;
    }

    // 🔥 IMPORTANTE (esto arregla el update)
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}