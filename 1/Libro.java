package Entidad;

public class Libro {
    
    public String ISBN;
    public String Titulo;
    private String Autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Información del Libro: ");
        sb.append("\nISBN = ").append(ISBN);
        sb.append("\nTitulo = ").append(Titulo);
        sb.append("\nAutor = ").append(Autor);
        sb.append("\nPáginas = ").append(numPaginas);
        return sb.toString();
    }
    
    
}
