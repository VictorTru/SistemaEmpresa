/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service;


import com.pe.victor.entity.Empleado;
import java.util.List;

/**
 *
 * @author 51923
 */
public interface EmpleadoService {
     public void grabar(Empleado empleado);
    public Empleado buscar(Object id);
    public List<Empleado> listar();
    public void actualizar(Empleado empleado);
    public void borrar(Empleado empleado);
    public boolean validar(String u, String p) throws Exception;
}
