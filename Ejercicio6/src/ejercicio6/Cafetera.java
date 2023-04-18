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
public class Cafetera {

    Scanner read = new Scanner(System.in);

    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
        System.out.println("La cafetera se ha llenado con "+this.capacidadActual+" oz.");
    }

    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza en oz.");
        int captaza = read.nextInt(), conttaza;
        if (this.capacidadActual >= captaza) {
            System.out.println("Se ha llenado la taza a FULL");
            this.capacidadActual = capacidadActual - captaza;
        } else {
            conttaza = this.capacidadActual;
            System.out.println("La taza se ha cargado con " + conttaza + " oz.");
        }
        System.out.println("Quedan "+this.capacidadActual+ " oz. en la cafetera");
      
    }

    public void vaciarCafetera() {
        this.capacidadActual = 0;
        System.out.println("Se ha vaciado la cafetera :(");
    }

    public void agregarCafe() {
        System.out.println("La cantidad actual es "+this.capacidadActual);
        System.out.println("La capacidad máxima es "+this.capacidadMaxima);
        System.out.println("Ingrese la cantidad de café a agregar a la cafetera en oz.");
        int add = read.nextInt();
        this.capacidadActual+=add;
        System.out.println("Se han añadido "+add+" oz.");
        
    }

}
