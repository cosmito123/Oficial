package com.example.demo.modelo;

public class Registrar_Municipio {
    private String nombre;
    private String personeria;

    public Registrar_Municipio(String nombre, String personeria) {
        this.nombre = nombre;
        this.personeria = personeria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersoneria() {
        return personeria;
    }

    public void setPersoneria(String personeria) {
        this.personeria = personeria;
    }

    @Override
    public String toString() {
        return "Registrar_Municipio{" +
                "nombre='" + nombre + '\'' +
                ", personeria='" + personeria + '\'' +
                '}';
    }
}
