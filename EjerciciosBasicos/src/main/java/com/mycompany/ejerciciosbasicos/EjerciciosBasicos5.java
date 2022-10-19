package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos5 {
    public static void main(String[] args) {
        /*5. Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que corresponden con dicho radio*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce lo que mide el radio");
        double radio = Math.abs(sc.nextInt()); //Da igual que lo de negativo
        
        //Variables
        double longitudCir = radio * 2;
        double areaCir = Math.PI * Math.pow(radio, 2);
        double volumenEsf = 4/3 * Math.PI * Math.pow(radio, 3);
        
        //Output
        System.out.println("Longitud Circurferencia: " + longitudCir + "\nArea del circulo: " + areaCir + "\nVolumen de la esfera: " + volumenEsf);
        
    }
}
