/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyecto3_progra3.controller.categoria;

import com.una.proyecto3_progra3.model.categoria.Categoria;

/**
 *
 * @author villa
 */
public interface CategoriaInterface {
    public boolean insertar(String[] data, String[] data1);
    public String modificar(String[] data);
    public Categoria buscarCategoria(String data);
    public void buscarDescipcion(String data);
    public String delete(String data);
    
        
        
   
   
}
