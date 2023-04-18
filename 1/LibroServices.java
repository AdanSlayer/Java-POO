package Servicios;

import Entidad.Libro;
import java.util.Scanner;

public class LibroServices {
    
    Scanner read = new Scanner(System.in);
    
    public Libro cargarLibro(Libro crearLibro){
        
        
        System.out.print("Ingresa el ISBN: ");
        crearLibro.setISBN(read.nextLine());
        System.out.print("Ingresa el Título del libro: ");
        crearLibro.setTitulo(read.nextLine());
        System.out.print("Ingresa el Autor: ");
        crearLibro.setAutor(read.nextLine());
        System.out.print("Ingresa el número de páginas: ");
        crearLibro.setNumPaginas(read.nextInt());
        return crearLibro;
        
    }
    
    public Libro informarLibro(Libro infoLibro){
        
        System.out.println(infoLibro.toString());
        return infoLibro;   
        
    }
}
