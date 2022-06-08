package Aula12;

import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("words.txt"));
        input.useDelimiter("[\\p{Punct}\\s]+");
        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        while (input.hasNext()) {
            set.add(input.next());
            cnt++;
        }
        System.out.println("Numero Total de Palavras: " + cnt);
        System.out.println("Numero de Diferentes Palavras: " + set.size());
    }
}
