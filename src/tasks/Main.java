package tasks;

import java.util.Scanner;

import tasks.model.ListaTasks;
import tasks.view.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

     Menu menu = new Menu();
     ListaTasks listatask = new ListaTasks();

      int opcao = 0;

      menu.exibirMenu();
      opcao = scanner.nextInt();
      scanner.nextLine();

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                 System.out.println("============ Adicionar tarefas ============");
                 listatask.adicionarTarefa();

                 menu.exibirMenu();
                  opcao = scanner.nextInt();
                   scanner.nextLine();
                    break;

                case 2:
                 System.out.println("============ Remover tarefa ============");   
                 listatask.removerTarefa();

                 menu.exibirMenu();
                  opcao = scanner.nextInt();
                   scanner.nextLine();
                    break;

                case 3:
                 System.out.println("============ Lista de tarefas ============");   
                 listatask.verLista();
                 System.out.println("==========================================");  

                 menu.exibirMenu();
                  opcao = scanner.nextInt();
                   scanner.nextLine();

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }

        System.out.println("Encerrando...");
        scanner.close();

    }
}
