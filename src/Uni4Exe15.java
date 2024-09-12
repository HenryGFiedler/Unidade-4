import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Elabore um algoritmo para exibir o valor de reajuste que um funcionário
 * receberá no seu salário. A empresa irá conceder 5% de reajuste para o
 * funcionário que for admitido há até de 12 meses. Para funcionário admitido
 * entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve
 * solicitar ao usuário que digite a quantidade de meses que o funcionário foi
 * admitido.
 */

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o salário do funcionário");
        double salary = s.nextDouble();
        System.out.println("Informe a quantos mêses seu funcionario foi admitido: ");
        int months = s.nextInt();

        if (months > 0 && months <= 12) {
            double fSalary = salary * 1.05;
            double raise = fSalary - salary;
            System.out.println(
                    "O reajuste foi de: R$ " + df.format(raise) + ", dando um total de: R$ " + df.format(fSalary));
        }
        else if (months >= 13 && months <= 48) {
            double fSalary = salary * 1.07;
            double raise = fSalary - salary;
            System.out.println(
                    "O reajuste foi de: R$ " + df.format(raise) + ", dando um total de: R$ " + df.format(fSalary));
        }
        else {
            System.out.println("Não houve reajuste");
        }

        s.close();

    }

}
