package entity;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class Aluno extends Usuario {
    private String endereco;

    public Aluno(String nome, BigInteger cpf, String telefone, String perfil, String endereco, GregorianCalendar dataNascimento) {
        super(cpf, nome, telefone, perfil);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return super.toString() + ", endereco=" + endereco + '}';
    }
}
