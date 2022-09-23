package com.una.proyecto3_progra3.model.usuario;


public class Usuario{
    private String usuario;
    private String contraseña;
    private String id;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    
    public Usuario(String []data){
        this.id = data[0];
        this.nombre = data[1];
        this.apellidos = data[2];
        this.telefono = data[3];
        this.email = data[4];
        this.usuario = data[5];
        this.contraseña = data[6];
    }
   
    public String getId() {
        return id;
    }

    public void setId(String _id) {
        this.id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String _telefono) {
        this.telefono = _telefono;
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