/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej4rectangulo;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ej4Rectangulo {

    public static void main(String[] args) {
 
        Rectangulo rec=new Rectangulo();
        rec.crearRectangulo(rec);
        
        
        System.out.println("El perimetro del rectangulo es "+rec.calcularPerimetro());
        System.out.println("La superficie del rectangulo es  "+rec.calcularSuperficie());
        System.out.println("El rectangulo dibujado es ");
        rec.dibujarRectangulo();
    }
}
