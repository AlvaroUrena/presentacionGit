package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos11 {
    public static void main(String[] args) {
        /*11. Escribe un programa que lee 2 números y muestra el mayor.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        //Logica
        if(num1 > num2) System.out.println("El numero mayor es: " + num1);
        else if(num2 > num1) System.out.println("El numero mayor es: " + num2);
        else System.out.println("Los dos numeros son iguales");
    }
}
