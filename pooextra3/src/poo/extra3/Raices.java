/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.extra3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Raices {

    Scanner read = new Scanner(System.in);
    private int a, b, c;
    double d,g,g2,g1;

    public Raices() {
    }

    public Raices(int a, int b, int c, double d, double g, double g2, double g1) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.g2 = g2;
        this.g1 = g1;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getG2() {
        return g2;
    }

    public void setG2(double g2) {
        this.g2 = g2;
    }

    public double getG1() {
        return g1;
    }

    public void setG1(double g1) {
        this.g1 = g1;
    }



    public int leerValores() {
        System.out.println("Escriba la parte cuadrática de la ec.(A)");
        a = read.nextInt();
        System.out.println("Escriba la parte lineal de la ec.(B)");
        b = read.nextInt();
        System.out.println("Escriba la parte constante de la ec.(C)");
        c = read.nextInt();
        return 0;
    }

    public int getDiscriminante() {
        d = Math.pow(b, 2) - 4 * a * c;
        System.out.println(d);
        return 0;
    }

    public boolean tieneRaices() {
        boolean flag = false;
        if (d > 0) {
            flag = true;
            System.out.println("La ecuación tiene dos raíces");
        }
        return flag;
    }

    public boolean tieneRaiz() {
        boolean bandera = false;
        if (d == 0) {
            bandera = true;
            System.out.println("La ecuación tiene una sola raíz");
        }
        return bandera;
    }

    public void obtenerRaices() {
        if (this.tieneRaices() == true) {
            g1 = (-b + Math.sqrt(d)) / (2 * a);
            g2 = (-b - Math.sqrt(d)) / (2 * a);
        }
    }

    public void obtenerRaiz() {
        if (this.tieneRaiz() == true) {
            g = -b / (2 * a);
        }
    }

    public void calcular() {
        if (tieneRaices()==true) {
            System.out.println(g1);
            System.out.println(g2);
        }else if (tieneRaiz()==true) {
            System.out.println(g);
        }else{
            System.out.println("La ecuación tiene raíces imaginarias");
        }
    }
}
