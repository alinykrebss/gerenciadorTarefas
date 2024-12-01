package br.edu.unisep.tarefas.view;

import javax.swing.*;
import java.util.ArrayList;

public class exibirTarefas {
    public void executar(ArrayList<model.tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tarefas.size(); i++) {
            sb.append(i + 1).append(". ").append(tarefas.get(i).toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Tarefas:\n" + sb.toString());
    }
}
