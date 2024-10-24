package entity;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class Usuario {
    private BigInteger cpf;
    private String nome;
    private String telefone;
    private String perfil;
    private GregorianCalendar dataInicio;

    public Usuario() {}

    public Usuario(BigInteger cpf, String nome, String telefone, String perfil) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.perfil = perfil;
        this.dataInicio = new GregorianCalendar();    
    }

    public BigInteger getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getPerfil() {
        return perfil;
    }

    public GregorianCalendar getDataInicio() {
        return dataInicio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", perfil=" + perfil + ", dataInicio=" + dataInicio + '}';
    }
}
