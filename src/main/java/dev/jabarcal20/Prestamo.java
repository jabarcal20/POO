package dev.jabarcal20;

public class Prestamo {
    String nombreEstudiante;
    String tituloLibro;
    String autor;
    String fechaInicio;
    String fechaFin;
    String estado;

    public Prestamo(String nombreEstudiante, String tituloLibro, String autor, String fechaInicio, String fechaFin, String estado) {
        this.nombreEstudiante = nombreEstudiante;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }
    public void entregarLibro(){
        System.out.println("Libro entregado");
    }

    public void registrarDatosEstudiante(){
        System.out.println("Nombre Estudiante: " + this.nombreEstudiante);
    }
    public void registrarDatosLibroPrestado(){
        System.out.println("Titulo Libro: " + this.tituloLibro);
        System.out.println("Autor: " + this.autor);
        System.out.println("Fecha Inicio prestamo: " + this.fechaInicio);
        System.out.println("Fecha Fin prestamo: " + this.fechaFin);
        System.out.println("Estado del libro: " + this.estado);
    }
}
