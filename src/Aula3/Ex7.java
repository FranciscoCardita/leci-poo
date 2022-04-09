package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int num, ans=0;
        int min = 0;
        int max = 100;
        String retry = "";
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        do {
            num = r.nextInt((max-min) + 1) + min;
            int numAttempts = 1;
            do {
                System.out.print("Insira um numero aleatorio: ");
                ans = sc.nextInt();
                if(ans > num) System.out.print("Valor alto!\n");
                else if(ans < num) System.out.print("Valor baixo!\n");
                else {
                    System.out.printf("Resposta correta!%nAcertou ao fim de %d tentativas.%n", numAttempts);
                }
                numAttempts++;
            } while (ans != num);
            System.out.print("Deseja recomecar? ");
            retry = sc.next();
        } while (retry.equals("S") || retry.equals("Sim"));
        sc.close();
    }
}
