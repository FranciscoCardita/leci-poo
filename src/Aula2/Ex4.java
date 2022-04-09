package Aula2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double c, tax, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o capital investido: ");
        c = sc.nextDouble();
        System.out.print("Taxa de juro mensal (em %): ");
        tax = sc.nextDouble();
        tax = tax / 100;
        total = c * Math.pow(1 + tax,3);
        System.out.printf("Ao fim de 3 meses o montante sera de %.3f euros.", total);
        sc.close();
    }
}
