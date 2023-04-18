/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Meses {

    Scanner read = new Scanner(System.in);
    private String mesSecreto;
    private String m;

    public Meses() {
    }

    public Meses(String mesSecreto, String m) {
        this.mesSecreto = mesSecreto;
        this.m = m;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public void adivinaMes() {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = meses[9];
        int c=0;
        do {
            if (c>0) {
                System.out.println("No ha acertado");
            }
            System.out.println("Adivine el mes secreto. Introduzca en minúscula");
            m = read.next();
            c++;
        } while (!m.equals(mesSecreto));
    }
}
