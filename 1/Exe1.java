package exe.pkg1;

import Entidad.Libro;
import Servicios.LibroServices;

public class Exe1 {

    public static void main(String[] args) {
        
        LibroServices libServicio = new LibroServices();
        Libro crearLibro = new Libro();
        libServicio.cargarLibro(crearLibro);
        System.out.println("");
        libServicio.informarLibro(crearLibro);
       
    }
    
}
