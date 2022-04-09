package Aula3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double ini, n=0, avg=0, sum=0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza um valor: ");
        ini = sc.nextDouble();
        if(ini == 0) n = ini + 1;
        double min = ini;
        double max = ini;
        while (n != ini) {
            System.out.print("(Introduza o primeiro valor para terminar o programa): ");
            n = sc.nextDouble();
            if(n < min) min = n;
            else if(n > max) max = n;
            sum += n;
            i++;
            avg = (sum + ini) / i;
        }
        sum += ini;
        System.out.printf("%3.1f %n%3.1f %n%3.1f %n%3.1f %n", min, max, avg, sum);
        sc.close();
    }
}