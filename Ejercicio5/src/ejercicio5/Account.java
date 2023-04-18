/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Account {

    Scanner read = new Scanner(System.in);
    Cuenta dato = new Cuenta();

    public void crearCuenta() {
        System.out.println("Ingrese numero de cuenta");
        dato.setNumeroCuenta(read.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        dato.setDniCliente(read.nextLong());
        System.out.println("Ingrese el saldo");
        dato.setSaldoActual(read.nextInt());
    }

    public void ingresar() {
        System.out.println("Ingrese la cantidad a ingresar");
        dato.setSaldoActual((int) (dato.getSaldoActual() + read.nextDouble()));
        System.out.println("Su saldo actual es de: "+dato.getSaldoActual()+" dólares");
    }

    public void retirar() {

        System.out.println("Ingrese la cantidad a reitirar");
        double retiro = read.nextDouble();

        if (retiro <= dato.getSaldoActual()) {
            dato.setSaldoActual((int) (dato.getSaldoActual() - retiro));
        } else {
            dato.setSaldoActual(0);
        }
        System.out.println("Su saldo actual es de: "+dato.getSaldoActual()+" dólares");
    }

    public void extraccionRapida() {
        System.out.println("Ingrese una cantidad a retirar (max=20% del saldo)");
        double retiro = read.nextDouble();
        if (retiro <= 0.2 * (dato.getSaldoActual())) {
            dato.setSaldoActual((int) (dato.getSaldoActual() - retiro));
        } else {
            System.out.println("El retiro supera el 20%");
        }
        System.out.println("Su saldo actual es de: "+dato.getSaldoActual()+" dólares");
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: "+dato.getSaldoActual()+" dólares");
    }

    public void consultarDatos() {
        System.out.println("Su no. de cta. es: "+ dato.getNumeroCuenta());
        System.out.println("Su no. de DNI es: "+ dato.getDniCliente());
        System.out.println("Su saldo actual es de: " + dato.getSaldoActual()+" dólares");
    }
    
}
