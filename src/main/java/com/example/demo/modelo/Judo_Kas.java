package com.example.demo.modelo;

public class Judo_Kas {
    private String Nombre;

    private String apellido;

    private String Fech_naci;

    private String genero;

    private String categoria;

    private float peso_ac;

    public Judo_Kas(String nombre, String apellido, String fech_naci, String genero, String categoria, float peso_ac) {
        Nombre = nombre;
        this.apellido = apellido;
        this.Fech_naci = fech_naci;
        this.genero = genero;
        this.categoria = categoria;
        this.peso_ac = peso_ac;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFech_naci() {
        return Fech_naci;
    }

    public void setFech_naci(String fech_naci) {
        Fech_naci = fech_naci;
    }

    public String getGenero() {return genero;
    }

    public void setGenero(String genero) {this.genero = genero;
    }

    public String getCategoria() {return categoria;
    }

    public void setCategoria(String categoria) {this.categoria = categoria;
    }

    public float getPeso_ac() {return peso_ac;
    }

    public void setPeso_ac(float peso_ac) {this.peso_ac = peso_ac;
    }


    @Override
    public String toString() {
        return "Judo_Kas{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Fech_naci=" + Fech_naci +
                ", genero='" + genero + '\'' +
                ", categoria='" + categoria + '\'' +
                ", peso_ac=" + peso_ac +
                '}';
    }
}

