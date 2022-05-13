package Aula8.Ex2;

import java.util.ArrayList;

public class Prato {

        private String nome;
        ArrayList<Alimento> alimentos = new ArrayList<>();
        private int numIng = 0;

        public Prato(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return this.nome;
        }

        public int getNumIng() {
            return this.numIng;
        }

        public boolean addIngrediente(Alimento a) {
            if(toString().contains("Vegetariano")) {
                if(a.toString().contains("Peixe") || a.toString().contains("Carne")) {
                    return false;
                }
            } else if (a.getCalorias() > PratoDieta.getMaxCalorias()) return false;
            numIng++;
            return true;
        }

        @Override
        public String toString(){
            return "Prato '" + getNome() + "', composto por " + getNumIng() + " Ingredientes";
        }
}
