
package exercfuncionario;

import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private Genero genero;
    private double salarioBase;
    private LocalDate dataAdmissao;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }

    public abstract double getSalarioFinal();
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
 public double getSalarioBase() {
        return salarioBase;
        
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataAdmissao() {
                return Util.formatarData(dataAdmissao);
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
    
}
