package Aula8.Ex2;

public class PratoVegetariano extends Prato {

    public PratoVegetariano(String nome){
        super(nome);
    }

    @Override
    public String toString(){
        return "Prato '" + getNome() + "', composto por " + getNumIng() + " Ingredientes - Prato Vegetariano";
    }
}
