
package exercfuncionario;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario{
    private Bonificacao bonificacao;

    public CargoDeConfianca() {
    }

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }
    
    
    
}
