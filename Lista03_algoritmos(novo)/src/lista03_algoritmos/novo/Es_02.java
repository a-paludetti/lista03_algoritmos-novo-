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
public class Es_02 {

    public static int somatoria(int n1) {
        int soma = 0;
        for (int i = 0; i <= n1; i++) {
            if (n1 < 0) {
                System.out.println("número invalido");
                break;
            } else {
                soma = soma + i;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("número: ");
        int n1 = NN.nextInt();
        
        int soma = somatoria(n1);
        System.out.println(soma);
    }

}
