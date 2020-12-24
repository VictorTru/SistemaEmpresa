/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service.impl;

import com.pe.victor.dao.DaoFactory;
import com.pe.victor.dao.VentaDao;
import com.pe.victor.entity.Venta;
import com.pe.victor.service.VentaService;
import static com.pe.victor.util.Util.opc;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 51923
 */
public class VentaServiceImpl implements VentaService{
    
    VentaDao dao;
    
    public VentaServiceImpl(){
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getVentaDao(opc);
    }

    @Override
    public int grabar(Venta venta){
        try {
            return dao.registrar(venta);
        } catch (Exception ex) {
            Logger.getLogger(VentaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    

    
    
}
