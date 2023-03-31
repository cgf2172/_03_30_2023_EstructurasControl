package com.hedima.presentacion;
import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        //Declarar una variable primitiva
        int numero = 10;
        //Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero->");
        numero = sc.nextInt();
        System.out.println("El numero es: " + numero);
        System.out.println("Ingrese un Nombre");
        String nombre = sc.next();
        if (nombre.equalsIgnoreCase("Juan")) {
            System.out.println("Bienvenido Juan");
    }else {
            System.out.println("Usted no es Juan, " + nombre);
        }
            //Pedir dos numeros y decir si son iguales
            System.out.println("Ingrese 2 numeros->");
            int numero1 = sc.nextInt(), numero2 = sc.nextInt();
            if (numero1 == numero2) {
                System.out.println("Los numeros son iguales");
            }
            //Pedir dos numeros y decir cual es el mayor
            System.out.println("Ingrese 2 numeros->");
            int numero3 = sc.nextInt(), numero4 = sc.nextInt();
            if (numero3 > numero4) {
                System.out.println("El número " + numero3 + " es mayor");
            }
            System.out.println("Ingrese 2 numeros->");
            int numero5 = sc.nextInt(), numero6 = sc.nextInt();
            if (numero5 > numero6) {
                System.out.println(numero5+","+numero6);
            }else {
                System.out.println( numero6+","+numero5);

            }
        }
    }








