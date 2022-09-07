package POO2122;

import java.util.*;

public class AgenciaTuristica {
    
    private String name;
    private String address;
    private List<PacoteTuristico> pacotes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public AgenciaTuristica() {
    }

    public AgenciaTuristica(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AgenciaTuristica name(String name) {
        setName(name);
        return this;
    }

    public AgenciaTuristica address(String address) {
        setAddress(address);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AgenciaTuristica)) {
            return false;
        }
        AgenciaTuristica agenciaTuristica = (AgenciaTuristica) o;
        return Objects.equals(name, agenciaTuristica.name) && Objects.equals(address, agenciaTuristica.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }

    public PacoteTuristico pacoteTuristico(String name, int numNights, int price) {
        return new PacoteTuristico(name, numNights, price);
    }

    public String listaPacotes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacotes turisticos disponiveis:\n");
        for(PacoteTuristico pacote : pacotes) {
            sb.append(pacote.toString() + "\n"); // add servico
            sb.append("\t**" + "\n");
        }
        return sb.toString();
    }

    public String listaReservas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservas efetuadas:\n");
        for(Reserva reserva : reservas) {
            sb.append(reserva.toString() + "\n");
            sb.append("\t**" + "\n"); // add servico
        }
        return sb.toString();
    }

    public void reserva(PacoteTuristico p1, int numPeople) {
        pacotes.add(p1);
        reservas.add(new Reserva(p1, numPeople));
    }

}
