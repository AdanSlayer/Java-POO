/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra6;

/**
 *
 * @author USER
 */
public class Ahorcado {
   public char[] palabra;
   public int letFound, jugMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letFound, int jugMax) {
        this.palabra = palabra;
        this.letFound = letFound;
        this.jugMax = jugMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetFound() {
        return letFound;
    }

    public void setLetFound(int letFound) {
        this.letFound = letFound;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }



   
    }



   
