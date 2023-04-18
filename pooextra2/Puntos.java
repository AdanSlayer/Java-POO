/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Puntos {

    Scanner read = new Scanner(System.in);
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int crearPuntos() {
        System.out.println("Ingresar el primer punto x1");
        x1 = read.nextInt();
        System.out.println("Ingresar el primer punto y1");
        y1 = read.nextInt();
        System.out.println("Ingresar el segundo punto x2");
        x2 = read.nextInt();
        System.out.println("Ingresar el segundo punto y2");
        y2 = read.nextInt();
        return 0;
    }
    public int calcularDistancia() {
        double distancia = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
        System.out.println("la distancia es: "+ distancia);
        return 0;
        
              
    }
}
