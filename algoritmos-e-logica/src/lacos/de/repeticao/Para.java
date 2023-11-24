package lacos.de.repeticao;

import java.util.Scanner;
public class Para {
    public static void main(String[] args) {
        // Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner(System.in);

        // Declaração das variáveis
        int num, mult, volta;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        for (volta = 1; volta <= 10; volta++){
            mult = num * volta;
            System.out.println(mult);
        }
    }
}