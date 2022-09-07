package POO2122;

import java.util.*;

public abstract class Servico {

    private String id;
    private static int val = 99;

    public Servico() {
        val++;
    }

    public Servico(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Servico id(String id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Servico)) {
            return false;
        }
        Servico servico = (Servico) o;
        return Objects.equals(id, servico.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

}
