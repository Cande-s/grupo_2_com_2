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
}
