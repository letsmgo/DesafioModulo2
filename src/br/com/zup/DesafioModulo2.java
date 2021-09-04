package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<>();

        System.out.println("\n Bem vinde ao 'YOUCAN' o seu gerenciador de funcionários!");
        System.out.println("Vamos começar?!");

        System.out.println("Digite o nome completo do funcionário que voce deseja incluir: ");
        String nome = input.nextLine();
        System.out.println("Digite agora o telefone de contato do funcionário: ");
        String telefone = input.nextLine();
        System.out.println("Digite o e-mail de contato do funcionário: ");
        String email = input.nextLine();
        System.out.println("Digite agora o CPF do funcionário :");
        String cpf = input.nextLine();

        funcionarios.put(cpf, "Nome: " + nome + "Telefone: " + telefone + "E-mail: " + email + ".");
        System.out.println(funcionarios);

    }
}
