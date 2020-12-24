/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service.impl;

import com.pe.victor.dao.CategoriaDao;
import com.pe.victor.dao.DaoFactory;
import com.pe.victor.entity.Categoria;
import com.pe.victor.service.CategoriaService;
import static com.pe.victor.util.Util.opc;
import java.util.List;

/**
 *
 * @author 51923
 */
public class CategoriaServiceImpl implements CategoriaService{

    CategoriaDao dao;
    
    public CategoriaServiceImpl(){
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getCategoriaDao(opc);
    }

    @Override
    public void grabar(Categoria categoria) {
       dao.create(categoria);
    }

    @Override
    public Categoria buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Categoria> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Categoria categoria) {
        dao.update(categoria);
    }

    @Override
    public void borrar(Categoria categoria) {
        dao.delete(categoria);
    }
    
    
    
}
