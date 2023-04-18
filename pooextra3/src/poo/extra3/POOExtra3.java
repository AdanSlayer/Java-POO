/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.extra3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class POOExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        Raices root = new Raices();
        root.leerValores();
        root.getDiscriminante();
        root.obtenerRaices();
        root.obtenerRaiz();
        root.calcular();
    }
    
}
//5x^2-20x+15 , 2x^2+5x+2, 3x^2-11-4 //
//x^2-8x+16 ,  //