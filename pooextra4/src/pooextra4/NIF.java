/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NIF {
    Scanner read = new Scanner(System.in);
    private long dni;
    private String letra;

    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }




    public void crearNif(){
        int r;
        System.out.println("Ingrese su DNI");
        dni=read.nextLong();
        r=(int) (dni%23);
        String[] letters = {"T", "R", "W'", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        letra=letters[r];
    }
    public void mostrar(){
        System.out.println(dni+"-"+letra);
    }
}
