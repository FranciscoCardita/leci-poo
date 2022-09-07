package POO2122;

import java.util.*;

public class Transporte extends Servico {

    private int numOc;
    private int mileage;
    private Combustivel combustivel;

    public Transporte() {
    }

    public Transporte(int numOc, int mileage, Combustivel combustivel) {
        this.numOc = numOc;
        this.mileage = mileage;
        this.combustivel = combustivel;
    }

    public int getNumOc() {
        return this.numOc;
    }

    public void setNumOc(int numOc) {
        this.numOc = numOc;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Combustivel getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Transporte numOc(int numOc) {
        setNumOc(numOc);
        return this;
    }

    public Transporte mileage(int mileage) {
        setMileage(mileage);
        return this;
    }

    public Transporte combustivel(Combustivel combustivel) {
        setCombustivel(combustivel);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transporte)) {
            return false;
        }
        Transporte transporte = (Transporte) o;
        return numOc == transporte.numOc && mileage == transporte.mileage && Objects.equals(combustivel, transporte.combustivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOc, mileage, combustivel);
    }

    @Override
    public String toString() {
        return "Transporte para " + getNumOc() + " ocupantes, " + getCombustivel() + "Kms maximos: " + getMileage();
    }

}
