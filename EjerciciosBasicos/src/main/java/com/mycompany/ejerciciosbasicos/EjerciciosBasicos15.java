package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos15 {
    public static void main(String[] args) {
        /*15. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        
        //Esta forma es para evitar el codigo spaguetti que se crea. Es sencilla y eficaz.
        int numMayor = num1;
        
        if(num2 > numMayor) numMayor = num2;
        if(num3 > numMayor) numMayor = num3;
        
        //Output
        System.out.println("El numero mayor es: " + numMayor);
    }
}
