/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej4rectangulo;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Rectangulo {
     private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularSuperficie(){
        return this.base*this.altura;
    }
    
    public double calcularPerimetro(){
        return (this.base+this.altura)*2;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        

        
    }
    
    public Rectangulo crearRectangulo(Rectangulo rec){
         Scanner leer=new Scanner(System.in);     
         
        System.out.println("Ingrese la base");
        rec.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura");
        rec.setAltura(leer.nextDouble());
        return rec;
    }
}
