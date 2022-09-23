package com.una.proyecto3_progra3.controller.usuario;

import com.una.proyecto3_progra3.model.usuario.Usuario;
import java.util.ArrayList;

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
    public ArrayList<Usuario> getAll();
}
