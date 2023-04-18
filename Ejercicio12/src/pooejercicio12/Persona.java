/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Persona {
    Scanner read=new Scanner(System.in);
    private String nombre;
    private Date fecha;
    private int age, age2;

    public Persona() {
    }

    public Persona(String nombre, Date fecha, int age, int age2) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.age = age;
        this.age2 = age2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void crearPersona(){
        System.out.println("Ingrese su nombre");
        nombre=read.nextLine();
        System.out.println("Ingrese su fecha de nacimiento AAAA-MM-DD");
        String fecha2=read.nextLine();
        LocalDate fecha= LocalDate.parse(fecha2);
        age=(int)calcularEdad(fecha);
        System.out.println("Usted tiene "+age+" años");
    }
    public long calcularEdad(LocalDate fecha){
        LocalDate fechaActual= LocalDate.now();
        return ChronoUnit.YEARS.between(fecha, fechaActual);
    }
    public boolean menorQue(){
        System.out.println("Ingrese otra edad");
        age2 = read.nextInt();
        System.out.println("La edad mayor es: " +Math.max(age, age2));
        return false;       
    }
    
    public Persona mostrarPersona() {
        System.out.println("Persona{" + "nombre=" + nombre + ", fecha=" + fecha + ", age=" + age + '}'); 
    }
}
