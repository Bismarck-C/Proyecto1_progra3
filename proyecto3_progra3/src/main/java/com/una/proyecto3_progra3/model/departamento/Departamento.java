package com.una.proyecto3_progra3.model.departamento;

import com.una.proyecto3_progra3.model.encargado.Encargado;


public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private String email;
    private String telefono;
    private Encargado encargado;

    public Departamento(String[] data){
        this.codigo = data[0];
        this.nombre = data[1];
        this.ubicacion = data[2];
        this.telefono = data[3];
        this.email = data[4];
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String _codigo) {
        this.codigo = _codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String _ubicacion) {
        this.ubicacion = _ubicacion;
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

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado _encargado) {
        this.encargado = _encargado;
    }
    
}
