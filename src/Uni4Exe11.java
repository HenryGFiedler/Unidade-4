import java.util.Scanner;

/**
 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma
 * mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere
 * que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
 * dos demais, e apenas irmãos se todas as idades forem diferentes.
 */

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento dos 3 irmãos");
        int irmao1 = s.nextInt();
        int irmao2 = s.nextInt();
        int irmao3 = s.nextInt();

        if (irmao1 == irmao2 && irmao1 == irmao3) {
            System.out.println("São trigêmeos");
        } else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.println("São gêmeos");
        } else {
            System.out.println("São irmãos");
        }

        s.close();
    }
}
