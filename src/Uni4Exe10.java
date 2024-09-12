import java.util.Scanner;

/**
 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um
 * algoritmo para ler as idades dos filhos e exibir quem é o caçula da família;
 * suponha que não haja empates.
 */

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quais são as idades de Marquinhos, Zezinho e Luluzinha");
        int marquinhos = s.nextInt();
        int zezinho = s.nextInt();
        int luluzinha = s.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos é o caçula");
        }
        if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("Zezinho é o caçula");
        }
        if (luluzinha < marquinhos && luluzinha < zezinho) {
            System.out.println("luluzinha é a caçula");
        }

        s.close();
    }
}
