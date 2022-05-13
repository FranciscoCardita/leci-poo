package Aula8.Ex1;

public class Pesado extends Veiculo {

    private String numQuadro;
    private int peso;

    public Pesado(String matricula, String marca, String modelo, int cilindrada, String numQuadro, int peso) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.peso = peso;
    }

    public String getNumQuadro() {
        return this.numQuadro;
    }

    public int getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Numero de Quadro: " + this.numQuadro + "; Peso: " + this.peso + ".";
    }
}
