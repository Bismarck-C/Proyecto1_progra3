/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyecto3_progra3.controller.departamento;

import com.una.proyecto3_progra3.model.departamento.Departamento;
import com.una.proyecto3_progra3.model.encargado.Encargado;
import java.util.ArrayList;

/**
 *
 * @author Dylan M
 */
public interface DepartamentoInterface {
    public boolean addDepartamento(String[] data, Encargado encaragado);
    public boolean updateDepartamento(String id_departamento, Encargado encargado, String[] data);
    public Encargado getEncargado(String id);
    public Departamento getDepartamento(String id);
    public ArrayList<Departamento> getAll();
}
