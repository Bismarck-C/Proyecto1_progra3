/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.una.proyecto3_progra3.controller.categoria;

import com.una.proyecto3_progra3.model.bloque.Bloque;
import com.una.proyecto3_progra3.model.categoria.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author villa
 */
public class CategoriaControllerTest {
    
    public CategoriaControllerTest() {
    }
    

    /**
     * Test of insertar method, of class CategoriaController.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String[] data = {"s22","una papa","2380"} ;
        String[] data2 = {"2381","bloque_22","activo"};
        CategoriaController instance = new CategoriaController();
        boolean expResult = true;
        //boolean result = instance.insertar(data,);
       // assertEquals(expResult, result);
      
    }

    /**
     * Test of modificar method, of class CategoriaController.
     */
    @Test
    public void testModificar() {
        String response;
        System.out.println("modificar");
        String[] data = {"s22","culillo vacilon"};
        CategoriaController instance = new CategoriaController();
        response = instance.modificar(data);
        assertEquals(response,"Se modifico correctamente");
    }

    /**
     * Test of buscarCategoria method, of class CategoriaController.
     */
    @Test
    public void testBuscarCategoria() {
        System.out.println("buscarCategoria");
        String data = "s22";
        CategoriaController instance = new CategoriaController();
        Categoria categoria = new Categoria();
        categoria = instance.buscarCategoria(data);
        assertEquals(categoria.getBloque().getCodigo(),"2380");
    }

    /**
     * Test of buscarDescipcion method, of class CategoriaController.
     */
    @Test
    public void testBuscarDescipcion() {
        System.out.println("buscarDescipcion");
        String data = "";
        CategoriaController instance = new CategoriaController();
        instance.buscarDescipcion(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CategoriaController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String response;
        String data = "s22";
        CategoriaController instance = new CategoriaController();
        response = instance.delete(data);
        assertEquals(response, "Se elimino correctamente");
    }
    @Test
    public void testModificarBloque(){
        System.out.println("modificar bloque");
        boolean response;
        String[] data = {"2381","bloque_15",};
        CategoriaController instance = new CategoriaController();
        response= instance.modificarBloque(data);
        assertTrue(response);
    
    }
    @Test
    public void testCambiarEstado(){
        System.out.println("modificar bloque");
        boolean response;
        String[] data = {"2381","inactivo",};
        CategoriaController instance = new CategoriaController();
        response= instance.cambiarEstado(data);
        assertTrue(response);
    
    }
    
    
    

  
}
