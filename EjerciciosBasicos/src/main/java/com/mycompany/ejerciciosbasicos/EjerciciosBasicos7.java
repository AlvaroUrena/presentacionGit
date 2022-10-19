package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos7 {
    public static void main(String[] args) {
        /*7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de millas marinas:");
        Double millas = Math.abs(sc.nextDouble());
        
        //Logica
        double metros = millas * 1.852;
        System.out.println("Metros: " + metros);
    }
}
