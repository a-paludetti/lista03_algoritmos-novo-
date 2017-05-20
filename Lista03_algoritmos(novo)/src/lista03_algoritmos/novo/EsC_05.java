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
public class EsC_05 {
    static Scanner imprimir = new Scanner(System.in);
    
    static void entrada(){
        int N = imprimir.nextInt();
    }
    
    public static double add(double x, double y){
        double add = x + y;
        return add;
    }
    
    public static double multi(double x, double y){
        double m = x * y;
        return m;
    }
    
    public static double sub(double x, double y){
        double sub = x - y;
        return sub;
    }
    
    public static double div(double x, double y){
        double D = x/y;
        return D;
    }
    
    public static double pow(double x, double y){
        double pow = Math.pow(x, y);
        return pow;
    }
    
    public static double root(double x){
        double root = Math.sqrt(x);
        return root;
    }
    
    double static int menu(){
        
    }
    
}
