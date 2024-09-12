import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Uma loja que trabalha com crediário funciona da seguinte maneira: se o
 * pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é
 * avisado que o pagamento está em dia. Se o pagamento é realizado até cinco
 * dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
 * mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um
 * algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da
 * prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas
 * mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
 * clientes nunca deixam para pagar no mês seguinte.
 */

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o valor a ser pago: ");
        double bill = s.nextDouble();
        //
        System.out.println("Informe o dia do vencimento: ");
        int dueDate = s.nextInt();
        //
        System.out.println("Informe o dia do pagamento: ");
        int paymentDate = s.nextInt();
        //
        int difference = paymentDate - dueDate;

        if (difference <= 0) {
            System.out.println("O pagamento esta em dia");
            bill *= 0.90;

        } else if (difference <= 5) {
            System.out.println("O pagamento está atrasado, mas ainda dentro do prazo de 5 dias sem multa");

        } else {
            double fine = (difference - 5) * 0.02;
            bill += bill * fine;
            System.out.println("O pagamento está atrasado e foi aplicado uma multa de " + (fine * 100) + "%");
        }

        System.out.println("O valor pago pelo cliente foi de R$ " + df.format(bill));

        s.close();
    }
}
