import java.util.Scanner;

/**
 * Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
 */

public class Uni4Exe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior que 0: ");
        int n = Math.abs(s.nextInt());

        if (n % 2 == 1)
            System.out.println("Número é ímpar");
        else
            System.out.println("Número é par");

        s.close();
    }
}
