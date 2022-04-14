package Aula5.Ex4;

//import java.util.ArrayList;

public class Utilizador {
    
    private String nome;
    private int nMec;
    private String curso;
    //private static ArrayList<Integer> id_emprestado = new ArrayList<Integer>();

    public Utilizador(String nome, int nMec, String curso) {
        this.nMec = nMec;
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() { return this.nome; }

    public int getNMec() { return this.nMec; }

    public String getCurso() { return this.curso; }

    public void setNome(String nome) { this.nome = nome; }

    public void setNMec(int nMec) { 
        if(!validNMec()) throw new IllegalArgumentException("Insira um nMec valido.");
        this.nMec = nMec;
    }

    public void setCurso(String curso) { this.curso = curso; }
    
    public String toString() { return "Aluno: " + this.nMec + "; " + this.nome + "; " + this.curso; }

    public boolean validNMec() { return this.nMec >= 0; }
}
