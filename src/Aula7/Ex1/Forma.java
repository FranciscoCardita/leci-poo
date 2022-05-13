package Aula7.Ex1;

public abstract class Forma {
    
    protected String colour;

    public abstract double area();
    public abstract double perimeter();

    public void setColour(String colour) { this.colour = colour; }

    public String getColour() { return this.colour; }
}