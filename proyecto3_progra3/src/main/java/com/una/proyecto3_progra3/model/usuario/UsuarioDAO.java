/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.usuario;

import com.una.proyecto3_progra3.model.ConnectionDB;
import java.sql.ResultSet;
/**
 *
 * @author Dylan M
 */
public class UsuarioDAO extends ConnectionDB{
    private String sqlString;
    
    public UsuarioDAO() throws Exception{
        super();
    }
    
    public boolean store(Usuario usuario)throws Exception{
        sqlString="INSERT INTO usuario(id,nombre,apellidos,telefono,correo,usuario,contraseña) "
                + "VALUES("+usuario.getId()+",'"+usuario.getNombre()+"','"
                + usuario.getApellidos()+"','"+usuario.getTelefono()+"','"
                + usuario.getEmail()+"','"+ usuario.getUsuario()+"','"+ usuario.getContraseña()+"')";
        
        
        return this.update(sqlString);
    }
    public boolean update(String[] data) throws Exception{
        sqlString="UPDATE usuario SET nombre='"+data[1]+"',apellidos='"+data[2]+"' "
                + "WHERE id='"+data[0]+"'";
                
        return this.update(sqlString);
    }
    public boolean delete(String id) throws Exception{
        sqlString="DELETE FROM usuario WHERE id='"+id+"'";
        return this.update(sqlString);
    }
    
    public ResultSet verifyPassUser(String user, String pass) throws Exception{
        sqlString="SELECT * FROM usuario WHERE usuario ='"+user+"' AND contraseña='"+pass+"'";
        return this.query(sqlString);
    }
    
    public ResultSet verifyExist(String id) throws Exception{
        sqlString ="SELECT * FROM usuario WHERE id ='"+id+"'";
        return this.query(sqlString);
    }
}
