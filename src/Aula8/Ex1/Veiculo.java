package Aula8.Ex1;

public class Veiculo implements KmPercorridosInterface {

    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int kmUltimo = 0;
    private int kmTotal = 0;

    public Veiculo(String matricula, String marca, String modelo, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    @Override
    public void trajeto(int quilometros) {
        kmUltimo = quilometros;
        kmTotal += quilometros;
    }

    @Override
    public int ultimoTrajeto() {
        return this.kmUltimo;
    }

    @Override
    public int distanciaTotal() {
        return kmTotal;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + "; Marca: " + this.marca + "; Modelo: " + this.modelo + "; Cilindrada: "
                + this.cilindrada;
    }
}
