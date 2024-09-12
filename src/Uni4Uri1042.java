import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1042 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int aOriginal = s.nextInt();
        int bOriginal = s.nextInt();
        int cOriginal = s.nextInt();

        int a = aOriginal;
        int b = bOriginal;
        int c = cOriginal;

        if (a > b) {
            int placeHolder = a;
            a = b;
            b = placeHolder;
        }
        if (b > c) {
            int placeHolder = b;
            b = c;
            c = placeHolder;
        }
        if (a > b) {
            int placeHolder = a;
            a = b;
            b = placeHolder;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
        System.out.println(aOriginal);
        System.out.println(bOriginal);
        System.out.println(cOriginal);

        s.close();
    }
}