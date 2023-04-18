/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServiceAhorcado {

    Scanner read = new Scanner(System.in);
    Ahorcado soga = new Ahorcado();
    String hidden = "";

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra");
        soga.setPalabra(read.next().toLowerCase().toCharArray());
        System.out.println("Ingrese la cantidad máxima de jugadas");
        soga.setJugMax(read.nextInt());
        return soga;
    }

    public void longitud() {
        for (int i = 0; i < soga.getPalabra().length; i++) {
            hidden += "[_]";
            System.out.print(hidden);
        }
    }

    public boolean buscar(char letra) {
        boolean flag = false;
        for (int i = 0; i < soga.getPalabra().length; i++) {
            if (letra == soga.getPalabra()[i]) {
                flag = true;
                break;
            }
        }
        return flag;

    }

    public void encontradas(char letra) {
        for (int i = 0; i < soga.getPalabra().length; i++) {
            if (letra == soga.getPalabra()[i]) {
                hidden = hidden.substring(0, i) + letra + hidden.substring(i + 1);
                soga.setLetFound(soga.getLetFound() + 1);
            }
        }
        for (int i = 0; i < soga.getPalabra().length; i++) {
            System.out.print("[" + hidden.charAt(i) + "]");
        }
        System.out.println("");
        System.out.println("Encontraste " + soga.getLetFound() + " letras");

    }

    public void intentos(char letra) {
        boolean mostrar = buscar(letra);
        if (!mostrar) {
            soga.setJugMax(soga.getJugMax() - 1);
        }
        System.out.println("Te quedan " + soga.getJugMax() + " intentos");

    }

    public void juego() {
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese una letra");
            char letter = read.next().toLowerCase().charAt(0);
            buscar(letter);
            encontradas(letter);
            intentos(letter);
        } while (soga.getLetFound() < soga.getPalabra().length && soga.getJugMax() > 0);
    }
}
