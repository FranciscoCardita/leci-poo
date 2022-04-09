package Aula3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double p=0, t=0, f=0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while(!flag) {
            System.out.print("Introduza a nota da componente pratica: ");
            p = sc.nextDouble();
            System.out.print("Introduza a nota da componente teorica: ");
            t = sc.nextDouble();
            if(p <= 0 || p >= 20 || t >= 20 || t <= 0) System.out.println("Introduza notas entre 0 e 20!");
            else flag = true;
        }
        if(p < 7 || t < 7) System.out.print("66 (reprovado por nota minima).");
        else {
            f = Math.round(0.4 * t + 0.6 * p);
            System.out.print("Nota final: " + (int)f);
        }
        sc.close();
    }
}
