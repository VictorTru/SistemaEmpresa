/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.victor.dao.impl;

import com.pe.victor.dao.VentaDao;
import com.pe.victor.entity.Detalle;
import com.pe.victor.entity.Venta;
import com.pe.victor.util.DBConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 51923
 */
public class VentaDaoImpl implements VentaDao<Venta>{
    
  private Connection cn;
  Statement stm = null, stm1;
  ResultSet rs = null ;
  PreparedStatement ps,psb,psa;
  

    Venta venta;

  String consulta;
  String query;

    @Override
    public int registrar(Venta reg) throws Exception {
       int nroVenta;
    try {
      cn = DBConn.getConnection();
      // inicia transaccion
      cn.setAutoCommit(false);
      // codigo genera nro de venta
      consulta = "Select Valor from Control where parametro='Ventas'";
      stm1 = cn.createStatement();
      rs = stm1.executeQuery(consulta);
      rs.next();
      nroVenta = rs.getInt("Valor");
      rs.close();
      consulta = "update Control set Valor=Valor+1 where parametro='Ventas'";
      stm1 = cn.createStatement();
      stm1.executeUpdate(consulta);
      
      
      // registra ventas
      query = "Insert Into Ventas(IdVenta,IdCliente,idEmpleado,tipodoc,Nrodoc,Fecha,Total)"
              + " Values(?,?,?,?,?,CURDATE(),?)";
      ps = cn.prepareStatement(query);
      // preparar valores a pasar al comando
      ps.setInt(1, nroVenta);
      ps.setString(2, reg.getIdcliente());
      ps.setString(3, reg.getIdempleado());
      ps.setString(4, reg.getTipodoc());
      ps.setString(5, reg.getNrodoc());
      ps.setDouble(6, reg.getTotal());
      ps.executeUpdate();// ejecuta insert de venta
      

      //graba detalle venta
      query = "Insert Into DetalleVenta(IdVenta,idproducto,precioventa,cantidad,importe)"
              + " Values(?,?,?,?,?)";
      psa = cn.prepareStatement(query);
      //actualiza stock
      query = "Update Productos  set Stock = Stock - ? where idProducto=?";
      psb = cn.prepareStatement(query);
      for (Detalle item : reg.getDetalle()) {
        // prepara valores a pasar al comando insertar detalle
        psa.setInt(1, nroVenta);
        psa.setString(2, item.getIdProducto());
        psa.setDouble(3, item.getPrecio());
        psa.setInt(4, item.getCantidad());
        psa.setDouble(5, item.getImporte());
        psa.executeUpdate();//ejecuta insert de detalle
        // actualizar stock de producto
        psb.setInt(1, item.getCantidad());
        psb.setString(2, item.getIdProducto());
        psb.executeUpdate();//ejecuta update de producto
      }
      stm1.close();
      ps.close();
      psa.close();
      psb.close();
      cn.commit(); // confirma la transaccion
    } catch (SQLException e2) {
      try {
        cn.rollback();// deshacer la transaccion
      } catch (SQLException e1) {
      }
      throw e2;
    } finally {
    }
    return nroVenta;
      } 
    
}
