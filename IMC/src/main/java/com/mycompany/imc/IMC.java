/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class IMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kilos (KG): ");
        double peso = sc.nextDouble();
        
        System.out.print("Ingrese su altura en metros(MT): ");
        double altura = sc.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("Su Índice de Masa Corporal es: " + imc);
    }
} 
    
