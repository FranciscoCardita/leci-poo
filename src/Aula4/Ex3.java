package Aula4;

import java.util.Scanner;
import java.lang.String;

public class Ex3 {
    public static void main(String[] args) {
        String input = "";
        System.out.print("Insira uma string: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(str[i].length() > 2) {
                System.out.print(str[i].charAt(0));
            }
        }
    }
}
