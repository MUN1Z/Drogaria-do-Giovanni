package view;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dieg0 MigueL
 */
public class Main {

    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        executaOpcao(imprimeMenu());  
    }

    private static void executaOpcao(int escolha) {
        switch (escolha) {
            case 1:
                new viewClientes();
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
     private static int imprimeMenu() {
            System.out.println("\t\t*************************");
            System.out.println("\t\t**Drogaria  do Giovanni**");
            System.out.println("\t\t*************************\n");

            System.out.println("1-Gerenciar Clientes");
            System.out.println("2-Gerenciar Funcionários");
            System.out.println("3-Gerenciar Produtos");
            System.out.println("4-Novo Pedido");
            System.out.print("Escolha uma ação--> ");
          
            return entrada.nextInt();
        }
}
