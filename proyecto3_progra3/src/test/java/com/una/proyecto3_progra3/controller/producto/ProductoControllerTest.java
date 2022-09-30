/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.una.proyecto3_progra3.controller.producto;


import com.una.proyecto3_progra3.model.categoria.Categoria;
import com.una.proyecto3_progra3.model.producto.Producto;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author villa
 */
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    


    /**
     * Test of addProducto method, of class ProductoController.
     */
    @Test
    public void testAddProducto() {
        System.out.println("addProducto");
        Categoria categoria = new Categoria();
        categoria.setCodigo("s22");
        Producto producto = new Producto("1011","mora",categoria,20,5,25);
        
        ProductoController instance = new ProductoController();
        boolean expResult = true;
        boolean result = instance.addProducto(producto);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateProducto method, of class ProductoController.
     */
    @Test
    public void testUpdateProducto() {
        System.out.println("updateProducto");
        Producto producto = null;
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.updateProducto(producto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ProductoController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ProductoController instance = new ProductoController();
        String[][] expResult = null;
        String[][] result = instance.getAll();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProductoController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String codigo = "";
        ProductoController instance = new ProductoController();
        String expResult = "";
        String result = instance.delete(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class ProductoController.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String codigo = "";
        ProductoController instance = new ProductoController();
        Producto expResult = null;
        Producto result = instance.find(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
