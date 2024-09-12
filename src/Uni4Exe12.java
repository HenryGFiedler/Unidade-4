import java.util.Scanner;

/**
 * Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos
 * lados de um triângulo, descreva um algoritmo que verifique se os mesmos podem
 * ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique
 * e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo
 * escaleno". Em caso negativo, informe que os mesmos não formam um triângulo.
 */

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1: ");
        double lado1 = s.nextDouble();
        System.out.println("Entre com o comprimento do lado 2: ");
        double lado2 = s.nextDouble();
        System.out.println("Entre com o comprimento do lado 3: ");
        double lado3 = s.nextDouble();

        // Checando se é um triângulo
        if (lado1 + lado2 <= lado3 ||
            lado1 + lado3 <= lado2 ||
            lado2 + lado3 <= lado1   ) {

            // Checando que tipo de triângulo é 
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilátero");
            }
            else if (lado1 == lado2 && lado1 != lado3 ||
                     lado1 == lado3 && lado1 != lado2 ||
                     lado2 == lado3 && lado2 != lado1   ) {
                System.out.println("é isóceles");
            }
            else {
                System.out.println("é escaleno");
            }

        } else {
            System.out.println("Não formam um triângulo");
        }

        s.close();
    }
}
