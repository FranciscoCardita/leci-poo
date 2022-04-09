package Aula2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double c, f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o valor em ºC: ");
        c = sc.nextDouble();
        sc.close();
        if (c < -273.15) {
            System.out.print("A fisica nao permite um valor tao baixo!");
        } else {
            f = 1.8 * c + 32;
            System.out.print(c + " ºC equivalem a " + f + " ºF.");
        }
    }
}
