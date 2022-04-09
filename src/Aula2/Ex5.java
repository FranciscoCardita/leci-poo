package Aula2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double v1, v2, d1, d2, t1, t2, vm;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a velocidade da primeira etapa: ");
        v1 = sc.nextDouble();
        System.out.print("Insira a distancia percorrida na primeira etapa: ");
        d1 = sc.nextDouble();
        System.out.print("Insira a velocidade da segunda etapa: ");
        v2 = sc.nextDouble();
        System.out.print("Insira a distancia percorrida na segunda etapa: ");
        d2 = sc.nextDouble();

        if(d1 < 0) {
            d1 = d1 * (-1);
        }
        if(d2 < 0) {
            d2 = d2 * (-1);
        }

        t1 = d1 / v1;
        t2 = d2 / v2;
        vm = (d1 + d2) / (t1 + t2);

        System.out.printf("A velocidade media final e': %.2f", vm);
        sc.close();
    }
}