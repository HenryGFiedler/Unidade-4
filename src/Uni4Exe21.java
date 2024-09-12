import java.util.Scanner;

/**
 * O índice de massa corporal (IMC) é uma medida internacional usada para
 * calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão
 * da massa do indivíduo pelo quadrado de sua altura, onde a massa está em
 * quilogramas e a altura está em metros, de acordo com a fórmula:
 */

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o peso do indivíduo: ");
        double peso = s.nextDouble();
        //
        System.out.println("Informe a altura do indivíduo: ");
        double altura = s.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Magreza"); // Literalmente eu

        } else if (imc < 25) {
            System.out.println("Saudável");

        } else if (imc < 30) {
            System.out.println("Sobrepeso");

        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");

        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (severa)");

        } else if (imc >= 40) {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        s.close();
    }
}
