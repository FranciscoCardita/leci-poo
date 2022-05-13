package Aula8.Ex1;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico {

    private int autonomia;
    private int carga;

    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, int cilindrada, String numQuadro,
            int peso, int capacidade, int autonomia) {
        super(matricula, marca, modelo, cilindrada, numQuadro, peso, capacidade);
        this.autonomia = autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        this.carga = percentagem;
    }

    @Override
    public int autonomia() {
        return this.autonomia * (this.carga / 100);
    }

}
