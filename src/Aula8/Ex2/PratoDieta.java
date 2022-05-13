package Aula8.Ex2;

public class PratoDieta extends Prato {

    private static double maxCalorias = 0;

    public PratoDieta(String nome, double maxCalorias) {
        super(nome);
        PratoDieta.maxCalorias = maxCalorias;
    }

    public static double getMaxCalorias() {
        return maxCalorias;
    }

    //public void 

    @Override
    public String toString(){
        return "Prato '" + getNome() + "', composto por " + getNumIng() + " Ingredientes - Dieta (" + getMaxCalorias() + " Calorias)";
    }
}
