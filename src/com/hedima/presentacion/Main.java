package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        byte numero = 11;
        if (numero%2==0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        float numero2= -938.89f;
        if (numero2>0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        } ;
        //Decir si un nmero esta entre 0 y 100
        if (numero>0 && numero<100) {
            System.out.println("Esta en el rango");
        } else {
            System.out.println("Esta fuera del rango");
        }
        //los articulos raton y teclado tienen el 10% de descuento
        String nombreArticulo="raton";
        double descuento=0.1, precio=20;
        if (nombreArticulo.equalsIgnoreCase("raton") || nombreArticulo.toLowerCase().equals("teclado"))
        {
            System.out.println("El descuento es " + descuento*precio);
        }else{
            System.out.println("no tiene descuento");

        }


    }
}