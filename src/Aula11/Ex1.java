package Aula11;

import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("aula11_files/major.txt"));
        input.useDelimiter("[\\\t\n\r .,:';?!\\-*{}=+&/()\\[\\]\"\']+");
        TreeMap<String, TreeMap<String, Integer>> mapa = new TreeMap<>();
        ArrayList<String> words = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next().toLowerCase();
            if (word.length() > 2)
                words.add(word);
        }

        for (int i = 0; i < words.size() - 1; i++) {
            String current = words.get(i);
            String next = words.get(i + 1);

            if (!mapa.containsKey(current)) {
                TreeMap<String, Integer> pairs = new TreeMap<>();
                pairs.put(next, 1);
                mapa.put(current, pairs);
            } else {
                if (mapa.get(current).containsKey(next))
                    mapa.get(current).replace(next, mapa.get(current).get(next) + 1);
                else
                    mapa.get(current).put(next, 1);
            }
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : mapa.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}
