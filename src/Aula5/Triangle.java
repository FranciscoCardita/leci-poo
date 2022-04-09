//package Aula5;

public class Triangle {
    
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getSide1() { return this.s1; }

    public double getSide2() { return this.s2; }

    public double getSide3() { return this.s3; }

    public void setSide1(double s1) {
        if(!validSide(s1)) throw new IllegalArgumentException("Insira um valor valido.");
        if(!validTriangle(s1, this.s2, this.s3)) throw new IllegalArgumentException("O lado nao satisfaz a desigualdade triangular.");
        this.s1 = s1;
    }

    public void setSide2(double s2) {
        if(!validSide(s2)) throw new IllegalArgumentException("Insira um valor valido.");
        if(!validTriangle(this.s1, s2, this.s3)) throw new IllegalArgumentException("O lado nao satisfaz a desigualdade triangular.");
        this.s2 = s2;
    }

    public void setSide3(double s3) {
        if(!validSide(s3)) throw new IllegalArgumentException("Insira um valor valido.");
        if(!validTriangle(this.s1, this.s2, s3)) throw new IllegalArgumentException("O lado nao satisfaz a desigualdade triangular.");
        this.s3 = s3;
    }

    public String toString() { return "Triangulo de lados " + this.s1 + ", " + this.s2 + " e " + this.s3 + ".";}

    public boolean equals(Triangle t) { return (this.s1 == t.getSide1()) && (this.s2 == t.getSide2()) && (this.s3 == t.getSide3()); }

    public double area() { 
        double s = perimeter() / 2;
        return Math.sqrt(s * (s-this.s1) * (s-this.s2) * (s-this.s3));
     }
    
    public double perimeter() { return this.s1 + this.s2 + this.s3; }

    public boolean validSide(double side) { return side > 0; }

    public boolean validTriangle(double s1, double s2, double s3) { return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1); }
}
