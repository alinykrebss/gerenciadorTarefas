package br.edu.unisep.tarefas.view;

import javax.swing.*;
import java.util.ArrayList;

public class addTarefas {
    public void executar(ArrayList<model.tarefa> tarefas) {
        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da nova tarefa:");
        if (descricao == null || descricao.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Descrição inválida! Tarefa não adicionada.");
            return;
        }
        tarefas.add(new model.tarefa(descricao));
        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
    }
}