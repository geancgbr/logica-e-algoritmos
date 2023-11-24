package desvio.condicionais.encadeado;

import java.util.Scanner;

public class DesvioEncadeado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Digite um número:");
        n = entrada.nextInt();
        // Desvio encadeado exibe o dia da semana de acordo com o valor numérico digitado, caso seja digitado um número inválido exibe a mensagem Dia inválido.
        if (n == 1)
            System.out.println("Domingo");
        else if (n == 2)
            System.out.println("Segunda");
        else if (n == 3)
            System.out.println("Terça");
        else if (n == 4)
            System.out.println("Quarta");
        else if (n == 5)
            System.out.println("Quinta");
        else if (n == 6)
            System.out.println("Sexta");
        else if (n == 7)
            System.out.println("Sábado");
        else
            System.out.println("Dia inválido");

    }
}
