package com.example.sitiosculturalespasto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {


    // importar google gson para identificar llave primaria
    @SerializedName("entidad_cargo")
    @Expose
    private String entidad_cargo;
    private String representante;
    private String direccion;
    private String correo;
    private String telefono;
    private String latitud;
    private String longitud;


    public String getEntidad_cargo() {
        return entidad_cargo;
    }

    public void setEntidad_cargo(String entidad_cargo) {
        this.entidad_cargo = entidad_cargo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}

