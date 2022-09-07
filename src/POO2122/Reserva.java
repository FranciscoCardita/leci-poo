package POO2122;

import java.util.*;

public class Reserva {

    private PacoteTuristico pacote;
    private int numPeople;

    public Reserva() {
    }

    public Reserva(PacoteTuristico pacote, int numPeople) {
        this.pacote = pacote;
        this.numPeople = numPeople;
    }

    public PacoteTuristico getPacote() {
        return this.pacote;
    }

    public void setPacote(PacoteTuristico pacote) {
        this.pacote = pacote;
    }

    public int getNumPeople() {
        return this.numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public Reserva pacote(PacoteTuristico pacote) {
        setPacote(pacote);
        return this;
    }

    public Reserva numPeople(int numPeople) {
        setNumPeople(numPeople);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reserva)) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Objects.equals(pacote, reserva.pacote) && numPeople == reserva.numPeople;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacote, numPeople);
    }

    @Override
    public String toString() {
        return "Pacote turistico " + getPacote() + " para " + getNumPeople() + " pessoas. Valor total: " + totalPrice();
    }

    public double totalPrice() {
        double price = getPacote().precoTotal(getNumPeople());
        if(price >= 12000) return price * 0.93;
        return price;
    }
}
