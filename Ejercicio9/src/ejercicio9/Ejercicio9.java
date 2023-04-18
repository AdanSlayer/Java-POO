/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Matematica math = new Matematica();
        math.setNum1(Math.random()*20);
        math.setNum2(Math.random()*20);
        System.out.println(math.getNum1());
        System.out.println(math.getNum2());
        System.out.println("El mayor de los dos números es"+math.devolverMayor());
        System.out.println("La potencia del max elevada al min es "+math.calcularPotencia());
        System.out.println("La raiz del min es "+math.calculaRaiz());
    }
    
}
