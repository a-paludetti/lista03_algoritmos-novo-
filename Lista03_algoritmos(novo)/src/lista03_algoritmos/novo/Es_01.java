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
public class Es_01 {

    public static int comparacao(int n1, int n2) {
        int menor;

        if (n1 > n2) {
            menor = n2;
        } else {
            menor = n1;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.println("Número");
        int N1 = NN.nextInt();
        System.out.println("Número");
        int N2 = NN.nextInt();
        System.out.println("Número");
        int N3 = NN.nextInt();

        int menor = comparacao(N1, N2);
        int menor2 = comparacao(menor, N3);

        System.out.println(menor2);
    }

}
