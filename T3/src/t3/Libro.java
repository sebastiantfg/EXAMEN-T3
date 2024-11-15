/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author PROPIETARIO
 */
public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Libro(String codigo, String titulo, String autor, int cantidadDisponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Métodos para registrar y devolver préstamo
    public void registrarPrestamo() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
            System.out.println("Préstamo registrado. Libros disponibles: " + cantidadDisponible);
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    public void devolverPrestamo() {
        cantidadDisponible++;
        System.out.println("Devolución registrada. Libros disponibles: " + cantidadDisponible);
    }
}
