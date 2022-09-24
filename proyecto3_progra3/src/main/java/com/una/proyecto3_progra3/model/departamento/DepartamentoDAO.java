/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.departamento;

import com.una.proyecto3_progra3.model.ConnectionDB;
import com.una.proyecto3_progra3.model.encargado.EncargadoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


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
    
    public Departamento verifyExist(String id) throws Exception{
        Departamento departamento = null;
        sqlString ="SELECT * FROM departamento WHERE codigo ='"+id+"'";
        ResultSet rs = this.query(sqlString);
        if(rs.next()){
            departamento = this.createDepartamaneto(rs);
        }
        return departamento;
    }
    
    public ArrayList getALL() throws Exception{
        sqlString ="SELECT * FROM departamento";
        ArrayList<Departamento> list = new ArrayList<>();
        ResultSet rs = this.query(sqlString);
        while(rs.next()){
            Departamento departamento = this.createDepartamaneto(rs);
            list.add(departamento);
        }
        return list;
    }
    
    private Departamento createDepartamaneto(ResultSet rs) throws Exception{
        Departamento departamento = null;
        String[] data = {rs.getString("codigo"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getString("telefono"),rs.getString("correo")};
        departamento = new Departamento(data);
        EncargadoDAO dao = new EncargadoDAO();
        departamento.setEncargado(dao.verifyExist(rs.getString("id_encargado")));
        return departamento;
    }
    
}
