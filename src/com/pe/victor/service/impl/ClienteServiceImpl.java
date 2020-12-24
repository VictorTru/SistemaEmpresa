/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service.impl;

import com.pe.victor.dao.ClienteDao;
import com.pe.victor.dao.DaoFactory;
import com.pe.victor.entity.Cliente;
import com.pe.victor.service.ClienteService;
import static com.pe.victor.util.Util.opc;
import java.util.List;

/**
 *
 * @author 51923
 */
public class ClienteServiceImpl implements ClienteService{

    ClienteDao dao;
    
    public ClienteServiceImpl(){
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getClienteDao(opc);
    }
    
    @Override
    public void grabar(Cliente cliente) {
        dao.create(cliente);
    }

    @Override
    public Cliente buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Cliente> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Cliente cliente) {
        dao.update(cliente);
    }

    @Override
    public void borrar(Cliente cliente) {
        dao.delete(cliente);
    }
    
}
