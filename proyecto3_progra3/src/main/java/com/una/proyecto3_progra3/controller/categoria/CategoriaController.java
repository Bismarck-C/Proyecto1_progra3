/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.controller.categoria;

import com.una.proyecto3_progra3.model.bloque.Bloque;
import com.una.proyecto3_progra3.model.bloque.BloqueDAO;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import com.una.proyecto3_progra3.model.categoria.CategoriaDAO;

/**
 *
 * @author villa
 */
public class CategoriaController implements CategoriaInterface, BloqueInterface{
    
    @Override
    public boolean insertar(String[] data, String[] data2) {
          Bloque bloque = new Bloque(data2);
          if(insertBloque(bloque)){
                Categoria categoria = new Categoria(data, bloque);
                
                try{
                        CategoriaDAO dao = new CategoriaDAO();
                        if(dao.store(categoria)){
                            return true;
                        }else{
                            return false;
                        }
                    }catch(Exception ex){   
                         ex.printStackTrace();
                        }
            }
          return false;
    }

    @Override
    public void modificar(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarCategoria(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buscarDescipcion(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertBloque(Bloque bloque) {
         try{
            BloqueDAO dao = new BloqueDAO();
            if(dao.store(bloque)){
                return true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
       
    }

   

        


    
}
