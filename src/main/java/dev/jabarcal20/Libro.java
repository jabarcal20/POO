package dev.jabarcal20;

/* Deje fuera la cantidad de paginas ya que no deberia ser informacion relevante bajo el contexto de
 crear una clase libro para posteriormente realizar un prestamo de un libro */

public class Libro {
    String titulo;
    String autor;
    int anio;
    String editorial;

    public Libro(String titulo, int anio, String autor, String editorial) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void leer(){
        System.out.println("Ingrese el titulo del libro");
    }

    public void escribir(){
        System.out.println("Ingrese el autor del libro");
    }

    public void abrir(){
        System.out.println("Abriendo el libro");
    }

    public void cerrar(){
        System.out.println("Cerrando el libro");
    }
}
