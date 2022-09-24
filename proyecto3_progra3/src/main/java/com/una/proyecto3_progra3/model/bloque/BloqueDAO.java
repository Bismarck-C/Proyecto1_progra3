/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.bloque;

import com.una.proyecto3_progra3.model.ConnectionDB;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        sqlString="INSERT INTO bloque(codigo,nombre,estado) "
                + "VALUES('"+bloque.getCodigo()+"','"+bloque.getNombre()+"','"+bloque.getEstado()+"')";
        
        return this.update(sqlString);
    }
    public boolean update(String[] data) throws Exception{
        sqlString = "UPDATE bloque SET nombre='"+data[1]+"' "
                +"WHERE codigo='"+data[0]+"'";
        return this.update(sqlString);
    }
     public boolean cambiarEstado(String[] data) throws Exception{
        sqlString = "UPDATE bloque SET estado='"+data[1]+"' "
                +"WHERE codigo='"+data[0]+"'";
        return this.update(sqlString);
    }
    public ArrayList getALL() throws SQLException, Exception{
        ArrayList<Bloque> list = new ArrayList<>();
        
        sqlString = "SELECT * FROM bloque";
        ResultSet rs = this.query(sqlString);
        
        while(rs.next()){
            Bloque bl = this.createBloque(rs);
            list.add(bl);
        
        }
        return list;
    }
    public Bloque createBloque(ResultSet rs) throws SQLException{
        Bloque bl = new Bloque();
        
        bl.setCodigo(rs.getString("codigo"));
        bl.setNombre(rs.getString("nombre"));
        bl.setEstado(rs.getString("estado"));
        
        return bl;
    
    }
    
    
}
