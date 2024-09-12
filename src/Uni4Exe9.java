import java.util.Scanner;

/**
 * Dados dois valores inteiros, escreva um algoritmo que informe se eles são
 * múltiplos ou não.
 */

public class Uni4Exe9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe dois números e direi se eles são múltiplos um do outro");
        double A = s.nextDouble();
        double B = s.nextDouble();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Eles são múltiplos");
        } else {
            System.out.println("Eles não são múltiplos");
        }

        s.close();
    }
}
