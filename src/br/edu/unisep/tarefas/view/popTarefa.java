package br.edu.unisep.tarefas.view;

import javax.swing.*;
import java.util.ArrayList;

public class popTarefa {
    public void executar(ArrayList<model.tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa para remover.");
            return;
        }
        String lista = listarTarefas(tarefas);
        String input = JOptionPane.showInputDialog(null, "Selecione o número da tarefa para remover:\n" + lista);
        if (input == null) return;

        try {
            int indice = Integer.parseInt(input) - 1;
            if (indice >= 0 && indice < tarefas.size()) {
                tarefas.remove(indice);
                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Número inválido!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.");
        }
    }

    private String listarTarefas(ArrayList<model.tarefa> tarefas) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tarefas.size(); i++) {
            sb.append(i + 1).append(". ").append(tarefas.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
