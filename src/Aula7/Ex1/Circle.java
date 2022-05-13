package Aula7.Ex1;

public class Circle extends Forma {

    private double radius;

    public Circle(double radius, String colour) {
        if (validRadius(radius)) {
            this.radius = radius;
            this.setColour(colour);
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (!validRadius(radius))
            throw new IllegalArgumentException("Insira um valor valido.");
        this.radius = radius;
    }

    public boolean validRadius(double radius) {
        return radius > 0;
    }

    public String toString() {
        return "Circulo de raio " + this.radius + "; cor: " + this.colour + ".";
    }

    public boolean equals(Circle c) {
        return this.radius == c.getRadius() && this.colour.equals(c.getColour());
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
