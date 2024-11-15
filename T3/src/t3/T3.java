/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PROPIETARIO
 */
public class T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de ejemplo
        Libro libro = new Libro("001", "Programación en Java", "Autor Desconocido", 5);
        Estudiante estudiante = new Estudiante("E001", "Juan Pérez", "Ingeniería de Software");

        int opcion;
        do {
            System.out.println("\n--- Sistema de Gestión de Biblioteca ---");
            System.out.println("1. Ver información del libro");
            System.out.println("2. Registrar un préstamo");
            System.out.println("3. Registrar una devolución");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nInformación del Libro:");
                    System.out.println("Código: " + libro.getCodigo());
                    System.out.println("Título: " + libro.getTitulo());
                    System.out.println("Autor: " + libro.getAutor());
                    System.out.println("Cantidad disponible: " + libro.getCantidadDisponible());
                    break;

                case 2:
                    System.out.println("\nRegistrando préstamo...");
                    Date fechaPrestamo = new Date(); // Fecha actual como fecha de préstamo
                    Date fechaDevolucionEstimada = new Date(fechaPrestamo.getTime() + (7 * 24 * 60 * 60 * 1000)); // 7 días después
                    
                    Prestamo prestamo = new Prestamo(libro, estudiante, fechaPrestamo, fechaDevolucionEstimada);
                    libro.registrarPrestamo();
                    System.out.println("Préstamo registrado exitosamente para el estudiante: " + estudiante.getNombreCompleto());
                    System.out.println("Fecha de devolución estimada: " + fechaDevolucionEstimada);
                    break;

                case 3:
                    System.out.println("\nRegistrando devolución...");
                    libro.devolverPrestamo();
                    System.out.println("Devolución registrada exitosamente.");
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}