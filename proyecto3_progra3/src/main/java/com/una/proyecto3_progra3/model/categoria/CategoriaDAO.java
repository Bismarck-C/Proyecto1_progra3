/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.categoria;

import com.una.proyecto3_progra3.model.ConnectionDB;
import com.una.proyecto3_progra3.model.bloque.Bloque;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
        sqlString="INSERT INTO categoria(codigo,descripcion,codigo_bloque) "
                +"VALUES('"+categoria.getCodigo()+"','"+categoria.getDescripcion()+"','"+categoria.getBloque().getCodigo()+"')";
               
        return this.update(sqlString);
    }
     public boolean update(String[] data) throws Exception{
        sqlString = "UPDATE categoria SET descripcion='"+data[1]+"' "+"WHERE codigo='"+data[0]+"'";
        return this.update(sqlString);
    }
    public boolean delete(String codigo) throws Exception{
        sqlString="DELETE FROM categoria WHERE codigo='"+codigo+"'";
        return this.update(sqlString);
    }
    public ArrayList getAll() throws Exception{
        ArrayList<Categoria> list = new ArrayList<>();
        sqlString = "SELECT * FROM categoria";
        ResultSet rs = this.query(sqlString);
        
        while(rs.next()){
            Categoria categoria = this.crearCategoria(rs);
            
            list.add(categoria);
        }
    
        return list;
    }
    private Categoria crearCategoria(ResultSet rs) throws SQLException{
        Categoria categoria = new Categoria();
        
        categoria.setCodigo(rs.getString("codigo"));
        categoria.setDescripcion(rs.getString("descripcion"));
        Bloque bl = new Bloque();
        bl.setCodigo(rs.getString("codigo_bloque"));
        bl.setEstado("none");
        bl.setNombre("none");
        categoria.setBloque(bl);
        
        return categoria;
        
    }
    public Categoria buscarCategoria(String data) throws Exception{
        sqlString = "SELECT * FROM categoria WHERE codigo ='"+data+"'";
        ResultSet rs = this.exist(sqlString);
        
        if(rs.next()){
            Categoria ct=this.crearCategoria(rs);
            return ct;
        
        }
         return null;
         
    }
    
    public ResultSet exist(String sqlString) throws Exception{
        ResultSet rs = this.query(sqlString);
        return rs;
       
        
    }
    
    
}
