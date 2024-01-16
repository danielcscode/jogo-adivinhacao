import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroCPU = new Random().nextInt(100);

        System.out.println("Digite o numero que a CPU escolheu entre 0 a 100:");
        int numeroJogador = teclado.nextInt();

        if (numeroJogador != numeroCPU) {
            for (int i = 1; i < 6; i++) {
                if (numeroJogador < numeroCPU) {
                    System.out.println("Você errou! O numero escolhido pela CPU é maior!");
                    System.out.println("");
                } else  {
                    System.out.println("Você errou! O numero escolhido pela CPU é menor!");
                    System.out.println("");
                }
                System.out.println("Esse é a tentativa numero " + i);
                System.out.println("Digite o numero que a CPU escolheu:");
                numeroJogador = teclado.nextInt();
                if (numeroJogador == numeroCPU) {
                    i = 6;
                    System.out.println("PARABÉNS! VOCÊ ACERTOU O NUMERO!");
                }
            }
            if (numeroJogador != numeroCPU) {
                System.out.println("Acabou as tentativas! Numero sorteado era: " + numeroCPU);
            }
        } else {
            System.out.println("PARABÉNS! VOCÊ ACERTOU O NUMERO!");
        }
    }
}