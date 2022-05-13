package Aula8.Ex1;

public class PesadoMercadorias extends Pesado {

    private int cargaMax;

    public PesadoMercadorias(String matricula, String marca, String modelo, int cilindrada, String numQuadro,
            int peso, int cargaMax) {
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    @Override
    public String toString() {
        return "Carga maxima: " + this.cargaMax;
    }
}
