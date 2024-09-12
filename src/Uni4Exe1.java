import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
 * de horas trabalhadas em um mês, o valor por hora e escreva o salário total do
 * funcionário, que deverá ser acrescido das horas extras, caso tenham sido
 * trabalhadas (considere que o mês possua 4 semanas exatas).
 */

public class Uni4Exe1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Aquisição das isnofrmações necessárias
        System.out.println("Entre com as horas trabalhadas no mês: ");
        Double hours = s.nextDouble();

        System.out.println("Entre com o valor pago por hora: ");
        Double dindinPerHour = s.nextDouble();

        // Calculo das horas extras
        if (hours > 160) {
            double overtime = hours - 40;
            hours -= overtime;
            hours += overtime * 1.5;
        }

        // Calculo do money
        double payout = hours * dindinPerHour;
        System.out.println("O salário total é: " + df.format(payout));

        s.close();
    }
}
