package Aula11.Ex2;

import java.util.*;
import java.io.*;

public class Voo {

    private String hora;
    private String voo;
    private String companhia;
    private String origem;
    private String atraso;
    private String obs;
    private static HashMap<String, String> companhias = new HashMap<>();

    public Voo(String hora, String voo, String origem, String atraso) throws IOException {
        this.hora = hora;
        this.voo = voo;
        this.origem = origem;
        this.atraso = atraso;
        if (atraso == "")
            this.obs = "";
        else
            this.obs = "Previsao: " + getPrevisao();
        this.companhia = getCompanhias().get(this.voo.substring(0, 2));
    }

    public String getHora() {
        return this.hora;
    }

    public String getVoo() {
        return this.voo;
    }

    public String getCompanhia() {
        return this.companhia;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getAtraso() {
        return this.atraso;
    }

    public String getObs() {
        return this.obs;
    }

    public String getPrevisao() {
        int horaPrev = Integer.parseInt(this.hora.substring(0, 2)) + Integer.parseInt(this.atraso.substring(0, 2));
        int minPrev = Integer.parseInt(this.hora.substring(3)) + Integer.parseInt(this.atraso.substring(3));
        if (horaPrev > 23)
            horaPrev -= 24;
        if (minPrev > 59) {
            horaPrev++;
            minPrev -= 60;    
        }
        return String.format("%02d", horaPrev) + ":" + String.format("%02d", minPrev);
    }

    @Override
    public String toString() {
        return String.format("%-5s\t%-7s\t%-19s\t%-20s\t%-6s\t%s", getHora(), getVoo(), getCompanhia(), getOrigem(),
                getAtraso(), getObs());
    }

    private HashMap<String, String> getCompanhias() throws IOException {
        if (companhias.isEmpty()) {
            Scanner companhias_txt = new Scanner(new File("aula11_files/companhias.txt"));
            companhias_txt.nextLine();
            while (companhias_txt.hasNextLine()) {
                String[] str = companhias_txt.nextLine().split("\t");
                companhias.put(str[0], str[1]);
            }
        }
        return companhias;
    }
}
