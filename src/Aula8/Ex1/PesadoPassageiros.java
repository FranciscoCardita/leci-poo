package Aula8.Ex1;

public class PesadoPassageiros extends Pesado {

    private int capacidade;

    public PesadoPassageiros(String matricula, String marca, String modelo, int cilindrada, String numQuadro,
            int peso, int capacidade) {
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Numero maximo de passageiros: " + this.capacidade + ".";
    }
}
