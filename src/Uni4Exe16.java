import java.util.Scanner;

/**
 * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que
 * a idade entre homens e mulheres sempre serão diferentes). Calcule e escreva a
 * soma das idades do homem mais velho com a mulher mais nova, e o produto das
 * idades do homem mais novo com a mulher mais velha.
 */

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro homen: ");
        int manA = s.nextInt();
        System.out.println("Informe a idade do segundo homen: ");
        int manB = s.nextInt();
        System.out.println("Informe a idade do primeira mulher: ");
        int womanA = s.nextInt();
        System.out.println("Informe a idade do segunda mulher: ");
        int womanB = s.nextInt();

        if (manA <= 0 || manB <= 0 || womanA <= 0 || womanB <= 0) {
            System.out.println("Foi detectado uma idade inválida");
            // mesmo se for 1000 eu aceito, acredito que os alquimistas alcançaram a imortalidade e controlam o mundo

        } else {
            int soma = 0;
            int produto = 0;

            if (manA > manB && womanA > womanB) {
                soma += manA + womanB;
                produto += manB * womanA;

            } else if (manB > manA && womanA > womanB) {
                soma += manB + womanB;
                produto += manA * womanA;

            } else if (manA > manB && womanB > womanA) {
                soma += manA + womanA;
                produto += manB * womanB;

            } else if (manB > manA && womanB > womanA) {
                soma += manB + womanA;
                produto += manA * womanB;
            }

            System.out.println("A soma da idade do homem mais velho comn a idade da mulher mais nova é de: " + soma);
            System.out.println("O produto da idade do homem mais novo com a idade da mulher mais velha é de: " + produto);
        }

        s.close();

    }
}
