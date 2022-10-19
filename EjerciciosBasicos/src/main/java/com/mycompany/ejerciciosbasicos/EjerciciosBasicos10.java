package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos10 {
    public static void main(String[] args) {
        /*10. Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división. (Ten en cuenta la división por cero).*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        //Logica
        System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nMultiplicacion: " + (num1 * num2));
        if(num2 == 0) System.out.println("Division: No es posible dividir por 0");
        else System.out.println("Division: " + (num1 / num2));
    }
}
