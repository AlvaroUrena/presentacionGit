package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos17 {
    public static void main(String[] args) {
        /*17. Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.*/
        
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce las horas:");
        int horas = Math.abs(sc.nextInt()); //Da igual que de numeros negativos
        
        System.out.println("Introduce los minutos:");
        int minutos = Math.abs(sc.nextInt());
        if(minutos >= 60){ //Por si pone 60 o mas
            minutos = 0;
            System.out.println("No puedes poner esa cantidad, lo hemos establecido a 0");
        }
        
        System.out.println("Introduce los segundos:");
        int segundos = Math.abs(sc.nextInt());
        if(segundos >= 60){ //Por si pone 60 o mas
            segundos = 0;
            System.out.println("No puedes poner esa cantidad, lo hemos establecido a 0");
        }
        
        //Logica
        segundos++;
        if(segundos >= 60){
            segundos = 0;
            minutos++;
            
            if(minutos >= 60){
                minutos = 0;
                horas++;
            }
        }
        
        //Output
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
