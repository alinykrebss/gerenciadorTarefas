package br.edu.unisep.tarefas.view;

import javax.swing.*;
import java.util.ArrayList;

public class tarefaConcluida {
    public void executar(ArrayList<model.tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa para marcar como concluída.");
            return;
        }
        String lista = listarTarefas(tarefas);
        String input = JOptionPane.showInputDialog(null, "Selecione o número da tarefa para marcar como concluída:\n" + lista);
        if (input == null) return;

        try {
            int indice = Integer.parseInt(input) - 1;
            if (indice >= 0 && indice < tarefas.size()) {
                model.tarefa tarefa = tarefas.get(indice);
                if (tarefa.isConcluida()) {
                    JOptionPane.showMessageDialog(null, "Tarefa já está concluída.");
                } else {
                    tarefa.setConcluida(true);
                    JOptionPane.showMessageDialog(null, "Tarefa marcada como concluída!");
                }
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
