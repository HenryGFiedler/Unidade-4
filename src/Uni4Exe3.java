import java.util.Scanner;

/**
 * Dados dois números inteiros descreva um algoritmo para informar o maior valor
 * entre eles.
 */

public class Uni4Exe3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Me fale dois números e lhe direi qual deles é o maior");
        int A = s.nextInt();
        int B = s.nextInt();

        if (A > B)
            System.out.println(A + " é maior");
        else
            System.out.println(B + " é maior");

        s.close();
    }
}
