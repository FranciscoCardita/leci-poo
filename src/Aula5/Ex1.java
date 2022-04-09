//package Aula5;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        int day=0, month=0, year=0, option=0;
        boolean t = true;
        Date date = new Date(day, month, year);
        Scanner sc = new Scanner(System.in);
        while(t) {
            System.out.printf("%nDate operations:");
            System.out.printf("%n1 - create new date%n2 - show current date%n3 - increment date%n4 - decrement date%n0 - exit%n");
            System.out.printf("%nOperation: ");
            option = sc.nextInt();
            switch(option) {
                case 0:
                    t = false;
                    System.out.print("Fim do programa.");
                    break;
                case 1:
                    System.out.print("Insira o dia: ");
                    day = sc.nextInt();

                    System.out.print("Insira o mes: ");
                    month = sc.nextInt();

                    System.out.print("Insira o ano: ");
                    year = sc.nextInt();

                    if(!date.valid(day, month, year)) {
                        System.out.printf("%n---Insira uma data valida!---%n");
                    } else date.set(day, month, year);
                    break;
                case 2:
                    System.out.printf("%s%n", date.toString());
                    break;
                case 3:
                    date.increment();
                    break;
                case 4:
                    date.decrement();
                    break;
                default:
                    System.out.print("Operacao invalida!");
                    break;
            }
        } sc.close();
    }
}
