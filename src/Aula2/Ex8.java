package Aula2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        double a, b, hip, ang;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o valor do cateto A: ");
        a = sc.nextDouble();
        System.out.print("Introduza o valor do cateto B: ");
        b = sc.nextDouble();

        if (a > 0 && b > 0) {
            hip = Math.sqrt(a * a + b * b);
            ang = Math.toDegrees(Math.acos(a / hip));
            System.out.printf("A hipotenusa e' igual a %.02f e faz um angulo de %.02fº com o cateto A.", hip, ang);
        } else {
            System.out.print("Por favor, introduza valores positivos.");
        }
        sc.close();
    }
}
