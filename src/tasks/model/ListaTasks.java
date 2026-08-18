package tasks.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTasks implements GerenciadorTarefas {

    Scanner scan = new Scanner(System.in, "CP850");

    LocalDate date = LocalDate.now();

    private ArrayList<String> tasks = new ArrayList<>();

    private String tarefas;

    private String localArquivo = System.getProperty("user.home");

    @Override
    public void adicionarTarefa() {

        do {
            System.out.println("Adicione tarefas a lista (Ou 'N' para sair).");
            tarefas = scan.nextLine();

            if (!tarefas.equalsIgnoreCase("N")) {
                tasks.add(tarefas);

            }

        } while (!tarefas.equalsIgnoreCase("N"));
    }

    @Override
    public void removerTarefa() {
        System.out.println("Informe a posição da tarefa na lista a ser removida (começando do 0): ");
        System.out.println(tasks);

        int i = scan.nextInt();

        try {
            tasks.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERRO! Posição inválida.");
            e.getMessage();
        }

    }

    @Override
    public void verLista() {
        System.out.println(tasks);
    }

    @Override
    public void gerarArquivo() {
        try {           
         FileWriter writer = new FileWriter(localArquivo + "\\Desktop\\Tarefas do dia " + date + ".txt");
          writer.write("==================== TAREFAS DO DIA ====================" + System.lineSeparator());

            for (int i = 0; i < tasks.size(); i++) {
             String tarefaAtual = tasks.get(i);
              writer.write(tarefaAtual + System.lineSeparator());
               
            }
            
          writer.close();

        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo " + e.getMessage());

        }

    }

}
