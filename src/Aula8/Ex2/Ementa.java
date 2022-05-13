package Aula8.Ex2;

import java.util.ArrayList;

public class Ementa {

    private String nome;
    private String local;
    private ArrayList<String> listaPratos = new ArrayList<String>();

    public String getNome() {
        return this.nome;
    }

    public String getLocal() {
        return this.local;
    }

    public Ementa(String nome, String local){
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato pratos, String d){
        String pr = "";
        pr = pratos.toString() + ", dia " + d;
        listaPratos.add(pr);
    }

    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < listaPratos.size(); i++){
            str += listaPratos.get(i) + '\n';
        }
        return str;
    }

}
