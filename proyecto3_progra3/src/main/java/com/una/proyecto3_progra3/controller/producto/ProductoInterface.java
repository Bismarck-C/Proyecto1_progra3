/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyecto3_progra3.controller.producto;

import com.una.proyecto3_progra3.model.categoria.Categoria;
import com.una.proyecto3_progra3.model.producto.Producto;

/**
 *
 * @author Eithel
 */
public interface ProductoInterface {
    public boolean addProducto(Producto producto);
    public String updateProducto(Producto producto);
    public String[][] getAll();
    public String delete(String codigo);
    public Producto find(String codigo);
    
}
