package com.mycompany.ejerciciosbasicos;

import java.util.Scanner;

public class EjerciciosBasicos6 {
    public static void main(String[] args) {
        /*6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado*/
        
        //Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el precio del articulo: ");
        double precioArticulo = Math.abs(sc.nextDouble());
        System.out.println("Introduce el precio real: ");
        double precioReal = Math.abs(sc.nextDouble());
        
        //Logica
        double descuento = 100 - (precioArticulo / precioReal * 100);
        System.out.println("El descuento es del " + descuento + "%");
        
    }
}
