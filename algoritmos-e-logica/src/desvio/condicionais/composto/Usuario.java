package desvio.condicionais.composto;

import java.util.Scanner;
public class Usuario
{ // Dado um número pelo usuário, informar se ele é positivo, negativo ou nulo.
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Digite um número:");
        n = entrada.nextInt();
        if (n > 0)
            System.out.println("Positivo");
        else if (n < 0)
            System.out.println("Negativo");
        else
            System.out.println("Nulo");
    }
}