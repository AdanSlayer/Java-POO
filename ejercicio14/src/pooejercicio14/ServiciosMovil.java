/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio14;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServiciosMovil {
    Movil mobile = new Movil();
    Scanner read= new Scanner(System.in);
    
    
    public void cargarCelular(){
        System.out.println("Ingrese la marca del télefono");
        mobile.marca=read.nextLine();
        System.out.println("Ingrese el modelo del télefono");
        mobile.modelo=read.nextLine();
        System.out.println("Ingrese la memoria RAM con la que cuenta el disp. en GB");
        mobile.RAM=read.nextInt();
        System.out.println("Ingrese el almacenamiento con el que cuenta el disp. en GB");
        mobile.almacenamiento=read.nextInt();
        System.out.println("Ingrese el precio del dispositivo en USD");
        mobile.precio=read.nextInt();
    }
    public void ingresarCodigo(){
        System.out.println("Ingrese el código númerico de 7 dígitos");
        for (int i = 0; i < 7; i++) {
            mobile.codigo[i]=(int) (Math.random()*10);
            System.out.println(mobile.codigo[i]);
        }
        
    }
}
