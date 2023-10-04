package senac.java.Views;

import java.util.Scanner;
import senac.java.Domain.FuncionarioMock;
import senac.java.Domain.FuncionarioMock2;
import senac.java.Domain.UsersMock;

public class SobreVenda {
    static Scanner sc = new Scanner(System.in);
    static FuncionarioMock funcionario = new FuncionarioMock();
    static FuncionarioMock2 funcionario2 = new FuncionarioMock2();
    static UsersMock cliente = new UsersMock();
    public static void informacoesVenda() {
        int sala = 0;
        int compraAluguel = 0;

        System.out.println("Digite o nome do funcionário que entregou a sala");
        funcionario.completeName = sc.nextLine();
        System.out.println("Digite o nome do cliente que recebeu a chave");
        cliente.name = sc.nextLine();
        System.out.println("Digite a sala que foi entregue ");
        sala = Integer.parseInt(sc.nextLine());
        System.out.println("Digite quanto foi a compra/aluguel da sala");
        compraAluguel = Integer.parseInt(sc.nextLine());


        System.out.println("Informações sobre venda:");
        System.out.println(" ");
        System.out.println("Nome funcionário que recebeu: " + funcionario.completeName);
        System.out.println("Nome cliente que recebeu a sala: " + cliente.name + " " + cliente.lastName);
        System.out.println("A sala que foi entregue foi: " + sala);
        System.out.println("A sala foi comprada ou alugada por " + "R$" + compraAluguel);
        System.out.println(" ");

        if(FuncionarioMock.completeName.equals("Amanda Gomes")){
            System.out.println(" ");
            System.out.println("Dados sobre o funcionário:");
            System.out.println(funcionario.completeName);
            System.out.println(funcionario.cpf);
            System.out.println(funcionario.email);
            System.out.println(funcionario.address);
        }else {
            System.out.println(" ");
            System.out.println("Dados sobre o funcionário:");
            System.out.println(funcionario2.completeName2);
            System.out.println(funcionario2.cpf2);
            System.out.println(funcionario2.email2);
            System.out.println(funcionario2.address2);
        }

        System.out.println(" ");
        System.out.println("O nome do cliente que recebeu a sala é: " + cliente.name + " " + cliente.lastName);
        System.out.println("Esse cliente tem " + cliente.age + " " + "anos");
        System.out.println("Mora no endereço: " + cliente.address);
        System.out.println("Seu email é " + cliente.email);
        System.out.println("Seu cpf é: " + cliente.cpf);

    }
}