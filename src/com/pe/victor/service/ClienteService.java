/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.service;

import com.pe.victor.entity.Cliente;
import java.util.List;

/**
 *
 * @author 51923
 */
public interface ClienteService {
     public void grabar(Cliente cliente);
    public Cliente buscar(Object id);
    public List<Cliente> listar();
    public void actualizar(Cliente cliente);
    public void borrar(Cliente cliente);
}
