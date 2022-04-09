package Aula4;

import java.util.Scanner;
import java.lang.String;

public class Ex1 {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma String: ");
        input = sc.nextLine();
        System.out.printf("Em minusculas: %s%n", input.toLowerCase());
        System.out.printf("Em maiusculas: %s%n", input.toUpperCase());
        System.out.printf("Ultimo char: %s%n", input.charAt(input.length() - 1));
        if(input.length() >= 3) System.out.printf("Primeiros 3 chars: %s%n", input.substring(0, 3));
        System.out.printf("%s%n", input.lastIndexOf('a'));
        System.out.print(input.replace('a', 'A'));
        sc.close();
    }
}
