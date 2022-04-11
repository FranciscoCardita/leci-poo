package Aula5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int option=-1;
        double r=0, s1=0, s2=0, s3=0, w=0, h=0;
        boolean t = true;
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(1, 1, 1);
        Rectangle rectangle = new Rectangle(1, 1);
        Scanner sc = new Scanner(System.in);
        while (t) {
            System.out.printf("%n    %-14s      %-14s      %-14s%n","Circle:", "Triangle:", "Rectangle:");
            System.out.printf("1 - %-14s 5  - %-14s 12 - %-14s%n", "new circle", "new triangle", "new rectangle");
            System.out.printf("2 - %-14s 6  - %-14s 13 - %-14s%n", "show circle", "show triangle", "show rectangle");
            System.out.printf("3 - %-14s 7  - %-14s 14 - %-14s%n", "area", "area", "area");
            System.out.printf("4 - %-14s 8  - %-14s 15 - %-14s%n", "perimeter", "perimeter", "perimeter");
            System.out.printf("    %-14s 9  - %-14s%n", "", "new side 1");
            System.out.printf("    %-14s 10 - %-14s%n", "", "new side 2");
            System.out.printf("    %-14s 11 - %-14s%n", "", "new side 3");
            System.out.printf("%nOperation: ");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    t = false;
                    System.out.println("Fim do programa.");
                    break;
                case 1:
                    System.out.print("Insira o raio: ");
                    r = sc.nextDouble();
                    circle.setRadius(r);
                    break;
                case 2:
                    System.out.println(circle.toString());
                    break;
                case 3:
                    System.out.println("Area do circulo: " + circle.area());
                    break;
                case 4:
                    System.out.println("Perimetro do circulo: " + circle.perimeter());
                    break;
                case 5:
                    System.out.print("Insira o lado 1: ");
                    s1 = sc.nextDouble();
                    System.out.print("Insira o lado 2: ");
                    s2 = sc.nextDouble();
                    System.out.print("Insira o lado 3: ");
                    s3 = sc.nextDouble();     
                    triangle = new Triangle(s1, s2, s3) ;
                    break;
                case 6:
                    System.out.println(triangle.toString());
                    break;
                case 7:
                    System.out.println("Area do triangulo: " + triangle.area());
                    break;
                case 8:
                    System.out.println("Perimetro do triangulo: " + triangle.perimeter());
                    break;
                case 9:
                    System.out.print("Insira o valor: ");
                    s1 = sc.nextDouble();
                    triangle.setSide1(s1);
                    break;
                case 10:
                    System.out.print("Insira o valor: ");
                    s2 = sc.nextDouble();
                    triangle.setSide2(s2);
                    break;
                case 11:
                    System.out.print("Insira o valor: ");
                    s3 = sc.nextDouble();
                    triangle.setSide3(s3);
                    break;
                case 12:
                    System.out.print("Insira a largura: ");
                    w = sc.nextDouble();
                    rectangle.setWidth(w);
                    System.out.print("Insira a altura: ");
                    h = sc.nextDouble();
                    rectangle.setHeight(h);
                    break;
                case 13:
                    System.out.println(rectangle.toString());
                    break;
                case 14:
                    System.out.println("Area do retangulo: " + rectangle.area());
                    break;
                case 15:
                    System.out.println("Perimetro do retangulo: " + rectangle.perimeter());
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
            sc.close();
        }
    }
}
