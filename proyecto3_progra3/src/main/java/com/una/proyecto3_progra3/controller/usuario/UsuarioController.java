/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.controller.usuario;

import com.una.proyecto3_progra3.model.usuario.Usuario;
import com.una.proyecto3_progra3.model.usuario.UsuarioDAO;
import java.sql.ResultSet;

/**
 *
 * @author Dylan M
 */
public class UsuarioController implements UsuarioInterface{
    
    public UsuarioController(){
    
    }

    @Override
    public boolean addUser(String[] data) {
        Usuario user = new Usuario(data);
        try{
            UsuarioDAO dao = new UsuarioDAO();
            if(dao.store(user)){
                return true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(String[] data) {
        try{
            if(this.verifyExist(data[0])){
                UsuarioDAO dao = new UsuarioDAO();
                if(dao.update(data)){
                    return true;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean verifyExist(String id) {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            ResultSet rs = dao.verifyExist(id);
            return rs.next();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        try{
            if(this.verifyExist(id)){
                UsuarioDAO dao = new UsuarioDAO();
                if(dao.delete(id)){
                    return true;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean verifyLogin(String user, String pass) {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            ResultSet rs = dao.verifyPassUser(user, pass);
            return rs.next();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
}
