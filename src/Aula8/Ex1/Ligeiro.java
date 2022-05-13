package Aula8.Ex1;

public class Ligeiro extends Veiculo {

    private String numQuadro;
    private int bagageira;

    public Ligeiro(String matricula, String marca, String modelo, int cilindrada, String numQuadro, int bagageira) {
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro = numQuadro;
        this.bagageira = bagageira;
    }

    public String getNumQuadro() {
        return this.numQuadro;
    }

    public int getBageira() {
        return this.bagageira;
    }

    @Override
    public String toString() {
        return super.toString() + "; Numero de Quadro: " + this.numQuadro + "; Capacidade da bagageira: " + this.bagageira;
    }
}
