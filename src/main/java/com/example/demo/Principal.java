package com.example.demo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args )throws  {
        //Judo_Kas jk1 = new Judo_Kas("Juan", "Perez",12/12/12,"Masculino","Medio",98.6);
        Scanner pes=new Scanner(System.in);
        Scanner nom=new Scanner(System.in);
        Scanner apell=new Scanner(System.in);
        Scanner fecha=new Scanner(System.in);
        Scanner genero=new Scanner(System.in);
        Scanner cat=new Scanner(System.in);
        System.out.println("Ingrese nombre del competidor: ");
        String nombre=nom.nextLine();
        System.out.println("Ingrese apellido del competidor: ");
        String ap= apell.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del competidor: ");
        String fe= fecha.nextLine();
        System.out.println("Ingrese genero del competidor: ");
        String gen= genero.nextLine();
        System.out.println("Ingrese categoria perteneciente:  ");
        String ca= cat.nextLine();
        float peso= Float.parseFloat(pes.nextLine());
        Judo_Kas j1=new Judo_Kas(nombre,ap,fe,gen,ca,peso);
        System.out.println(j1);




















    }
}