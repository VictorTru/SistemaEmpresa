/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service;

import com.pe.victor.entity.Categoria;
import java.util.List;

/**
 *
 * @author 51923
 */
public interface CategoriaService {
    
    public void grabar(Categoria categoria);
    public Categoria buscar(Object id);
    public List<Categoria> listar();
    public void actualizar(Categoria categoria);
    public void borrar(Categoria categoria);
    
}
