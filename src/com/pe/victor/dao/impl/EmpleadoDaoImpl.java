/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao.impl;

import com.pe.victor.dao.EmpleadoDao;
import com.pe.victor.entity.Empleado;
import com.pe.victor.util.DBConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 51923
 */
public class EmpleadoDaoImpl implements EmpleadoDao{
    
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    Empleado empleado;

    @Override
    public void create(Empleado t) {
         try{
            String sql = "INSERT INTO empleados VALUES(?,?,?,?,?,?)";
            con = DBConn.getConnection();

            pst = con.prepareStatement(sql);
            pst.setString(1, t.getIdempleado());
            pst.setString(2, t.getApellido());
            pst.setString(3, t.getNombre());
            pst.setString(4, t.getEmail());
            pst.setString(5, t.getUsuario());
            pst.setString(6, t.getClave());
            pst.executeUpdate();
            con.close();
            System.out.println("grabo con preparedstatement");
        }catch (SQLException ex){
            System.out.println("Errors");
        }
    }

    @Override
    public void update(Empleado t) {
        String sql = "update empleados set Apellido=?, Nombre=?, Email=?, Usuario=?, Clave=? where IdEmpleado=?";

        try {
            con = DBConn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(6, t.getIdempleado());
            pst.setString(1, t.getApellido());
            pst.setString(2, t.getNombre());
            pst.setString(3, t.getEmail());
            pst.setString(4, t.getUsuario());
            pst.setString(5, t.getClave());
            pst.executeUpdate();
            con.close();
            System.out.println();
        }catch (SQLException ex){
            System.out.println("ErrorOI");
        }
    }

    @Override
    public void delete(Empleado t) {
        String sql = "delete from empleados where IdEmpleado=?";
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1,t.getIdempleado());
            pst.executeUpdate();
            con.close();
            System.out.println("Eliminando");
        }catch (SQLException ex){
            System.out.println("Errorla");
        }
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> lEmpleado = new ArrayList<>();
        Empleado empleado;

        try{

            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from empleados");

            rs = pst.executeQuery();

            while (rs.next()){
                empleado = new Empleado();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                empleado.setIdempleado(rs.getString(1));
                empleado.setApellido(rs.getString(2));
                empleado.setNombre(rs.getString(3));
                empleado.setEmail(rs.getString(4));
                empleado.setUsuario(rs.getString(5));
                empleado.setClave(rs.getString(6));
                lEmpleado.add(empleado); 

            }
            con.close();

        }catch (SQLException ex){
            System.out.println("Error");
        }
        return lEmpleado;
    }

    @Override
    public Empleado find(Object id) {
       empleado =  null;
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement("SELECT * FROM empleados where IdEmpleado=?");
            pst.setString(1, (String) id);
            rs = pst.executeQuery();

            if (rs.next()){
                empleado = new Empleado();
                //vendedor.setvCodigo(Integer.parseInt(rs.getInt(1)+""));
                empleado.setIdempleado(rs.getString(1));
                empleado.setApellido(rs.getString(2));
                empleado.setNombre(rs.getString(3));
                empleado.setEmail(rs.getString(4));
                empleado.setUsuario(rs.getString(5));
                empleado.setClave(rs.getString(6));
            }
            rs.close();
            con.close();
            System.out.println("Encontrar con PreparedStament");
        }catch (SQLException ex){
            System.out.println("ErrorR");
        }
        return empleado;
    }
        
    
    @Override
    public boolean validar(String xuser, String xpass) throws Exception {
        
        boolean sw;
        try{
            
            con = DBConn.getConnection();
            pst = con.prepareStatement("select count(*) from empleados where usuario=? and clave=?");
            pst.setString(1, xuser);
            pst.setString(2, xpass);
            rs = pst.executeQuery();
            rs.next();
            int x = rs.getInt(1);
            sw = x > 0;
            rs.close();
            pst.close();
        }catch(SQLException ex){
            throw ex;
        }finally{
            
        }
        
        return sw;    
        
    }
}
