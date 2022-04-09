package Aula2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, d;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduza a abscissa de p1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduza a ordenada de p1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduza a abscissa de p2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduza a ordenada de p2: ");
        y2 = sc.nextDouble();

        d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.print("A distancia entre pontos e': " + d);
        sc.close();
    }
}
