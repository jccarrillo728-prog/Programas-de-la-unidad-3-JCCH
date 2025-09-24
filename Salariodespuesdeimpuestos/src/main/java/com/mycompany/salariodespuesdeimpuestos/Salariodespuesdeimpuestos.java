/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariodespuesdeimpuestos;

import java.util.Scanner;
/**Este programa calcula el salario de una persona despues de los  impuestos 
/**
 *
 * @author inksa
 */
public class Salariodespuesdeimpuestos {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el salario bruto mensual: ");
        double salario_antes_de_impuestos = sc.nextDouble();
        
        System.out.print("Ingrese el porcentaje de impuestos: ");
        double percentImpuestos = sc.nextDouble();
        
        System.out.print("Ingrese las deducciones adicionales (Fonacot, Infonavit, Etc): ");
        double deduccionesAdicionales = sc.nextDouble();
        
        double impuesto = salario_antes_de_impuestos * (percentImpuestos / 100);
        double salarioNeto = salario_antes_de_impuestos - impuesto - deduccionesAdicionales;
        
        System.out.println("El salario neto es: " + salarioNeto);
    }
}
 

