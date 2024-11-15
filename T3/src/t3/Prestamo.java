/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Date;

/**
 *
 * @author PROPIETARIO
 */
public class Prestamo {
    private Libro libro;
    private Estudiante estudiante;
    private Date fechaPrestamo;
    private Date fechaDevolucionEstimada;
    private Date fechaDevolucionReal;

    public Prestamo(Libro libro, Estudiante estudiante, Date fechaPrestamo, Date fechaDevolucionEstimada) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    // Getters y setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Date getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(Date fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public boolean esDevueltoFueraDePlazo() {
        return fechaDevolucionReal != null && fechaDevolucionReal.after(fechaDevolucionEstimada);
    }
}
