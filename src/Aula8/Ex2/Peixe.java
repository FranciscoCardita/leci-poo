package Aula8.Ex2;

public class Peixe extends Alimento {
    
    public enum TipoPeixe {
        CONGELADO, FRESCO
    }

    private TipoPeixe TipoPeixe;

    public Peixe(TipoPeixe TipoPeixe, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.TipoPeixe = TipoPeixe;
    }

    public TipoPeixe getTipoPeixe() {
        return this.TipoPeixe;
    }

    @Override
    public String toString(){
        return "Peixe " + this.TipoPeixe + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }
}
