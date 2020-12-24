/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao.impl;

import com.pe.victor.dao.CategoriaDao;
import com.pe.victor.dao.EntidadDao;
import com.pe.victor.entity.Categoria;
import com.pe.victor.util.DBConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 51923
 */
public class CategoriaDaoImpl implements CategoriaDao{
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    Categoria categoria;

    @Override
    public void create(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> findAll() {
        List<Categoria> lCategoria = new ArrayList<>();
        Categoria categoria;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from categorias");

            rs = pst.executeQuery();

            while (rs.next()){
                categoria = new Categoria();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                categoria.setIdcategoria(Integer.parseInt(rs.getString(1)));
                categoria.setNombre(rs.getString(2));
                categoria.setDescripcion(rs.getString(3));
                lCategoria.add(categoria);
                

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lCategoria;    }

    @Override
    public Categoria find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
