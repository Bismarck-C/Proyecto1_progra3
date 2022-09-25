/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.producto;

import com.una.proyecto3_progra3.model.categoria.Categoria;

/**
 *
 * @author villa
 */
public class Producto {
  
        private String codigo;
        private String description;
        private Categoria categoria;
        private Integer existencia;     
        private Integer minimo;
        private Integer maximo;
        //private img imagen ;

        public Producto(){
            this.codigo = codigo;
            this.description = description;
            this.categoria = categoria;
            this.existencia = existencia;
            this.minimo = minimo;
            this.maximo = maximo;
            
        }
       
         public Producto(String codigo,String description,Categoria categoria,Integer existencia,Integer minimo,Integer maximo){
            this.codigo = codigo;
            this.description = description;
            this.categoria = categoria;
            this.existencia = existencia;
            this.minimo = minimo;
            this.maximo = maximo;
        }

    
   
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

   
    public Categoria getCategoria() {
        return categoria;
    }

   
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    public Integer getExistencia() {
        return existencia;
    }

    
    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

   
    public Integer getMinimo() {
        return minimo;
    }

    
    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }

    
    public Integer getMaximo() {
        return maximo;
    }

   
    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }
        
        
}
   
 

