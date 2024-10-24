
package portalAcademico1;

import entity.Aluno;
import entity.Professor;
import entity.Disciplina;
import entity.Curso;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PortalAcademico1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um aluno
        Aluno aluno = new Aluno("Gabriel Mariano", 
                                 new BigInteger("99999999988"), 
                                 "16320903767", 
                                 "AL", 
                                 "Rua Quito, 250", 
                                 new GregorianCalendar(2024, 1, 23));

        // Criando professores
        Professor professor1 = new Professor("João Silva", 
                                             new BigInteger("88888888888"), 
                                             "16320903768", 
                                             "Professor", 
                                             new BigInteger("12345"), 
                                             new GregorianCalendar());
        Professor professor2 = new Professor("Maria Oliveira", 
                                             new BigInteger("77777777777"), 
                                             "16320903769", 
                                             "Professor", 
                                             new BigInteger("12346"), 
                                             new GregorianCalendar());
        Professor professor3 = new Professor("Carlos Pereira", 
                                             new BigInteger("66666666666"), 
                                             "16320903770", 
                                             "Professor", 
                                             new BigInteger("12347"), 
                                             new GregorianCalendar());
        
        // Criando disciplinas
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina(10, "Matemática", professor1));
        disciplinas.add(new Disciplina(3, "Física", professor2));
        disciplinas.add(new Disciplina(5, "Química", professor3));
        
        // Criando o curso
        Curso curso = new Curso(1001, aluno, new GregorianCalendar(), disciplinas);

        // Exibindo informações do curso
        System.out.println("Nome do Aluno: " + curso.getAlunoNome());
        System.out.println("Curso: " + curso);
        System.out.println("Quantidade de Disciplinas: " + curso.getDisciplinas().size());
        System.out.println("Disciplinas e Professores:");
        for (Disciplina disciplina : curso.getDisciplinas()) {
            System.out.println("- " + disciplina);
        }

        scanner.close();
    }
}