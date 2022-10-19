package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos14 {
    public static void main(String[] args) {
        /*14. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        //Logica
        if(num1 > num2) System.out.println("El primer numero(" + num1  + ") es el mayor");
        else if(num2 > num1)System.out.println("El segundo numero(" + num2  + ") es el mayor");
        else System.out.println("Los dos numeros son iguales");
    }
}
