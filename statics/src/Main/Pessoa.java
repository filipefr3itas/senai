package Main;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return Util.formatarData(dataNascimento);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

   