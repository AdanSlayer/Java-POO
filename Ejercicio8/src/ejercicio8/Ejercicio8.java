/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Cadena cad = new Cadena();
        System.out.println("Ingrese la frase");
        cad.setFrase(read.nextLine());
        cad.setLongitud(cad.getFrase().length());
        System.out.println(cad.getLongitud());
        cad.mostrarVocales();
        cad.invertirFrase();
        System.out.println("Ingrese una letra pa' ver si se repite");
        char letra=read.next().charAt(0);
        cad.vecesRepetido(letra);
        read.nextLine();
        System.out.println("Ingrese una nueva frase");
        String phrase=read.nextLine();
        cad.compararLongitud(phrase);
        cad.unirFrases(phrase);
        System.out.println("Ingrese una caracter para reemplazar la A");
        char letra2=read.next().charAt(0);
        cad.reemplazar(letra2);
        System.out.println("Ingrese una letra para comprobar si está");
        char letra3=read.next().charAt(0);
        System.out.println(cad.contiene(letra3));
        
        
        
    }
    
}
