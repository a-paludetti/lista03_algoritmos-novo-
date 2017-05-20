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
public class EsC_04 {

    public static double soma(double x) {
        double soma = x + 2;
        return soma;
    }

    public static double square(double x) {
        double sqr = Math.pow(x, 2) - 4;
        return sqr;
    }

    public static double sub(double x) {
        double sub = (2 * x) - 1;
        return sub;
    }

    public static void funcao(double x) {
        if (x < -1) {
            System.out.println(soma(x));
        } else if (x == -1 && x <= 2) {
            System.out.print(square(x));
        } else {
            System.out.print(sub(x));
        }
    }

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.println("número:");
        double x = NN.nextDouble();

        funcao(x);
    }
}
