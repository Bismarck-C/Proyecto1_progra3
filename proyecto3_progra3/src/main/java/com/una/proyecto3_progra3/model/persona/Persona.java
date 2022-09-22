/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyecto3_progra3.model.persona;

/**
 *
 * @author villa
 */
public class Persona {
    private String id;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    
    
    public Persona(){
    
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
}
