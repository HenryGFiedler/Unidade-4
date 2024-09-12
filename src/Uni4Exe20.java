import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
 * descreva um algoritmo que calcule a média de aproveitamento e o conceito do
 * aluno, usando a fórmula:
 * media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7
 */

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a primeira nota: ");
        double nota1 = s.nextDouble();
        //
        System.out.println("Informe a segunda nota: ");
        double nota2 = s.nextDouble();
        //
        System.out.println("Informe a terceira nota: ");
        double nota3 = s.nextDouble();
        //
        System.out.println("Informe a nota da média dos exercícios: ");
        double nota4 = s.nextDouble();

        char nota = 'F';
        double media = 0;

        // Validação da nota
        if (nota1 < 0 || nota1 > 10 ||
            nota2 < 0 || nota2 > 10 ||
            nota3 < 0 || nota3 > 10 ||
            nota4 < 0 || nota4 > 10 ) {
            System.out.println("Foi detectado uma nota inválida");

        } else {
            media = (nota1 + (nota2 * 2) + (nota3 * 3) + nota4) / 7;

            // Indicação do conceito
            if (media >= 9) {
                nota = 'A';

            } else if (media >= 7.5) {
                nota = 'B';

            } else if (media >= 6) {
                nota = 'C';

            } else if (media >= 4) {
                nota = 'D';

            } else if (media < 4) {
                nota = 'E';
            }

            if (nota != 'D' && nota != 'E') {
                System.out.println(nota + " " + df.format(media) + " - Aprovado");

            } else {
                System.out.println(nota + " " + df.format(media) + " - Reprovado");
            }
        }
        
        s.close();

    }
}
