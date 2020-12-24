/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao.impl;

import com.pe.victor.dao.ProductoDao;
import com.pe.victor.entity.Producto;
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
public class ProductoDaoImpl implements ProductoDao{
    
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    Producto producto;

    @Override
    public void create(Producto t) {
        try{
            String sql = "INSERT INTO productos VALUES(?,?,?,?,?,?)";
            con = DBConn.getConnection();

            pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdproducto());
            pst.setString(2, t.getDescripcion());
            pst.setInt(3, t.getIdcategoria());
            pst.setDouble(4, t.getPreciocompra());
            pst.setDouble(5, t.getPrecioventa());
            pst.setInt(6, t.getStock());
            pst.executeUpdate();
            con.close();
            System.out.println("grabo con preparedstatement");
        }catch (SQLException ex){
            System.out.println("Errors");
        }
    }

    @Override
    public void update(Producto t) {
        String sql = "update productos set Descripcion=?, IdCategoria=?, PrecioCompra=?, PrecioVenta=?, Stock=? where IdProducto=?";

        try {
            con = DBConn.getConnection();
           pst = con.prepareStatement(sql);
            pst.setString(6, t.getIdproducto());
            pst.setString(1, t.getDescripcion());
            pst.setInt(2, t.getIdcategoria());
            pst.setDouble(3, t.getPreciocompra());
            pst.setDouble(4, t.getPrecioventa());
            pst.setInt(5, t.getStock());
            pst.executeUpdate();
            con.close();
            System.out.println();
        }catch (SQLException ex){
            System.out.println("ErrorOI");
        }
    }

    @Override
    public void delete(Producto t) {
        String sql = "delete from productos where IdProducto=?";
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1,t.getIdproducto());
            pst.executeUpdate();
            con.close();
            System.out.println("Eliminando");
        }catch (SQLException ex){
            System.out.println("Errorla");
        }    }

    @Override
    public List<Producto> findAll() {
        List<Producto> lProducto = new ArrayList<>();
        Producto producto;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from productos");

            rs = pst.executeQuery();

            while (rs.next()){
                producto = new Producto();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                producto.setIdproducto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setIdcategoria(Integer.parseInt(rs.getString(3)));
                producto.setPreciocompra(Double.parseDouble(rs.getString(4)));
                producto.setPrecioventa(Double.parseDouble(rs.getString(5)));
                producto.setStock(Integer.parseInt(rs.getString(6)));
                lProducto.add(producto);
                
                

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lProducto;
    }

    @Override
    public Producto find(Object id) {
        producto =  null;
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement("SELECT * FROM productos where IdProducto=?");
            pst.setString(1, (String) id);
            rs = pst.executeQuery();

            if (rs.next()){
               producto = new Producto();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                producto.setIdproducto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setIdcategoria(Integer.parseInt(rs.getString(3)));
                producto.setPreciocompra(Double.parseDouble(rs.getString(4)));
                producto.setPrecioventa(Double.parseDouble(rs.getString(5)));
                producto.setStock(Integer.parseInt(rs.getString(6)));
                
            }
            rs.close();
            con.close();
            System.out.println("Encontrar con PreparedStament");
        }catch (SQLException ex){
            System.out.println("ErrorR");
        }
        return producto;    
    }
    
     
    public List<Producto> findAllOrderSueldo() {
        List<Producto> lProducto = new ArrayList<>();
        Producto producto;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from productos order by ");

            rs = pst.executeQuery();

            while (rs.next()){
                producto = new Producto();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                producto.setIdproducto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setIdcategoria(Integer.parseInt(rs.getString(3)));
                producto.setPreciocompra(Double.parseDouble(rs.getString(4)));
                producto.setPrecioventa(Double.parseDouble(rs.getString(5)));
                producto.setStock(Integer.parseInt(rs.getString(6)));
                lProducto.add(producto);
                
                

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lProducto;
    }

    public List<Producto>  findAll(String nombre) {
         List<Producto> lProducto = new ArrayList<>();
        Producto producto;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from productos order by ");

            rs = pst.executeQuery();

            while (rs.next()){
                producto = new Producto();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                producto.setIdproducto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setIdcategoria(Integer.parseInt(rs.getString(3)));
                producto.setPreciocompra(Double.parseDouble(rs.getString(4)));
                producto.setPrecioventa(Double.parseDouble(rs.getString(5)));
                producto.setStock(Integer.parseInt(rs.getString(6)));
                lProducto.add(producto);
                
                

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lProducto;
    }

    public List<Producto>  findAll(int cat) {
         List<Producto> lProducto = new ArrayList<>();
        Producto producto;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from productos order by IdCategoria");

            rs = pst.executeQuery();

            while (rs.next()){
                producto = new Producto();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                producto.setIdproducto(rs.getString(1));
                producto.setDescripcion(rs.getString(2));
                producto.setIdcategoria(Integer.parseInt(rs.getString(3)));
                producto.setPreciocompra(Double.parseDouble(rs.getString(4)));
                producto.setPrecioventa(Double.parseDouble(rs.getString(5)));
                producto.setStock(Integer.parseInt(rs.getString(6)));
                lProducto.add(producto);
                
                

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lProducto;
    }

   
    
    
}
