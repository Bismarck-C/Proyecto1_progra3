/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyecto3_progra3.controller.usuario;

/**
 *
 * @author Dylan M
 */
public interface UsuarioInterface{
    public boolean addUser(String[] data);
    public boolean updateUser(String[] data);
    public boolean verifyExist(String id);
    public boolean deleteUser(String id);
    public boolean verifyLogin(String user, String pass);
}
