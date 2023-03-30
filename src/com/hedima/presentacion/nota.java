package com.hedima.presentacion;
import java.util.Scanner;


public class nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota = teclado.nextInt();
        switch (nota) {
            case 10,9:
                System.out.println("Sobresaliente");
                break;
            case 8,7:
                System.out.println("Notable");
                break;
            case 6,5:
                System.out.println("Aprobado");
                break;
            case 4,3,2,1,0:
                System.out.println("Rechazado");
                break;
            default:
                System.out.println("Nota invalida");
        }
    }
}
