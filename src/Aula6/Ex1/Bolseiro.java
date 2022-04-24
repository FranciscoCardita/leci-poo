package Aula6.Ex1;

import Aula5.Date;

public class Bolseiro extends Aluno {
    
    private double bolsa;

    public Bolseiro(String nome, int cc, Date dataNasc, double bolsa) {
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
    }

    public double getBolsa() { return this.bolsa; }

    public void setBolsa(double bolsa) { this.bolsa = bolsa; }

    @Override public String toString() { return "Valor da bolsa: " + bolsa; }
}
