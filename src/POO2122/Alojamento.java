package POO2122;

import java.util.*;

public class Alojamento extends Servico {

    private String name;
    private int numRooms;
    private int maxPeople;
    private Regime regime;

    public Alojamento() {
    }

    public Alojamento(String name, int numRooms, int maxPeople, Regime regime) {
        this.name = name;
        this.numRooms = numRooms;
        this.maxPeople = maxPeople;
        this.regime = regime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getMaxPeople() {
        return this.maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Regime getRegime() {
        return this.regime;
    }

    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    public Alojamento name(String name) {
        setName(name);
        return this;
    }

    public Alojamento numRooms(int numRooms) {
        setNumRooms(numRooms);
        return this;
    }

    public Alojamento maxPeople(int maxPeople) {
        setMaxPeople(maxPeople);
        return this;
    }

    public Alojamento regime(Regime regime) {
        setRegime(regime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alojamento)) {
            return false;
        }
        Alojamento alojamento = (Alojamento) o;
        return Objects.equals(name, alojamento.name) && numRooms == alojamento.numRooms && maxPeople == alojamento.maxPeople && Objects.equals(regime, alojamento.regime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numRooms, maxPeople, regime);
    }

    @Override
    public String toString() {
        return "Alojamento " + getName() + " com " + getNumRooms() + " quartos, ocupacao maxima " + getMaxPeople() + " pessoas, em regime de " + getRegime();
    }

}
