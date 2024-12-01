import br.edu.unisep.tarefas.view.addTarefas;
import br.edu.unisep.tarefas.view.exibirTarefas;
import br.edu.unisep.tarefas.view.popTarefa;
import br.edu.unisep.tarefas.view.tarefaConcluida;

import javax.swing.*;
import java.util.ArrayList;


public static void main (String[] args) {
    ArrayList<model.tarefa> tarefas = new ArrayList<>();
    while (true) {
        String opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma opção:\n\n" +
                        "1. Adicionar tarefa\n" +
                        "2. Marcar tarefa como concluída\n" +
                        "3. Remover tarefa\n" +
                        "4. Exibir todas as tarefas\n" +
                        "5. Sair",
                "Gerenciador de Tarefas",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (opcao == null || opcao.equals("5")) {
            JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!");
            break;
        }

        switch (opcao) {
            case "1":
                new addTarefas().executar(tarefas);
                break;
            case "2":
                new tarefaConcluida().executar(tarefas);
                break;
            case "3":
                new popTarefa().executar(tarefas);
                break;
            case "4":
                new exibirTarefas().executar(tarefas);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
        }
    }
}
