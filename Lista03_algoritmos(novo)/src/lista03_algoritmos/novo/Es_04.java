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
public class Es_04 {

    public static int somatoria(int n1) {
        int soma = 0;
        for (int i = 0; i <= n1; i++) {
            soma = soma + i;
        }
        return soma;
    }

    public static int fatorial(int n1) {
        int fat = 1;
        for (int i = 1; i <= n1; i++) {
            fat = fat * i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        int x, y, soma, div;

        System.out.println("número 1:");
        x = NN.nextInt();
        System.out.println("número 2:");
        y = NN.nextInt();

        soma = somatoria(x);
        div = fatorial(y);

        System.out.println(div / soma);
    }

}
