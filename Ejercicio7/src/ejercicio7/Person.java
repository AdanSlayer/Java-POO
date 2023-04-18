/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Person {

    Scanner read = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Person() {
    }

    public Person(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
        System.out.println("Ingresa tu nombre");
        nombre = read.next();
        System.out.println("Ingresa tu edad");
        edad = read.nextInt();
        do {System.out.println("Ingresa tu sexo: H, M, O");
        sexo = read.next().toUpperCase();
        } while (!sexo.equals("H")&&!sexo.equals("M")&&!sexo.equals("O"));
        System.out.println("Ingresa tu peso en kg :(");
        peso = read.nextDouble();
        System.out.println("Ingresea tu altura en m");
        altura = read.nextDouble();
    }
    public void calcularIMC(){
        double imc = peso/Math.pow(altura, 2);
        System.out.println("Tu IMC es de: "+imc);
        if (imc<20) {
            System.out.println("-1");
            
        }else if(imc>25){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    
    }
    public void esMayorDeEdad(){
        boolean mayoria;
        if (edad<18) {
            mayoria=false;
        }
    }
    
}
