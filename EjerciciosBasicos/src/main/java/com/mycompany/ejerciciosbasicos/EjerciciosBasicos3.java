package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos3 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los metros cuadrados del lado: ");
        int lado = sc.nextInt();
        
         System.out.println("Area de un cuadrado de lado " + lado + ": " + (lado * lado) + " metros cuadrados");
        
    }
}
