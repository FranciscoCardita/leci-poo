package Aula8.Ex1;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String codPostal;
    private String email;
    private ArrayList<Veiculo> veiculo = new ArrayList<>();

    public Empresa(String nome, String codPostal, String email) {
        this.nome = nome;
        this.codPostal = codPostal;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodPostal() {
        return this.codPostal;
    }

    public String getEmail() {
        return this.email;
    }

    public void addVeiculo(Veiculo v) {
        this.veiculo.add(v);
    }

    public String getVeiculos() {
        String str = "";
        for (int i = 0; i < veiculo.size(); i++) {
            str += veiculo.get(i) + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + nome + "; Codigo Postal: " + codPostal + "; Email: " + email + ".";
    }
}
