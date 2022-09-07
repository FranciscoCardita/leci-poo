package POO2122;

import java.util.*;

public class PacoteTuristico implements IPacoteTuristico {

    private String name;
    private int numNights;
    private double price;
    private List<Servico> servicos = new ArrayList<>();

    public PacoteTuristico() {
    }

    public PacoteTuristico(String name, int numNights, double price) {
        this.name = name;
        this.numNights = numNights;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumNights() {
        return this.numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PacoteTuristico name(String name) {
        setName(name);
        return this;
    }

    public PacoteTuristico numNights(int numNights) {
        setNumNights(numNights);
        return this;
    }

    public PacoteTuristico price(double price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PacoteTuristico)) {
            return false;
        }
        PacoteTuristico pacoteTuristico = (PacoteTuristico) o;
        return Objects.equals(name, pacoteTuristico.name) && numNights == pacoteTuristico.numNights && price == pacoteTuristico.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numNights, price);
    }

    @Override
    public String toString() {
        return "Pacote Turistico " + getName() + ": " + getNumNights() + " noites; " + getPrice() + " € / pessoa / noite";
    }

    @Override
    public PacoteTuristico adicionaServico(Servico servico) {
        if(servicos.contains(servico)) return this;
        // System.out.println("%% Nao pode ser acrescentado outro servico do tipo " + servico.getId());
        servicos.add(servico);
        return this;
    }

    @Override
    public Collection<String> listaServicos() {
        List<String> servicos = new ArrayList<>();
        for(Servico servico : this.servicos) {
            servicos.add(servico.getId());
        }
        return servicos;
    }

    @Override
    public int precoTotal(int numPessoas) {
        return (int) (numPessoas * getPrice() * getNumNights());
    }

}
