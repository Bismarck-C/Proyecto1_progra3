/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.departamento;

import com.una.proyecto3_progra3.model.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Dylan M
 */
public class DepartamentoDAO extends ConnectionDB{
    private String sqlString;
    public DepartamentoDAO() throws SQLException{
        super();
    }
    
     public boolean store(Departamento departamento)throws Exception{
        sqlString="INSERT INTO departamento(codigo,nombre,ubicacion,telefono,correo,id_encargado) "+ "VALUES('"+departamento.getCodigo()+"','"+departamento.getNombre()+"','"+ departamento.getUbicacion()+"','"+departamento.getTelefono()+"','"+ departamento.getEmail()+"','"+departamento.getEncargado().getId()+"')";
        return this.update(sqlString);
    }
     
    public boolean update(Departamento departamento) throws Exception{
        sqlString="UPDATE departamento SET nombre='"+departamento.getNombre()+"',ubicacion='"+departamento.getUbicacion()+"',telefono='"+departamento.getTelefono()+"',correo='"+departamento.getEmail()+"',id_encargado='"+departamento.getEncargado().getId()+"' "
                + "WHERE codigo='"+departamento.getCodigo()+"'";
                
        return this.update(sqlString);
    }
     
    public boolean delete(String codigo) throws Exception{
        sqlString="DELETE FROM departamento WHERE id='"+codigo+"'";
        return this.update(sqlString);
    }
    
    public ResultSet verifyExist(String id) throws Exception{
        sqlString ="SELECT * FROM departamento WHERE codigo ='"+id+"'";
        return this.query(sqlString);
    }
    
    public ResultSet getALL() throws Exception{
        sqlString ="SELECT * FROM departamento";
        return this.query(sqlString);
    }
    
}
