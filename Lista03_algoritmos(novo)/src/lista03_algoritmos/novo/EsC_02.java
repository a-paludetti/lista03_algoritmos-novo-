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
public class EsC_02 {

    public static int compare(int n1, int n2) {
        int maior;
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        int x, y, maior;
        
        System.out.println("número 1:");
        x = NN.nextInt();
        System.out.println("número 2:");
        y = NN.nextInt();
        
        maior = compare(x, y);
        System.out.println(maior);
    }
}
