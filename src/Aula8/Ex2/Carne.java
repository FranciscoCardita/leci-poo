package Aula8.Ex2;

public class Carne extends Alimento {

    public enum VariedadeCarne {
        VACA, PORCO, PERU, FRANGO, OUTRA
    }

    private VariedadeCarne var;

    public Carne(VariedadeCarne var, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.var = var;
    }
    
    public VariedadeCarne getVariedadeCarne() {
        return this.var;
    }

    @Override
    public String toString(){
        return "Carne " + this.var + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }
}
