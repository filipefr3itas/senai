
package exercfuncionario;

import java.time.LocalDate;


public class Gerente extends CargoDeConfianca{

    public Gerente() {
    }

    public Gerente(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(Bonificacao.GERENTE, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public double getSalarioFinal() {
        return this.getSalarioBase()*Bonificacao.GERENTE.getValor() + this.getSalarioBase();
    }
    
     @Override
    public String toString() {
        return "GERENTE\n" + "Nome: " + super.getNome() + "\nCPF: " +super.getCpf() + "\nRG: " +super.getRg() + "\nGenero: " + super.getGenero().texto
                + "\nData de Admissão: " + this.getDataAdmissao() + "\nSalário: " + Util.formatarBrl(getSalarioFinal())+
                "\nBonificação: " +Util.formatarPercentual1(Bonificacao.GERENTE) ;
    }

    
}
