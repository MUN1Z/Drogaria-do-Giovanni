package view;

import facade.Facade;
import java.util.Scanner;
import model.Cliente;

/**
 *
 * @author Dieg0 MigueL
 */
class viewClientes {

    public viewClientes() {
        executa(escolheOpcaoMenu());
    }

    private int escolheOpcaoMenu() {

        System.out.println("\t\t**Gerenciamento de Clientes**\n");
        System.out.println("1-Adicionar Cliente");
        System.out.println("2-Remover Cliente");
        System.out.println("3-Atualizar dados");
        System.out.println("4-Histórico de Pedidos");
        System.out.println("Escolha a opção desejada--> ");
        
        return Main.entrada.nextInt();
    }

    private void executa(int opcao) {
        switch (opcao) {
            case 1:
                adicionarCliente();
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;
                
            default:
                break;
        }

    }

    private void adicionarCliente() {
        Scanner entrada =  new Scanner(System.in);
        String nome, cpf, endereco, telefone;
        
        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite o cpf: ");
        cpf = entrada.nextLine();
        System.out.println("Digite o endereco: ");
        endereco = entrada.nextLine();
        System.out.println("Digite o telefone: ");
        telefone = entrada.nextLine();
        
        Facade.cadastrarCliente(new Cliente(nome, cpf, endereco, telefone));
    }

}
