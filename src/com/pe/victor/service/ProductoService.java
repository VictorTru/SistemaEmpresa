/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service;

import com.pe.victor.entity.Categoria;
import com.pe.victor.entity.Producto;
import java.util.List;

/**
 *
 * @author 51923
 */
public interface ProductoService {
     public void grabar(Producto producto);
    public Producto buscar(Object id);
    public List<Producto> listar();
    public void actualizar(Producto producto);
    public void borrar(Producto producto);
   
    
  

    
}
