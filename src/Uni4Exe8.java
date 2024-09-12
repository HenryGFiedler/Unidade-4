import java.util.Scanner;

/**
 * Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
 */

public class Uni4Exe8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a letra:");
        char letter = Character.toLowerCase(s.next().charAt(0));

        if (    letter == 'a' ||
                letter == 'e' ||
                letter == 'i' ||
                letter == 'o' ||
                letter == 'u'   ) {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

        s.close();
    }
}
