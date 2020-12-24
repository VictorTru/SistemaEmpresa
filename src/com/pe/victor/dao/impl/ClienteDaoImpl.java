/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao.impl;

import com.pe.victor.dao.ClienteDao;
import com.pe.victor.entity.Cliente;
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
public class ClienteDaoImpl implements ClienteDao{
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    Cliente cliente;

    @Override
    public void create(Cliente t) {
         
    }

    @Override
    public void update(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> lCliente = new ArrayList<>();
        Cliente cliente;
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement("select * from clientes order by idCliente desc ");
            rs = pst.executeQuery();
            while (rs.next()){
                cliente = new Cliente();
                cliente.setIdcliente(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setRuc(rs.getString(4));
                cliente.setTelefono(rs.getString(5));
                lCliente.add(cliente);
                
                
            }
            con.close();
        }catch (Exception ex){
            System.out.println("ErrorP");
        }

        return lCliente;
    }

    @Override
    public Cliente find(Object id) {
          cliente =  null;
        try{
            con = DBConn.getConnection();
            pst = con.prepareStatement("SELECT * FROM clientes where idcliente=?");
            pst.setString(1, (String) id);
            rs = pst.executeQuery();

            if (rs.next()){
                cliente  = new Cliente();
                cliente.setIdcliente(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setRuc(rs.getString(4));
                cliente.setTelefono(rs.getString(5));
            }
            rs.close();
            con.close();
            System.out.println("Encontrar con PreparedStament");
        }catch (SQLException ex){
            System.out.println("ErrorR");
        }
        return cliente;    }
    
    
}
