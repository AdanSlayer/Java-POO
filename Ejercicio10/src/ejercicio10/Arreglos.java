/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author USER
 */
public class Arreglos {
    private int v1 [];
    private int v2 [];

    public Arreglos() {
    }

    public Arreglos(int[] v1, int[] v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        this.v1 = v1;
    }

    public int[] getV2() {
        return v2;
    }

    public void setV2(int[] v2) {
        this.v2 = v2;
    }
    
    public void azar(int v1[]){
        for (int i = 0; i < 50; i++) {
            v1[i]= (int)(Math.random()*20);
            System.out.print(v1[i]);
        }
    }

}
