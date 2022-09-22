package com.una.proyecto3_progra3.model.usuario;


import com.una.proyecto3_progra3.model.persona.Persona;

public class Usuario extends Persona{
    private String usuario;
    private String contraseña;
    
    public Usuario(String []data){
        super();
        this.setId(data[0]);
        this.setNombre(data[1]);
        this.setApellidos(data[2]);
        this.setTelefono(data[3]);
        this.setEmail(data[4]);
        this.usuario = data[5];
        this.contraseña = data[6];
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}