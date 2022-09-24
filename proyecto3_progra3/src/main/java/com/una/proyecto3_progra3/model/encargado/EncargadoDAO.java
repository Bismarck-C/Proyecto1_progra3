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
     
    public Encargado verifyExist(String id) throws Exception{
        sqlString ="SELECT * FROM encargado WHERE id ='"+id+"'";
        ResultSet rs = this.query(sqlString);
        Encargado encargado = null;
        if(rs.next()){
            encargado = this.createEncargado(rs);
        }
        return encargado;
    }
    
    private Encargado createEncargado(ResultSet rs) throws SQLException{
        String[] data = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
        Encargado encargado = new Encargado(data);
        return encargado;
    }
}
