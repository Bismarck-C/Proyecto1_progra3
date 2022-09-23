package com.una.proyecto3_progra3.controller.departamento;

import com.una.proyecto3_progra3.model.departamento.Departamento;
import com.una.proyecto3_progra3.model.encargado.Encargado;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartamentoControllerTest {
    
    public DepartamentoControllerTest() {
    }
    
    @Test
    public void testAddDepartamento() {
        System.out.println("addDepartamento");
        String[] data ={"S5","Ventas","Liberia","4444-4444","ventas@google.com"};
        String[] data2 = {"50447089","Dylan", "Mejia Ruiz","8325-3006","dylan@gmail.com"};
        Encargado encaragado = new Encargado(data2);
        DepartamentoController dController = new DepartamentoController();
        assertEquals(true, dController.addDepartamento(data, encaragado));
    }
    
    @Test
    public void testUpdate(){
        DepartamentoController dController = new DepartamentoController();
        String[] data2 = {"45","Olivier", "Mejia Ruiz","8325-3006","dylan@gmail.com"};
        String[] data = {"Ventas","Liberia","4444-4444","ventas@google.com"};
        Encargado encaragado = new Encargado(data2);
        assertEquals(true, dController.updateDepartamento("S52", encaragado, data));
    }
    
     @Test
    public void testGetAll(){
        boolean as = false;
        DepartamentoController dController = new DepartamentoController();
        ArrayList<Departamento> list = dController.getAll();
        for(int i = 0; i < list.size(); i++){
            System.out.println("Codigo: "+list.get(i).getCodigo()+"  "+"Encargado: "+list.get(i).getEncargado().getNombre());
            as = true;
        }
        assertEquals(true, as);
    }
}
