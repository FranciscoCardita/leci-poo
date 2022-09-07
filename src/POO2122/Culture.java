package POO2122;

import java.util.Objects;

public class Culture extends Activity {

    protected enum Option {
        ARCHITECTURAL_TOUR, RIVER_TOUR, WINE_TASTING, ART_MUSEUM
    }
    private Option option;
    private int price = 22;

    public Culture() {
    }

    public Culture(Option option, int numParticipants) {
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

    public Culture option(Option option) {
        setOption(option);
        return this;
    }

    public Culture price(int price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Culture)) {
            return false;
        }
        Culture culture = (Culture) o;
        return Objects.equals(option, culture.option) && price == culture.price;
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
