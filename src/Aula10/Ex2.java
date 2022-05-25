package Aula10;

import java.util.*;
import java.lang.Math;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, HashSet<String>> mapa = new TreeMap<>();

        // Put
        mapa.put("Branco", new HashSet<>(Arrays.asList("Que tem a cor da neve")));
        mapa.put("Preto", new HashSet<>(Arrays.asList("Que tem a cor do cafe")));
        mapa.put("Verde", new HashSet<>(Arrays.asList("Que tem a cor da relva", "Esperanca")));
        mapa.put("Vermelho", new HashSet<>(Arrays.asList("Que tem a cor do sangue", "Paixao")));
        mapa.put("Azul", new HashSet<>(Arrays.asList("Que tem a cor do ceu")));
        mapa.put("Amarelo", new HashSet<>(Arrays.asList("Que tem a cor dos girassois")));
        mapa.put("Transparente", new HashSet<>(Arrays.asList("Que nao tem cor")));

        // Remove
        mapa.remove("Transparente");

        // Change
        mapa.get("Branco").add("Descorado, palido");
        mapa.get("Branco").add("Cor do leite");
        mapa.get("Verde").add("Sporting");
        mapa.get("Vermelho").add("Benfica");
        mapa.get("Azul").add("Porto");

        Scanner sc = new Scanner(System.in);
        System.out.printf("%n%s %n%s %n%s %n%s %n%s %n%s %n%nInsira um dos termos acima: ", "Branco", "Preto", "Verde",
                "Vermelho", "Azul", "Amarelo");
        String input = sc.nextLine();
        System.out.println(getRandom(mapa.get(input)));
        sc.close();
    }

    public static String getRandom(HashSet<String> set) {
        int n = (int) (Math.random() * set.size());
        int i = 0;
        for (String str : set) {
            if (i == n)
                return str;
            i++;
        }
        return null;
    }
}
