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

    public static double entrada() {
        double N = imprimir.nextDouble();
        return N;
    }

    public static double add(double x, double y) {
        double add = x + y;
        return add;
    }

    public static double multi(double x, double y) {
        double m = x * y;
        return m;
    }

    public static double sub(double x, double y) {
        double sub = x - y;
        return sub;
    }

    public static double div(double x, double y) {
        double D = x / y;
        return D;
    }

    public static double pow(double x, double y) {
        double pow = Math.pow(x, y);
        return pow;
    }

    public static double root(double x) {
        double root = Math.sqrt(x);
        return root;
    }

    public static int menu() {
        System.out.println("#-*-*-*CALCULADORA*-*-*-#");
        System.out.println("# 1 - Soma              #");
        System.out.println("# 2 - Subtração         #");
        System.out.println("# 3 - Multiplicação     #");
        System.out.println("# 4 - Divisão           #");
        System.out.println("# 5 - Raiz              #");
        System.out.println("# 6 - Potencia          #");
        System.out.println("#-*-*-*-*-*-*-*-*-*-*-*-#");
        int opcao = imprimir.nextInt();
        return opcao;
    }

    public static double opcao(int n1) {
        double x, y, R = 0;

        switch (n1) {
            case 1:
                System.out.print("primeiro número: ");
                x = entrada();
                System.out.print("segundo número: ");
                y = entrada();
                R = add(x, y);
                break;
            case 2:
                System.out.print("primeiro número: ");
                x = entrada();
                System.out.print("segundo número: ");
                y = entrada();
                R = sub(x, y);
                break;
            case 3:
                System.out.print("primeiro número: ");
                x = entrada();
                System.out.print("segundo número: ");
                y = entrada();
                R = multi(x, y);
                break;
            case 4:
                System.out.print("primeiro número: ");
                x = entrada();
                System.out.print("segundo número: ");
                y = entrada();
                R = div(x, y);
                break;
            case 5:
                System.out.print("número: ");
                x = entrada();
                R = root(x);

                break;
            case 6:
                System.out.print("primeiro número: ");
                x = entrada();
                System.out.print("segundo número: ");
                y = entrada();
                R = pow(x, y);
                break;
            default:
                System.out.println("~*~*INVALIDO*~*~");
                break;
        }

        return R;
    }

    public static void main(String[] args) {
        int n = menu();
        System.out.println(opcao(n));
    }
}
