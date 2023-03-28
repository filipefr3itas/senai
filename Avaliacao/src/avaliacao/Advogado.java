
package avaliacao;


public class Advogado extends Funcionario{
    protected String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, double salario, Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, salario, Setor.JURÍDICO, genero, nome, id, telefone, email, endereco);
        this.oab = oab;
    }

    @Override
    public String toString() {
        return  "ADVOGADO\n" + "Setor: Júridico"  + "\nOAB: " + oab + "\nNome: " + super.nome +  "\nCPF: " + super.cpf + "\nRG: " + super.rg + 
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
       
  
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
    
}
