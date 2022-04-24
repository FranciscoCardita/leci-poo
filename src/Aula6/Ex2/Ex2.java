package Aula6.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5);

        Conjunto c2 = new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7};

        for (int el : test) c2.insert(el);
        c2.remove(3); c2.remove(5); c2.remove(6);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Numero de elementos em c1: " + c1.size());
        System.out.println("Numero de elementos em c2: " + c2.size());

        System.out.println("c1 contem 6?: " + ((c1.contains(6) ? "sim" : "nao")));
        System.out.println("c2 contem 6?: " + ((c2.contains(6) ? "sim" : "nao")));

        System.out.println("Uniao:" + c1.combine(c2));
        System.out.println("Intersecao:" + c1.intersect(c2));
        System.out.println("Diferenca:" + c1.subtract(c2));

        c1.empty();
        System.out.println("c1:" + c1);
    }
}
