package POO2122;

import java.util.Objects;

public class Sport extends Activity {

    protected enum Modality {
        KAYAK, HIKING
    }
    private Modality modality;
    private int price = 30;

    public Sport() {
    }

    public Sport(Modality modality, int numParticipants) {
        super(numParticipants);
        this.modality = modality;
    }

    public Modality getModality() {
        return this.modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sport modality(Modality modality) {
        setModality(modality);
        return this;
    }

    public Sport price(int price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) o;
        return Objects.equals(modality, sport.modality) && price == sport.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modality, price);
    }

    @Override
    public String toString() {
        return "{" +
            " modality='" + getModality() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}
