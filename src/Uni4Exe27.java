import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * O número de horas a pagar é sempre inteiro e arredondado para cima ou para
 * baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se
 * para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem
 * estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar
 * por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa
 * permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de
 * chegada e partida são apresentados na forma de pares de inteiros,
 * representando horas e minutos. Por exemplo, o par 12 50 representará meio dia
 * e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de
 * partida e escreva na tela o tempo que ficou estacionado, e o preço a ser
 * cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida
 * se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo
 * dia.
 */

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Entre com a hora de chegada");
        int hChegada = s.nextInt();
        //
        System.out.println("Entre com o minuto de chegada");
        int mChegada = s.nextInt();
        //
        System.out.println("Entre com a hora de partida");
        int hPartida = s.nextInt();
        //
        System.out.println("Entre com o minuto de partida");
        int mPartida = s.nextInt();

        if (hChegada < 0 || hChegada >= 24 ||
                mChegada < 0 || mChegada >= 60) {
            System.out.println("Tempo de chegada inválido");

        } else if (hPartida < 0 || hPartida >= 24 || hChegada > hPartida ||
                mPartida < 0 || mPartida >= 60 || hChegada == hPartida && mChegada > mPartida) {
            System.out.println("Tempo de partida inválido");

        } else {
            int hDiferenca = hPartida - hChegada;
            int mDiferenca = Math.abs(mChegada - mPartida);

            if (hDiferenca == 0 || mDiferenca >= 30) {
                hDiferenca++;
            }

            double conta = 0;

            switch (hDiferenca) {
                case 1:
                    conta = 5;
                    break;

                case 2:
                    conta = 10;
                    break;

                case 3:
                    conta = 17.5;
                    break;

                case 4:
                    conta = 25;

                default:
                    conta = 25 + (hDiferenca - 4) * 10;
                    break;
            }

            System.out.println("Preço cobrado = R$" + df.format(conta));
        }

        s.close();
    }
}
