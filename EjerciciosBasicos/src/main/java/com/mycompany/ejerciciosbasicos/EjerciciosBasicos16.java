package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos16 {
    public static void main(String[] args) {
        /*16. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        calificación alfabética, escribiendo el resultado.
        • de 0 a <3 Muy Deficiente.
        • de 3 a <5 Insuficiente.
        • de 5 a <6 Bien.
        • de 6 a <9 Notable
        • de 9 a 10 Sobresaliente*/
        
        //Input (repite cada vez que no da un valor valido)
        Scanner sc = new Scanner(System.in);
        Double nota;
        while(true){
            System.out.println("Introduce una nota de 0 al 10 (con coma si es decimal)");
            nota = sc.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("Error: La nota debe ser del 0 al 10");
            } else break;
        }
        
        //Notas en Alfabetico (declaro las condiciones en variables booleanas para que sea mas facil de leer y quede un codigo mas ordenado)
        boolean notaMuyDeficiente = nota >= 0 && nota < 3;
        boolean notaInsuficiente = nota >= 3 && nota < 5;
        boolean notaBien = nota >= 5 && nota < 6;
        boolean notaNotable = nota >= 6 && nota < 9;
        
        //Logica y Output (Gracias a declarar las condiciones antes queda muy ordenado, aunque es menos eficaz en rendimiento queria hacerlo diferente)
        if(notaMuyDeficiente) System.out.println("Muy Deficiente");
        else if(notaInsuficiente) System.out.println("Insuficiente");
        else if(notaBien) System.out.println("Bien");
        else if(notaNotable) System.out.println("Notable");
        else System.out.println("Sobresaliente");


    }
}
