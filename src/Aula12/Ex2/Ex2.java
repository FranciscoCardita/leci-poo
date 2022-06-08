package Aula12.Ex2;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Movie> movie = registerMovies();
        listMovies(movie);
        sortedBy(movie);
        genres(movie);
        wrtFile(movie, "aula12_files/myselection.txt");
    }

    public static ArrayList<Movie> registerMovies() throws IOException {
        ArrayList<Movie> movie = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("aula12_files/movies.txt"));
        lines.remove(lines.get(0));
        for (String ln : lines) {
            String[] info = ln.split("\t");
            movie.add(new Movie(info[0], Float.parseFloat(info[1]), info[2], info[3], Integer.parseInt(info[4])));
        }
        movie.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        return movie;
    }

    public static void listMovies(ArrayList<Movie> movie) {
        System.out.printf("%-40s\t%-5s\t%-6s\t%-10s\t%s%n", "name", "score", "rating", "genre", "running time");
        for (Movie movies : movie)
            System.out.println(movies);
    }

    public static void sortedBy(ArrayList<Movie> movie) {
        String str = "=";

        System.out.println(str.repeat(30) + " Sorted by score " + str.repeat(30));
        movie.sort((a, b) -> Float.compare(b.getScore(), a.getScore()));
        for (Movie movies : movie)
            System.out.println(movies);

        System.out.println(str.repeat(27) + " Sorted by running time " + str.repeat(27));
        movie.sort((a, b) -> Integer.compare(a.getRunningTime(), b.getRunningTime()));
        for (Movie movies : movie)
            System.out.println(movies);
    }

    public static void genres(ArrayList<Movie> movie) {
        HashSet<String> set = new HashSet<>();
        for (Movie movies : movie)
            set.add(movies.getGenre());
        System.out.println(set);
    }

    public static void wrtFile(ArrayList<Movie> movie, String path) throws IOException {
        PrintWriter out = new PrintWriter(new File(path));
        String s = String.format("%-40s\t%-5s\t%-6s\t%-10s\t%s%n", "name", "score", "rating", "genre", "running time");
        out.print(s);
        for (Movie movies : movie) {
            if (movies.getScore() > 60 && movies.getGenre().equals("comedy"))
                out.println(movies.toString());
        }
        out.close();
    }
}
