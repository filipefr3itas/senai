
package ExercicioData;

import java.time.LocalDate;


public class Engenheiro extends Funcionario{
    protected String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, double salario, Genero genero, EstadoCivil estcivil, LocalDate dataNasc, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, Setor.ENGENHARIA, genero, estcivil, dataNasc, nome, id, telefone, email, endereco);
        this.crea = crea;
    }

   

    @Override
    public String toString() {
        return  "\nENGENHEIRO: \n" + "Setor: Engenharia"  + "\nCREA: " + crea + "\nNome: " + super.nome +  "\nCPF: " + super.cpf + "\nRG: " + super.rg + 
                "\nMatrícula: " + super.matricula + "\nSalário: " + super.salario +
                "\nId: " + super.id+
                "\nData de Nascimento: " + super.dataNasc
                +
                "\nIdade: " + super.getIdade() +
                "Estado Civil: " + super.estcivil
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email + 
                "\nGenêro: " + super.genero.getTexto() + 
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
    }
       
    
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
    
}
