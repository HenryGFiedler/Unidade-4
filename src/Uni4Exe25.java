import java.util.Scanner;

/**
 * Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e
 * execute a operação correspondente. O algoritmo deve exibir uma mensagem de
 * erro se a opção for inválida. O menu tem as seguintes opções:
 */

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com dois valores: ");
        double a = s.nextDouble();
        double b = s.nextDouble();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int resposta = s.nextInt();

        switch (resposta) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Não é possível dividir por zero");
                    break;
                }
                System.out.println(a / b);
                break;

            default:
                break;
        }

        s.close();
    }
}
