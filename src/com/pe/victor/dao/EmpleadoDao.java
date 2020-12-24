/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao;

import com.pe.victor.entity.Empleado;

/**
 *
 * @author 51923
 */
public interface EmpleadoDao extends EntidadDao<Empleado>  {
    public boolean validar(String u, String p) throws Exception;
}
