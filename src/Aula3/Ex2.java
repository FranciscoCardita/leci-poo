package Aula3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n=0;
        System.out.print("Introduza um valor positivo: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        if(n < 0) System.out.print("O valor tem de ser positivo.");
        for(; n >= 0; n--) {
            if(n > 0) System.out.printf("%d, ", n);
            else if(n == 0) System.out.print(n);
        }
    }
}