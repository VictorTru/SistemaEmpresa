/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.entity;

import java.util.List;

/**
 *
 * @author 51923
 */
public class Venta {
    private int idventa;
    private String idcliente;
    private String idempleado;
    private String tipodoc;
    private String nrodoc;
    private String fecha;
    private double total;
    private List<Detalle> detalle;

    public Venta() {
    }

    public Venta(int idventa, String idcliente, String idempleado, String tipodoc, String nrodoc, String fecha, double total, List<Detalle> detalle) {
        this.idventa = idventa;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.tipodoc = tipodoc;
        this.nrodoc = nrodoc;
        this.fecha = fecha;
        this.total = total;
        this.detalle = detalle;
    }

    

    public List<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }
    
    

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNrodoc() {
        return nrodoc;
    }

    public void setNrodoc(String nrodoc) {
        this.nrodoc = nrodoc;
    }
    
    
    
}
