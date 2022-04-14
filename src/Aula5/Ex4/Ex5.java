package Aula5.Ex4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro catalogo[] = new Livro[100];
        Utilizador aluno[] = new Utilizador[100];
        boolean t = true;
        while(t) {
            System.out.println("\n1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            System.out.printf("%nInsira a operacao: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Fim do programa.");
                    t = false;
                    break;
                case 1:
                    System.out.print("Insira o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Insira o nMec: ");
                    int nMec = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o curso: ");
                    String curso = sc.next();
                    for(int i = 0; i < aluno.length; i++) {
                        if(aluno[i] == null) {
                            aluno[i] = new Utilizador(nome, nMec, curso);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Insira o nMec: ");
                    int nMec2 = sc.nextInt();
                    try {
                        for (int i = 0; i < aluno.length; i++) {
                            if(aluno[i].getNMec() == nMec2) {
                                aluno[i] = null;
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("\nNumero mecanografico nao econtrado.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < aluno.length; i++) {
                        if(aluno[i] != null) System.out.println(aluno[i]);
                    }
                    break;
                case 4:
                    System.out.print("Insira o titulo do livro: ");
                    String titulo = sc.nextLine();

                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] == null) {
                            catalogo[i] = new Livro(titulo);
                            break;
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] != null) System.out.println(catalogo[i]);
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Operacao invalida.");
                    break;
            }
        }
        sc.close();
    }
}
