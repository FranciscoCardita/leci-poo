package Aula7.Ex1;

public class Rectangle extends Forma {

    private double w;
    private double h;

    public Rectangle(double w, double h, String colour) {
        if (validSide(w) && validSide(h)) {
            this.w = w;
            this.h = h;
            this.setColour(colour);
        }
    }

    public double getWidth() {
        return this.w;
    }

    public double getHeight() {
        return this.h;
    }

    public void setWidth(double w) {
        if (!validSide(w))
            throw new IllegalArgumentException("Insira um valor valido.");
        this.w = w;
    }

    public void setHeight(double h) {
        if (!validSide(h))
            throw new IllegalArgumentException("Insira um valor valido.");
        this.h = h;
    }

    public String toString() {
        return "Retangulo de lados " + w + " e " + h + "; cor: " + this.colour + ".";
    }

    public boolean equals(Rectangle r) {
        return (this.w == r.getWidth()) && (this.h == r.getHeight());
    }

    public double area() {
        return this.w * this.h;
    }

    public double perimeter() {
        return 2 * (this.w + this.h);
    }

    public boolean validSide(double side) {
        return side > 0;
    }
}
