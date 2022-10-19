package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos4 {
    public static void main(String[] args) {
        /*Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
producto y división.*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nProducto: " + (num1 * num2) + "\nDivision: " + (num1 / num2));
    }
}
