package com.hedima.presentacion;
import java.util.Scanner;
public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println( "ingrese un numero");
        int numero = num.nextInt(), numero1=num.nextInt();
        if (numero > numero1) {
            System.out.println(numero+","+numero1);
        }else {
            System.out.println(numero1+","+numero);
        }


    }
}
