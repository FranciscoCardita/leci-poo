package POO2122;

import java.util.Objects;

public class Catering extends Activity {

    protected enum Option {
        FULL_MENU, DRINKS_AND_SNACKS, LIGHT_BITES
    }
    private Option option;
    private int price = 25;

    public Catering() {
    }

    public Catering(Option option, int numParticipants) {
        super(numParticipants);
        this.option = option;
    }

    public Option getOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Catering option(Option option) {
        setOption(option);
        return this;
    }

    public Catering price(int price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Catering)) {
            return false;
        }
        Catering catering = (Catering) o;
        return Objects.equals(option, catering.option) && price == catering.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, price);
    }

    @Override
    public String toString() {
        return "{" +
            " option='" + getOption() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}
