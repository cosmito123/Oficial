package com.example.demo.modelo;

public class Club {
    private Integer id_club;
    private  String nombres;
    private  String direccion;
    private  int personas;
    private int x;

    public int getX() {
        return x;
    }

    public Club(String nombres, String direccion, int personaas) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.personas = personaas;
    }

    public Integer getId_club() {
        return id_club;
    }

    public void setId_club(Integer id_club) {
        this.id_club = id_club;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personaas) {
        this.personas = personaas;
    }
    @Override
    public String toString() {
        return "club{" +
                "nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                ", personaas=" + personas +
                '}';
    }
}
