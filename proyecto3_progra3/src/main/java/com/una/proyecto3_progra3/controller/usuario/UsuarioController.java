package com.una.proyecto3_progra3.controller.usuario;

import com.una.proyecto3_progra3.model.usuario.Usuario;
import com.una.proyecto3_progra3.model.usuario.UsuarioDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    @Override
    public ArrayList<Usuario> getAll() {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            ArrayList<Usuario> list = new ArrayList<>();
            ResultSet rs = dao.getAll();
            while(rs.next()){
                String[] data = new String[7];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                data[6] = rs.getString(7);
                Usuario usuario = new Usuario(data);
                list.add(usuario);
            }
            rs.close();
            return list;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
