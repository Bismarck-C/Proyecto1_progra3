/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.categoria;

import com.una.proyecto3_progra3.model.bloque.Bloque;

/**
 *
 * @author villa
 */
public class Categoria {
    private String codigo;
    private String descripcion;
    private Bloque bloque;
    
    
    public Categoria(String[] data, Bloque bloque){
        this.codigo = data[0];
        this.descripcion = data[1];
        this.bloque = bloque;
        
    
    }

    public Categoria() {
       
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the bloque
     */
    public Bloque getBloque() {
        return bloque;
    }

    /**
     * @param bloque the bloque to set
     */
    public void setBloque(Bloque bloque) {
        this.bloque = bloque;
    }
}
