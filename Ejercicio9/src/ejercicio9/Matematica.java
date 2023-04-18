/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author USER
 */
public class Matematica {
    private double num1,num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    public double devolverMayor(){
        return Math.max(num1, num2);
    }
    public double calcularPotencia(){
        double max= devolverMayor();
        double min= Math.min(num1, num2);  
        return Math.pow(max, min);
    }
    public double calculaRaiz(){
        return Math.sqrt(Math.min(num1, num2));
    }
}
