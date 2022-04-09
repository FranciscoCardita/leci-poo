//package Aula5;

public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return this.radius; }

    public void setRadius(double radius) { 
        if(!validRadius(radius)) throw new IllegalArgumentException("Insira um valor valido.");
        this.radius = radius;
     }

    public boolean validRadius(double radius) { return radius > 0; }

    public String toString() { return "Circulo de raio " + this.radius; }

    public boolean equals(Circle c) { return this.radius == c.getRadius(); }

    public double area() { return Math.PI * radius * radius; }

    public double perimeter() { return Math.PI * 2 * radius; }
}
