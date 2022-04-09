package Aula4;

import java.util.Scanner;
import java.lang.String;

public class Ex4 {
    public static void main(String[] args) {
        String date = read();
        printCalendar(date, numDays(date));
    }

    public static String read() {
        int month=0, year=0, day=0;
        Scanner sc = new Scanner(System.in);
        while (!(month > 0 && month <= 12)) {
            System.out.print("Insira o mes: ");
            month = sc.nextInt();
        }
        while (!(year > 0)) {
            System.out.print("Insira o ano: ");
            year = sc.nextInt();
        }
        while (!(day > 0 && day <= 7)) {
            System.out.print("Insira o primeiro dia da semana do mes: ");
            day = sc.nextInt();
        }
        sc.close();
        String date = month + "/" + year + "/" + day;
        return date;
    }

    public static int numDays(String str) {
        int num = 0;
        String[] s = str.split("/");
        int m = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                num = 30;
                break;
            case 2:
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                    num = 29;
                } else num = 28;
                break;
            default: num = 31;
                break;
        }
        return num;
    } 

    public static void printCalendar(String s, int daysMonth) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] date = s.split("/");
        int month = Integer.parseInt(date[0]);
        int year = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf(" %10s %s%n", months[month-1], year);
        System.out.println(" Su Mo Tu We Th Fr Sa");
        String str = new String(("   ").repeat(day - 1));
        for (int i = 1; i <= daysMonth; i++) {
            if(day == 7) {
                str += String.format("%3d%n", i);
                day = 1;
            } else {
                str += String.format("%3d", i);
                day++;
            }
        }
        System.out.print(str);
    }
}
