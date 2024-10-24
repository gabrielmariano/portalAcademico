package entity;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Curso {
    private Integer codigo;
    private Aluno aluno;
    private GregorianCalendar dataInicio;
    private ArrayList<Disciplina> disciplinas;

    public Curso(Integer codigo, Aluno aluno, GregorianCalendar dataInicio, ArrayList<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.dataInicio = dataInicio;
        this.disciplinas = disciplinas;
    }

    public String getAlunoNome() {
        return aluno.getNome();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Curso " + codigo;
    }
}
