/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import ejercicio3.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Arimetica {
   
    Scanner leer = new Scanner (System.in);
    
     public Operacion creaOperacion(Operacion op1) {
        System.out.print("Ingrese el primero numero: ");
      op1.setNumero1(leer.nextDouble());
        System.out.print("Ingrese el segundo numero: ");
        op1.setNumero2(leer.nextDouble());
        return op1;
        
    } 
     
     public double suma(Operacion op1) {
         
         return op1.getNumero1()+op1.getNumero2();
    
     }
     
     public double resta(Operacion op1) {
         return op1.getNumero1()-op1.getNumero2();
     }
     
     public double multiplicacion (Operacion op1) {
         
         if (op1.getNumero1()==0 || op1.getNumero2()==0) {
             
             System.out.println("Error estas multiplicando por 0, no es posible la operacion");
             return 0;
             
         } else {
         return op1.getNumero1()*op1.getNumero2();
         }
         
         
     }
     
     public double division (Operacion op1) {
         if (op1.getNumero1()==0 || op1.getNumero2()==0) {
             
             System.out.println("Error estas dividiendo por 0, no es posible la operacion");
             return 0;
             
         } else {
         return op1.getNumero1()/op1.getNumero2();
         
         }   
     }
}

