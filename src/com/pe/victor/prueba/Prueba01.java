/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.prueba;

import com.pe.victor.service.ProductoService;
import com.pe.victor.service.impl.ProductoServiceImpl;

/**
 *
 * @author 51923
 */
public class Prueba01 {
    public static void main(String[] args) {
        ProductoService service = new ProductoServiceImpl();
        
        service.listar().forEach((a) -> {System.out.println(a);});
        
    }
}
