package Aula10;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, String> colours = new HashMap<>();

        colours.put("Branco", "Que tem a cor da neve");
        colours.put("Preto", "Que tem a cor do cafe");
        colours.put("Verde", "Que tem a cor da relva");
        colours.put("Vermelho", "Que tem a cor do sangue");
        colours.put("Azul", "Que tem a cor do ceu");
        colours.put("Amarelo", "Que tem a cor das rosas");
        colours.put("Transparente", "Que nao tem cor");
        colours.replace("Amarelo", "Que tem a cor do girassol");
        colours.remove("Transparente");

        System.out.println(colours.toString());
        System.out.println(colours.keySet());
        System.out.println(colours.values());
    }
}
