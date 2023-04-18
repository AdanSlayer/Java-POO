/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author USER
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account cuenta = new Account();
        cuenta.crearCuenta();
        cuenta.ingresar();
        cuenta.retirar();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
        
    }
    
}
