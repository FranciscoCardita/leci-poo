package Aula6.Ex1;

import Aula5.Date;

public class Pessoa {
    
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getNome() { return this.nome; }

    public int getCc() { return this.cc; }

    public Date getDataNasc() { return this.dataNasc; }
    
    public void setNome(String nome) { this.nome = nome; }

    public void setCc(int cc) { this. cc = cc; }

    public void setDataNasc(Date dataNasc) { this.dataNasc = dataNasc; }

    @Override public String toString() { return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc; }
}
