package com.mycompany.ejerciciosbasicos;

//@author alvar

import java.util.Scanner;

public class EjerciciosBasicos8 {

    public static void main(String[] args) {
        /*8. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();
        
        //Output
        if(edad >= 18) System.out.println("Eres mayor de edad");
        
    }
}
