import java.util.Scanner;

/*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções: */

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe três números: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        System.out.println("Informe de qual forma você gostaria de ver esses números: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1 - escreva os 3 valores em ordem crescente");
        System.out.println("2 - escreva os 3 valores em ordem decrescente");
        System.out.println("3 - escreva os 3 valores de forma que o maior valor fique no meio");
        System.out.println("-------------------------------------------------------------------");
        int resposta = s.nextInt();

        switch (resposta) {
            case 1:
                if (a > b) {
                    double placeHolder = a;
                    a = b;
                    b = placeHolder;
                }
                if (b > c) {
                    double placeHolder = b;
                    b = c;
                    c = placeHolder;
                }
                if (a > b) {
                    double placeHolder = a;
                    a = b;
                    b = placeHolder;
                }

                System.out.println(a + " " + b + " " + c);
                break;
            //
            case 2:
                if (a < b) {
                    double placeHolder = a;
                    a = b;
                    b = placeHolder;
                }
                if (b < c) {
                    double placeHolder = b;
                    b = c;
                    c = placeHolder;
                }
                if (a < b) {
                    double placeHolder = a;
                    a = b;
                    b = placeHolder;
                }

                System.out.println(a + " " + b + " " + c);
                break;
            //
            case 3:
                if (a > b) {
                    double placeHolder = a;
                    a = b;
                    b = placeHolder;
                }
                if (b < c) {
                    double placeHolder = b;
                    b = c;
                    c = placeHolder;
                }

                System.out.println(a + " " + b + " " + c);
                break;
            //
            default:
                System.out.println("Opção inválida");
                break;
        }

        s.close();
    }
}
