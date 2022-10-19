package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos9 {
    public static void main(String[] args) {
        /*9. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();
        
        //Output
        if(edad >= 18) System.out.println("Eres mayor de edad");
        else System.out.println("Eres menor de edad");
    }
}
