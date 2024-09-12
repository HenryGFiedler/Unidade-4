import java.util.Scanner;

/**
 * Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M'
 * escreva “Masculino”. Se for digitada a letra 'F' escreva “Feminino”. Se for
 * informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
 * “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para
 * maiúscula.
 */

public class Uni4Exe6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu gênero:");
        System.out.println("M - Masculino;");
        System.out.println("F - Feminino;");
        System.out.println("I - Prefiro não informar.");

        char letter = Character.toUpperCase(s.next().charAt(0));

        if (letter == 'M')
            System.out.println("Masculino");
        else if (letter == 'F')
            System.out.println("Feminino");
        else if (letter == 'I')
            System.out.println("Não Informado");
        else
            System.out.println("Entrada Incorreta");

        s.close();

    }
}
