package POO2122;

import java.util.Objects;

public abstract class Activity {

    private int numParticipants;
    private int price;

    public Activity() {
    }

    public Activity(int numParticipants) {
        this.numParticipants = numParticipants;
    }

    public int getNumParticipants() {
        return this.numParticipants;
    }

    public void setNumParticipants(int numParticipants) {
        this.numParticipants = numParticipants;
    }

    public Activity numParticipants(int numParticipants) {
        setNumParticipants(numParticipants);
        return this;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) o;
        return numParticipants == activity.numParticipants;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numParticipants);
    }

    @Override
    public String toString() {
        return "{" +
            " numParticipants='" + getNumParticipants() + "'" +
            "}";
    }

}
