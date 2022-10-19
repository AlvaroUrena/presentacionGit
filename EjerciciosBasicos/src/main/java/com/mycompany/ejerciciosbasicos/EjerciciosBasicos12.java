package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos12 {
    public static void main(String[] args) {
        /*12. Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        
        //Logica
        if(num >= 0) System.out.println("Es positivo");
        else System.out.println("Es negativo");
    }
}
