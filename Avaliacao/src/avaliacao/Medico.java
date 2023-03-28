
package avaliacao;


public class Medico extends Funcionario{
    protected String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, double salario, Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, Setor.SAÚDE, genero, nome, id, telefone, email, endereco);
        this.crm = crm;
    }
    
    @Override
    public String toString() {
        return  "\nMÉDICO\n" + "Setor: Medicina"  + "\nCRM: " + crm + "\nNome: " + super.nome +  "\nCPF: " + super.cpf + "\nRG: " + super.rg + 
                "\nMatrícula: " + super.matricula + "\nSalário: " + super.salario +
                "\nId: " + super.id
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nIdade: " + super.idade + 
                "\nGenêro: " + super.genero + 
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
