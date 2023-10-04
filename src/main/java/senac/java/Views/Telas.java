package senac.java.Views;

import senac.java.Views.SobreVenda;
import java.util.Scanner;

public class Telas {
    static Scanner sc = new Scanner(System.in);

    public void telaInicial() {
        SobreVenda informacaoDaVenda = new SobreVenda();

        System.out.println("Bem-vindo ao nosso código!!");
        System.out.println(" ");

        informacaoDaVenda.informacoesVenda();
    }
}