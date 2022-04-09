package Aula3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double c, tax, vfinal=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o montante investido: ");
        c = sc.nextDouble();
        System.out.print("Insira a taxa de juro mensal(em %): ");
        tax = sc.nextDouble();
        sc.close();
        if (c > 0 && c % 1000 == 0 && tax >= 0 && tax <= 5) {
            for (int i = 1; i <= 12; i++) {
                vfinal = c * Math.pow((1 + tax / 100), i);
                System.out.printf("Mes %d: %7.2f%n", i, vfinal);
            }
        } else {
            System.out.print("O montante investido tem de ser positivo e multiplo de 1000 e a taxa de juro mensal tem de variar entre 0 e 5.");
        }
    }
}
