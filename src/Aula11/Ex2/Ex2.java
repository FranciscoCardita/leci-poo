package Aula11.Ex2;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.Map.Entry;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Voo> voos = registarVoos();
        listarVoos(voos);
        infoPublico(voos);
        System.out.println(atrasoMedio(voos));
        cidades(listarChegadas(voos));
    }

    public static ArrayList<Voo> registarVoos() throws IOException {
        ArrayList<Voo> voos = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("aula11_files/voos.txt"));
        lines.remove(lines.get(0));
        for (int i = 0; i < lines.size(); i++) {
            String[] info = lines.get(i).split("\t");
            if (info.length == 3)
                voos.add(new Voo(info[0], info[1], info[2], ""));
            else
                voos.add(new Voo(info[0], info[1], info[2], info[3]));

        }
        return voos;
    }

    public static void listarVoos(ArrayList<Voo> voos) {
        System.out.printf("%-5s\t%-7s\t%-19s\t%-20s\t%-6s\t%s%n", "Hora", "Voo", "Companhia", "Origem", "Atraso",
                "Obs");
        for (Voo voo : voos)
            System.out.println(voo.toString());
        ;
    }

    public static void infoPublico(ArrayList<Voo> voos) throws IOException {
        PrintWriter out = new PrintWriter(new File("aula11_files/Infopublico.txt"));
        out.printf("%-5s\t%-7s\t%-19s\t%-20s\t%-6s\t%s%n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        for (Voo voo : voos)
            out.println(voo.toString());
        out.close();
    }

    public static String atrasoMedio(ArrayList<Voo> voos) {
        HashMap<String, ArrayList<String>> atrasos = new HashMap<>();
        String cabecalho = String.format("%n%-20s\t%-12s%n", "Companhia", "Atraso medio");
        for (Voo voo : voos) {
            if (!voo.getAtraso().equals("")) {
                atrasos.putIfAbsent(voo.getCompanhia(), new ArrayList<>());
                atrasos.get(voo.getCompanhia()).add(voo.getAtraso());
            }
        }

        HashMap<String, String> medias = new HashMap<>();
        for (String companhia : atrasos.keySet())
            medias.put(companhia, calcMedia(atrasos.get(companhia)));

        ArrayList<String> horas = new ArrayList<>();
        for (String str : medias.values())
            horas.add(str);
        Collections.sort(horas);

        String corpo = "";
        for (String hora : horas) {
            for (Entry<String, String> entry : medias.entrySet())
                if (entry.getValue() == hora)
                    corpo += String.format("%-20s\t%-12s%n", entry.getKey(), hora);
        }
        return cabecalho + corpo;
    }

    public static String listarChegadas(ArrayList<Voo> voos) {
        HashMap<String, Integer> chegadas = new HashMap<>();
        for (Voo voo : voos) {
            chegadas.putIfAbsent(voo.getOrigem(), 0);
            chegadas.put(voo.getOrigem(), chegadas.get(voo.getOrigem()) + 1);
        }
        HashMap<String, Integer> chegadasOrdenadas = new LinkedHashMap<>();
        chegadas.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> chegadasOrdenadas.put(x.getKey(), x.getValue()));
        String cabecalho = String.format("%-20s\t%s%n", "Origem", "Voos");
        String corpo = "";
        for (String key : chegadasOrdenadas.keySet())
            corpo += String.format("%-20s\t%d%n", key, chegadasOrdenadas.get(key));
        return cabecalho + corpo;
    }

    public static void cidades(String chegadas) throws IOException {
        PrintWriter out = new PrintWriter(new File("aula11_files/cidades.txt"));
        out.print(chegadas);
        out.close();
    }

    private static String calcMedia(ArrayList<String> atrasos) {
        int i = 0;
        for (String str : atrasos) {
            i += Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(3));
        }
        int media = i / atrasos.size();
        int min = media % 60;
        int hora = (media - min) / 60;
        return String.format("%02d:%02d", hora, min);
    }
}
