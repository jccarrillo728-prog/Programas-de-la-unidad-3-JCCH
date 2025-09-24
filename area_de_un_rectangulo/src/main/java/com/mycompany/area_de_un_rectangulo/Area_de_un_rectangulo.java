/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_de_un_rectangulo;

import java.util.Scanner;

/**
 *
 * @author inksa
 */


public class Area_de_un_rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        double resultado = base * altura;
        System.out.println("El área del rectángulo es: " + resultado);
    }
}
