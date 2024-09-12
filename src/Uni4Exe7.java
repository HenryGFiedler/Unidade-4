import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com
 * peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em
 * que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em
 * gramas, determine o custo do selo.
 */

public class Uni4Exe7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double cost;

        System.out.println("Entre com o peso da carta: ");
        Double weight = s.nextDouble();

        if (weight > 50) {
            weight -= 50;
            int extra = (int) Math.ceil(weight) / 20;

            if (weight % 20 != 0) {
                extra++;
            }

            cost = (extra + 1) * 0.45;
        } else {
            cost = 0.45;
        }

        System.out.println("Custo do selo: " + df.format(cost));

        s.close();
    }
}
