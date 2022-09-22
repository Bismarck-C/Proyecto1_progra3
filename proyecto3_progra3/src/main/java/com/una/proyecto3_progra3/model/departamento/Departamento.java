package com.una.proyecto3_progra3.model.departamento;

import com.una.proyecto3_progra3.model.Persona;

public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private String email;
    private String telefono;
    private Persona encargado;

    public Departamento(String[] data){
        this.codigo = data[0];
        this.nombre = data[1];
        this.ubicacion = data[2];
        this.telefono = data[3];
        this.email = data[4];
        this.encargado.setId(data[5]);
        this.encargado.setNombre(data[6]);
        this.encargado.setApellidos(data[7]);
        this.encargado.setTelefono(data[8]);
        this.encargado.setEmail(data[9]);
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

    public Persona getEncargado() {
        return encargado;
    }

    public void setEncargado(Persona _encargado) {
        this.encargado = _encargado;
    }
    
}
