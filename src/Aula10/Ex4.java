package Aula10;

import java.util.*;
import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        List<String> twoPlus = new ArrayList<>();
        List<String> allWords = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if (word.length() > 2)
                twoPlus.add(word);
            allWords.add(word);
        }

        System.out.println("---------Todas as palavras terminadas em 's'---------");
        endsWithS(allWords);
        System.out.println("-----------------------------------------------------");

        List<String> aux = new ArrayList<>();
        for (String string : twoPlus)
            if (string.matches("[a-zA-Z]+"))
                aux.add(string);
        twoPlus.clear();
        twoPlus.addAll(aux);

        System.out.println(twoPlus.toString()); // Testar
    }

    public static void endsWithS(List<String> allWords) {
        for (String str : allWords)
            if (str.toLowerCase().endsWith("s"))
                System.out.println(str);
    }
}
