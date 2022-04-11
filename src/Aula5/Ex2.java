package Aula5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int firstWeekday=0, month=0, year=0, option=-1;
        boolean t = true;
        Calendar cal = new Calendar(firstWeekday, year);
        Scanner sc = new Scanner(System.in);
        while (t) {
            System.out.printf("%nCalendar operations:");
            System.out.printf("%n1 - create new calendar%n2 - print calendar month%n3 - print calendar%n0 - exit%n");
            System.out.printf("%nOperation: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Insira um dia da semana (1-domingo e 7-sabado): ");
                    firstWeekday = sc.nextInt();

                    System.out.print("Insira o ano: ");
                    year = sc.nextInt();
                    
                    if(firstWeekday >= 1 && firstWeekday <= 12 && year >= 1) cal = new Calendar(firstWeekday, year);
                    else System.out.println("\nInsira valores validos!");
                    break;
                case 2:
                    while(month < 1 || month > 12) {
                        System.out.print("Insira um mes: ");
                        month = sc.nextInt();
                    }
                    cal.printMonth(month);
                    break;
                case 3:
                    cal.toString();
                    break;
                case 0:
                    t = false;
                    System.out.print("Fim do programa.");
                    break;
                default:
                    System.out.println("\nInsira uma das 4 opcoes.");
                    break;
            }
        }
        sc.close();
    }
}
