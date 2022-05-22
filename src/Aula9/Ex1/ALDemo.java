package Aula9.Ex1;

import java.util.*;

import Aula5.Date;
import Aula6.Ex1.Pessoa;

public class ALDemo {

    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        //*ArrayList
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        System.out.println(c2.subList(0, 2));
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        //*HashSet
        Set<Pessoa> c3 = new HashSet<>();
        Pessoa rui = new Pessoa("Rui Emanuel", 54321, new Date(25, 9, 2001));
        Pessoa ramiro = new Pessoa("Ramiro", 12345, new Date(20, 12, 2000));
        Pessoa vasco = new Pessoa("Vasco", 99999, new Date(2, 7, 2001));
        Pessoa constantino = new Pessoa("Constantino", 11111, new Date(6, 10, 2001));
        Pessoa bruno = new Pessoa("Bruno", 98765, new Date(26, 4, 2001));
        c3.add(rui);
        c3.add(ramiro);
        c3.add(vasco);
        c3.add(constantino);
        c3.add(bruno);
        c3.add(bruno);
        for(Pessoa pessoa : c3) System.out.println(pessoa);

        //*TreeSet
        // Set<Aula7.Ex2.Date> c4 = new TreeSet<>();
        // DateYMD d1 = new DateYMD(23, 4, 1944);
        // DateYMD d2 = new DateYMD(14, 8, 1961);
        // DateYMD d3 = new DateYMD(18, 8, 1956);
        // c4.add(d1);
        // c4.add(d2);
        // c4.add(d3);
        // for (Aula7.Ex2.Date date : c4) System.out.println(date);
    }
}
