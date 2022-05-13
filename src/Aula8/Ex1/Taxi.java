package Aula8.Ex1;

public class Taxi extends Ligeiro {

    private int numLicenca;

    public Taxi(String matricula, String marca, String modelo, int cilindrada, String numQuadro, int bagageira,
            int numLicenca) {
        super(matricula, marca, modelo, cilindrada, numQuadro, bagageira);
        this.numLicenca = numLicenca;
    }

    public int getNumLicenca() {
        return this.numLicenca;
    }

    @Override
    public String toString() {
        return "Numero de Licenca: " + this.numLicenca + ".";
    }
}
