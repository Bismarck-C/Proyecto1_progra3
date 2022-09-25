/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.producto;
import com.una.proyecto3_progra3.model.ConnectionDB;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Eithel
 */
public class ProductoDAO extends ConnectionDB{
    private String sqlString;
    
    public ProductoDAO() throws SQLException{
        super();
    }
    public boolean store(Producto producto) throws Exception{
       sqlString="INSERT INTO producto(codigo,description,categoria,existencia,minimo,maximo) "+ "Values('"+producto.getCodigo()+"','"+producto.getDescription()+"','"+producto.getCategoria().getCodigo()+"',"+producto.getExistencia()+","+producto.getMinimo()+","+producto.getMaximo()+")";  
       return this.update(sqlString);
    }
    public boolean update(Producto producto) throws Exception{
        sqlString="UPDATE producto SET description= '"+producto.getDescription()+"',categoria='"+producto.getCategoria()+"',existencia="+producto.getExistencia()+",minimo="+producto.getMinimo()+",maximo="+producto.getMaximo()+""
                + "WHERE codigo='"+producto.getCodigo()+"'";
        return this.update(sqlString);
    }
    private Producto addProducto(ResultSet rs) throws Exception{
   
       Producto producto = new Producto();
      
       producto.setCodigo(rs.getString("codigo"));
       producto.setDescription(rs.getString("description"));
       producto.setExistencia(rs.getInt("existencia"));
       producto.setMinimo(rs.getInt("minimo"));
       producto.setMaximo(rs.getInt("maximo"));
       Categoria categoria = new Categoria();
       categoria.setCodigo("none");
       categoria.setDescripcion("none");
       producto.setCategoria(categoria);
       return producto; 
    }    
    public ArrayList getAll() throws Exception{
        sqlString= "SELECT * FROM producto";
        ArrayList<Producto> list = new ArrayList();
        ResultSet rs = this.query(sqlString);
        
        while(rs.next()){
            Producto producto = this.addProducto(rs);
            list.add(producto);
        }
          return list;
    } 
    
    public boolean delete(String codigo) throws Exception{
        sqlString="DELETE FROM * producto WHERE codigo='"+codigo+"'";
        return this.update(sqlString);
    }    
    public ResultSet exist(String sqlString) throws Exception{
        ResultSet rs = this.query(sqlString);
        return rs;
    }
    public Producto findProducto(String codigo) throws Exception{
        sqlString = "SELECT * FROM producto WHERE codigo= '"+codigo+"'";
        ResultSet rs = this.exist(sqlString);
        
        if(rs.next()){
            Producto producto = this.addProducto(rs);
            return producto;
        }
        return null;
    }
    
}
