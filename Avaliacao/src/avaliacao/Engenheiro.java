
package avaliacao;


public class Engenheiro extends Funcionario{
    protected String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, double salario, Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, Setor.ENGENHARIA, genero, nome, id, telefone, email, endereco);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return  "\nENGENHEIRO: \n" + "Setor: Engenharia"  + "\nCREA: " + crea + "\nNome: " + super.nome +  "\nCPF: " + super.cpf + "\nRG: " + super.rg + 
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
       
    
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    
    
}
