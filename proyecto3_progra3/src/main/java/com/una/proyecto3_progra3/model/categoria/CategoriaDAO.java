/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.categoria;

import com.una.proyecto3_progra3.model.ConnectionDB;
import java.sql.ResultSet;

/**
 *
 * @author villa
 */
public class CategoriaDAO extends ConnectionDB{
     private String sqlString;
    
    public CategoriaDAO() throws Exception{
        super();
    }
    
    public boolean store(Categoria categoria)throws Exception{
        sqlString="INSERT INTO categoria(codigo,descripcion) "
                + "VALUES("+categoria.getCodigo()+",'"+categoria.getDescripcion()+"')";
               
        
        
        return this.update(sqlString);
    }
   
  
    
}
