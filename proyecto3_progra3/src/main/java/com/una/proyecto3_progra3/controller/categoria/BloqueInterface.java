/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyecto3_progra3.controller.categoria;

import com.una.proyecto3_progra3.model.bloque.Bloque;
import java.util.ArrayList;

/**
 *
 * @author villa
 */
public interface BloqueInterface {
    public boolean insertBloque(String[] data);
    public boolean modificarBloque(String[] data);
    public boolean cambiarEstado(String[] estado);
    public ArrayList getAll();
     
    
}
