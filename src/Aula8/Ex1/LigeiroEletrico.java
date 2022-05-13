package Aula8.Ex1;

public class LigeiroEletrico extends Ligeiro implements VeiculoEletrico {

    private int autonomia;
    private double carga;

    public LigeiroEletrico(String matricula, String marca, String modelo, int cilindrada, String numQuadro,
            int bagageira, int autonomia) {
        super(matricula, marca, modelo, cilindrada, numQuadro, bagageira);
        this.autonomia = autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        this.carga = percentagem;
    }

    @Override
    public int autonomia() {
        double a = this.autonomia;
        a = a * (this.carga / 100);
        return (int) a;
    }

    @Override
    public String toString() {
        return super.toString() + "; Autonomia com carga total: " + this.autonomia + "Km.";
    }

}
