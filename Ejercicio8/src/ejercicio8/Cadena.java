/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author USER
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {
        int c = 0;
        char letter;
        for (int i = 0; i < longitud; i++) {
            letter = frase.toLowerCase().charAt(i);
            switch (letter) {
                case 'a':
                    c++;
                    break;
                case 'e':
                    c++;
                    break;
                case 'i':
                    c++;
                    break;
                case 'o':
                    c++;
                    break;
                case 'u':
                    c++;
                    break;
            }
        }
        System.out.println("Hay " + c + " vocales en la frase");
    }

    public void invertirFrase() {
        String frase2 = "";
        char letter;
        for (int i = longitud - 1; i >= 0; i--) {
            letter = frase.charAt(i);
            frase2 = frase2 + letter;
        }
        System.out.println(frase2);
    }

    public void vecesRepetido(char letra) {
        char letter;
        int k = 0;
        for (int i = 0; i < longitud; i++) {
            letter = frase.toLowerCase().charAt(i);
            if (letra == letter) {
                k++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + k + " veces");
    }

    public void compararLongitud(String phrase) {
        int largo = phrase.length();
        if (longitud > largo) {
            System.out.println("La primer frase es más larga");
        } else if (largo > longitud) {
            System.out.println("La segunda frase es más larga");
        } else {
            System.out.println("Ambas frases tinen la misma longitud");
        }
    }

    public void unirFrases(String phrase) {
        frase = frase + " " + phrase;
        System.out.println(frase);
    }

    public void reemplazar(char letra2) {
        char j;
        String frase2 = "";
        for (int i = 0; i < longitud; i++) {
            j = frase.toLowerCase().charAt(i);
            if (j == 'a') {
                frase2 = frase2 + letra2;
            } else {
                frase2 = frase2 + j;
            }
        }
        System.out.println(frase2);
    }

    public boolean contiene(char letra3) {
        boolean bandera;
        char letter;
        int k = 0;
        for (int i = 0; i < longitud; i++) {
            letter = frase.toLowerCase().charAt(i);
            if (letra3 == letter) {
                k++;
            }
        }
        bandera=k>0;
        return bandera;
    }
}
