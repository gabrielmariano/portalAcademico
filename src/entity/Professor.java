package entity;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class Professor extends Usuario {
    private BigInteger matricula;
    private GregorianCalendar dataAdmissao;

    public Professor(String nome, BigInteger cpf, String telefone, String perfil, BigInteger matricula, GregorianCalendar dataAdmissao) {
        super(cpf, nome, telefone, perfil);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public BigInteger getMatricula() {
        return matricula;
    }

    public GregorianCalendar getDataAdmissao() {
        return dataAdmissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", matricula=" + matricula + ", dataAdmissao=" + dataAdmissao + '}';
    }
}
