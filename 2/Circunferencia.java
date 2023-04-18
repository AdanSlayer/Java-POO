package ejercicio2;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        this.radio =leer.nextDouble();
    }
    
    public double area(){
        return Math.PI* Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2 * Math.PI* radio;
}
}

