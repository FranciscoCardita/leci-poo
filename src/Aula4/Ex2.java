package Aula4;

import java.util.Scanner;
import java.lang.String;

public class Ex2 {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma string: ");
        input = sc.nextLine();
        sc.close();
        System.out.printf("Nr de chars numericos: %d%n", countDigit(input));
        System.out.printf("Nr de espacos: %d%n", nrSpaces(input));
        System.out.printf("So contem minusculas: %b%n", onlyLowercase(input));
        System.out.printf("Remove whitespaces: %s%n", singleSpace(input));
        System.out.printf("E' palindromo: %b%n", isPalindrome(input));
    }

    public static int countDigit(String s) {
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') num++;
        }
        return num;
    }

    public static int nrSpaces(String s) {
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') num++;
        }
        return num;
    }

    public static boolean onlyLowercase(String s) {
        Boolean lowercase = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                lowercase = false;
            }
        }
        return lowercase;
    }

    public static String singleSpace(String s) {
        String str = s.trim().replaceAll(" +", " ");
        return str;
    }

    public static boolean isPalindrome(String s) {
        Boolean palindrome = true;
        String str = s.trim().replaceAll(" +", "");
        int j = str.length() - 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if(i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    palindrome = false;
                }
            }
            j--;
        }
        return palindrome;
    }
}
