package Aula8.Ex2;

public class Alimento {

    private double proteinas;
    private double calorias;
    private double peso;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return this.proteinas;
    }

    public double getCalorias() {
        return this.calorias;
    }

    public double getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Proteinas " + this.proteinas + ", calorias " + this.calorias + ", Peso " + this.peso;
    }
}
