/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Curso {

    Scanner consola = new Scanner(System.in);
    private String nameCurso, turno;
    private int precio, cantidadHpD, cantDpW;
    private String alumnos;

    public Curso() {
    }

    public Curso(String nameCurso, String turno, int precio, int cantidadHpD, int cantDpW) {
        this.nameCurso = nameCurso;
        this.turno = turno;
        this.precio = precio;
        this.cantidadHpD = cantidadHpD;
        this.cantDpW = cantDpW;
    }

    public Scanner getConsola() {
        return consola;
    }

    public void setConsola(Scanner consola) {
        this.consola = consola;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadHpD() {
        return cantidadHpD;
    }

    public void setCantidadHpD(int cantidadHpD) {
        this.cantidadHpD = cantidadHpD;
    }

    public int getCantDpW() {
        return cantDpW;
    }

    public void setCantDpW(int cantDpW) {
        this.cantDpW = cantDpW;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String cargarAlumnos() {
        System.out.println("Ingrese el nombre del alumno");
        alumnos = consola.nextLine();
        return alumnos;
    }

    public String crearCurso() {
        System.out.println("ingrese el nombre del curso");
        this.nameCurso = consola.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        this.cantidadHpD = consola.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        this.cantDpW = consola.nextInt();
        do {
            System.out.println("Ingrese el turno del curso (M/V)");
            this.turno = consola.next().toUpperCase();
        } while (!turno.equals("M") && !turno.equals("V"));
        System.out.println("Ingrese el precio");
        this.precio = consola.nextInt();
        return null;
    }

    public int calcularGananciaSemanal() {
        int GS = cantDpW * cantidadHpD * precio;
        System.out.println("La ganancia semanal es" + " $ " + GS);
        return GS;
    }
}
