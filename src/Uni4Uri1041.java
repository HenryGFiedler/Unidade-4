import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1041 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        double y = s.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");

        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");

        } else if (x > 0 && y < 0) {
            System.out.println("Q4");

        } else if (x < 0 && y > 0) {
            System.out.println("Q2");

        } else if (x < 0 && y < 0) {
            System.out.println("Q3");

        } else {
            System.out.println("Origem");
        }

        s.close();
    }

}