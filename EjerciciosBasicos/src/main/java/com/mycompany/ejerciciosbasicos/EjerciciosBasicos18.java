package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos18 {
    public static void main(String[] args) {
        /*18. Escribe un programa que calcula el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        • Las primeras 35 horas se pagan a tarifa normal.
        • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        • Las tasas de impuestos son:
        • Los primeros 500 euros son libres de impuestos.
        • Los siguientes 400 tienen un 25% de impuestos.
        • Los restantes un 45% de impuestos.
         Escribir nombre, salario bruto, tasas y salario neto.*/
        
        Scanner sc = new Scanner(System.in);
        
        //Variables
        int salarioBruto;
        int salarioNeto;
        int tasas = 0;
        String nombre;
        
        //Input
        System.out.println("Introduce la tarifa normal por hora");
        int tarifaHora = Math.abs(sc.nextInt());
        System.out.println("Introduce las horas trabajadas");
        int horas = Math.abs(sc.nextInt());
        
        //Salario bruto
        if(horas > 35){
            salarioBruto = 35 * tarifaHora;
            salarioBruto += (horas - 35) * (tarifaHora * 1.5);
        } else salarioBruto = horas * tarifaHora;
        System.out.println("Salario Bruto: " + salarioBruto + " euros");
        
        //Tasas
        if(salarioBruto > 900){
            tasas += ((salarioBruto - 900) * 0.45) + (400 * 0.25);
        } else if(salarioBruto > 500){
            tasas += (salarioBruto - 500) * 0.25;
        }
        System.out.println("Tasas: " + tasas + " euros");
        
        //Salario Neto
        salarioNeto = salarioBruto - tasas;
        System.out.println("Salario Neto: " + salarioNeto + " euros");
    }
}
