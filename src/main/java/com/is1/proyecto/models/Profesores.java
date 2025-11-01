package com.is1.proyecto.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("professors")
public class Profesores extends Model {
    public Integer getLegajo() {
        return getInteger("legajo"); // Obtiene el valor de la columna 'legajo'
    }

    public void setDni(Integer legajo) {
        set("legajo", legajo); // Establece el valor para la columna 'legajo'
    }

    public String getCargo() {
        return getString("cargo"); // Obtiene el valor de la columna 'cargo'
    }

    public void setCargo(String cargo) {
        set("cargo", cargo); // Establece el valor para la columna 'cargo'
    }

    //Metodos implementados de la interfaz persona (Menos setDni que está arriba)
    public String getNombre() {
        return getString("nombre"); // Obtiene el valor de la columna 'nombre'
    }

    public void setNombre(String nombre) {
        set("nombre", nombre); // Establece el valor para la columna 'nombre'
    }

    public Integer getDni() {
        return getInteger("dni"); // Obtiene el valor de la columna 'dni'
    }

    public String getApellido() {
        return getString("apellido"); // Obtiene el valor de la columna 'apellido'
    }

    public void setApellido(String apellido) {
        set("apellido", apellido); // Establece el valor para la columna 'apellido'
    }

    public String getDireccion() {
        return getString("direccion"); // Obtiene el valor de la columna 'direccion'
    }

    public void setDireccion(String direccion) {
        set("direccion", direccion); // Establece el valor para la columna 'direccion'
    }

    public Integer getTelefono() {
        return getInteger("telefono"); // Obtiene el valor de la columna 'telefono'
    }

    public void setTelefono(Integer telefono) {
        set("telefono", telefono); // Establece el valor para la columna 'telefono'
    }

    public String getCorreo() {
        return getString("correo");
    }

    public void setCorreo(String correo) {
        set("correo", correo);
    }
}

