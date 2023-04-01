
package ExercicioData;


public abstract class PJuridica extends Pessoa {
    protected String cnpj;
    protected String inscricaoEstadual;

    public PJuridica() {
    }


    public PJuridica(String cnpj, String inscricaoEstadual, String nome, int id, String telefone, String email, Endereco endereco) {
        super(nome, id, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    @Override
    public String toString() {
        return  "\nPESSOA JURIDICA\n" + "\nNome: " + super.nome +  "\nCNPJ: " + cnpj  + 
                "\nId: " + super.id
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
               "\nInscrição Estadual: " + inscricaoEstadual + 
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
    }
       

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
    
}
