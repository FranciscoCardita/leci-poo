package Aula2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double m, ti, tf, q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza a massa de agua (em Kg): ");
        m = sc.nextDouble();
        System.out.print("Temperatura inicial da agua: ");
        ti = sc.nextDouble();
        System.out.print("Temperatura final da agua: ");
        tf = sc.nextDouble();
        q = m * (tf - ti) * 4184;
        System.out.println("Energia necessaria: " + q + " J.");
        sc.close();
    }
}
