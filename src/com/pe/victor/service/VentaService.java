/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service;

import com.pe.victor.dao.VentaDao;
import com.pe.victor.dao.impl.VentaDaoImpl;
import com.pe.victor.entity.Categoria;
import com.pe.victor.entity.Venta;
import java.util.List;

/**
 *
 * @author 51923
 */
public class VentaService {
    
    VentaDao dao;
    
    public VentaService(){
        dao = new VentaDaoImpl();
    }
    
    public int grabar(Venta venta) throws Exception{
        return dao.registrar(venta);
    }
    
}
