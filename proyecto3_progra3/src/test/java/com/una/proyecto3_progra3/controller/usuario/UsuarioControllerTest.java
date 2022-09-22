/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.una.proyecto3_progra3.controller.usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dylan M
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }
    
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String[] data = {"504470897","Dylan", "Mejia Ruiz","8325-3006","dylan@gmail.com","DOMR2003","dmr2003#"};
        UsuarioController userController = new UsuarioController();
        assertEquals(true, userController.addUser(data));
    }
    
    @Test
    public void testUpdateUser(){
        System.out.println("addUser");
        String[] data = {"504470897","Olivier", "Ruiz"};
        UsuarioController userController = new UsuarioController();
        assertEquals(true, userController.updateUser(data));
    }
    
    @Test
    public void testDeleteUser(){
        System.out.println("deleteUser");
        UsuarioController userController = new UsuarioController();
        assertEquals(true, userController.deleteUser("504470897"));
    }
    
    @Test
    public void testVerifyLogin(){
        System.out.println("deleteUser");
        UsuarioController userController = new UsuarioController();
        assertEquals(true,userController.verifyLogin("DOMR2003", "dmr2003#"));
    }
}
