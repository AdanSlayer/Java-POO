/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cafetera coffee = new Cafetera(60,0);
        coffee.llenarCafetera();
        coffee.servirTaza();
        coffee.vaciarCafetera();
        coffee.agregarCafe();
    }
    
}
