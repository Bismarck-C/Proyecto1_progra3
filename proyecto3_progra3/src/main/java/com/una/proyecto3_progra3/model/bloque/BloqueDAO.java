/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.bloque;

import com.una.proyecto3_progra3.model.ConnectionDB;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import java.sql.ResultSet;

/**
 *
 * @author villa
 */
public class BloqueDAO extends ConnectionDB {
     private String sqlString;
    
    public BloqueDAO() throws Exception{
        super();
    }
    
    public boolean store(Bloque bloque)throws Exception{
        sqlString="INSERT INTO categoria(codigo,descripcion) "
                + "VALUES("+bloque.getNombre()+",'"+bloque.getEstado()+"')";
        
        return this.update(sqlString);
    }
 
  
    
    
    
}
