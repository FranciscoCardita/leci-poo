package POO2122;

import java.time.LocalDate;
import java.util.*;

public class Voo extends Servico {

    private String code;
    private LocalDate date;
    private Classe classe;

    public Voo() {
    }

    public Voo(String code, LocalDate date, Classe classe) {
        this.code = code;
        this.date = date;
        this.classe = classe;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Classe getClasse() {
        return this.classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Voo code(String code) {
        setCode(code);
        return this;
    }

    public Voo date(LocalDate date) {
        setDate(date);
        return this;
    }

    public Voo classe(Classe classe) {
        setClasse(classe);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Voo)) {
            return false;
        }
        Voo voo = (Voo) o;
        return code == voo.code && Objects.equals(date, voo.date) && Objects.equals(classe, voo.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, date, classe);
    }

    @Override
    public String toString() {
        return "Voo " + getCode() + " em " + getDate() + ", classe " + getClasse();
    }

}
