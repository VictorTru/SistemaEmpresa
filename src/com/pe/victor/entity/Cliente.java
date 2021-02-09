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
public class Cliente {
    
    private String idcliente;
    private String nombre;
    private String direccion;
    private String ruc;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String idcliente, String nombre, String direccion, String ruc, String telefono) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
        this.telefono = telefono;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  idcliente + " " + nombre;
    }

    
    
    
    
}
