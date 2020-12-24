/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao;

import java.util.List;

/**
 *
 * @author VictorTru
 */

public interface EntidadDao <T>{
    public void create(T t);
    public void update(T t);
    public void delete(T t);
    public List<T> findAll();
    public T find(Object id);
}
