package Aula2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double km=0, miles;
        boolean flag = false;
        System.out.print("Introduza o valor em km: ");
        
        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                km = sc.nextDouble();
                sc.close();
                flag = true;
            } catch (Exception e) {
                System.out.printf("Introduza um valor valido.%nIntroduza o valor em km: : ");
            }
        }
        if (km > 0) {
            miles = km * 1.609;
            System.out.print(km + " Km equivale a " + miles + " milhas");
        } else {
            System.out.print("O valor nao e' positivo.");
        }
    }
}
