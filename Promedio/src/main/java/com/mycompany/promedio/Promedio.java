/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class Promedio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();
        
        double promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio es: " + promedio);
    }
}
    
