package com.hedima.presentacion;
import java.util.Scanner;

public class ProbarSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el estado civil");
        String estadoCivil = teclado.next();
        switch (estadoCivil.toUpperCase()) {
            case "S":
                System.out.println("Soltero");
                break;
            case "V":
                System.out.println("Viudo");
                break;
            case "D":
                System.out.println("Divorciado");
                break;
            case "C":
                System.out.println("Casado");
                break;

            default:
                System.out.println("Estado no valido");
                break;
        }


    }}
