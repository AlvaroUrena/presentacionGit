package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos13 {
    public static void main(String[] args) {
        /*13. Escribe un programa que lee dos números y los visualiza en orden ascendente.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        //Logica
        if(num1 > num2) System.out.println(num1 + "\n" + num2);
        else System.out.println(num2 + "\n" + num1);
    }
}
