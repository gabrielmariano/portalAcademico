package entity;

public class Disciplina {
    private Integer quantidade;  // Carga horária ou outra métrica
    private String nome;         // Nome da disciplina
    private Professor professor; // Professor responsável pela disciplina

    public Disciplina(Integer quantidade, String nome, Professor professor) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.professor = professor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return nome + " (Carga Horária: " + quantidade + " horas, Professor: " + professor.getNome() + ")";
    }
}
