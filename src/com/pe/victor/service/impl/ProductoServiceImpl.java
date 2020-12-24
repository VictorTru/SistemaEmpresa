/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service.impl;

import com.pe.victor.dao.DaoFactory;
import com.pe.victor.dao.ProductoDao;
import com.pe.victor.entity.Producto;
import com.pe.victor.service.ProductoService;
import static com.pe.victor.util.Util.opc;
import java.util.List;

/**
 *
 * @author 51923
 */
public class ProductoServiceImpl implements ProductoService{

    ProductoDao dao;
    
    public ProductoServiceImpl(){
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getProductoDao(opc);
    }
    
    @Override
    public void grabar(Producto producto) {
        dao.create(producto);
    }

    @Override
    public Producto buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Producto> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Producto producto) {
        dao.update(producto);
    }

    @Override
    public void borrar(Producto producto) {
        dao.delete(producto);
    }
    
    
    
    
}
