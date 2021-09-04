package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<>();
        boolean chave = true;
        int opcao = 0;

        System.out.println("\n Bem vinde ao 'YOUCAN' o seu gerenciador de funcionários!");
        System.out.println("Vamos começar?!");


        while (chave == true) {
            //Menu interativo
            System.out.println("Digite 1: para incluir um funcionário;");
            System.out.println("Digite 2: para visualizar os funcionários cadastrados;");
            System.out.println("Digite 3: para remover um funcionário;");
            System.out.println("Digite 4: para encerrar o gerenciador.");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                //Cadastrando um funcionário novo no gerenciador.
                System.out.println("Digite o nome completo do funcionário que voce deseja incluir: ");
                String nome = input.nextLine();
                System.out.println("Digite agora o telefone de contato do funcionário: ");
                String telefone = input.nextLine();
                System.out.println("Digite o e-mail de contato do funcionário: ");
                String email = input.nextLine();
                System.out.println("Digite agora o CPF do funcionário :");
                String cpf = input.nextLine();
                System.out.println("Funcionário incluído com sucesso!\n");


                funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email + ".");

            } else if (opcao == 2) {
                //Visualizar a lista de funcionários cadastrados no gerenciador.
                for (String visualizador : funcionarios.keySet()) {
                    System.out.println("Contato: " + funcionarios.get(visualizador) + " CPF: " + visualizador);
                    System.out.println();
                }

            } else  if (opcao == 3) {
            // Removendo um funcionário.
                System.out.println("Por favor, digite o CPF do funcionário a ser removido: ");
                String cpfASerRemovido = input.nextLine();
                String cpfRemove = "";

                for ( String cpfRemovido: funcionarios.keySet()) {
                    if ( cpfRemovido.equals(cpfASerRemovido)){
                        System.out.println("Funcionário removido com sucesso!");
                        cpfRemove = cpfASerRemovido;
                    }
                }
                funcionarios.remove(cpfRemove);

            }else if (opcao == 4) {
                chave = false;
                System.out.println("YOUCAN finalizado com sucesso!");
            }
        }
    }
}

