import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1046 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int hInicial = s.nextInt();
        int hFinal = s.nextInt();

        if (hInicial == hFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");

        } else if (hInicial > hFinal) {
            int tempo = (24 - hInicial) + hFinal;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        } else {
            int tempo = hFinal - hInicial;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }

        s.close();
    }

}
