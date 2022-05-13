package Aula7.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int option = -1;
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1 - new circle");
            System.out.println("2 - new rectangle");
            System.out.println("3 - new triangle");
            System.out.println("4 - show figures");
            System.out.println("5 - compare circles");
            System.out.println("6 - compare rectangles");
            System.out.println("7 - compare triangles");
            System.out.println("0 - exit");
            System.out.printf("%nOperation: ");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Fim do programa.");
                    break;

                case 1:
                    System.out.print("Insira o raio: ");
                    double r = sc.nextInt();
                    System.out.print("Insira a cor: ");
                    String colourC = sc.next();
                    Circle circle = new Circle(r, colourC);
                    circles.add(circle);
                    break;

                case 2:
                    System.out.print("Insira a largura: ");
                    double w = sc.nextDouble();
                    System.out.print("Insira a altura: ");
                    double h = sc.nextDouble();
                    System.out.print("Insira a cor: ");
                    String colourR = sc.next();
                    Rectangle rectangle = new Rectangle(w, h, colourR);
                    rectangles.add(rectangle);
                    break;

                case 3:
                    System.out.print("Insira o lado 1: ");
                    double s1 = sc.nextInt();
                    System.out.print("Insira o lado 2: ");
                    double s2 = sc.nextInt();
                    System.out.print("Insira o lado 3: ");
                    double s3 = sc.nextInt();
                    System.out.print("Insira a cor: ");
                    String colourT = sc.next();
                    Triangle triangle = new Triangle(s1, s2, s3, colourT);
                    triangles.add(triangle);
                    break;

                case 4:
                    for (int i = 0; i < circles.size(); i++)
                        System.out.println(circles.get(i));
                    for (int i = 0; i < rectangles.size(); i++)
                        System.out.println(rectangles.get(i));
                    for (int i = 0; i < triangles.size(); i++)
                        System.out.println(triangles.get(i));
                    break;

                case 5:
                    for (int i = 0; i < circles.size() - 1; i++) {
                        if (!(circles.get(i).equals(circles.get(i + 1))))
                            System.out.println(circles.get(i) + " e' diferente do " + circles.get(i + 1));
                    }
                    break;

                case 6:
                    for (int i = 0; i < triangles.size() - 1; i++) {
                        if (!(triangles.get(i).equals(triangles.get(i + 1))))
                            System.out.println(triangles.get(i) + " e' diferente do " + triangles.get(i + 1));
                    }
                    break;

                case 7:
                    for (int i = 0; i < rectangles.size() - 1; i++) {
                        if (!(rectangles.get(i).equals(rectangles.get(i + 1))))
                            System.out.println(rectangles.get(i) + " e' diferente do " + rectangles.get(i + 1));
                    }
                    break;

                default:
                    System.out.println("Invalid operation.");
                    break;
            }

        } while (option != 0);
        sc.close();
    }
}
