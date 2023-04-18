/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import operations.Arimetica;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operacion op1 = new Operacion ();
       Arimetica ari1 = new Arimetica ();
       
       ari1.creaOperacion(op1);
      double sumacion = ari1.suma(op1);
        System.out.println("la suma de los numeros es: " + sumacion);
        double restacion = ari1.resta(op1);
        System.out.println("la resta de los numeros es: " + restacion);
        double divis = ari1.division(op1);
        System.out.println("la division de los numeros es: " + divis);
        double multis = ari1.multiplicacion(op1);
        System.out.println("la multiplicacion de los numeros es: " +multis);
    }
    
}
