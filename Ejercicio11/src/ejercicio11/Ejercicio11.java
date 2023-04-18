/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha en formato AAAA-MM-DD: ");
        String fechaStr = scanner.nextLine();

        LocalDate fecha = LocalDate.parse(fechaStr);

        long diferenciaEnAnios1 = calcularDiferenciaEnAnios(fecha);
        
        System.out.println("la fecha actual es: "+ LocalDate.now());
        System.out.println("La diferencia entre la fecha ingresada y la fecha actual es de " + diferenciaEnAnios1 + " años.");
    }

    public static long calcularDiferenciaEnAnios(LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.YEARS.between(fecha, fechaActual);
    }
    }
