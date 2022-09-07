package POO2122;

import java.util.*;

public class RoteiroHistorico extends Servico {

    private String name;
    private int numLocals;

    public RoteiroHistorico() {
    }

    public RoteiroHistorico(String name, int numLocals) {
        this.name = name;
        this.numLocals = numLocals;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumLocals() {
        return this.numLocals;
    }

    public void setNumLocals(int numLocals) {
        this.numLocals = numLocals;
    }

    public RoteiroHistorico name(String name) {
        setName(name);
        return this;
    }

    public RoteiroHistorico numLocals(int numLocals) {
        setNumLocals(numLocals);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RoteiroHistorico)) {
            return false;
        }
        RoteiroHistorico roteiroHistorico = (RoteiroHistorico) o;
        return Objects.equals(name, roteiroHistorico.name) && numLocals == roteiroHistorico.numLocals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numLocals);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", numLocals='" + getNumLocals() + "'" +
            "}";
    }

}
