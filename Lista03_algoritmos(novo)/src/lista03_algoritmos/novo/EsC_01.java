/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03_algoritmos.novo;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class EsC_01 {

    static String imprimirNota(double n1) {
        String nota;
        if (n1 >= 6) {
            nota = "Aprovado";
        } else {
            nota = "Reprovado";
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        double nota;
        String status = "";

        System.out.println("Nota: ");
        nota = NN.nextDouble();
        status = imprimirNota(nota);
        
        System.out.println(status);
    }
}
