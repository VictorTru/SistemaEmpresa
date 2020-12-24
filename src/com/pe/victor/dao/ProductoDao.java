/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao;

import com.pe.victor.entity.Producto;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author 51923
 */
public interface ProductoDao extends EntidadDao<Producto>{
    
    public List<Producto>  findAll(String nombre);
    public List<Producto>  findAll(int cat);
    
    
}
