package Aula3;

public class Ex8 {
    public static void main(String[] args) {
        double notas[][] = new double[16][2];
        int nf;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 2; j++) {
                notas[i][j] = Math.random() * 20;
            }
        }
        System.out.printf("%5s %10s %10s%n", "NotaT", "NotaP", "Pauta");
        for (int i = 0; i < 16; i++) {
            if(notas[i][0] < 7 || notas[i][1] < 7) nf = 66;
            else nf = (int)(notas[i][0] * 0.6 + notas[i][1] * 0.4);
            System.out.printf("%5.1f %10.1f %10d%n", notas[i][0], notas[i][1], nf);
        }
    }
}
