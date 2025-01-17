package model;

public class tarefa {
    private String descricao;
    private boolean concluida;

    public tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : " (Pendente)");
    }
}