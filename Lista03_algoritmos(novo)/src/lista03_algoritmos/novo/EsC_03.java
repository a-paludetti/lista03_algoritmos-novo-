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
public class EsC_03 {
    
    public static void para(int x) {
        if (x % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
    
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        int n1;
        
        System.out.println("número: ");
        n1 = NN.nextInt();
        
        para(n1);
    }
}
