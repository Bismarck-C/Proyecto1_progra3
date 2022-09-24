/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.controller.categoria;

import com.una.proyecto3_progra3.model.bloque.Bloque;
import com.una.proyecto3_progra3.model.bloque.BloqueDAO;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import com.una.proyecto3_progra3.model.categoria.CategoriaDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author villa
 */
public class CategoriaController implements CategoriaInterface, BloqueInterface{
    public CategoriaController(){
        
    
    }
    
    @Override
    public boolean insertar(String[] data, String[] data2) {
          Bloque bloque = new Bloque(data2);
        try {
            BloqueDAO bl = new BloqueDAO();
            if(bl.store(bloque)){ 
                Categoria categoria = new Categoria(data, bloque);
                CategoriaDAO dao = new CategoriaDAO();
                if(dao.store(categoria)){
                    return true;
                }
                    
            }
          
                
        } catch (Exception ex) {
           ex.printStackTrace();
        }
          
          return false;
    }

    @Override
    public String modificar(String[] data) {
        String response ="Error al modificar!";
        try {
            CategoriaDAO dao = new CategoriaDAO();
       
            if(dao.update(data)){
                response = "Se modifico correctamente";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
        
        
        
       
    }

    @Override
    public Categoria buscarCategoria(String data) {
        try {
            CategoriaDAO dao = new CategoriaDAO();
            Categoria ct = dao.buscarCategoria(data);
            
            if(ct != null){
                return ct;
            
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }

    @Override
    public String delete(String data) {
       String response = "Error al eliminar!";
      
        try {
            CategoriaDAO dao = new CategoriaDAO();
            if(dao.delete(data))
                response = "Se elimino correctamente";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return response;
    }

    @Override
    public boolean insertBloque(String[] data) {
        Bloque bl = new Bloque(data);
        
        try {
            BloqueDAO dao = new BloqueDAO();
            if(dao.store(bl)){
                return true;
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
       
    }

    @Override
    public boolean modificarBloque(String[] data) {

        try {
            BloqueDAO dao = new BloqueDAO();  
            if(dao.update(data)){
                return true;
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean cambiarEstado(String[] estado) {
        try {
            BloqueDAO dao = new BloqueDAO();
            if(dao.cambiarEstado(estado)){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void buscarDescipcion(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 


    
}
