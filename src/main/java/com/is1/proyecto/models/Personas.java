package com.is1.proyecto.models;
import org.javalite.activejdbc.annotations.Table;

@Table("persons")
public interface Personas {

    public String getNombre();

    public void setNombre(String nombre);

    public Integer getDni();

    public void setDni(Integer dni);

    public String getApellido();

    public void setApellido(String apellido);

    public String getDireccion();

    public void setDireccion(String direccion);

    public Integer getTelefono();

    public void setTelefono(Integer telefono);

    public String getCorreo();

    public void setCorreo(String correo);
}
