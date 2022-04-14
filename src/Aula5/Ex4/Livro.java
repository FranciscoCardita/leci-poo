package Aula5.Ex4;

public class Livro {
    
    private int id;
    private String titulo;
    private String tipoEmprestimo;
    private static int idNum = 100;

    public Livro(String titulo, String tipoEmprestimo) {
        this.id = idNum++;
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public Livro(String titulo) { 
        this.id = idNum++;
        this.titulo = titulo;
        this.tipoEmprestimo = "NORMAL";
    }

    public int getId() { return this.id; }

    public String getTitulo() { return this.titulo; }

    public String getTipoEmprestimo() { return this.tipoEmprestimo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public void setTipoEmprestimo(String tipoEmprestimo) { this.tipoEmprestimo = tipoEmprestimo; }

    public String toString() { return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo; }
}
