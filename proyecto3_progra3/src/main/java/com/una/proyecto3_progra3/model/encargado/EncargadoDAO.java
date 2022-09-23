/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.encargado;

import com.una.proyecto3_progra3.model.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dylan M
 */
public class EncargadoDAO extends ConnectionDB{
    private String sqlString;
    public EncargadoDAO() throws SQLException{
        super();
    }
     
    public boolean store(Encargado encargado)throws Exception{
        sqlString="INSERT INTO encargado(id,nombre,apellidos,telefono,correo) "
                + "VALUES("+encargado.getId()+",'"+encargado.getNombre()+"','"
                + encargado.getApellidos()+"','"+encargado.getTelefono()+"','"
                + encargado.getEmail()+"')";
        return this.update(sqlString);
    }
    
    public boolean delete(String id) throws Exception{
        sqlString="DELETE FROM encargado WHERE id='"+id+"'";
        return this.update(sqlString);
    }
     
    public ResultSet verifyExist(String id) throws Exception{
        sqlString ="SELECT * FROM encargado WHERE id ='"+id+"'";
        return this.query(sqlString);
    }
}
