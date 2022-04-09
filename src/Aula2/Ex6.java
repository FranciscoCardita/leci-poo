package Aula2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int input=0, h = 0, m = 0, s = 0;
        Boolean done = false;
        System.out.print("Introduza o numero de segundos: ");
        while (!done) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                sc.close();
                done = true;
            } catch (Exception e) {
                System.out.printf("Introduza um valor valido.%nValor: ");
            }
        }
        h = input / 3600;
        m = input % 3600 / 60;
        s = input % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
