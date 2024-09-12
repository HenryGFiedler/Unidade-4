import java.util.Scanner;

/**
 * Dado um caractere indicando uma opção, escreva um algoritmo para:
 */

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("T: calcular a área de um triângulo com a base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        char opcao = Character.toUpperCase(s.next().charAt(0));

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                double base = s.nextDouble();
                double altura = s.nextDouble();

                System.out.println("Área do triângulo = " + (base * altura) / 2);
                break;

            case 'Q':
                System.out.println("Digite o lado");
                double lado = s.nextDouble();

                System.out.println("Área do quadrado = " + lado * lado);
                break;

            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                double b = s.nextDouble();
                double h = s.nextDouble();

                System.out.println("Área do retângulo = " + b * h);
                break;

            case 'C':
                System.out.println("Digite o raio: ");
                double r = s.nextDouble();

                System.out.println("Área do circulo = " + Math.PI * Math.pow(r, 2));
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        s.close();
    }
}
