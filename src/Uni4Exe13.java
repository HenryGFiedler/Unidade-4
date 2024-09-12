import java.util.Scanner;

/**
 * Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as
 * três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3;
 * 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a
 * palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se
 * APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas
 * forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso
 * nada.
 */

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informa as 3 cartas: ");
        int carta1 = s.nextInt();
        int carta2 = s.nextInt();
        int carta3 = s.nextInt();

        int qtdCartasBoa = 0;

        // Checando se as cartas são boas
        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoa++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoa++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoa++;
        }

        // Imprimindo o resultado
        if (qtdCartasBoa == 1) {
            System.out.println("TRUCO");
        }
        if (qtdCartasBoa == 2) {
            System.out.println("SEIS");
        }
        if (qtdCartasBoa == 3) {
            System.out.println("NOVE");
        } else {
            System.out.println("desiste fih");
        }

        s.close();
    }
}
