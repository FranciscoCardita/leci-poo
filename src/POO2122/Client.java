package POO2122;

import java.util.Objects;

public class Client {

    private String name; 
    private String local;

    public Client() {
    }

    public Client(String name, String local) {
        this.name = name;
        this.local = local;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Client name(String name) {
        setName(name);
        return this;
    }

    public Client local(String local) {
        setLocal(local);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(local, client.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, local);
    }

    @Override
    public String toString() {
        return getName() + "[" + getLocal() + "]";
    }

}
