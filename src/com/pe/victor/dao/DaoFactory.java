/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao;

import com.pe.victor.dao.*;
import com.pe.victor.dao.*;
import com.pe.victor.dao.impl.CategoriaDaoImpl;
import com.pe.victor.dao.impl.ClienteDaoImpl;
import com.pe.victor.dao.impl.EmpleadoDaoImpl;
import com.pe.victor.dao.impl.ProductoDaoImpl;
import com.pe.victor.dao.impl.VentaDaoImpl;

import static com.pe.victor.util.Util.*;

/**
 *
 * @author VictorTru
 */

public class DaoFactory {
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {

        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public CategoriaDao getCategoriaDao(int tipo){
        CategoriaDao dao;
        switch(tipo){
            case DB: dao = new CategoriaDaoImpl(); break;
            default : dao=null;
        }
        return dao;
    }
    
    public ClienteDao getClienteDao(int tipo){
        ClienteDao dao;
        switch(tipo){
            case DB: dao = new ClienteDaoImpl(); break;
            default : dao=null;
        }
        return dao;
    }
    
    public EmpleadoDao getEmpleadoDao(int tipo){
        EmpleadoDao dao;
        switch(tipo){
            case DB: dao = new EmpleadoDaoImpl(); break;
            default : dao=null;
        }
        return dao;
    }
    
    public ProductoDao getProductoDao(int tipo){
        ProductoDao dao;
        switch(tipo){
            case DB: dao = new ProductoDaoImpl(); break;
            default : dao=null;
        }
        return dao;
    }
    
    public VentaDao getVentaDao(int tipo){
        VentaDao dao;
        switch(tipo){
            case DB: dao = new VentaDaoImpl(); break;
            default : dao=null;
        }
        return dao;
    }
}
