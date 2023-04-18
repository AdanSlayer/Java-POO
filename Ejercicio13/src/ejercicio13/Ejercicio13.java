/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author USER
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso course= new Curso();
        course.cargarAlumnos();
        course.crearCurso();
        course.calcularGananciaSemanal();
        Curso course2= new Curso();
        course2.cargarAlumnos();
        course2.crearCurso();
        course2.calcularGananciaSemanal();
        Curso course3= new Curso();
        course3.cargarAlumnos();
        course3.crearCurso();
        course3.calcularGananciaSemanal();
        Curso course4= new Curso();
        course4.cargarAlumnos();
        course4.crearCurso();
        course4.calcularGananciaSemanal();
        Curso course5= new Curso();
        course5.cargarAlumnos();
        course5.crearCurso();
        course5.calcularGananciaSemanal();
        int GT=course.calcularGananciaSemanal()+ course2.calcularGananciaSemanal()+
                course3.calcularGananciaSemanal()+ course4.calcularGananciaSemanal()+
                course5.calcularGananciaSemanal();
        System.out.println("La ganancia TOTAL es: $"+GT);
    }
    
}
