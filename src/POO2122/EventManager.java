package POO2122;

import java.time.LocalDate;
import java.util.*;

import RandomTicketTester.Date;

public class EventManager {

    private String name;
    private Map<Client, Date> mapa = new TreeMap<>();

    public EventManager() {
    }

    public EventManager(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventManager name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EventManager)) {
            return false;
        }
        EventManager eventManager = (EventManager) o;
        return Objects.equals(name, eventManager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }

    public Client addClient(String clientName, String clientLoc) {
        Client c1 = new Client(clientName, clientLoc);
        mapa.put(c1, new Date());
        return c1;
    }

    public Event addEvent(Client c1, LocalDate date) {
        String[] splitDate = date.toString().split("-");
        mapa.get(c1).set(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
        return null;
    }

    public String listClients() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clients:\n");
        for (Map.Entry<Client, Date> entry : mapa.entrySet()) {
            sb.append(entry.getKey().toString());
        }
        return sb.toString();
    }

    public String listEvents() {
        return null;
    }

    public String[] clientsWithEvents() {
        return null;
    }

    public String[] nextEventsByDate() {
        return null;
    }

}
