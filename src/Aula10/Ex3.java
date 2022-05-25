package Aula10;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma String: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println(charPos(str));
    }

    public static String charPos(String s) {
        Map<Character, ArrayList<Integer>> mapa = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapa.put(s.charAt(i), new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i++) {
            mapa.get(s.charAt(i)).add(i);
        }

        return mapa.toString();
    }
}
