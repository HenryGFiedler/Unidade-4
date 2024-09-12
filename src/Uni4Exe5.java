import java.util.Scanner;

/**
 * Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável
 * lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”,
 * caso seja false.
 */

public class Uni4Exe5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("A cor é azul?");

        if (s.nextBoolean())
            System.out.println("Sim");
        else
            System.out.println("Não");

        s.close();
    }
}
