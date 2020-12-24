/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service.impl;

import com.pe.victor.dao.DaoFactory;
import com.pe.victor.dao.EmpleadoDao;
import com.pe.victor.entity.Empleado;
import com.pe.victor.service.EmpleadoService;
import static com.pe.victor.util.Util.opc;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 51923
 */
public class EmpleadoServiceImpl implements EmpleadoService{

    EmpleadoDao dao;
    
    public EmpleadoServiceImpl(){
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getEmpleadoDao(opc);
    }
    
    @Override
    public void grabar(Empleado empleado) {
        dao.create(empleado);
    }

    @Override
    public Empleado buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Empleado> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Empleado empleado) {
        dao.update(empleado);
    }

    @Override
    public void borrar(Empleado empleado) {
        dao.delete(empleado);
    }
    
    

    @Override
    public boolean validar(String u, String p)  throws Exception{
           
            return dao.validar(u, p);
        
    }
    
}
