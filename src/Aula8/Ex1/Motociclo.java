package Aula8.Ex1;

public class Motociclo extends Veiculo {

    public static enum Tipo {
        DESPORTIVO,
        ESTRADA
    }

    private Tipo tipo;

    public Motociclo(String matricula, String marca, String modelo, int cilindrada, Tipo tipo) {
        super(matricula, marca, modelo, cilindrada);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "; Tipo: " + this.tipo;
    }
}
