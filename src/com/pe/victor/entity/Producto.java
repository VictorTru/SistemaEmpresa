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
public class Producto {
    private String idproducto;
    private String descripcion;
    private int idcategoria;
    private double preciocompra;
    private double precioventa;
    private int stock;

    public Producto() {
    }

    public Producto(String idproducto, String descripcion, int idcategoria, double preciocompra, double precioventa, int stock) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.idcategoria = idcategoria;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return idproducto + "  " + descripcion ;
    }
    
    
    
}
