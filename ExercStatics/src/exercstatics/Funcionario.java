
package exercstatics;

import java.time.LocalDate;


public class Funcionario extends Pessoa{
     private String cpf;
     private String rg; 
     private LocalDate dataNasc;
     private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, LocalDate dataNasc, double salario, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNasc = dataNasc;
        this.salario = salario;
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

    public String getDataNasc() {
        return Util.formatarData(dataNasc);
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSalario() {
        return Util.formatarBrl(salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
     
    
}
