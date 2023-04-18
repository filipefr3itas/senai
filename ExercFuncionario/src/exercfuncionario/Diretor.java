
package exercfuncionario;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca{
    
    protected final double PARTICIPACAO_LUCRO = 0.1;

    @Override
    public double getSalarioFinal() {
        return this.getSalarioBase()*Bonificacao.DIRETOR.getValor() + this.PARTICIPACAO_LUCRO*this.getSalarioBase()+ getSalarioBase();
    }

    public Diretor() {
    }

    public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(Bonificacao.DIRETOR, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return "DIRETOR\n" + "Nome: " + super.getNome() + "\nCPF: " +super.getCpf() + "\nRG: " +super.getRg() + "\nGenero: " + super.getGenero().texto
                + "\nData de Admissão: " + this.getDataAdmissao() + "\nSalário: " + Util.formatarBrl(getSalarioFinal()) +
                "\nBonificação: " +Util.formatarPercentual1(Bonificacao.DIRETOR) + "\nParticipação nos lucros: " + Util.formatarPercentual2(PARTICIPACAO_LUCRO);
    }
    
    
    
    
    
}
