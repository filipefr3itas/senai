
package ExercicioData;

import java.time.LocalDate;


public class Medico extends Funcionario{
    protected String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, double salario, Genero genero, EstadoCivil estcivil, LocalDate dataNasc, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, Setor.SAÚDE, genero, estcivil, dataNasc, nome, id, telefone, email, endereco);
        this.crm = crm;
    }

        
    @Override
    public String toString() {
        return  "\nMÉDICO\n" + "Setor: Medicina"  + "\nCRM: " + crm + "\nNome: " + super.nome +  "\nCPF: " + super.cpf + "\nRG: " + super.rg + 
                "\nMatrícula: " + super.matricula + "\nSalário: " + super.salario +
                "\nId: " + super.id  +
                "Estado Civil: " + super.estcivil +
                "\nData de Nascimento: " + super.dataNasc
                +
                "\nIdade: " + super.getIdade()
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email  + 
                "\nGenêro: " + super.genero.getTexto() + 
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
    }
       

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
}
