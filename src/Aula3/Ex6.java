package Aula3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int month=0, year=0, days;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while(!flag) {
            System.out.print("Insira o mes: ");
            month = sc.nextInt();
            System.out.print("Insira o ano: ");
            year = sc.nextInt();
            if (month > 0 && month <= 12 && year > 0) flag = true;
        }
        sc.close();
        if(month == 2) {
            if (year % 4 == 0) {
                days = 29;
                if(year % 100 == 0 && !(year % 400 == 0)) days = 28;
            } else days = 28;

        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;

        } else days = 31;
        System.out.printf("O mes %d do ano %d tem %d dias.", month, year, days);
    }
}
