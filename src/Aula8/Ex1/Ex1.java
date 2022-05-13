package Aula8.Ex1;

import Aula8.Ex1.Motociclo.Tipo;

public class Ex1 {
    public static void main(String[] args) {
        Empresa jsc = new Empresa("jsc", "3800-023", "jsc@jsc.com");
        Ligeiro l1 = new Ligeiro("AD-53-XC", "Mercedes", "A", 240, "12345", 50);
        Ligeiro l2 = new Ligeiro("12-FC-56", "Renault", "Clio", 96, "54321C", 30);
        Motociclo m1 = new Motociclo("55-IH-98", "Honda", "NT1100", 100, Tipo.DESPORTIVO);

        jsc.addVeiculo(l1);
        jsc.addVeiculo(l2);
        jsc.addVeiculo(m1);
        System.out.println();
        System.out.println(jsc.toString());
        System.out.println(jsc.getVeiculos());

        LigeiroEletrico e1 = new LigeiroEletrico("BF-50-ER", "Peugeot", "e308", 120, "r31g2", 35, 600);
        e1.carregar(60);
        System.out.println(e1.toString());
        System.out.println("Autonomia apos carregar 60%: " + e1.autonomia() + "Km.");
    }
}
