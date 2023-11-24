package procedimentos;

import java.util.Scanner;
public class ComParametros {
    // Criação do Procedimento
    public static void saudacao2(String usuario, int hora)
    {
        String msg;
        if (hora < 12) {
            msg = "Bom dia!";
        }else if (hora < 18) {
            msg = "Boa tarde!";
        }else {
            msg = "Boa noite!";
        }
        System.out.println("Ola "+ usuario + ", " + msg + " Você está logado.");

    }

    // Chamada do Procedimento
    public static void main(String[] args)
    {
        saudacao2("Edson", 16);
    }
}