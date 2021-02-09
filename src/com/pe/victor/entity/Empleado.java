/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.entity;

/**
 *
 * @author 51923
 */
public class Empleado {
    private String idempleado;
    private String apellido;
    private String nombre;
    private String email;
    private String usuario;
    private String clave;

    public Empleado() {
    }

    public Empleado(String idempleado, String apellido, String nombre, String email, String usuario, String clave) {
        this.idempleado = idempleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return idempleado + " " + apellido + " " + nombre;
    }
    
    
    
}
