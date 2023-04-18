/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10poo;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Cancion {
    Scanner read = new Scanner(System.in);
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void mostrarCancion(){
        System.out.println("ingrese el nombre de la cancion: ");
        titulo = read.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        autor = read.nextLine();
       
        System.out.println("el titulo es: "+titulo);
        System.out.println("el autor es: "+autor);
    }
    
}
