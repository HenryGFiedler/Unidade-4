import java.util.Scanner;
import java.util.Locale;

/**
 * Dado um número de ponto flutuante maior do que 0, informe se foram digitadas
 * ou não casas decimais no número.
 */

public class Uni4Exe4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);

        System.out.println("Me fale um número e te direi se há casas decimais");
        double n = Math.abs(s.nextDouble());

        double theTruthBehindItAll = n - Math.floor(n);

        if (theTruthBehindItAll > 0)
            System.out.println("Há casas decimais");
        else
            System.out.println("Não há casas decimais");

        s.close();
    }
}
