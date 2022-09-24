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
    public ArrayList getAll() {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            ArrayList<Usuario> list = dao.getAll();
            String[][] data = new String[list.size()][7];
            for(int i = 0; i < list.size(); i++){
                Usuario user = list.get(i);
                data[i][0] = user.getId();
                data[i][1] = user.getNombre();
                data[i][2] = user.getApellidos();
                data[i][3] = user.getEmail();
                data[i][4] = user.getTelefono();
                data[i][5] = user.getUsuario();
                data[i][6] = user.getContraseña();
            }
            return list;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
