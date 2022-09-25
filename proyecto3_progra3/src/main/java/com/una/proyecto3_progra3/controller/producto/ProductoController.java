/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.controller.producto;


import com.una.proyecto3_progra3.model.producto.Producto;
import com.una.proyecto3_progra3.model.producto.ProductoDAO;
import java.util.ArrayList;

/**
 *
 * @author Eithel
 */
public class ProductoController implements ProductoInterface {

    @Override
    public boolean addProducto(Producto producto) {

        try{
            ProductoDAO prod = new ProductoDAO();
            return prod.store(producto);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return false;
        
    }

    @Override
    public String updateProducto(Producto producto) {
       String response="Error al modificar!";
       
       try{
           ProductoDAO pro = new ProductoDAO();
           if(pro.update(producto)){
               response = "Se modifico correctamente";
               
           }
           
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return response; 
        
    }

    @Override
    public String[][] getAll() {
        try{
            ProductoDAO dao = new ProductoDAO();
            ArrayList<Producto> list = dao.getAll();
            String[][] data = new String[list.size()][6];
            for(int i=0;i<list.size();i++){
                Producto aux = list.get(i);
                data[i][0] = aux.getCodigo();
                data[i][1] = aux.getDescription();
                data[i][2] = aux.getCategoria().getCodigo();
                data[i][3] = String.valueOf(aux.getExistencia());
                data[i][4] = String.valueOf(aux.getMinimo());
                data[i][5] = String.valueOf(aux.getMaximo());
               
            }
            return data;
            
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        return null;
        
    }

    @Override
    public String delete(String codigo) {
        String response="No se elimino correctamente!!";
        
        try{
            ProductoDAO dao = new ProductoDAO();
            
            if(dao.delete(codigo)){
               response="Correctamente eliminado";
                
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return response;
    }

    @Override
    public Producto find(String codigo) {
        
        try{
            ProductoDAO dao = new ProductoDAO();
            Producto pro = dao.findProducto(codigo);
            if(pro != null){
                return pro;
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
        
    }
    
}
