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
public class Es_03 {

    public static int fatorial(int n1) {
        int fat = 1;
        for (int i = 1; i <= n1; i++) {
            fat = fat * i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.println("número:");
        int x = NN.nextInt();

        int fact = fatorial(x);
        System.out.println(fact);
    }
}
