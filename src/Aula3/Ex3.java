package Aula3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n=0;
        boolean flag = false;
        boolean isPrime = true;
        System.out.print("Introduza um valor positivo: ");
        while(!flag) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.close();
            if(n < 0) System.out.print("O valor invalido.");
            else flag = true;
        }
        for (int i = n-1; i > 1; i--) {
            if(n%i == 0) isPrime = false;
        }
        if(n == 0 || n ==1) System.out.print(n + " nao e' numero primo.");
        else if(isPrime) System.out.print(n + " e' numero primo.");
        else System.out.print(n + " nao e' numero primo.");
    }
}
